package ����֮��;
//Ѱ�������е����ֵ����Сֵ
//�ⷨ��
public class MaxAndMin
{

		public static void findMaxAndMin(int[] array)
		{
			int max= array[0];
			int min= array[0];
			//ȷ����������ĸ���������������ż������������Խ��
			//������Ԫ���нϴ�ֵ����ż��λ����Сֵ��������λ
			for(int i = 0;i <array.length-1; i+=2)
			{
				if(array[i] <array[i+1])
				{
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] =temp;
				}
			}
			
			//�ҳ�ż��λ�����ֵ
			for(int i=0; i<array.length;i+=2)
			{
				if(max <array[i])
					max = array[i];
			}

			//�ҳ�����λ����Сֵ
			for(int i=1; i<array.length; i+=2)
			{
				if(min > array[i])
					min =array[i];
			}
			
			//��ӡ����
				System.out.println("max:" + max);
				System.out.println("min:" + min);
		
		}
		
		public static void main(String[] args)
		{
			int[] a={5, 6, 8, 3, 7, 9};
			findMaxAndMin(a);
		}
}
