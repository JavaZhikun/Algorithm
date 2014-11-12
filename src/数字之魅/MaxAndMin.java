package 数字之魅;
//寻找数组中的最大值和最小值
//解法二
public class MaxAndMin
{

		public static void findMaxAndMin(int[] array)
		{
			int max= array[0];
			int min= array[0];
			//确保不管数组的个数是奇数个还是偶数个，都不会越界
			//将相邻元素中较大值放在偶数位，较小值放在奇数位
			for(int i = 0;i <array.length-1; i+=2)
			{
				if(array[i] <array[i+1])
				{
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] =temp;
				}
			}
			
			//找出偶数位的最大值
			for(int i=0; i<array.length;i+=2)
			{
				if(max <array[i])
					max = array[i];
			}

			//找出奇数位的最小值
			for(int i=1; i<array.length; i+=2)
			{
				if(min > array[i])
					min =array[i];
			}
			
			//打印出来
				System.out.println("max:" + max);
				System.out.println("min:" + min);
		
		}
		
		public static void main(String[] args)
		{
			int[] a={5, 6, 8, 3, 7, 9};
			findMaxAndMin(a);
		}
}
