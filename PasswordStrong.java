public static boolean isPasswordStrong(String password){
        if (password.length() < 8){
            return false;
        }
  			boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        String specials = "!@#$%^&*()-+";
        for (int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
          	if (password.charAt(i) == password.charAt(i-1)){
                return false;
            }
            if(c >= 'a' & c <= 'z'){
                hasLowercase = true;
            } else if (c >= 'A' & c <= 'Z') {
                hasUppercase = true;
            } else if (c >= '0' & c <= '9') {
                hasDigit = true;
            } else if (specials.indexOf(c) != -1) {
                hasSpecial = true;
            } 
        }
        if (!hasSpecial || !hasDigit || !hasLowercase || !hasUppercase){
            return false;
        }
        for (int i = 1; i < password.length(); i++){
            if (password.charAt(i) == password.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
