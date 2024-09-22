package API.Testing.ex_21092024.TestNGExamples;

import org.apache.log.Priority;
import org.testng.annotations.Test;

import javax.crypto.spec.PSource;

public class TestNG005 {

    @Test(priority = 1)
    public void t1(){
        System.out.println("1");
    }

    @Test(priority = 0)
    public void t2(){
        System.out.println("2");
    }

    @Test(priority = 2)
    public void t3(){
        System.out.println("3");
    }

}
