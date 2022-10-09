public class finding_last_string {
    public static void main(String[] args) {
        String str="My name is hulk";

        String lastWord = str.substring(str.lastIndexOf(" ")+1);
        System.out.println(lastWord);
    }
}
