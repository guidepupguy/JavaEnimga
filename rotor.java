public class rotor{
  protected rotatingTable tableRotor;
  protected Character turnoverpoint;
  
  
  public rotor(Character[] right,Character[] left,Character turnover){
    tableRotor=new rotatingTable();
    tableRotor.put(right,left);
    turnoverpoint=turnover;
  }
  public Character getCodeRight(Character input){
    return (Character)tableRotor.getData(input);
  }
  public Character getCodeLeft(Character input){
    return (Character)tableRotor.getKey(input);
  }
  public boolean turnOver(){
    tableRotor.incrementLoc();
    if(tableRotor.getCurrentCharacter()==turnoverpoint){
      return true;
    }else{
      return false;
    }
  }
}