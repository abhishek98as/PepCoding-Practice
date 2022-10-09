import java.util.*;
public class finding_index_of_element_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();

        }

        int data=sc.nextInt();
        int index=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==data){
                index=i;
                break;
            }
        }
        System.out.println(index);

    }
}
