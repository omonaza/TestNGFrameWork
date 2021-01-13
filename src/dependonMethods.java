import org.testng.Assert;
import org.testng.annotations.Test;

public class dependonMethods {
    @Test(groups = {"smoke"})
    public void test1() {
        System.out.println(" automate scenarios and test to be done 1");
        Assert.assertEquals(11,11);
    }

    @Test(dependsOnMethods = {"test1"},groups = {"smoke"})
    public void dependingMethod(){
        System.out.println("Print message");
    }

    @Test(groups = {"regression"})
    public void test2() {
        System.out.println(" automate scenarios and test to be done 2");

    }
}