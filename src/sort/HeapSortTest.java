package sort;

/**
 * ����ok�汾
 * @author Luan Zhikun
 *
 */
public class HeapSortTest
{
		public static  void maxHeapify(int[] a , int i, int length)
		{
			int left, right, largest;
			left = 2*i +1;
			right = 2*i +2;
			
			//Ѱ�ҳ�һ�����������ֵ���������붥�㽻��
			if(left <length  && a[left] >a[i])
				largest = left;
			else 
				largest = i;
			
			if(right <length &&a[right] >a[largest])
			largest = right;
			
			if(i  != largest)
			{
				int temp = a[largest];
				a[largest] =a [i];
				a[i] =temp;
				maxHeapify(a, largest,length);
			}
		}
		
		public static  void buildHeap(int[] a)
		{
			//�˴�ʹ��length/2-1�ͣ�length-1��/2���ɣ��������߿��ܶ�һ�β���Ҫ������
			for(int i = a.length/2-1 ; i>=0; i--)
			{
				maxHeapify(a, i, a.length);
			}
		}
		
		public static void heapSort(int[] a,int length )
		{
			buildHeap(a);
			for(int i =a.length -1; i>=1; i--)
			{
				//������Ԫ�ؽ����������һ��
				int temp = a[0];
				a[0]= a[i];
				a[i ] = temp;
				
				//��С�ѵ���������ȥ�����һ��Ԫ�صĶ����½��ɴ󶥶�
				//�˴���i��������ĳ��ȣ���˽���һ������֮������ĳ��ȼ���1�����պ�i��ֵΪlength-1���ʲ��øı�
				//������maxHeapify(a,0,i-1) �ʹ��ˣ���ʱa[i-1]û�����ȥ����Ϊleft��rightҪС��length.��i-1�պõ���length
				//���ܵ���right����������������
				maxHeapify(a, 0,i);
				
			}
		}
		
		public static void display(int[] a)
		{
			for(int i =0; i< a.length; i++)
			{
				System.out.println(a[i]);
			}
		}
	

		public static void main(String[] args)
		{
			int[] a ={4,1,3,2,99,19,6,26,6,66,595,26,26,62262,62,62,6,266,26,2626,2326,2,6,26,6,626,6};
			heapSort(a, a.length);
			display(a);
		}
} 
