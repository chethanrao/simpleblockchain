
public class Main{
	public static void main(String[] args){
		String[] transaction1={"a","b","c","d"};
		Block block1=new Block(-1,transaction1);
		
		int hashCode1=block1.getBlockHash();
		
		System.out.println(hashCode1);
		String[] transaction2={"e","f","g","h"};

		Block block2=new Block(hashCode1,transaction2);
		
		System.out.println(block2.getBlockHash());

		
		
	}
}