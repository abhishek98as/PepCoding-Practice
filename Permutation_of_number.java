import java.util.Scanner;

public class Permutation_of_number {

    public static int fact(int x) {
        int mul_num = 1;
        for (int i = 1; i <= x; i++) {
            mul_num=mul_num * i;
        }

        return mul_num;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

        int n_fact=fact(n);
        int r_fact=fact(n-r);


        int npr=n_fact/r_fact;
         System.out.println(n+"P"+r+"="+npr);

//        int n_fact=1;
//        for(int i=1; i<=n; i++)
//        {
//            n_fact*=i;
//        }
//
//        int r_fact=1;
//        for(int i=1; i<=n-r;i++)
//        {
//            r_fact*=i;
//        }
//
//




;    }
}
