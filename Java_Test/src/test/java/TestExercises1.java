import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class TestExercises1 {
    String str = "You Only Live Once. But if You do it right. once is Enough";
    Exercises_01 ex1 = new Exercises_01();

    @Test
    public void test1(){
        assertThat(ex1.count(str)).isEqualTo(7);
    }
    @Test
    public void test2(){
        assertThat(ex1.Uppercase(str)).isEqualTo("You Only Live Once. But If You Do It Right. Once Is Enough")
                .isNotNull();
    }
    @Test
    public void test3(){
        assertThat(ex1.Uppercase2(str)).isEqualTo("You only live once. But if you do it right. Once is enough")
                .isNotNull();
    }
}
