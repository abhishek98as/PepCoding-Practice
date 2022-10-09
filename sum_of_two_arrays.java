import java.util.Scanner;

public class sum_of_two_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int s1=sc.nextInt();
        int s2=sc.nextInt();

        int[] arr1=new int[s1];
        int[] arr2=new int[s2];


        for(int i=0; i<arr1.length; i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0; i<arr2.length; i++){
            arr2[i]=sc.nextInt();
        }
        int[]sum=new int[s1>s2 ? s1:s2];
        }
    }

