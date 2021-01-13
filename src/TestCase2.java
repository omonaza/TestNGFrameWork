import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestCase2 {
    @BeforeSuite

    public void initializeTest(){
        System.out.println("started selenium web driver to open the browser  ");
    }

    @Test(groups ={"smoke"} )
    public void test1(){
        System.out.println(" automate scenarios and test to be done");

    }

    @Test(groups ={"regression"} )
    public void test2(){
        System.out.println(" automate scenarios and test to be done");

    }
    @AfterSuite
    public void close(){
        System.out.println("close browser");
    }

}
