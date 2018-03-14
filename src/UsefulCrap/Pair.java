package UsefulCrap;

public class Pair<H,K> {
	H data1;
	K data2;
	
	
	public Pair(H data1, K data2) {
		this.data1=data1;
		this.data2=data2;
	}
	public H getFirst() {
		return data1;
	}
	public K getSecond(){
		return data2;
	}
	public boolean setFirst(H first) {
		data1=first;
		return true;
	}
	public boolean setSecond(K second) {
		data2=second;
		return true;
	}
	
}
