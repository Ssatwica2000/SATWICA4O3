package pack_1;
import java.util.*;

public class area_rectangle {
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter length");
		int l=obj.nextInt();
		System.out.println("enter breadth");
		int b=obj.nextInt();
		 int area=l*b;
		System.out.println("area of rectangle= "+area);
	}

}