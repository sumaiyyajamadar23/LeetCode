package LeetCode;

public class Longest_Common_Prefix14
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String[] strs = { "flower", "flow", "floight"};
		System.out.println(longestCommonPrefix(strs));
	}

	
		 public static String longestCommonPrefix(String[] strs)
		 {
            StringBuffer st=new StringBuffer();
             if(strs==null||strs.length==0)
             {
            	return st.toString(); 
             }
             int min=strs[0].length();
             for(int i=0;i<strs.length;i++)
             {
            	 min=Math.min(min,strs[i].length());
             }
             for(int i=0;i<min;i++)
             {
            	 char c=strs[0].charAt(i);
            	 for(String str:strs)
            	 {
            		 if(str.charAt(i)!=c)
            		 {
            			 return st.toString();
            		 }
            	 }
            	 st.append(c);
             }				
            return st.toString();	        
		  }
}

/*
		String res = "";
		// int num1=0;int num2=0;
		int[] num = new int[2];
		int x = 0;
		for (int i = 1; i < s.length; i++) 
		{
			int c = 0;
			
			for (int j = 0; j < s[i].length(); j++) 
			{
				if(s[0].charAt(j) == s[i].charAt(j)) 
				{
					c++;
				}
			}
			num[x] = c;
			x++;
		}
		int resnnum = Math.min(num[0], num[1]);
		for (int i = 0; i < resnnum; i++) {
			res = res + s[0].charAt(i);
		}
		return res;
	
	}
 */
