package code.util.rev;

public class MainClient {

    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Nuthing to reverse!!");
        } else {
            ReverseUtility rv = new ReverseUtility();
            String result = rv.myReverseString(args[0]);
            System.out.println("Reverse of " + args[0] + "is " + result);
        }
    }
}
