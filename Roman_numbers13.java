package LeetCode;

public class Roman_numbers13
{ 
	/*
	 * static int value(char r) { if (r == 'I') return 1; if (r == 'V') return 5; if
	 * (r == 'X') return 10; if (r == 'L') return 50; if (r == 'C') return 100; if
	 * (r == 'D') return 500; if (r == 'M') return 1000; return -1; }
	 * 
	 * static int romanToInt(String s) { int total = 0; for (int i=0; i<s.length();
	 * i++) { int s1 = value(s.charAt(i)); if (i+1 <s.length()) { int s2 =
	 * value(s.charAt(i+1)); if (s1 >= s2) { total = total + s1; } else { total =
	 * total - s1; } } else { total = total + s1; } } return total; }
	 */
public static int romanToInt(String s)
{ char c;

int total=0;
	for(int i=0;i<s.length();i++)
	{int val=0;
		c=s.charAt(i);
		if(c=='I')
		{
			val=1;
		}
		else if(c=='V')
		{
			val=5;
		}else if(c=='X')
		{
			val=10;
		}
		else if(c=='L')
		{
			val=50;
		}
		else if(c=='C')
		{
			val=100;
		}
		else if(c=='D')
		{
			val=500;
		}
		else if(c=='M')
		{
			val=1000;
		}
		if(i<s.length()-1)
		{
			char nc=s.charAt(i+1);
			int newval=0;
			if(nc=='I')
			{
				newval=1;
			}
			else if(nc=='V')
			{
				newval=5;
			}else if(nc=='X')
			{
				newval=10;
			}
			else if(nc=='L')
			{
				newval=50;
			}
			else if(nc=='C')
			{
				newval=100;
			}
			else if(nc=='D')
			{
				newval=500;
			}
			else if(nc=='M')
			{
				newval=1000;
			}
			if(newval>val)
			{
				val=-val;
			}
			
			
		}
		total=total+val;
	}
	return total;
}
public static void main(String args[])
{
	System.out.println(romanToInt("MCMXCIV"));
}
}
/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/