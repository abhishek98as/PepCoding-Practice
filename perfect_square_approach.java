import java.util.Scanner;

public class perfect_square_approach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double sqr=Math.sqrt(num);

        int i=(int)sqr;

        int j=i*i;

        if(num==j){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}
