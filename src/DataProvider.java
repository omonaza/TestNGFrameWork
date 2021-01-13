import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProvider {

    @org.testng.annotations.DataProvider(name = "loginTestData")
    public static Object[][] loginTestMethod() {
        return new Object[][]{
                {"Motorolla12321", "100"},
                {"neomatrix@gmail.com", "200"},
                {"natali@gmail.com", "300"}
        };
    }
    @Test(dataProvider = "loginTestData", groups = {"smoke"})
    public void login(String name, String expected) {
        //open browser
        // chrome
        //login
        //retrieve some data from webapp
        //expected
        //asswertion
        // System.out.println("password" + password);
        //another logic will search for the dealName
        // you will have dynamic code which will grab the data from web app based on the dealName
        String actualValue1 = "100";
        String actualValue2 = "200";
        String actualValue3 = "300";
        String expectedValue = "100";
        Assert.assertEquals(expectedValue,actualValue1);
    }

}
