//////////////////////////////
////////////Наши решения
 static int[] visited; //visited -> [0, 9, 8, 5, 6, 9] -> [9, 9]

    public List<Integer> mostVisited(int n, int[] rounds) {
        visited = new int[n+1];
        
        for (int m = 0; m < rounds.length-1; m++) {
            IncreaseValues(rounds[m], rounds[m+1], n);
        }

        visited[rounds[rounds.length-1]]++;

        int maxValue = Integer.MIN_VALUE;
        for (int i : visited) {
            if (i > maxValue) maxValue = i;
        }

        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i < visited.length; i++) {

            if (visited[i] == maxValue) {
                answer.add(i);
            }
        }

        return answer;
    }


    public void IncreaseValues(int a, int b, int n) {
        //3..4
        while (a != b) {
            visited[a]++;
            a = a % n + 1;

        }

    }
//////////

//[1 3] 1, countVisitors[0]++; 2, countVisitors[1]++; 3 
public List<Integer> mostVisited(int n, int[] rounds) {
//  указатели
  int [] countVisited = new int [n];
        int prev  = rounds[0];
        for (int i = 1; i < rounds.length; i++){
            int start = prev;
            int end = rounds[i];
            while (start != end){
                countVisited[start - 1]++;
                start = start % n + 1;
            }
            prev = end;
        }

        countVisited[prev - 1] ++;
        int maxCount = 0;
        for (int count : countVisited){
            maxCount = Math.max(count, maxCount);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++){
            if(countVisited[i] == maxCount) {
                result.add(i + 1);
            }
        }

        List<Integer> res = new ArrayList<>(result.size());
        for (int i = 0; i < res.size(); i++){
            res.add(i, result.get(i));
        }
        return res;
        }
  


//////////////////////////
//////Лучшее по памяти
class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int length = rounds.length;
        int start = rounds[0];
        int end = rounds[length-1];
        List<Integer> result = new ArrayList<>();
        
		//case 1: add everything from the round
        int i = start;
        if (start <= end) while (i <= end) result.add(i++);
        //case 2: if end is lesser then we need to add 1 to end and start to n
		else{
            i = 1;
            while (i <= end) result.add(i++);
            i = start;
            while (i <= n) result.add(i++);
        }
        return result;
    }
}

/////////////////////////////
//////Лучшее по скорости

class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        // find start
        // find each circle
        // count how many circles
        // find end
        // any sectors between start and end inclusively should be in the List
        List<Integer> ret = new ArrayList<>();
        int left = rounds[0];
        int right = rounds[rounds.length - 1];

        if (left <= right) {
            for (int i = left; i <= right; i++) {
                ret.add(i);
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (i > right && i < left) {
                    continue;
                }
                ret.add(i);
            }
        }

        
        return ret;
    }
}
