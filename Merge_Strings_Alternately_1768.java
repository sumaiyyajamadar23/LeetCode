package LeetCode;

public class Merge_Strings_Alternately_1768 
{
public static String mergeString(String s1,String s2)
{
	StringBuilder result= new StringBuilder();
	int i = 0;
	while(i<s1.length()||i<s2.length())
	{
		if(i<s1.length())
		{
			result.append(s1.charAt(i));
		}
		if(i<s2.length())
		{
			result.append(s2.charAt(i));
		}
		i++;
	}
	return result.toString();
	
}

public static void main(String args[])
{
	String s1="abcdlmn";
	String s2="pqrst";
	System.out.println(mergeString(s1,s2));
}
}

//In PYTHON
/*class Solution:
  def mergeAlternately(self, word1: str, word2: str) -> str:
      l1, l2 = len(word1), len(word2)
      merge = ''

      for i in range(min(l1, l2)):
          merge += word1[i]
          merge += word2[i]
      
      merge += word1[l2:] if l1 > l2 else word2[l1:]

      return merge*/ 
