public class Car{
    String owner,brand,serialNo;
    boolean running=false;
    double fuelLevel;
    Car(String owner,String brand,String serialNo,double fuel){
        this.owner=owner;
        this.brand=brand;
        this.serialNo=serialNo;
        this.fuelLevel=fuel;
    }
    void start(){
        if(fuelLevel>0){
            running=true;
            System.out.println(brand+" started.");
        }else{
            System.out.println("No fuel!");
        }
    }
    void stop(){
        running=false;
        System.out.println(brand+" stopped.");
    }
    void checkFuel(){
        System.out.println("Fuel: "+fuelLevel+"L | Running: "+running);
    }
    public static void main(String[] args){
        Car car=new Car("Alice","Toyota","SN-001",40.0);
        car.start();
        car.checkFuel();
        car.stop();
    }
}