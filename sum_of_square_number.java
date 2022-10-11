import java.util.Scanner;

public class sum_of_square_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for(int i=0; i<=c; i++)
        {
            for(int j=0;j<=c; j++)
            {
                if(((i*i)+ (j*j))== c)
                {
                    System.out.println("true");
                }
            }
        }
    }
}
