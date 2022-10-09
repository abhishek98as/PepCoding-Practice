import java.util.*;
public class Finding_max_min_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();

        }
        int max=arr[0];
        for (int j=0; j<arr.length; j++)
        {
            if(max<=arr[j]){
                max=arr[j];

            }
        }

        int min=arr[0];
        for(int k=0; k< arr.length; k++)
        {
            if(min>=arr[k])
            {
                min=arr[k];
            }
        }
        System.out.println(max);
        System.out.println(min);


    }
}
