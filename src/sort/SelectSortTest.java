package sort;
//��ѡ������
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
			int min = i;             //����ǰ�±궨��Ϊ��Сֵ�±�
			for(int j= i+1; j<a.length; j++)
			{
				if(a[min] >a[j])                  //�����С�ڵ�ǰ��Сֵ�Ĺؼ���
				{
					min =  j;                          //���˹ؼ����±긳��min
				}
			}
			
			if(i != min)                            //���min������i��˵���ҵ���Сֵ������
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
