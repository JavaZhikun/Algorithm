package dynamicProgramming;

public class MaxOfSubArrayTest
{
	  public static void main(String[] args)
	{
		  MaxOfSubArray m = new MaxOfSubArray();
		  int[] array = {-2, 5, 3, -6, 4, -8, 6};
		  System.out.println( m.maxSum1(array));
		  System.out.println("ʹ�ö�̬�滮��ý����");
		  System.out.println(m.maxSum2(array));
	}

} 


class MaxOfSubArray
{
	
	//ʱ�临�Ӷ�ΪO(N^2)���㷨
	public int maxSum1( int[] a)
	{
		int max = Integer.MIN_VALUE; //��ʾ���͵���Сֵ
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
	
	//ʱ�临�Ӷ�ΪO(N)�Ķ�̬�滮�㷨
	public int maxSum2(int[] a)
	{
		int[]  Start = new int[a.length];
		int[] All = new int[a.length];
		
		//��Start�����All������и���ֵ�������������һλ�ĳ�ֵ
		Start[a.length -1] = a[a.length-1];
		All[a.length -1] = a[a.length -1 ];
		
		for(int i = a.length -2; i>=0; i--)  //�������ĩβ��ǰ������ֱ��������
		{
			//Start�������ŴӸ�����ʼ�����ֵ
			Start[i] = max( a[i], a[i]+Start[i+1]);
			//All[i]�����д���Ŵ�(A[i],A[i+1], ......, A[n])�е�����һ������֮��
			All[i] = max (Start[i], All[i+1]);
		}
		
		return All[0];
	}
	
	public int max(int a, int b)
	{
		return a>b?a:b;
	}
}
