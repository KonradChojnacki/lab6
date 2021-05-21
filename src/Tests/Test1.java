package Tests;
import static App.Main.*;
import org.junit.Assert;
import org.junit.Test;

public class Test1 {
     @Test
     public void test1()
     {
         Assert.assertEquals(init_max(10,5),10);
     }

    @Test
    public void test2()
    {
        Assert.assertEquals(init_min(6,9),6);
    }
    @Test
    public void test3()
    {
        Assert.assertTrue(isPositive(5));
    }
 }


