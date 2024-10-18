package LeetCode;

public class Merge_Strings_Alternately_1768 
{
//public static String mergeString(String s1,String s2)
//{
//	StringBuilder result= new StringBuilder();
//	int i = 0;
//	while(i<s1.length()||i<s2.length())
//	{
//		if(i<s1.length())
//		{
//			result.append(s1.charAt(i));
//		}
//		if(i<s2.length())
//		{
//			result.append(s2.charAt(i));
//		}
//		i++;
//	}
//	return result.toString();
//	
//}
	 public static String mergeString(String word1,String word2)
	 {
	 int l1=word1.length();
	 int l2=word2.length();
	 String merge="";
	 int no=Math.min(l1,l2);
	 for(int i=0;i<no;i++)
	 {
	 merge+=word1.charAt(i);
	 merge+=word2.charAt(i);
	 }
	 if (l1 > l2) {
	        merge += word1.substring(l2);  // Add the rest of word1
	    } else if (l2 > l1) {
	        merge += word2.substring(l1);  // Add the rest of word2
	    }

	    return merge;
	 }

public static void main(String args[])
{
	String s1="abcdlmn3";
	String s2="pqrsthdiu7788";
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
/*
 public static string merge(String word1,String word2)
 {
 l1=word1.length();
 l2=word2.length();
 String merge="";
 int no=Math.min(l1,l2);
 for(int i=0;i<no;i++)
 {
 merge+=word1.charAt(i);
 merge+=word2.charAt(i);
 }
 if (l1 > l2) {
        merge += word1.substring(l2);  // Add the rest of word1
    } else if (l2 > l1) {
        merge += word2.substring(l1);  // Add the rest of word2
    }

    return merge;
 }*/
