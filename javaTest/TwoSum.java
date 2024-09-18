package javaTest;

import java.util.Arrays;


	
	/*public void evenodd(int num) {
		if(num%2 ==0) {
			System.out.println(num+": Number is Even.");
		}else {
			System.out.println(num+": Number is Odd.");
		}
	}
    public static void main(String[] args) {
    	EvenOdd obj = new EvenOdd();
    	obj.evenodd(28);
    }*/

class TwoSum{
    public static void main(String[] args){
        int[] nums = {2,7,5,11};
        int target = 9;
        TwoSum obj = new TwoSum();
        
        System.out.println(Arrays.toString(obj.twoSum(nums, target)));
        
    }
    public int[] twoSum(int nums[], int target){
        for(int i=0; i<nums.length;i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
