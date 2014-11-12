package sort;

public class BubbleSortTest
{
		public static void main(String[] args)
		{
			BubbleSort b = new BubbleSort();
			int[] array ={9,1,5,8,3,7,4,6,2};
			b.bubbleSort(array);
			b.display(array);
			
		   System.out.println();
		   System.out.println("----------�Ż���ð������-------------");
		   BubbleSort1 b1 = new BubbleSort1();
		   b1.bubbleSort(array);
		   b1.display(array);
		}
}

//���ڵ�ð������
class BubbleSort
{
	public void bubbleSort(int[] a)
	{
		for(int i=0; i<a.length-1; i++)
		{
			//��i�˽���iС����ð����
			for(int j = a.length-2; j>=i ; j--)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] =temp;
				}
			}
		}
	}
	
	
	public void display(int[] a )
	{
		for(int i = 0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}

//ð�������Ż�
//�Ż��ĵط������������ǰ�漸�ν��н���֮���Ѿ���������治�ټ����жϡ�
class BubbleSort1
{
	public void bubbleSort(int[] a)
	{
		boolean flag = true;   //flag����Ϊ���
		for(int i=0; i<a.length-1 && flag; i++)       //flagΪfalse�����������ݽ������˳�ѭ��
		{
			flag =false;           //��ʼΪfalse
			//��i�˽���iС����ð����
			for(int j = a.length-2; j>=i ; j--)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] =temp;
					
					flag =true;  //��������ݽ�������flag��Ϊtrue
				}
			}
		}
	}
	
	
	public void display(int[] a )
	{
		for(int i = 0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	
}
