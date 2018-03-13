public class rotatingTable{
  protected revTable keyTable=new revTable<Integer,Character>();
  protected revTable dataTable=new revTable<Integer,Character>();
  protected int location=0;
  protected int totalNumber=-1;
  
  public rotatingTable(){
    
  }
  public void put(Character[] keys,Character[] data){
    int x=0;
    //System.out.println(keys.length);
    while(x!=keys.length){
      //System.out.println(x);
      totalNumber++;
      keyTable.put(x,keys[x]);
      dataTable.put(x,data[x]);
      x++;
    }
  }
  public boolean incrementLoc(){
    if(location==totalNumber-1){
      location=0;
      return true;
    }
    else{
      location++;
      return false;
    }
  }
  public void resetLine(){
    location=0;
  }
  public int getLocation(){
    return location;
  }
  public void setLocation(int set){
    location=set-1;
  }
  public Character getData(Character key){
    Integer number=(Integer)keyTable.getKey(key);
    if(number+location>=totalNumber){
    number=(number+location)-totalNumber;
    }else{
      number=number+location;
    }
    return (Character)dataTable.getData(number);
  }
  public Character getKey(Character data){
    Integer number=(Integer)dataTable.getKey(data);
    if(number-location<0){
    number=(number-location)+totalNumber;
    }else{
      number=number-location;
    }
    return (Character)keyTable.getData(number);
    
  }
  public Character getCurrentCharacter(){
    return (Character)dataTable.getData(0);
  }
}