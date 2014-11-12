package string;

//�ַ���ƥ���㷨
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
		char[] t1 =(" " +t).toCharArray();    //������������ַ����Ƚϣ�����һ���ַ��ı��Ϊ1���ʼ�һ���ո�
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
				
				//----------------�Ľ��Ĳ���-----------
				if(t1[i] != t1[j])                //����ǰ�ַ���ǰ׺�ַ���ͬ
					next[i] =j;                   //��ǰ��jΪnext��iλ�õ�ֵ

				else                                //�����ǰ׺�ַ���ͬ����ǰ׺�ַ���nextֵ����next��iλ�õ�ֵ
					next[i] = next[j];
			} 
			
			else 
				j = next[j];                 //���ַ�����ͬ����jֵ����
		}
	}
	
	
	//�����Ӵ�t������s�е�pos���ַ�֮���λ�ã��������ڣ���������ֵΪ0
	//T�ǿգ� 1<= pos <=s.length();
	public int indexKMP(String s, String t, int pos)
	{
		int i =pos;
		
		int  j =1;
		int[] next = new int[255];  //����һ��next����
		
		//�Ƚϵ�ʱ���Ǵ������λ��1��ʼ�ģ��ʽ�λ��0�ÿո����
		char[] s1 = (" "+ s).toCharArray();
		char[] t1 = (" " + t).toCharArray();
 		getNext(t,next);
		
		while(i<= s.length() && j<= t.length())  //��iС��s�ĳ�����jС��t�ĳ��ȣ�ѭ������
		{
			if(j ==0 || s1[i] == t1[j])
			{
				i++;
				j++;
			}
			
			else                                    //ָ��������¿�ʼƥ��
			{
				j = next[j];                    //j�˻غ��ʵ�λ�ã�iֵ����
			}
		}
		
		if(j > t.length())
			return i - t.length();
		
		else
			return 0;
	}
}
