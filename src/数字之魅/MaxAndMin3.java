package 数字之魅;

public class MaxAndMin3
{
		public static void findMaxAndMin(int[] array)
		{
			int max =array[0]>array[1]?array[0]:array[1];
			int min = array[0]<array[1]?array[0]:array[1];
			
			for(int i =0; i<array.length ;i+=2)
			{
				//求出相邻两数的较大值和较小值
				int temp1 =(array[i]>array[i+1]?array[i]:array[i+1]);
				int temp2 =(array[i]<array[i+1]?array[i]:array[i+1]);
				
				//将较大值与max比较，更大的赋给max，较小值与min比较，更小的赋给min
				max = max>temp1?max:temp1;
				min = min<temp2? min:temp2;
			}
			
			System.out.println("max:" + max);
			System.out.println("min:" + min);
		}
		
		public static void main(String[] args)throws Exception
		{
			int[] a={5,6,8,3,7,9,10};
			findMaxAndMin(a);
		}
}
