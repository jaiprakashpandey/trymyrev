package code.util.rev;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseUtilityTest {

    ReverseUtility utilityInstance = null;
    TestCaseBuilder buildTestCaseString = null;

    @Before
    public void setUp() throws Exception {
        utilityInstance = new ReverseUtility();
        buildTestCaseString = new TestCaseBuilder(utilityInstance);
    }

    @After
    public void tearDown() throws Exception {
        utilityInstance = null;
    }

    @Test
    public void testBasicString() {
        String INPUT_STRING = "JAI PRAKASH PANDEY";
        String EXPECTED_RESULT = "YEDNAP HSAKARP IAJ";

        boolean result = buildTestCaseString
                .withGivenString(INPUT_STRING)
                .whenReverseUtilityIsFired()
                .thenResultOfUtilityShouldBe()
                .verifyResult(EXPECTED_RESULT);

        Assert.assertTrue(result);

    }

    @Test
    public void testBlankString() {
        String INPUT_STRING = "";
        String EXPECTED_RESULT = "";

        boolean result = buildTestCaseString
                .withGivenString(INPUT_STRING)
                .whenReverseUtilityIsFired()
                .thenResultOfUtilityShouldBe()
                .verifyResult(EXPECTED_RESULT);

        Assert.assertTrue(result);

    }

    @Test
    public void testNullString() {
        String INPUT_STRING = "";
        String EXPECTED_RESULT = "";

        boolean result = buildTestCaseString
                .withGivenString(INPUT_STRING)
                .whenReverseUtilityIsFired()
                .thenResultOfUtilityShouldBe()
                .verifyResult(EXPECTED_RESULT);

        Assert.assertTrue(result);

    }

    @Test
    public void testDuplicateInBetwenString() {
        String INPUT_STRING = "hello";
        String EXPECTED_RESULT = "olleh";

        boolean result = buildTestCaseString.
                withGivenString(INPUT_STRING)
                .whenReverseUtilityIsFired()
                .thenResultOfUtilityShouldBe()
                .verifyResult(EXPECTED_RESULT);

        Assert.assertTrue(result);

    }

    @Test
    public void testAnotherString() {
        String INPUT_STRING = "Hannah";
        String EXPECTED_RESULT = "hannaH";

        boolean result = buildTestCaseString.withGivenString(INPUT_STRING)
                .whenReverseUtilityIsFired()
                .thenResultOfUtilityShouldBe()
                .verifyResult(EXPECTED_RESULT);

        Assert.assertTrue(result);

    }

    @Test
    public void testPrintableAschiCharacters() {
        String INPUT_STRING = "---)(*&^%$#@!^^-+7653432gsfcba///?<>[]{}''||\\\\:;````-~%!!!***&&&###$A@=??,01234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ~~~";
        String EXPECTED_RESULT = "~~~ZYXWVUTSRQPONMLKJIHGFEDCBAzyxwvutsrqponmlkjihgfedcba09876543210,??=@A$###&&&***!!!%~-````;:\\\\||''}{][><?///abcfsg2343567+-^^!@#$%^&*()---";

        boolean result = buildTestCaseString
                .withGivenString(INPUT_STRING)
                .whenReverseUtilityIsFired()
                .thenResultOfUtilityShouldBe()
                .verifyResult(EXPECTED_RESULT);

        Assert.assertTrue(result);

    }

    @Test
    public void testNumberAsString() {
        String INPUT_STRING = "1234567890";
        String EXPECTED_RESULT = "0987654321";

        boolean result = buildTestCaseString
                .withGivenString(INPUT_STRING)
                .whenReverseUtilityIsFired()
                .thenResultOfUtilityShouldBe()
                .verifyResult(EXPECTED_RESULT);

        Assert.assertTrue(result);

    }
}