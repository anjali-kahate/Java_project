package com.patternMenu;

import java.util.Scanner;

import com.patternOperation.StarPattern;

public class StarPatt {
	public static void starPattern()
	{
	String con="";
	do {
	 System.out.println("                ");
	 System.out.println(" ******** find Star Pattern Program *********");
	 System.out.println("                                    ");
	 System.out.println(" ---- 1. Box Pattern ----");
	 System.out.println(" ---- 2. Hollow Box Pattern ----");
	 System.out.println(" ---- 3. Hollow Box & X Pattern");
	 System.out.println(" ---- 4. Rhombus Pattern ----");
	 System.out.println(" ---- 5. Hollow Pattern ----");
	 System.out.println(" ---- 6. Mirrored Rhombus Pattern ----");
	 System.out.println(" ---- 7. Hollow Mirrored Rhombus Pattern ----");
	 System.out.println(" ---- 8. Right Triangle Pattern ----");
	 System.out.println(" ---- 9. Hollow Right Trangle Pattern ----");
	 System.out.println(" ---- 10. Left Triangle Pattern (Mirrored Right Trangle) ----");
	 System.out.println(" ---- 11. Hollow Mirrored Left Triangle Pattern ----");
	 System.out.println(" ---- 12. Inverted Right Triangle Pattern ----");
	 System.out.println(" ---- 13. Hollow Inverted Right Triangle Pattern ----");
	 System.out.println(" ---- 14. Inverted Mirrored Right Triangle Pattern ----");
	 System.out.println(" ---- 15. Hollow Inverted Mirrored Right Triangle Pattern ----");
	 System.out.println(" ---- 16. Pyramid Pattern ----");
	 System.out.println(" ---- 17. Hollow Pyramide Pattern ----");
	 System.out.println(" ---- 18. Inverted Pyramide Pattern ----");
	 System.out.println(" ---- 19. Hollow Inverted Pyramide Pattern ----");
	 System.out.println(" ---- 20. Half Diamond Pattern ----");
	 System.out.println(" ---- 21. Diamond Pattern ----");
	 System.out.println(" ---- 22. Right Arrow Pattern ----");
	 System.out.println(" ---- 23. Left Arrow Pattern ----");
	 System.out.println(" ---- 24. Plus Pattern ----");
	 System.out.println(" ---- 25. X Pattern ----");
	 System.out.println(" ---- 25. Go To Menu ----");
	 System.out.println("                          ");
	 System.out.println(" Enter Operation Number:- ");
	 Scanner s=new Scanner(System.in);
	 int a=s.nextInt();
	 operation(a);
	 System.out.println("                    ");
	 System.out.println("Do you Want To Continu, Type (Y/N):-");
	 Scanner s1=new Scanner(System.in);
	 con=s1.nextLine();
	}while(con.equalsIgnoreCase("Y"));
	System.err.println("Exit");
}
	public static int getValue()
	{
		System.out.println("Enter Number:- ");
		Scanner s=new Scanner(System.in);
		int a1=s.nextInt();
//		operation(a1);
		return a1;
		
	}
public static void operation(int n)
{
 switch (n) {
case 1:
	StarPattern.boxPattern(getValue());
break;
case 2:
	StarPattern.hollowBoxP(getValue());
break;
case 3:
	StarPattern.hollowBoxXP(getValue());
break;
case 4:
	StarPattern.rhombusP(getValue());
break;
case 5:
	StarPattern.hollowP(getValue());
break;
case 6:
	StarPattern.mirroredRhombusP(getValue());
break;
case 7:
	StarPattern.hollowMirroredRhombusP(getValue());
break;
case 8:
	StarPattern.rightTriangleP(getValue());
break;
case 9:
	StarPattern.hollowRightTriangleP(getValue());
break;
case 10:
	StarPattern.leftTriangleP(getValue());
break;
case 11:
	StarPattern.hollowMirrLeftTriangleP(getValue());
break;
case 12:
	StarPattern.invertedRightTriangleP(getValue());
break;
case 13:
	StarPattern.holInveRighTriangleP(getValue());
break;
case 14:
	StarPattern.InvMirrRighTriangleP(getValue());
break;
case 15:
	StarPattern.holInvMirrRighTriangleP(getValue());
break;
case 16:
	StarPattern.pyramidP(getValue());
break;
case 17:
	StarPattern.holPyramideP(getValue());
break;
case 18:
	StarPattern.InvPyramideP(getValue());
break;
case 19:
	StarPattern.holInvPyramideP(getValue());
break;
case 20:
	StarPattern.halfDiamondP(getValue());
break;
case 21:
	StarPattern.diamondP(getValue());
break;
case 22:
	StarPattern.rightArrowP(getValue());
break;
case 23:
	StarPattern.leftArrowP(getValue());
break;
case 24:
	StarPattern.plusPattern(getValue());
break;
case 25:
	StarPattern.XPattern(getValue());
break;
case 26:
	StarPattern.goToMenu();
break;

default:
	break;
}
}

}
