import java.util.*;
import java.util.Scanner;

public class finding_max_in_in_java_v_2 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            int[] arr=new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i]=sc.nextInt();
            }
            int max=arr[0];
            int min=arr[0];
            for (int j=0; j<arr.length; j++)
            {
                if(max<=arr[j])
                {
                    max=arr[j];
                }
                if(min>=arr[j])
                {
                    min=arr[j];
                }

            }

            System.out.println(max);
            System.out.println(min);


        }
    }


