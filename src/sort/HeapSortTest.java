package sort;

/**
 * 完整ok版本
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
			
			//寻找出一个子树的最大值，并将其与顶点交换
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
			//此处使用length/2-1和（length-1）/2均可，不过后者可能多一次不必要的运算
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
				//将最大的元素交换到最后面一个
				int temp = a[0];
				a[0]= a[i];
				a[i ] = temp;
				
				//减小堆的容量，将去掉最后一个元素的堆重新建成大顶堆
				//此处的i代表数组的长度，因此将第一个换掉之后，数组的长度减少1，而刚好i的值为length-1，故不用改变
				//如果变成maxHeapify(a,0,i-1) 就错了，此时a[i-1]没有算进去，因为left和right要小于length.而i-1刚好等于length
				//可能导致right处不参与其中排序
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
