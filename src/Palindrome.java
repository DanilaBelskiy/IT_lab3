public class Palindrome {

    // Print true or false for each argument, depending on whether it is a palindrome or not
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)){
                System.out.print(String.format(s + " "));
            }
            //System.out.print(String.format("%s ", isPalindrome(s)));
        }
        System.out.println();
    }

    // Return reversed str
    public static String reverseString(String str){
        String new_str = "";
        for (int i = str.length()-1; i >= 0; i--) {
            new_str += str.charAt(i);
        }
        return new_str;
    }

    // Return true if str - palindrome, else return true
    public static boolean isPalindrome(String str) {
        String reversed_str = reverseString(str);
        return str.equals(reversed_str);
    }
}
