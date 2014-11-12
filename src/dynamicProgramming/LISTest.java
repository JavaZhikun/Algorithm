package dynamicProgramming;

//求数组中的最长递增子序列
//largestIncreasingSubsequence
public class LISTest
{
		public static void main(String[] args)
		{
	            int[] array = {1,-1,  2, -3, 4, -5, 6,-7};
	            LIS a = new LIS();
	           System.out.println( a.lis(array));
		}
}


//时间复杂度为O(n^2)
class LIS
{
	public int lis(int[] array)
	{
		 int [] lis = new int[array.length];
		 for(int i=0; i< array.length; i++)
		 {
			 lis[i] =1;
			 for(int j= 0; j<i; j++)
			 {
				 if(array[i]> array[j] && lis[j] +1 >lis[i])
				 {
					 lis[i] =lis[j] +1;
				 }
			 }
		 }
		  int max =lis[0];
		 for(int i =0; i<array.length; i++)
		 {
			 if(lis[i]>max)
				 max = lis[i];
		 }
		 for(int i = 0; i<array.length; i++)
		 {
			 System.out.print(lis[i]+" ");
		 }
		 System.out.println();
		 System.out.print("最大长度为：");
		 return max;
	}
}
