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
		   System.out.println("----------优化的冒泡排序-------------");
		   BubbleSort1 b1 = new BubbleSort1();
		   b1.bubbleSort(array);
		   b1.display(array);
		}
}

//正宗的冒泡排序
class BubbleSort
{
	public void bubbleSort(int[] a)
	{
		for(int i=0; i<a.length-1; i++)
		{
			//第i趟将第i小的数冒起来
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

//冒泡排序优化
//优化的地方：如果数组在前面几次进行交换之后已经有序，则后面不再继续判断。
class BubbleSort1
{
	public void bubbleSort(int[] a)
	{
		boolean flag = true;   //flag来作为标记
		for(int i=0; i<a.length-1 && flag; i++)       //flag为false表明已无数据交换则退出循环
		{
			flag =false;           //初始为false
			//第i趟将第i小的数冒起来
			for(int j = a.length-2; j>=i ; j--)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] =temp;
					
					flag =true;  //如果有数据交换，则将flag置为true
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
