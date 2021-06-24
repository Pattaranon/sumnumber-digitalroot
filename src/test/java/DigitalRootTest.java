import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;

public class DigitalRootTest {
    private DigitalRoot digitalRoot;

    @Before
    public void setUp() {
        digitalRoot = new DigitalRoot();
    }

    @Test
    public void testDigitalRoot() {
        //You are able to add more unit test to make it coverage.
        Assert.assertThat(digitalRoot.check(9), Matchers.equalTo(9L));
        Assert.assertThat(digitalRoot.check(934623324L), Matchers.equalTo(9L));
        Assert.assertThat(digitalRoot.check(1235889343324L), Matchers.equalTo(1L));
        Assert.assertThat(digitalRoot.check(493193L), Matchers.equalTo(2L));
    }


    @Test(expected = InputMismatchException.class)
    public void testInvalidInput() {
        digitalRoot.check(-87625L);
    }
}
