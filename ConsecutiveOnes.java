public int findMaxConsOnes(int [] nums){
        int maxCons = 0;
        int currentCons = 0;

        for (int num: nums){
            if (num == 1){
                currentCons++;
            } else {
                maxCons = Math.max(maxCons, currentCons);
                currentCons = 0;
            }
        }
        maxCons = Math.max(currentCons, maxCons);
        return maxCons;
    }
public int findMaxConsOnes(int [] nums){
        int maxCons = 0;
        int currentCons = 0;

        for (int num: nums){
            if (num == 1){
                currentCons++;
            } else {
                maxCons = Math.max(maxCons, currentCons);
                currentCons = 0;
            }
        }
        maxCons = Math.max(currentCons, maxCons);
        return maxCons;
    }
