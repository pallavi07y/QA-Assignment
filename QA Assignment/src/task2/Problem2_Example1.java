package task2;

public class Problem2_Example1 {
	
	 public static String lcp(String s, String t)
	 {  
	        int b = Math.min(s.length(),t.length());  
	        for(int i = 0; i < b; i++)
	        {  
	            if(s.charAt(i) != t.charAt(i))
	            {  
	                return s.substring(0,i);  
	            }  
	        }  
	        return s.substring(0,b);  
	    }  
	  
	    public static void main(String[] args)
	    {  
	        String s = "abcabcbb";  
	        String a="";  
	        int b = s.length();  
	        for(int i = 0; i < b; i++)
	        {  
	            for(int j = i+1; j < b; j++)
	            {  
	                String x = lcp(s.substring(i,b),s.substring(j,b));   
	                if(x.length() > a.length()) 
	                	a=x;  
	            }  
	        }  
	        System.out.println("Longest substring with repeating char: "+a);  
	    }  

}
