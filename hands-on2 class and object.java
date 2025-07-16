//link: https://onlinegdb.com/Mx5zgpa1v

import java.util.*;
public class Main
{
    int powerInt(int num1,int num2)
    {
        return (int)Math.pow(num1,num2);
    }
    double powerDouble(double num1,double num2)
    {
        return Math.pow(num1,num2);
    }
	public static void main(String[] args) {
	    Main m=new Main();
		System.out.println(m.powerInt(2,2));
		System.out.println(m.powerDouble(2.0,2.0));
	}
}
