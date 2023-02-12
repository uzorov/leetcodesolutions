////////// Лучшее решение по времени 

 public boolean isPalindrome(int x) {
        if(x < 0) {
	        return false;
        }

        int y = x;
        int z = 0;
        while(y > 0){
            z = z * 10 + y % 10;
            y = y / 10;
        }	

        return x == z;
    }

//////////

/////////////////////////////////////	Лучшее по памяти

 public boolean isPalindrome(int x) {
        if(x<0) return false;
   
        int c=0;
       
        while (x>c){
        
            c=c*10+x%10;
            x=x/10;
        }
            
        return x == c;
        if(x==c)return true ; //for even number of digits
        if(c/10 == x) return true;
   			return false;
    }

    
    ///////////////////////////////////
