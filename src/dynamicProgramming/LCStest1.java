package dynamicProgramming;

public class LCStest1
{

	public static void main(String[] args)
	{
		String  str1="ABCD";
		String str2 ="ABad";
		int [] a = new int[str1.length()];
		char[] str11=(str1).toCharArray();
		char[] str22=(str2).toCharArray();
		a[0]=0;
		int max=0;
		for(int j=0;j<str22.length;j++)
		for(int i=0; i<str11.length;i++)
		{
			while(str22[j] ==str11[i])
			{
			 a[j]++;
		       j++;
		       i++;
				
			}
			if(a[j]>max)
			{
				max=a[j];
			    a[j]=0;
			}
		}

	System.out.println(max);
	
	}
}

