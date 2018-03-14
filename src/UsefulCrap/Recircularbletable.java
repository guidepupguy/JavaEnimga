package UsefulCrap;
import java.util.ArrayList;

/**
 * @author Alex
 *
 * @param <H> First Variable Type
 * @param <K> Second Varible Type
 */
public class Recircularbletable<H,K> {
	protected CircularArray<Pair> mainArray=new CircularArray<Pair>();
	
	/**
	 * @param input1 Array of type H inputs
	 * @param input2 Array of type K inputs synced to the type H inputs
	 */
	public Recircularbletable(H[] input1, K[] input2) {
		add(input1,input2);
	}
	public Recircularbletable(H input1, K input2) {
		add(input1,input2);
	}
	public Recircularbletable() {
		
	}
	public int size() {
		return mainArray.size();
	}
	/**
	 * @param input1 Array of H object inputs
	 * @param input2 Array of type K inputs
	 * @return True
	 */
	public boolean add(H[] input1, K[] input2) {
		for(int x=0; x!=input1.length; x++) {
			add(input1[x],input2[x]);
			System.err.println("Recircularble Added Index "+input1[x].toString()+","+input2[x].toString());
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
	public Pair getPairs(H input) {
		
	}
	public Pair getPairs(K input) {
		
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
		System.err.println("Data retrived on request");
		return (K[])output.toArray();
	}
	public H[] getKeys(K input) {
		ArrayList<H> output=new ArrayList<H>();
		Pair temp=null;
		System.err.print("Getting keys on request... ");
		for(int x=0;x!=mainArray.size();x++) {
			temp=mainArray.get(x);
			if(temp.getSecond()==input) {
				output.add((H) temp.getFirst());
			}
		}
		System.err.println("	Success!");
		return (H[])output.toArray();
	}
	/**
	 * Returns first Data that Matches the key given
	 * @param input
	 * @return First data for given Key
	 */
	public K getData(H input) {
		try {
		return getDatas(input)[0];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.print("Error!");
			return null;
		}
	}
	/**
	 * Returns first Data that Matches the key given
	 * @param input
	 * @return First key that has matching data
	 */
	public H getKey(K input) {
		return getKeys(input)[0];
	}
	public CircularArray<Pair> getTabable() {
		return mainArray;
	}
	public void setTabable(CircularArray<Pair> tabable) {
		this.mainArray = tabable;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
