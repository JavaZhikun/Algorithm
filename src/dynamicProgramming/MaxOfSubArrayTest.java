package dynamicProgramming;

public class MaxOfSubArrayTest
{
	  public static void main(String[] args)
	{
		  MaxOfSubArray m = new MaxOfSubArray();
		  int[] array = {-2, 5, 3, -6, 4, -8, 6};
		  System.out.println( m.maxSum1(array));
		  System.out.println("使用动态规划求得结果：");
		  System.out.println(m.maxSum2(array));
	}

} 


class MaxOfSubArray
{
	
	//时间复杂度为O(N^2)的算法
	public int maxSum1( int[] a)
	{
		int max = Integer.MIN_VALUE; //表示整型的最小值
		int sum;
		
		for(int i =0; i<a.length; i++)
		{
			sum = 0;
			for(int j =i;  j< a.length; j++)
			{
				sum += a[j];
				if(sum> max)
							max = sum;
			}
		}
		return max;
	}
	
	//时间复杂度为O(N)的动态规划算法
	public int maxSum2(int[] a)
	{
		int[]  Start = new int[a.length];
		int[] All = new int[a.length];
		
		//将Start数组和All数组进行附初值操作，附上最后一位的初值
		Start[a.length -1] = a[a.length-1];
		All[a.length -1] = a[a.length -1 ];
		
		for(int i = a.length -2; i>=0; i--)  //从数组的末尾往前遍历，直到数组首
		{
			//Start数组存放着从该数开始的最大值
			Start[i] = max( a[i], a[i]+Start[i+1]);
			//All[i]数组中存放着从(A[i],A[i+1], ......, A[n])中的最大的一段数组之和
			All[i] = max (Start[i], All[i+1]);
		}
		
		return All[0];
	}
	
	public int max(int a, int b)
	{
		return a>b?a:b;
	}
}
