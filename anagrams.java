
class Main {
    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] map = new int[26]; //creating an array of 26 size(26 alphabates)
        for (int i=0; i<s.length(); i++) {
            map[s.charAt(i)-97]++; //increasing each alphabate occurance in s (97 is ascii value of 'a')
            map[t.charAt(i)-97]--; //decreasing each alphabate occurance in t
        }
        for (int i=0; i<26; i++) {
            if (map[i] != 0) {  //checking if the occurance is nullified or not (cuz of anagrams each char will hv same occurance)
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s="abcb";
        String t="acbb";
        

        boolean b= isAnagram(s,t);
        System.out.println(b);

}
}