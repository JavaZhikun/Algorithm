package sort;

public class QuickSortTest
{
	public static void main(String[] args) throws Exception
	{
		QuickSort qs = new QuickSort();
		int[]  data={1,3};
		//������������鸳�����ŵ�����
		qs.data =data;
		//������������п���
		qs.quickSort(0, qs.data.length-1);
		//��ӡ����
		qs.display();
	}
}

class QuickSort
{
	//�������������
         int[] data;
	//���뺯������С��p��Ԫ�ط�������ߣ�����p��Ԫ�ط����ұ�
	public int partition( int[] array, int left , int right) throws Exception
	{
	 
		
		//�����ʼ�������,store����������ֻ�ã�������ֵС�ķ���store��ߣ�����ķ����ұ�
		//��С������ֵ��Ԫ�ط��ڵ��崦Ԫ�ص����(���崦����Ԫ����������֮�ã���һ��������Ԫ��С)
		int temp;
		int store =left;
		int key=array[right];//keyΪ����ֵ,ѡ������ֵΪ���ұߵ�Ԫ��
		
				for(int i =left; i<=right-1; i++)
				{
						//��С������ֵ��Ԫ�ط��ڵ�������
						if(array[i]<=key)
						{
							temp = array[i];
							array[i] = array[store];
							array[store] =temp;
						}
						//��������
						store++;
						
				}
		
				//��������Ԫ�غ͵��崦Ԫ�ص�λ��
				int temp2=array[store];
				array[store] =key;
				key=temp2;
				
				//��������ֵp�Ĵ洢λ�ã���ɷ���
				return store;
	}
	
	  //��������Ĺ���
			public void quickSort( int left, int right) throws Exception
			{
				
				//�ݹ麯������������,Ҳ�ɲ�Ҫ����Ϊ�������й�
				if(left >= right)
				        return;
				
				if(left < right)
				{
					int  q =partition(data,left,right);
					partition(data, left, q-1);
					//��q�պ�Ϊ���һ��Ԫ�أ����п������
					partition(data, q+1, right);
				}
			}
			
			//��������ʾ����
			public void display()
			{
				for(int i=0; i<data.length; i++)
				{
					System.out.print(data[i]+" ");
				}
			}
}








//���Ű汾��
 // �������Ŀ��Ű汾

/*public class QuickSortTest {

      

     public static void main(String[] args)   

     {  
         // TODO �Զ����ɷ������  
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