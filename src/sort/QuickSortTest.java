package sort;

public class QuickSortTest
{
	public static void main(String[] args) throws Exception
	{
		QuickSort qs = new QuickSort();
		int[]  data={1,3};
		//将待排序的数组赋给快排的数组
		qs.data =data;
		//对整个数组进行快排
		qs.quickSort(0, qs.data.length-1);
		//打印出来
		qs.display();
	}
}

class QuickSort
{
	//用来排序的数组
         int[] data;
	//分离函数，将小于p的元素放在其左边，大于p的元素放在右边
	public int partition( int[] array, int left , int right) throws Exception
	{
	 
		
		//挡板最开始在最左边,store用来做挡板只用，比中枢值小的放在store左边，其余的放在右边
		//将小于中枢值的元素放在挡板处元素的左边(挡板处本身元素用作交换之用，不一定比中枢元素小)
		int temp;
		int store =left;
		int key=array[right];//key为中枢值,选定中枢值为最右边的元素
		
				for(int i =left; i<=right-1; i++)
				{
						//将小于中枢值的元素放在挡板的左边
						if(array[i]<=key)
						{
							temp = array[i];
							array[i] = array[store];
							array[store] =temp;
						}
						//挡板右移
						store++;
						
				}
		
				//交换中枢元素和挡板处元素的位置
				int temp2=array[store];
				array[store] =key;
				key=temp2;
				
				//返回中枢值p的存储位置，完成分离
				return store;
	}
	
	  //快速排序的过程
			public void quickSort( int left, int right) throws Exception
			{
				
				//递归函数跳出的条件,也可不要，因为和输入有关
				if(left >= right)
				        return;
				
				if(left < right)
				{
					int  q =partition(data,left,right);
					partition(data, left, q-1);
					//若q刚好为最后一个元素，则有可能溢出
					partition(data, q+1, right);
				}
			}
			
			//将数组显示出来
			public void display()
			{
				for(int i=0; i<data.length; i++)
				{
					System.out.print(data[i]+" ");
				}
			}
}








//快排版本二
 // 方便理解的快排版本

/*public class QuickSortTest {

      

     public static void main(String[] args)   

     {  
         // TODO 自动生成方法存根  
         quicksort qs = new quicksort();  
        int data[] = {2,8,7,1,3,5,6,4};  
        qs.data = data;  
        qs.sort(0, qs.data.length-1);  
        qs.display();  

    }  
}  

 class quicksort  
{  
    public int data[];  
     private int partition(int sortArray[],int low,int hight)  
     {  
         int key = sortArray[low];  
         while(low<hight)  
         {  

             while(low<hight && sortArray[hight]>=key)  

                 hight--;  

             sortArray[low] = sortArray[hight];  
             while(low<hight && sortArray[low]<=key)  
                 low++;  
             sortArray[hight] = sortArray[low];  
         }  
        sortArray[low] = key;  
        return low;  
     }  

     public void sort(int low,int hight)  
     {  
         if(low<hight)  
         {  
             int result = partition(data,low,hight);  
            sort(low,result-1);  
             sort(result+1,hight);  
         }  
     }  
     public void display()  
     {  
        for(int i=0;i<data.length;i++)  
         {  
             System.out.print(data[i]);  
            System.out.print(" ");  
         }  
    }  

 } 

 
*/