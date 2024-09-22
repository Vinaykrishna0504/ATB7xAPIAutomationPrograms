package API.Testing.ex_21092024.TestNGExamples;

import org.testng.annotations.Test;

import java.util.SortedMap;

public class TestNG007 {

    @Test
    public void serverStartedOk(){
        System.out.println("I will run first");
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void testmethod1(){
        System.out.println("Method1");
    }
}
