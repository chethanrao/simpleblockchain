import java.util.Arrays;



public class Block{
	
	private String[] transaction;
	
	private int previousHash;
	

	private int blockHash;
	
	public Block(int previousHash,String[] transaction){
		this.previousHash=previousHash;
		this.transaction=transaction;
		
		Object[] blockContents={Arrays.hashCode(transaction),previousHash};
		
		this.blockHash=Arrays.hashCode(blockContents);
		
		
	}
	
	

	public String[] getTransaction(){
		return transaction;
	}
	
	public int getPreviousHash(){
		return previousHash;
	}
	
	public int getBlockHash(){
		return blockHash;
	}
}