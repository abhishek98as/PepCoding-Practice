public class Splitting_the_strings {
    public static void main(String[] args) {

     String s="abc def ghi ijk lmn";
     String[] parts=s.split(" ");
     for(int i=0; i<parts.length; i++)
     {
         System.out.println(parts[i]);
     }

    }
}
