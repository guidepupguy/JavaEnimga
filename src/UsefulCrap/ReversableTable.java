package UsefulCrap;
import java.util.ArrayList;

/**
 * @author Student
 *
 * @param <H> First Variable Type
 * @param <K> Second Varible Type
 */
public class ReversableTable<H,K> {
	protected ArrayList<Pair> tabable=new ArrayList<Pair>();
	
	/**
	 * @param input1 Array of type H inputs
	 * @param input2 Array of type K inputs synced to the type H inputs
	 */
	public ReversableTable(H[] input1, K[] input2) {
		add(input1,input2);
	}
	public ReversableTable(H input1, K input2) {
		add(input1,input2);
	}
	
	/**
	 * @param input1 Array of H object inputs
	 * @param input2 Array of type K inputs
	 * @return True
	 */
	public boolean add(H[] input1, K[] input2) {
		for(int x=0; x!=input1.length; x++) {
			add(input1[x],input2[x]);
		}
		return true;
	}
	
	/**
	 * @param input1 Object of type H to be the Key of the pair
	 * @param input2 Object of type K to be the Data of the pair
	 * @return True
	 */
	public boolean add(H input1, K input2){
		tabable.add(new Pair<H,K>(input1,input2));
		return true;
	}
	public K getData(H input) {
		
	}
	public H getKey(K input) {
		for(int x=0;x!=tabable.size();x++) {
			
		}
	}
	protected ArrayList<Object> loopGet(boolean isData,Object Check) {
		ArrayList<Object> output=new ArrayList<Object>();
		Object temp=null;
		if(isData) {
			
		}
		for(int x=0;x!=tabable.size();x++) {
			if(isData) {
				temp=tabable.get(x).getFirst();
				if(temp==Check) {
					output.add(Check);
				}
			}
		}
	}
	public ArrayList<Pair> getTabable() {
		return tabable;
	}
	public void setTabable(ArrayList<Pair> tabable) {
		this.tabable = tabable;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
