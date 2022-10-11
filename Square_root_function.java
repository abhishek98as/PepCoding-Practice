import java.lang.Math;
import java.util.Scanner;

public class Square_root_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        double sq_root=Math.sqrt(x);
        int value = (int)sq_root;

        System.out.println(value);
    }
}
