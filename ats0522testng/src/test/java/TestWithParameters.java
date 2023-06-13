import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWithParameters {

    @Parameters({"firstName","lastName"})
    @Test
    public void sayHiTest(String firstName, String lastName){
        System.out.println("hello " +firstName + " " + lastName);
    }
}
