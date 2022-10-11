import java.util.Arrays;
import java.util.Scanner;
public class Anagram_Question {

        static boolean isAnagram(String a, String b) {

                char[] a1 = a.toCharArray();
                char[] b1 = b.toCharArray();

                Arrays.sort(a1);
                Arrays.sort(b1);

                if (a1.equals(b1)) {
                    return false;
                }

                return true;
            }
            public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String a = scan.next();
                String b = scan.next();
                scan.close();
                boolean ret = isAnagram(a, b);
                System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
            }
        }
