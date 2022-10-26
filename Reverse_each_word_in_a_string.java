public class Reverse_each_word_in_a_string {
    public static void main(String[] args) {
        String str = "welcome to india";  //original string

        String[] words = str.split(" ");  //splitiing theworld

        String reverseString = "";

        for (String w : words)
        {
            String reverseword = "";
                for (int i = w.length() - 1; i >= 0; i--)  //welcome
                {
                reverseword = reverseword + w.charAt(i);
                }
                     reverseString=reverseString+reverseword+" ";
        }
        System.out.println(reverseString);
    }
}