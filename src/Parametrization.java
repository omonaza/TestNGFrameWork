import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {


    @Test(groups ={"smoke"} )
    @Parameters({"userName","Password"})
    public void test1(String userName,String pass){
        System.out.println(userName);
        System.out.println(pass);

    }

}
