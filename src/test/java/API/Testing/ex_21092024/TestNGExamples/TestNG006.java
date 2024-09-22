package API.Testing.ex_21092024.TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG006 {

    @Test(groups = {"Sanity", "qa", "preprod"})
    public void sanityRun(){
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test(groups = {"qa", "preprod", "reg"})
    public void Regrun(){
        System.out.println("Reg");
        Assert.assertTrue(false);
    }

    @Test(groups = {"dev", "stage"})
    public void SmokeRun(){
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }
}
