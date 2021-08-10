package code.util.rev;

public class ReverseUtility {

    public String myReverseString(String inputString) {
        String retVal = null;

        if ("".equalsIgnoreCase(inputString))
            return "";

        if (null == inputString)
            return null;

        int lastIdx = inputString.toCharArray().length - 1;
        char[] reverseChars = new char[lastIdx + 1];
        int reverseStrIdx = 0;
        char[] originalStr = inputString.toCharArray();
        for (int i = lastIdx; i >= 0; i--) {
            reverseChars[reverseStrIdx] = originalStr[i];
            reverseStrIdx++;
        }
        retVal = String.valueOf(reverseChars);
        return retVal;
    }
}
