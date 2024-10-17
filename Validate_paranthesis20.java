package LeetCode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Validate_paranthesis20 
{
	 public static boolean isValid(String s) {
	        Stack<Character> bracket = new Stack<>();
	        Set<Character> sp=new HashSet<Character>();
	        for (char c : s.toCharArray()) {
	             switch (c) {
	                case '(': bracket.push(c); break;
	                case '{': bracket.push(c); break;
	                case '[': bracket.push(c); break;
	                case ')': if (bracket.empty() || bracket.peek()!='(') return false; else bracket.pop(); break;
	                case '}': if (bracket.empty() || bracket.peek()!='{') return false; else bracket.pop(); break;
	                case ']': if (bracket.empty() || bracket.peek()!='[') return false; else bracket.pop(); break;
	                default: ; 
	            }
	        }
	        return bracket.isEmpty();
	    }
	  public static void main(String[] args) {
	      String s = "{}[)(]";
	      boolean check = isValid(s);
	          if(check){
	                System.out.println("The given string contains valid parentheses.");
	            }
	            else{
	                System.out.println("The given string contains invalid parentheses.");
	            }
	  }
	
}
	/*
	 * public boolean isValid(String s) { boolean val=false; for(int
	 * i=0;i<s.length();i++) {
	 * 
	 * 
	 * if(i<s.length()-1) { if(s.charAt(i)=='(' && s.charAt(i+1)==')') { val=true; }
	 * else //{val=false;} if(s.charAt(i)=='{' && s.charAt(i+1)=='}') { val=true; }
	 * else//{val=false;} if(s.charAt(i)=='[' && s.charAt(i+1)==']') { val=true; }
	 * //else //{val=false;} i=i+2; } } return val; }
	 */
	/*
	 * class Solution 
{
    public boolean isValid(String s)
    {
          boolean val=false;
    for(int i=0;i<s.length();i++)
    {
       
      
        if(i<s.length()-1)
        {
            if(s.charAt(i)=='(' && s.charAt(i+1)==')')
            {
                val=true;
                break;
            }
            else 
            //{val=false;} 
            if(s.charAt(i)=='{' && s.charAt(i+1)=='}')
            {
                val=true;
                 break;
            }
            else//{val=false;} 
             if(s.charAt(i)=='[' && s.charAt(i+1)==']')
            {
                val=true;
                 break;
            }
            else
            if(s.charAt(i)=='('&&s.charAt((s.length()-1)-i)==')')
            {
                val=true;
                 break;
            }
            else if(s.charAt(i)=='{'&&s.charAt((s.length()-1)-i)=='}')
            {
                val=true; break;
            }
            else if(s.charAt(i)=='['&&s.charAt((s.length()-1)-i)==']')
            {
                val=true; break;
            }
            //else
            //{val=false;} 
             i=i+2;
        }
    }    
    return val;
    }
}
	 */
	/*
	 *  public boolean isValid(String s) {
        // Stack to store left symbols
        Stack<Character> leftSymbols = new Stack<>();
        // Loop for each character of the string
        for (char c : s.toCharArray()) {
            // If left symbol is encountered
            if (c == '(' || c == '{' || c == '[') {
                leftSymbols.push(c);
            }
            // If right symbol is encountered
            else if (c == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
                leftSymbols.pop();
            } else if (c == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
                leftSymbols.pop();
            } else if (c == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
                leftSymbols.pop();
            }
            // If none of the valid symbols is encountered
            else {
                return false;
            }
        }
        return leftSymbols.isEmpty();
    }
	 */

