package dynamicProgramming;


//���������������
//the longest common subsequence
public class LCSTest
{
		public static void main(String[] args)
		{
			  LCS lcs = new LCS();
			  String str1 = "ABCBDAB";
			  String str2 = "BDCABA";
			 System.out.println( lcs.LCSLength(str1, str2,0) );
			 lcs.printLCS(lcs.LCSLength(str1, str2, 1), str1, str1.length(), str2.length());
		
		}

}

class LCS
{
	public int[][] LCSLength(String x, String y, int flag)
	{
		String x1 =" "+x;
		String y1 = " "+y;
		char[] ch1 = x1.toCharArray();
		char[] ch2 = y1.toCharArray();
		//����c���ڴ������������е�����
		int[][] c = new int[ch1.length][ch2.length];
		//����b���ڴ�Ŷ�Ӧ�ı�ʶ
		int[][] b = new int[ch1.length][ch2.length];//����ָ��1��ʾ������ָ��2��ʾ�������Ϸ�ָ��3��ʾ
		
		
		for(int i =0;i <ch1.length; i++)
		{
			c[i][0] =0;
		}
		
		for(int j= 0; j<ch2.length;j++)
		{
			c[0][j] = 0;
		}
		
		for(int i=1; i<ch1.length; i++)
		{
			for(int j=1; j<ch2.length; j++)
			{
				if(ch1[i] == ch2[j])
				{
					c[i][j]= c[i-1][j-1]+1;
					//ָ�����Ϸ�
					b[i][j] = 3;
				}
				
				else if(c[i-1][j]>=c[i][j-1])
				{
					c[i][j] = c[i-1][j];
					//ָ���Ϸ�
					b[i][j] =1;
				}
				
				else 
				{
					c[i][j] =c[i][j-1];
					//ָ����
					b[i][j] = 2;
				}
			}
		}
		
		for(int i =0; i<ch1.length; i++)
		{
			for(int j=0; j<ch2.length; j++)
			{
				System.out.print(c[i][j]);
				System.out.print(b[i][j] +" ");
				
			}
			System.out.println();
			System.out.println();
		}
		
		//��־λΪ0ʱ����c����
		if(flag==0)
		return  c;
		
		//��־λΪ1ʱ����b����
		else
		   return b;
		
	}
	
	public void printLCS(int [][] b , String x, int i , int j)
	{
		char[] ch1 =(" "+x).toCharArray();
		if(i ==0 ||j ==0)
			return;
		
		//������Ҫ��ӡ�����
		//ָ�����Ϸ�
		if(b[i][j] == 3)
		{
			printLCS(b, x, i-1, j-1);
			System.out.println(ch1[i]);
		}
		//ָ���Ϸ�
		else if(b[i][j] ==1)
		{
			printLCS(b,x,i-1,j);
		}
		//ָ����
		else 
			printLCS(b,x, i, j-1);
	}
}
