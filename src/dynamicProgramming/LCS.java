package dynamicProgramming;

public class LCS
{
	public static void main(String[] args)
	{
		String str1="ABCDEABCEDE";
		String str2="ABCED";
		char[] ch1 =(" " +str1).toCharArray();
		char[] ch2 =(" "+str2).toCharArray();
		
		int[][] E = new int [ch1.length][ch2.length];
		int[][] flag = new int[ch1.length][ch2.length];
		
		for(int i=0;i<ch1.length;i++)
			E[i][0]=0;
		for(int j=0;j<ch2.length;j++)
			E[0][j]=0;
	
		for(int i=1;i<ch1.length;i++)
			for(int j=1;j<ch2.length;j++)
			{
				if(ch1[i]==ch2[j]&&ch1[i-1]==ch2[j-1])
				{
					E[i][j] =E[i-1][j-1]+1;
				}
				else
					E[i][j]=max(E[i][j-1],E[i-1][j]);
			}
		
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch2.length;j++)
			{
			System.out.print(E[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(E[ch1.length-1][ch2.length-1]);
		
	    int m=ch1.length-1;
		int  n=ch2.length-1;
		while(E[m][n]==E[m-1][n])
			m--;
		while(E[m][n]==E[m][n-1])
			n--;
		while(m!=0 &&n!=0)
		{
			System.out.println(ch1[m]);
			m--;
			n--;
		}
	}
	
	
	static int max(int a, int b)
	{
		return a>b?a:b;
	}

}
