package sort;

import java.math.BigInteger;

//<<左移，即高位移出，其他的数字向左平移，即乘以2
// >>右移，即低位移出，其他的数字向右平移，即除以2
public class GCD
{
	public static  int  gcd(int  x, int y)
	{
		if(x<y)
			return gcd(y, x );
		if( y ==0)
			return x;
		
		
		else 
		{
			if(isEven(x))
			{
				if(isEven(y))
					return (gcd(x>>1, y>>1) <<1);
				else 
					return gcd(x>>1,y);
			}
			
			else 
			{
				if(isEven(y))
					return gcd(x, y>>1);
				else
					return gcd(y, x-y);
			}
		}
	}
	
	public static  boolean isEven(int  n)
	{
		if((n&1) ==0)
			return true;
		else
			return false;
			
	}
	

	
	public static void main(String[] args)
	{
		System.out.println(gcd(1420,316));
	}
	

}
