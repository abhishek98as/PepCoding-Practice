import java.util.*;
public class prime_number_print_check {

    public static boolean isprime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n =23;
        for(int i=2; i<n; i++){
            if(!isprime(i)){
                System.out.println(i);
            }
        }

//        boolean Prime=isprime(23);
//        System.out.println(Prime);

    }
}
