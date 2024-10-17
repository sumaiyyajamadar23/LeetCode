package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mejority_elements_169 
{
	//static Map<Integer, Integer> mp=new HashMap<Integer, Integer>();
	 //   public static int majorityElement(int[] nums)
	    /* {
	    	int count=1;
	    	for(int i=0;i<nums.length;i++)
	    	{
	    		for(int j=i;j<nums.length;j++)
	    		{
	    			if(nums[i]==nums[j])
	    			{
	    				mp.put(nums[i],count);
	    				count++;
	    			}
	    			
	    		}
	    	}
	    	for (Map.Entry<Integer,Integer> entry : mp.entrySet()) 
	            System.out.println("Key = " + entry.getKey() +
	                             ", Value = " + entry.getValue());
			return 0;
				 
	     }*/
		/*
		 * public static int majorityElement(int[] nums) { int count=1; int num=0;
		 * for(int i=0;i<nums.length;i++) { for(int j=i+1;j<nums.length;j++) {
		 * if(nums[i]==nums[j]) { count++; } } if(count>(nums.length/2)) { num=nums[i];
		 * break; } else count=1; } return num; }
		 */
	 public static int majorityElement(int[] nums) {
	        int majority=0;
	        int maxCount=0;
	        for(int i=0;i<nums.length;i++){
	            int count=1;
	            for(int j=i+1;j<nums.length;j++){
	               if(nums[i]==nums[j]){
	                   count++;
	               }
	               if(count > majority){
	                   maxCount=nums[i];
	               }
	               majority=Math.max(majority,count); 
	            }
	        }
	        return maxCount;
	    }

	public static void main(String[] args) {
		 System.out.println(majorityElement(new int[] {3,9,2,9,3,6,7,8,9,9,1,3}));

	}
	
	}

