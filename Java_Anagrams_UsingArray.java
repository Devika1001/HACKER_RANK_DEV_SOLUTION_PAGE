package com.BasicOfJava.dev;
import java.util.*;
import java.util.Scanner;

public class Java_Anagrams_UsingArray
{

static boolean isAnagram(String a, String b)
	     {
	        // Complete the function
		int x=a.length();
		int y=b.length();
		 if(x==y)
	        {
	       int uni1[]=new int[a.length()];
	       int uni2[]=new int[b.length()];
		        
		       
	           String[] s1=new String[x];
	            
	            String[] s2=new String[x];
	            String ls1=a.toLowerCase();
	            String ls2=b.toLowerCase();
	            
	        for(int i=0;i<x;++i)
	        {
	        	s1[i]=ls1.substring(i,i+1);
	        }
	        for(int i=0;i<y;++i)
	        {
	        	s2[i]=ls2.substring(i,i+1);
	        }
	       
	        for(int i=0;i<x;++i)
	        {
	        	
	        	uni1[i]=ls1.codePointAt(i);
	        	System.out.println( uni1[i]);
	            uni2[i]=ls2.codePointAt(i);
	        	System.out.println( uni2[i]);
	        }
	        
	       Arrays.sort(uni1);
	        Arrays.sort(uni2);
	        
	       if(Arrays.equals(uni1, uni2))
	        		return true;
	        	else		
	        		return false;
	    }
	else 
		return false;
	     }
	    public static void main(String[] args)
	    {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}
	
