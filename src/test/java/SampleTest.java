import org.junit.Assert;
import org.junit.Test;


public class SampleTest {

    @Test
    public void passTest1() {
        Assert.assertTrue(true);
    }

    @Test
    public void failedTest1() {
        Assert.assertTrue(false);
    }
}
