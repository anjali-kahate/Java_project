package com.patternOperation;

import java.util.Scanner;

import com.menu.MainClass;

public class StarPattern {
	
	public static void boxPattern(int n)
	{
		System.out.println(" # Box pattern # ");
		System.out.println("              ");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void hollowBoxP(int n)
	{
		System.out.println(" # hollowBox pattern # ");
		System.out.println("              ");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==n||i==n||j==1||i==1)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	public static void hollowBoxXP(int n)
	{
		System.out.println(" # hollow Box X pattern # ");
		System.out.println("              ");
		 for (int i = 1; i < n; i++) {
				
				for (int j = 1; j < n; j++) {
					
					if(i==1||i==n||j==1||j==n-i+1||i==j ||j==n)
					{
						System.out.print(" * ");
					}
					else
					{
						System.out.print("   ");
					}
				}
				System.out.println();
				
			}  
	}
	public static void rhombusP(int n)
	{
		System.out.println(" # rhombus pattern # ");
		System.out.println("              ");
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("   ");
			}
			for (int k =1; k<=n; k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
	public static void hollowP(int n)
	{
		System.out.println(" # hollow rhombus pattern # ");
		System.out.println("              ");
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("   ");
			}
			for (int k =1; k<=n; k++) {
				if(i==1||i==n||k==1||k==n) {
				System.out.print(" * ");
				}
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		
	}
	public static void mirroredRhombusP(int n)
	{
		System.out.println(" # mirrored Rhombus pattern # ");
		System.out.println("              ");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("   ");
			}
			for (int k =1; k<=n; k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
	public static void hollowMirroredRhombusP(int n)
	{
		System.out.println(" # hollow mirrored Rhombus pattern # ");
		System.out.println("              ");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("   ");
			}
			for (int k =1; k<=n; k++) {
				if(i==1||i==n||k==1||k==n)
				System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		
	}
	public static void rightTriangleP(int n)
	{
		System.out.println(" # right Triangle pattern # ");
		System.out.println("              ");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
					System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void hollowRightTriangleP(int n)
	{
		System.out.println(" # hollow right Triangle pattern # ");
		System.out.println("              ");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==j||j==1||i==n)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		
	}
	public static void leftTriangleP(int n)
	{
		System.out.println(" # left Triangle pattern # ");
		System.out.println("              ");
		int m=1;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("   ");
			}
			for (int k =1; k<=m; k++) {
				
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
	public static void hollowMirrLeftTriangleP(int n)
	{
		System.out.println(" # hollow mirrored left Triangle pattern # ");
		System.out.println("              ");
		int m=1;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("   ");
			}
			for (int k =1; k<=m; k++) {
				if(k==1||k==m||m==n)
				System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		
	}
	public static void invertedRightTriangleP(int n)
	{
		System.out.println(" # inverted Right Triangle pattern # ");
		System.out.println("              ");
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
	public static void holInveRighTriangleP(int n)
	{
		System.out.println(" # hollow inverted Right Triangle pattern # ");
		System.out.println("              ");
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1||j==i||i==n)
				System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		
	}
	public static void InvMirrRighTriangleP(int n)
	{
		System.out.println(" # inverted mirrored Right Triangle pattern # ");
		System.out.println("              ");
		int m=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=m;k++) {
				System.out.print(" * ");
			}
			m--;
			System.out.println();
		}
		
	}
	public static void holInvMirrRighTriangleP(int n)
	{
		System.out.println(" # hollow inverted mirrored Right Triangle pattern # ");
		System.out.println("              ");
		int m=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=m;k++) {
				if(i==1||k==1||k==m)
				System.out.print(" * ");
				else
					System.out.print("   ");
			}
			m--;
			System.out.println();
		}
		
	}
	public static void pyramidP(int n)
	{
		System.out.println(" # hollowBox pattern # ");
		System.out.println("              ");
		int m=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m-1;j++)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(" * ");
			}
			m--;
			System.out.println();
		}
	}
	public static void holPyramideP(int n)
	{
		System.out.println(" # hollow Pyramid pattern # ");
		System.out.println("              ");
		int m=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m-1;j++)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=2*i-1;k++) {
				if(k==1||k==2*i-1||i==n)
				System.out.print(" * ");
				else
					System.out.print("   ");
			}
			m--;
			System.out.println();
		}
		
	}
	public static void InvPyramideP(int n)
	{
		System.out.println(" # Inverted Pyramid pattern # ");
		System.out.println("              ");
		int m=1;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(" * ");
			}
			m++;
			System.out.println();
		}
		
	}
	public static void holInvPyramideP(int n) 
	{
		System.out.println(" # hollow Pyramid pattern # ");
		System.out.println("              ");
		int m=1;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=2*i-1;k++) {
				if(k==1||k==2*i-1||i==n)
				System.out.print(" * ");
				else
					System.out.print("   ");
			}
			m++;
			System.out.println();
		}
	}
	public static void halfDiamondP(int n)
	{
		System.out.println(" # half Diamond pattern # ");
		System.out.println("              ");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void diamondP(int n)
	{
		System.out.println(" # diamond pattern # ");
		System.out.println("              ");
		int spaces=n-1;
		int characters=1;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=characters;k++) {
				
				System.out.print(" * ");
			}
			if(spaces>i) {
				spaces=spaces-1;
				characters=characters+2;
			}
			if(spaces<i) {
				spaces=spaces+1;
				characters=characters-2;
			}
			System.out.println();
		}
	}
	public static void rightArrowP(int n)
	{
		System.out.println(" # right Arrow pattern # ");
		System.out.println("              ");
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("   ");
			}
			for(int j1=1;j1<n-i;j1++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				System.out.print("   ");
			}for(int j1=1;j1<=i+1;j1++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
	public static void leftArrowP(int n)
	{
		System.out.println(" # left Arrow pattern # ");
		System.out.println("              ");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("   ");
			}
			for(int j1=1;j1<=n-i;j1++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				System.out.print("   ");
			}for(int j1=1;j1<=i+1;j1++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
	public static void plusPattern(int n)
	{
		System.out.println(" # Plus pattern # ");
		System.out.println("              ");
		int k=n/2;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(i==k || j==k)
	             System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
	public static void XPattern(int n)
	{ 
		System.out.println(" # X pattern # ");
		System.out.println("              ");
         for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if(i==j || n-i-1==j)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
			
		}
		
	}
	public static void goToMenu()
	{
		MainClass.menu();
	}	
}
