class mergeStringAlternately {
    public String mergeAlternately(String word1, String word2) {
        int wl1 = word1.length();
        int wl2 = word2.length();
        String new_word = "";

        int smallest;
        if(wl1 <= wl2) {
            smallest = wl1;
        }
        else{
            smallest = wl2;
        }

        for (int i = 0; i<smallest ; i++)
        {
            new_word = new_word + Character.toString(word1.charAt(i)) + Character.toString(word2.charAt(i));
        }
        if(wl1 > wl2) {
            new_word = new_word + word1.substring(smallest, wl1);
        }
        else {
            new_word = new_word + word2.substring(smallest, wl2);
        }

        return new_word;

    }
}