import java.util.Scanner;

public class UserInput {
    private static Scanner sc = new Scanner(System.in);

    public static String textInput(){
        return sc.nextLine();
    }

    public static int numeralInput(){
        return sc.nextInt();
    }
}
