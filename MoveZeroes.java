package leetcode;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
        int length = nums.length;
        int checkIndex = 0;
        int keeperIndex = 0;
        
        while(checkIndex<length){
            if(nums[checkIndex]==0){
                checkIndex++;
                continue;
            }
            if(checkIndex != keeperIndex) {
                nums[keeperIndex] = nums[checkIndex];
                nums[checkIndex] = 0;
            }
            checkIndex++;
            keeperIndex++;
        }
    }
}
