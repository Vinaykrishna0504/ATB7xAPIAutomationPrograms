package API.Testing.ex_21092024.TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG009 {

    @Test
    public void test01(){
        Assert.assertTrue(true);
    }

    @Test(enabled = false)
    public void test02(){
        Assert.assertTrue(false);
    }

    @Test
    public void test03(){
        Assert.assertTrue(true);
    }
}
