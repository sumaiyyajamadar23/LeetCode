package LeetCode;

public class Palindrome_ineger9 
{
	   public static boolean isPalindrome(int x)
	    {
	        int r;
	       int newno=0;
	       int temp=x;
	        while(x>0)
	        {
	            r=x%10;
	            newno=(newno*10)+r;
	            x=x/10;

	        }
	        if(temp==newno)
	        {
	            return true;
	        }
	        else
	        {
	        return false;
	        }
	    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));

	}

}
