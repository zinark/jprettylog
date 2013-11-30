import org.fest.assertions.Assertions;
import org.junit.Test;

public class FooTest
{
    @Test
    public void testFoo() throws Exception
    {
        Assertions.assertThat("ferhat").contains("er");
    }

    @Test
    public void testBar() throws Exception
    {
        Assertions.assertThat("ferhat").contains("er");
    }
}
