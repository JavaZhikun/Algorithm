package dynamicProgramming;

public class EditDistanceTest
{
	public static  void main(String[] args)
	{
		EditDistance e = new EditDistance();
		
		String str1 = "EXPONENTIAL";
		String str2 ="POLYNOMIAL";
		System.out.println(e.editDistance(str1, str2));
	}
}

class EditDistance
{

	public  int editDistance(String a , String b)
	{
		//将其开头加上一个空格，转换为字符数组
		String a1 =" " +a;
		String b1 =" "+b;
		char[] ch1 = a1.toCharArray();
		char[] ch2 = b1.toCharArray();
		int [][] E = new int [ch1.length][ch2.length];
		int [][] diff = new int[ch1.length][ch2.length];
		
		//求得编辑距离的数组
		for(int i =0; i<ch1.length; i++)		
			E[i][0] =i;
		for(int j =1; j< ch2.length; j++)
			E[0][j] =j;
		
		for(int i=1; i<ch1.length; i++)
			for(int j=1; j<ch2.length ;j++)
			{
				if(ch1[i] == ch2[j])
					diff[i][j]=0;
				else
					diff[i][j]=1;
				E[i][j] = min(E[i-1][j]+1,  E[i][j-1]+1, E[i-1][j-1]+diff[i][j]); 
			}
		
		//----------------打印编辑数组
		/*System.out.print("  ");
		for(int j =0; j<ch2.length; j++)
		{
		System.out.print(ch2[j]+" ");
		}
		System.out.println();
		
		for(int i= 0;  i<ch1.length; i++)
		{
				System.out.print(ch1[i]+" ");
			
			for(int j =0; j<ch2.length; j++)
			{
				System.out.print(E[i][j]+" ");
			}
			System.out.println();
		}*/
		
		//返回最后一个元素
		return E[ch1.length-1][ch2.length-1];
	}
	public  int min(int x, int y , int z)
	{
		int a =(x<y)?x:y ;
		int b =(a<z)?a:z;
		return b;
	}
	
}
