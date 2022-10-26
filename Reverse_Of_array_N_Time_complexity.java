import java.util.Scanner;

public class Reverse_Of_array_N_Time_complexity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int temp ;
        int start=0;
        int end=n-1;

        while(start<end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;


        }
        System.out.println("printing an array after reversing");

        for(int j=0; j<n; j++){
            System.out.println(arr[j]);
        }


    }
}
