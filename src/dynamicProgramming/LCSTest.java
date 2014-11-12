package dynamicProgramming;


//最长公共子序列问题
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
		//数组c用于存放最长公共子序列的数组
		int[][] c = new int[ch1.length][ch2.length];
		//数组b用于存放对应的标识
		int[][] b = new int[ch1.length][ch2.length];//向上指用1表示，向左指用2表示，向左上方指用3表示
		
		
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
					//指向左上方
					b[i][j] = 3;
				}
				
				else if(c[i-1][j]>=c[i][j-1])
				{
					c[i][j] = c[i-1][j];
					//指向上方
					b[i][j] =1;
				}
				
				else 
				{
					c[i][j] =c[i][j-1];
					//指向左方
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
		
		//标志位为0时返回c数组
		if(flag==0)
		return  c;
		
		//标志位为1时返回b数组
		else
		   return b;
		
	}
	
	public void printLCS(int [][] b , String x, int i , int j)
	{
		char[] ch1 =(" "+x).toCharArray();
		if(i ==0 ||j ==0)
			return;
		
		//三种需要打印的情况
		//指向左上方
		if(b[i][j] == 3)
		{
			printLCS(b, x, i-1, j-1);
			System.out.println(ch1[i]);
		}
		//指向上方
		else if(b[i][j] ==1)
		{
			printLCS(b,x,i-1,j);
		}
		//指向左方
		else 
			printLCS(b,x, i, j-1);
	}
}
