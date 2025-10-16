package core;

import java.util.Scanner;


public class mark {

	public static void main(String[] args) {
//		int[] mark;
//	mark=new int []
//			{
//					100,65,-3,45,45,33,44
//			};
//	 //acces the array value
//	 System.out.println("normal loop");
//	 for(int i=0;i<mark.length;i++)
//	 {
//		 System.out.println("mark["+i +"]:"+mark[i]);
//	 }
//	 
//	 //using foreach() loop
//	 System.out.println("advance for loop");
//	 for(int num:mark)
//	 {
//		 System.out.println(num);
//		 
//	 }
//	 
//	 int min=mark[0];
//	 int max=mark[0];
//	 for(int i=0;i<mark.length;i++)
//	 {
//		 if(mark[i]>max)
//		 {
//			 max=mark[i];
//		 }
//		 if(mark[i]<min)
//		 {
//			 min=mark[i];
//		 }
//	 }
//
//		System.out.println("minimun:"+min);
//	 System.out.println("maximum:"+max);
//		
//
//	}
    Scanner sc=new Scanner(System.in);
    int i,j;
    int[][] a = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
   System.out.println("normal for loop:");
   for( i=0;i<3;i++)
   {
	   for( j=0;j<3;j++)
{
	System.out.print("\t"+a[i][j]);
}
	   System.out.println();
   }
   System.out.println("  mark-1     mark-2     mark-3     total     average     maximin     minimum");
   
   for( i=0;i<3;i++)
   {
	   int total=0;
	   int min=a[i][0];
	   int max=a[i][0];
	   for(j=0;j<3;j++)
	   {
		   System.out.print("\t" + a[i][j]);
		   total+=a[i][j];
		   
	   if(a[i][j]>max) max=a[i][j];
	   if(a[i][j]<min)min=a[i][j];
	   }
	   float avg=total/3;
//	   System.out.println(total +"\t" +avg+ "\t" + max  + "\t" + min);
	   System.out.println("\t    "+ total + "       \t" + avg + "   \t  " + max + "    \t" + min);

  }
   
	   
   	}}
    	
    		
    

