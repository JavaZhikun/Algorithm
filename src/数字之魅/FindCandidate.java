package ����֮��;
//Ѱ�ҷ���ˮ��
public class FindCandidate
{
	
	public static int Find(int[] ID)
	{
		int candidate=0;
		int nTimes,i;
		
		for( i = nTimes =0; i<ID.length; i++)
		{
			if(nTimes ==0)
			{
				candidate = ID[i];
				nTimes = 0;
			}
			else 
			{
				//������ͬ�ģ�����1
				if(candidate == ID[i])
				           nTimes ++;
				//������ͬ�ģ�����1
				else
					nTimes--;
			}
		}
		
		return candidate;
	}
	
	public static void main(String[] args)
	{
		int a[] ={0001,0002,0003,0004,0002,0001,0002,0003
				,0002,0001,0002,0002,0002};
		
		FindCandidate f =new FindCandidate();
		System.out.println(f.Find(a));
	}
 
}
