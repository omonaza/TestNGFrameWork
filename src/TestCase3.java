import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase3 {

    @BeforeClass
    public void accountLogIn(){
        System.out.println("Account has be logged in");
    }
    @AfterClass
    public void accountLogOut(){
        System.out.println("The account logged out");
    }

    @Test(groups ={"smoke"} )
    public void updateProfile() {
        System.out.println(" automate scenarios and test to be done");

    }

    @Test(groups ={"regression"} )
    public void verifyBankBalance(){
        System.out.println(" automate scenarios and test to be done");

    }
}