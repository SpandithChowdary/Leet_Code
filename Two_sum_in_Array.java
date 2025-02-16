package LCProblems;

import java.util.*;

public class Two_sum_in_Array {
	     static int[] twoSum(int[] nums, int target) {
	        HashMap<Integer,Integer> map = new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	            int value = target - nums[i];
	            if(map.containsKey(value)){
	                return new int[]{map.get(value),i};
	            }
	            map.put(nums[i],i);
	        }
	        return new int[]{};
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
    	int[] num = new int[size];
    	for(int i=0; i< size ;i++) {
    		num[i] = sc.nextInt();
    	}
    	int target = sc.nextInt();
    	int[] result = twoSum(num, target);

        if (result.length > 0) {
            System.out.println("Pair found at indices: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No pair found");
        }
    	sc.close();
	}

}
