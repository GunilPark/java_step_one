package t_test;

public class Test {

		int[] nums = new int[5];
	
	    public int[] twoSum(int[] nums, int target) {
	        int[] sum = new int[2];
	        for(int i =0; i<nums.length; i++){
	            for(int j =0; i<j; j++){
	                if(target == nums[i]+nums[j]){
	                     sum[0]=i;
	                     sum[1]=j;
	                }
	                
	            }
	        }
	        return sum;
	    
	    }
	    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
