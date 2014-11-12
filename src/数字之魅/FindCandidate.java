package 数字之魅;
//寻找发帖水王
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
				//碰到相同的，增加1
				if(candidate == ID[i])
				           nTimes ++;
				//碰到不同的，减少1
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
