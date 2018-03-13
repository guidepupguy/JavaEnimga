import java.util.Hashtable;
public class revTable<H,I>{
	protected Hashtable mainTable=new Hashtable<H,I>();
	protected Hashtable revrTable=new Hashtable<I,H>();
	
	public revTable(){
		
	}
	
	public boolean addEntry(H key,I data){
		try{
			mainTable.put(key,data);
			revrTable.put(data,key);
		}catch(Error e){
			return false;
		}
		return true;
	}
	
	public I getData(H key){
		I output=(I)mainTable.get(key);
		return output;
	}
	
	public H getKey(I data){
		H output=(H)revrTable.get(data);
		return output;
	}
	
	public boolean put(H key,I data){
		try{
			mainTable.put(key,data);
			revrTable.put(data,key);
		}catch(Error e){
			return false;
		}
		return true;
	}
}