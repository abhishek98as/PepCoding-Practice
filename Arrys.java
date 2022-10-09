import java.util.Scanner;

public class Arrys {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int new_number=sc.nextInt();
        int[] arr=new int[new_number];


        for(int j=0; j<new_number; j++) {
            arr[j]=sc.nextInt();

            System.out.println(arr[j]);
        }
    }
}
