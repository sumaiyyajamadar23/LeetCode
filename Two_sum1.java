package LeetCode;

import java.util.Arrays;

public class Two_sum1 {

	    public static int[] twoSum(int[] nums, int target)
	     {
	    	/*
	    	 * 	         //int n=0;
	         int a[]=new int[2];
	        for(int i=0;i<nums.length-1;i++)
	        {
	            for(int j=1;j<nums.length-1;j++)
	            {
	                if((nums[i]+nums[j])==target)
	                {
	                    a[0]=i;
	                    a[1]=j;
	                  
	                }
	               
	            }
	        }
	        return a;
	    	 */
	    	int a[]=new int[2];
	          for (int i = 0; i < nums.length; i++) 
	          {
	            for (int j = i + 1; j < nums.length; j++) 
	            {
	                if (nums[i] + nums[j] == target)
	                 {
	                   a[0]=i;
	                   a[1]=j;
	                }
	            }
	        }
	        return a;
	    }
	
	public static void main(String[] args)
	{
	System.out.println(Arrays.toString(twoSum(new int[] {3,2,4},6)));	

	}

}
