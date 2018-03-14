package UsefulCrap;

public class CircularArray<K>{
	protected ReversableTable<Integer,K> mainTable=new ReversableTable<Integer,K>();
	int currentnumber=0;
	public CircularArray() {
		
	}
	public CircularArray(K[] input) {
		
	}
	public boolean add(K[] input) {
		for(K x: input) {
			add(x);
			
		}
		return true;
	}
	public boolean add(K input) {
		System.err.println("CircularArray added "+input.toString()+" to "+currentnumber);
		mainTable.add(currentnumber, input);
		increment();
		return true;
	}
	public boolean finalise() {
		currentnumber=null;
		return true;
	}
	protected void increment() {
		currentnumber++;
	}
	public int size() {
		return currentnumber;
	}
	public K get(int location) {
		return mainTable.getData(location);
	}
	
}
