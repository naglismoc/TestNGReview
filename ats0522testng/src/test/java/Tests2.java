import org.testng.annotations.Test;

public class Tests2 {

    @Test (groups = {"positive"})
    public void test(){
        System.out.println("test2 test positive");
    }
    @Test  (groups = {"negative"})
    public void test2(){
        System.out.println("test2 test negative");
    }
}
