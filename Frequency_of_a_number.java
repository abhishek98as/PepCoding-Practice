import java.util.Scanner;

public class Frequency_of_a_number {
    public static int get_frequency(int n, int d) {
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            if (digit == d) {
                count++;
            }

        }
        return count;
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
           int  d = sc.nextInt();
            int Total = get_frequency(n, d);
            System.out.println(Total);
        }
    }

