public static int findMiddleIndex(int [] nums){
  //nums = [1,-1,4]
        int n = nums.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++){
            totalSum += nums[i];
        }

        int leftSum = 0;
        for (int i = 0; i < n; i++){
            if (leftSum == totalSum - leftSum - nums[i]){
                return i;
            } else {
                leftSum += nums[i];
            }
        }
        return -1;
    }

class Solution {
    public int findMiddleIndex(int[] nums) {
    int Lsum = 0;
		int Tsum = 0;
		for (int i: nums){
			Tsum += i;
		}

		for (int i=0; i<nums.length; i++) {
			Tsum -= nums[i];
			if (Tsum == Lsum) {
				return i;
			}
		Lsum += nums[i];
		}
        return -1;
    }
        
}
