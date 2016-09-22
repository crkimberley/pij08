import java.util.Scanner;

/**
 * @author crkimberley on 22/09/2016.
 */
public class HashTest {
    public static void main(String[] args) {
        new HashTest().launch();
    }

    private void launch() {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a string and I will calculate its hash code");
        String str = input.nextLine();
        System.out.println(str);
        int hash = str.hashCode();
        System.out.println("Hash from hashCode()" + hash);
        int smallHash = HashUtilities.shortHash(hash);
        System.out.println("0 < " + "Hash from HashUtilities.shortHash(): " + smallHash + " < 1000");
    }
}
