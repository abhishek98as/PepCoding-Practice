import java.util.*;
public class Search_element_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int find=sc.nextInt();

        int[] arr=new int[n];
        boolean b=false;
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        int mil_gya=-1;
        for(int j=0; j<arr.length; j++)
        {
            if(find==arr[j])
            {
               mil_gya=j;
               break;
            }
        }

        System.out.println(mil_gya);
    }
}
