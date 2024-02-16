class gcdString {
    public String gcdOfStrings(String str1, String str2) {
        
        int l1 = str1.length();
        int l2 = str2.length();
        int gcdval = gcd(l1, l2);
        int num = l1/gcdval; 
       
        for (int i = 0; i< num; i++){
            
            String s1 = str1.substring(i*gcdval, (i+1)*gcdval);
            String s2 = str2.substring(0,gcdval);
            if(!s1.equals(s2)) {
                return "";
            }
        }
       
        for (int i = 0; i<l2/gcdval; i++) {

            String s1 = str2.substring(i*gcdval, (i+1)*gcdval);
            String s2 = str2.substring(0, gcdval);
            if(!s1.equals(s2)) {
                return "";
            }
        }
               
        return str2.substring(0,gcdval);
    }

    public int gcd(int l1, int l2) {

        while(l1 != l2) {
            if (l1>l2) {
                return gcd(l1-l2, l2);
            }
            else {
                return gcd(l1, l2-l1);
            }
        }
        return l1;
    }
    
}