public class Revese_of_array_by_1_loop {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int i,j = 0;
        for( i=arr.length-1; i>=0; i--){
            if(j<i) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                System.out.print(arr[j]+" ");
                j++;

            }
            else{
                System.out.print(arr[j]+" ");
                j++;
            }
        }


    }
}
