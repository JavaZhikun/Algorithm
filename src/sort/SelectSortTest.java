package sort;
//简单选择排序
public class SelectSortTest
{
	public static void main(String[] args)
	{
		SelectSort s = new SelectSort();
		int[] array ={9,1,5,8,3,7,4,6,2};
		s.selectSort(array);
		s.display(array);
	}
}

class SelectSort
{
	public void selectSort(int[] a)
	{
		for(int i=0; i<a.length-1 ; i++)
		{
			int min = i;             //将当前下标定义为最小值下标
			for(int j= i+1; j<a.length; j++)
			{
				if(a[min] >a[j])                  //如果有小于当前最小值的关键字
				{
					min =  j;                          //将此关键字下标赋给min
				}
			}
			
			if(i != min)                            //如果min不等于i，说明找到最小值，交换
			{
				int temp =a[i];
				a[i] = a[min];
				a[min] =temp;
			}
		}
	}
	
	public void display(int[] a)
	{
		for(int i =0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
