package ����֮��;

public class MaxAndMin3
{
		public static void findMaxAndMin(int[] array)
		{
			int max =array[0]>array[1]?array[0]:array[1];
			int min = array[0]<array[1]?array[0]:array[1];
			
			for(int i =0; i<array.length ;i+=2)
			{
				//������������Ľϴ�ֵ�ͽ�Сֵ
				int temp1 =(array[i]>array[i+1]?array[i]:array[i+1]);
				int temp2 =(array[i]<array[i+1]?array[i]:array[i+1]);
				
				//���ϴ�ֵ��max�Ƚϣ�����ĸ���max����Сֵ��min�Ƚϣ���С�ĸ���min
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
