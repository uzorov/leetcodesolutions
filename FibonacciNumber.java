//////////Лучшее решение по скорости

class Solution {
    int[] memo = new int[31];

    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        if (memo[n] > 0) {
            return memo[n];
        }

        return memo[n] = fib(n - 1) + fib(n - 2);
    }
}

///////////////////////////////////////////////////
//////////

/////////////Лучшее решение по памяти

class Solution {
    public int fib(int n) {
        if(n == 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        }

        int firstNum = 1;
        int secondNum = 1;

        for(int i = 3; i <= n; i++) {
            int total = firstNum + secondNum;
            secondNum = firstNum;
            firstNum = total;
        }

        return firstNum;
    }
}


////////////////////////////////////////
///////////Наши решения:
//№1
class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        else return fib(n-1) + fib(n-2);
    }
}


//№2
 public int fib(int n){
        int[] fibArray = new int[n+1];
        fibArray[0] = 0;
        fibArray[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibArray[i] = fibArray[i-1] + fibArray[i-2];
        }
        return fibArray[n];
    }
