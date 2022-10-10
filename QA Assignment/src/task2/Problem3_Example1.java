package task2;

public class Problem3_Example1 {
	static void printStr(String s, int low, int high)
	{
	    for (int i = low; i <= high; ++i)
	    System.out.print(s.charAt(i));
	} 
	static int longestPalStr(String s)
	{
	    int maxLength = 1, start = 0;
	    for (int i = 0; i < s.length(); i++)
	    {
	        for (int j = i; j < s.length(); j++)
	        {
	            int f = 1;
	            for (int k = 0; k < (j - i + 1) / 2; k++)
	                if (s.charAt(i + k) != s.charAt(j - k))
	                    f = 0;
	            if (f!=0 && (j - i + 1) > maxLength) 
	            {
	                start = i;
	                maxLength = j - i + 1;
	            }
	        }
	    }
	    System.out.print("Longest palindrome String is: ");
	    printStr(s, start, start + maxLength - 1);
	    return maxLength;
	}
	public static void main(String[] args)
	{
	    String s = "babad";
	    System.out.print("\nLength is: "
	         + longestPalStr(s));
	}
}


