import java.util.*;

public class Input {
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in); // one scanner calss will be enough
        String name = a.nextLine(); // you can take  variables from that scanner class
        int rollnum = a.nextInt();
        float marks = a.nextFloat();
        // nextDouble() for double values
        // nextLong() for long values
        System.out.println(name);
        System.out.println(rollnum);
        System.out.println(marks);

    }
}