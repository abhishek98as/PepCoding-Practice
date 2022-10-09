import java.util.Scanner;

public class Bar_char_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]= sc.nextInt();
        System.out.print(maxWater(arr, n));
    }
        public static int maxWater(int[] arr, int n)
        {

            // To store the maximum water
            // that can be stored
            int res = 0;

            // For every element of the array
            // except first and last element
            for (int i = 1; i < n - 1; i++) {

                // Find maximum element on its left
                int left = arr[i];
                for (int j = 0; j < i; j++) {
                    left = Math.max(left, arr[j]);
                }

                // Find maximum element on its right
                int right = arr[i];
                for (int j = i + 1; j < n; j++) {
                    right = Math.max(right, arr[j]);
                }

                // Update maximum water value
                res += Math.min(left, right) - arr[i];
            }
            return res;
        }}








