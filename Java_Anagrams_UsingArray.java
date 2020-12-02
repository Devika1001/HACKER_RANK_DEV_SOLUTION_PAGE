package com.BasicOfJava.dev;
import java.util.*;
import java.util.Scanner;

public class Java_Anagrams_UsingArray
{

public static String getSmallestAndLargest(String s, int k) {
		// TODO Auto-generated method stub
		 String s1;
		  	int a=s.length() ;
		  	int i=0;
		  	 String[] s2=new String[a];
		  	for( i=0;i<=s.length()-k;i++)
		   {
		   	
		    s1=s.substring(i,i+k);
		     s2[i]=s1;
		    System.out.print(s2[i]+" ");
		   }System.out.println();
		  	
		       String smallest =s2[0];
		       String largest =s2[0];
		       
		       for( i=0;i<=s2.length-k;i++)
		       {
		       	String a1=s2[i];
		       	String b=s2[i];
		       if((s2[i].compareTo(smallest))<0)
		       {
		       	smallest=a1;
		       }
		       if((s2[i].compareTo(largest))>0)
		       {
		       	largest=b;
		       }
		       
		       } 
		      return smallest + "\n" + largest;

	}
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String s = scan.next();
       int k = scan.nextInt();
       scan.close();
     
       System.out.println(getSmallestAndLargest(s, k));


	}

}
