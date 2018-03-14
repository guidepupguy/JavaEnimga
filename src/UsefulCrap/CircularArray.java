package UsefulCrap;

public class CircularArray<K>{
	protected ReversableTable<Integer,K> mainTable=new ReversableTable<Integer,K>();
	protected ReversableTable<Integer,K> updated=new ReversableTable<Integer,K>();
	int currentnumber=0;
	int size;
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
		addNull(input);
		increment();
		return true;
	}
	protected boolean addNull(K input) {
		System.err.println("CircularArray added "+input.toString()+" to "+currentnumber);
		mainTable.add(currentnumber, input);
		return true;
	}
	protected boolean addNull(K input, int loc) {
		System.err.println("CircularArray added "+input.toString()+" to "+currentnumber);
		mainTable.add(currentnumber, input);
		return true;
	}
	protected boolean addSafe(K input) {
		System.err.println("CircularArray added Safe "+input.toString()+" to "+size);
		updated.add(size, input);
		return true;
	}
	public boolean finalise() {
		size=currentnumber;
		updated=mainTable;
		System.err.println("Finals");
		for(int x=0; x!=currentnumber;x++) {
			addSafe(updated.getData(x));
			size++;
		}
		size=currentnumber*-1;
		for(int x=0; x!=currentnumber;x++) {
			addSafe(updated.getData(x));
			size++;
		}
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
	public Object[] getLocs(K input) {
		Object[] output=mainTable.getKeys(input);
		return output;
	}
	public Integer getLoc(K input) {
		return (Integer)getLocs(input)[0];
	}
}
