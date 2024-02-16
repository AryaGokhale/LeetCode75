public class reverseString { 

    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        String reveresedString = "";
        for(int i=words.length-1; i>=0; i--) {
            if(words[i] != "") {
                
                if(i>0) {
                    reveresedString = reveresedString +words[i] + " ";
                }
                else {
                    reveresedString = reveresedString + words[i];
                }
                
            }
        }
       return reveresedString;
    }

}