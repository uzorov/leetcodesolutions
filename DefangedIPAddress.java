    /////////////////////////////////
//////////////Наши решения
public String defangIPaddr(String address) {

        StringBuilder defangedStr = new StringBuilder();
        String[] s = address.split("\\.");
        defangedStr = new StringBuilder(s[0]);
        for (int i = 1; i < s.length; ++i) {
            defangedStr.append("[.]").append(s[i]);
        }
        return defangedStr.toString();
    }
/////////////////////////////////////
///////////////

public static String defangIPaddr(String address){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++){
            char c = address.charAt(i);
            if (c == '.'){
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

