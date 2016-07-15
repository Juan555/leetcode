public class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) return "";
        s = s.trim();
        StringBuilder res = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].equals("")) {
                res.append(words[i]);
                if (i != 0) res.append(" ");
            }
        }
        return res.toString(); // remove last space
    }
    
}