package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_duplicate_Element_sorted26 {

	
	    private static int removeDuplicates(int[] nums)
	    {
	    	List<Integer> l=new ArrayList<Integer>();
	        int count = 0;
	        for (int i = 0; i < nums.length; i++) 
	        {
	            // If the current element is equal to the next element, we skip
	            if (i < nums.length - 1 && nums[i] == nums[i + 1]) 
	            {
	                continue;
	            }
	            // We will update the array in place
	           l.add( nums[i]);
	            count++;
	            System.out.println(l);
	        }
	        return count;
	    }

	    public static void main(String[] args)
	    {
	        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
	        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4,3}));
	    }
	}
	
