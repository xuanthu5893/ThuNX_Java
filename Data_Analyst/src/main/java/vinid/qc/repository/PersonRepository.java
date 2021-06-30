package vinid.qc.repository;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;
import vinid.qc.model.Person;


import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class PersonRepository {
    private List<Person> person = new ArrayList<>();

    public PersonRepository() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        File file;
        try {
            file = ResourceUtils.getFile("classpath:static/person.json");
            person.addAll(mapper.readValue(file, new TypeReference<List<Person>>() {
            }));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Map.Entry<String, List<Person>>> getPeopleByJobInCity(String job, String city) {
        return person
                .stream()
                .filter(p -> p.getJob().equals(job))    //filter theo nghề nghiệp
                .filter(p -> city.contains(p.getCity()))   //filter tiếp theo thành phố
                .collect(Collectors.groupingBy(Person::getCity))  //nhóm theo thành phố
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey)) //sắp xếp
                .collect(Collectors.toList());
    }

    public Map.Entry<String, Double> findCityHaveAvgAgeYoungest(String job) {
        Map<String, Double> cityAverAge = person
                .stream()
                .filter(p -> p.getJob().equals(job))
                .collect(Collectors.groupingBy(Person::getCity, Collectors.averagingDouble(Person::getAge)));
        Optional<Map.Entry<String, Double>> result = cityAverAge.entrySet()
                .stream()
                .collect(Collectors.minBy(Map.Entry.comparingByValue()));
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RuntimeException("Cannot find top job");
        }
    }


    public Map<String, Double> maleFemaleRatioByCity() {
        Map<String, List<Person>> groupPersonByCity = person
                .stream()
                .collect(Collectors.groupingBy(Person::getCity));
        return groupPersonByCity.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        entry -> maleFemaleRatio(entry.getValue())));

    }

    public Double maleFemaleRatio(List<Person> value) {
        Long maleCount = value
                .stream()
                .filter(p -> p.getGender().equals("Male"))
                .collect(Collectors.counting());
        return (double) maleCount / (double) (value.size() - maleCount);
    }

    public Double avgSalaryByAge(int age) {
        Long oldPeopleCount = person
                .stream()
                .filter(p -> p.getAge() >= age).count();    //đếm số người lớn hơn 30 tuổi
        Long totalSalary = person.stream()
                .filter(p -> p.getAge() >= age)
                .mapToLong(s -> s.getSalary())
                .reduce(0, ((s1, s2) -> s1 + s2)); // tính tổng lương những người 30 tuổi
        return (double) totalSalary / (double) oldPeopleCount;
    }
}

