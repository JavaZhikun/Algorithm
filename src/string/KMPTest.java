package string;

//字符串匹配算法
public class KMPTest
{
			public static void main(String[] args)
			{
				KMP kmp = new KMP();
				String s ="aaaaaaaaaaaaabaaaaaaaaaaaaaabcdefd";
				String t ="aaaaaab";
				System.out.println(kmp.indexKMP(s, t, 1));
			}
}

class KMP
{
	public void getNext(String t, int[] next)
	{
		char[] t1 =(" " +t).toCharArray();    //用来做后面的字符串比较，但第一个字符的标好为1，故加一个空格
		int i=1;
		int j=0;
		
		next[1] = 0;
		while(i < t.length())
		{
			if( j == 0 || t1[i] ==t1[j])
			{
				i++;
				j++;
				next[i] = j;
				
				//----------------改进的部分-----------
				if(t1[i] != t1[j])                //若当前字符与前缀字符不同
					next[i] =j;                   //则当前的j为next在i位置的值

				else                                //如果与前缀字符相同，则将前缀字符的next值赋给next在i位置的值
					next[i] = next[j];
			} 
			
			else 
				j = next[j];                 //若字符不相同，则j值回溯
		}
	}
	
	
	//返回子串t在主串s中第pos个字符之后的位置，若不存在，则函数返回值为0
	//T非空， 1<= pos <=s.length();
	public int indexKMP(String s, String t, int pos)
	{
		int i =pos;
		
		int  j =1;
		int[] next = new int[255];  //定义一个next数组
		
		//比较的时候都是从数组的位置1开始的，故将位置0用空格填充
		char[] s1 = (" "+ s).toCharArray();
		char[] t1 = (" " + t).toCharArray();
 		getNext(t,next);
		
		while(i<= s.length() && j<= t.length())  //若i小于s的长度且j小于t的长度，循环继续
		{
			if(j ==0 || s1[i] == t1[j])
			{
				i++;
				j++;
			}
			
			else                                    //指针后退重新开始匹配
			{
				j = next[j];                    //j退回合适的位置，i值不变
			}
		}
		
		if(j > t.length())
			return i - t.length();
		
		else
			return 0;
	}
}
