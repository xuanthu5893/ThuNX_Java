package vinid.qc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vinid.qc.model.Person;
import vinid.qc.repository.PersonRepository;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class PeopleController {
    @Autowired
    private PersonRepository personRepo;

    @GetMapping("devhanoisaigoshanghai")
    public ResponseEntity<List<Map.Entry<String, List<Person>>>> getPeopleByJobInCity() {
        return ResponseEntity.ok().body(personRepo.getPeopleByJobInCity("developer", "Hanoi Shanghai Saigon"));
    }

    @GetMapping("youngestdevs")
    public ResponseEntity<Map.Entry<String, Double>> findAvgAgeJob() {
        return ResponseEntity.ok().body(personRepo.findCityHaveAvgAgeYoungest("developer"));
    }


    @GetMapping("malefemaleratio")
    public ResponseEntity<Map<String, Double>> malefemaleratioByCity() {
        return ResponseEntity.ok().body(personRepo.maleFemaleRatioByCity());
    }

    @GetMapping("avgsalarypeopleabove30")
    public ResponseEntity<Double> getAvgSalaryByAge() {
        return ResponseEntity.ok().body(personRepo.avgSalaryByAge(30));
    }

}
