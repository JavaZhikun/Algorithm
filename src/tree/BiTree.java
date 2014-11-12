package tree;

import java.util.Scanner;

public class BiTreeTest
{

}


class  BiTNode
{
	public char data;
	public BiTNode lchild = new BiTNode();
	public BiTNode rchild = new BiTNode();
	
}

class BiTree
{
	public  BiTNode biTree = new BiTNode();
}
class BiTree1
{
	public BiTNode biTNode;

	public void createBiTree(BiTNode T)
	{
		char ch;
		Scanner in = new Scanner(System.in);
		
		
		if(ch =='#')
			T = null;
		
		else
		{
			T = new BiTNode();
		/*	if(T != null)
			return;*/
			
				T.data =ch;
				createBiTree(T.lchild);
				createBiTree(T.rchild);
				
				
			}
		}
}

