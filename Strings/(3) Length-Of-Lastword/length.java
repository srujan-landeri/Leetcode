public class length {
        public int lengthOfLastWord(String s) {
            int i = s.length() - 1;
            int len = 0;
    
            while(s.charAt(i) == ' '){
                i--;
            }
    
            while(i!= -1 && s.charAt(i) != ' '){
                len++;i--;
            }
    
            return len;
        }
}
