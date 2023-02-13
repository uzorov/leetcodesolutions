/////////Наши решения

public boolean repeatedSubstringPattern(String s) {
        String s0 = "";
        for (char n : s.toCharArray()) {
            s0 += n;
            if (isRepeated(s0, s)) return true;
        }
        return false;
    }

    public boolean isRepeated(String s1, String s2) {

        if ((s2.length() % s1.length() == 0) && s1.length() != s2.length()) {
            for (int p = 0; p < s2.length() / s1.length(); p++) {
                if (!s2.substring(p*s1.length(), (p+1) * s1.length()).equals(s1)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
///////////////////////////////////


public  static boolean repeatedSubstringPattern(String s) {

  
        int n = s.length();
        for (int i = n/2; i > 0; i--){
            if (n % i == 0){
                boolean match = true;
                for (int j = i; j < n; j++){
                    if (s.charAt(j) != s.charAt(j-i)){
                        match = false;
                        break;
                    }
                }
                if (match){
                    return true;
                }
            }
        }
        return false;
    }

/////////////////////////////////////
//////////////Лушчее по памяти
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        //First Approach
        // int size=s.length();
        
        // String largeString=s.substring(1,size)+s.substring(0,size-1);

        // return largeString.contains(s);

        //Second Approach
        int length = s.length();
       for (int i = length/2;i>0;i--) {
        if(length%i == 0 && s.charAt(i-1) == s.charAt(s.length()-1)) {
            String str = s.substring(0,i);
            StringBuilder sb = new StringBuilder();
            int r = length/i;
            for(int j = 0;j<r;j++) {
                sb.append(str);
            } if(sb.toString().equals(s)) {
                return true;
            }
        }
       }
        return false;
    }
}






/////////////////////////////////////
///////////////Лучшее по скорости
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
       for (int i = length/2;i>0;i--) {
        if(length%i == 0 && s.charAt(i-1) == s.charAt(s.length()-1)) {
            String str = s.substring(0,i);
            StringBuilder sb = new StringBuilder();
            int r = length/i;
            for(int j = 0;j<r;j++) {
                sb.append(str);
            } if(sb.toString().equals(s)) {
                return true;
            }
        }
       }
        return false;
    }
}
