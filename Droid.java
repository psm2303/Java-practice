public class Droid{
    String name;
    int batteryLevel;
  
  public void performTask(String task){
    System.out.println(name +" is performing task: " + task);
    batteryLevel -= 10;
  }

  public int energyReport(){
    return batteryLevel;
  }

  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }
  public static void main(String[] args){
    Droid droid = new Droid("Codey");
    System.out.println(droid);
    droid.performTask("Deliver Pizza");
    System.out.println(droid.batteryLevel);
  }
  public String toString(){
    return "Hello, I'm the droid: " + name;
  }
}