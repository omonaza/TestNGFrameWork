import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("running before method ");

    }


    @Test(groups ={"smoke"} )
    public void test1(){
        System.out.println("first method ");
        Assert.assertEquals(11,11);
    }


    @Test(groups = {"regression"},enabled = false,priority = 1)
    public void test2(){
        System.out.println("second method  ");
        Assert.assertEquals(1,11);
    }

    @AfterMethod
    public void afterMethod () {
        System.out.println("running after each method");
    }
}
