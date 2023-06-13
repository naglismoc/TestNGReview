import org.testng.annotations.*;

public class TestNgTests {

    @Test (groups = {"positive"},  priority=2)
    public void firstTest(){
        System.out.println("firstTest positive");
    }

    @Test (groups = {"negative"}, priority=1)
    public void secondTest(){
        System.out.println("secondTest negative");
    }

    @Test (groups = {"negative"},  priority=3)
    public void thirdTest(){
        System.out.println("thirdTest negative");
    }

    @BeforeMethod (groups = {"negative","positive"})
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }

    @AfterMethod (groups = {"negative","positive"})
    public void afterMethod(){
        System.out.println("afterMethod");
    }



    @BeforeClass (groups = {"negative","positive"})
    public void beforeClass(){
        System.out.println("beforeClass");
    }

    @AfterClass (groups = {"negative","positive"})
    public void AfterClass(){
        System.out.println("AfterClass");
    }


}
