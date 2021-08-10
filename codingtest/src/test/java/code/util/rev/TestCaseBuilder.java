package code.util.rev;

public class TestCaseBuilder {

    ReverseUtility instance = null;

    public TestCaseBuilder(ReverseUtility utilityInstance) {
        instance = utilityInstance;
    }

    public String getTestCaseString() {
        return testCaseString;
    }

    public void setTestCaseString(String testCaseString) {
        this.testCaseString = testCaseString;
    }

    String testCaseString = null;

    public String getResultString() {
        return resultString;
    }

    public void setResultString(String resultString) {
        this.resultString = resultString;
    }

    String resultString = null;

    public TestCaseBuilder withGivenString(String inputTestCaseString) {
        this.setTestCaseString(inputTestCaseString);
        return this;
    }

    public TestCaseBuilder whenReverseUtilityIsFired() {
        this.setResultString(this.instance.myReverseString(this.getTestCaseString()));
        return this;
    }

    public TestCaseBuilder thenResultOfUtilityShouldBe() {
        return this;
    }

    public boolean verifyResult(String expectedString) {
        return expectedString.equalsIgnoreCase(this.getResultString());
    }
}
