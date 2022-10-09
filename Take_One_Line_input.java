import java.util.Scanner;

public class Take_One_Line_input {
    public static void main(String[] args) {

                String[] input;
                String a,b;
                Scanner sc=new Scanner(System.in);
                input=sc.nextLine().split(" ");

                a=input[0];
                b=input[1];
                int a1=Integer.parseInt(a);
                int b1=Integer.parseInt(b);
                System.out.println(a1+" "+b1);
                System.out.println(a1*b1);


    }
}
