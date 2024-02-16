import java.util.Stack;

public class removeStar {
    public String remove(String s){

        Stack<Character> wordStack = new Stack<>();
        String updatedStr = "";
        int wordlen = s.length();
        for(int i=0; i<wordlen; i++) {
            if(s.charAt(i) == '*') {
                wordStack.pop();
            }
            else {
                wordStack.push(s.charAt(i));
            }
        }

        wordStack.toString();

        for(int j=0; j<wordStack.size(); j++) {
            updatedStr = updatedStr.concat(String.valueOf(wordStack.elementAt(j)));
        }
        
        return updatedStr;
    }
}
