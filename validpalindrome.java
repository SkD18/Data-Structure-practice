public class validpalindrome {
    static boolean isPalindrome(String s) {
        char[] c = s.toCharArray(); //creating char array of this string
        
        for (int i = 0, j = c.length - 1; i < j; ) {

            if (!Character.isLetterOrDigit(c[i])) i++; //check if its not an alphanumeric(a-z,0-9) increament index to next element(i)

            else if (!Character.isLetterOrDigit(c[j])) j--;//check if its not an alphanumeric(a-z,0-9) decrement index to previous element(j)

            //if lowerCased elements doesnt match return false
            else if (Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--])) 

                return false;
        }
        return true;
    }

    public static void main(String[] args){

        String s="A1 Bob 1a";
    
        boolean b= isPalindrome(s);
        System.out.println(b);

}
}
