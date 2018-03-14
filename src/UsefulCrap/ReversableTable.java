package UsefulCrap;
import java.util.ArrayList;

/**
 * @author Student
 *
 * @param <H> First Variable Type
 * @param <K> Second Varible Type
 */
public class ReversableTable<H,K> {
	protected ArrayList<Pair> mainArray=new ArrayList<Pair>();
	
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
	public ReversableTable() {
		
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
		mainArray.add(new Pair<H,K>(input1,input2));
		return true;
	}
	public K[] getDatas(H input) {
		ArrayList<K> output=new ArrayList<K>();
		Pair temp=null;
		for(int x=0;x!=mainArray.size();x++) {
			temp=mainArray.get(x);
			if(temp.getFirst()==input) {
				output.add((K) temp.getSecond());
			}
		}
		return (K[])output.toArray();
	}
	public H[] getKeys(K input) {
		ArrayList<H> output=new ArrayList<H>();
		Pair temp=null;
		for(int x=0;x!=mainArray.size();x++) {
			temp=mainArray.get(x);
			if(temp.getSecond()==input) {
				output.add((H) temp.getFirst());
			}
		}
		return (H[])output.toArray();
	}
	/**
	 * Returns first Data that Matches the key given
	 * @param input
	 * @return First data for given Key
	 */
	public K getData(H input) {
		return getDatas(input)[0];
	}
	/**
	 * Returns first Data that Matches the key given
	 * @param input
	 * @return First key that has matching data
	 */
	public H getKey(K input) {
		return getKeys(input)[0];
	}
	public ArrayList<Pair> getTabable() {
		return mainArray;
	}
	public void setTabable(ArrayList<Pair> tabable) {
		this.mainArray = tabable;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
