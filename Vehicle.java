abstract class Vehicle
{
    abstract void start();
    public void stop()
    {
       System.out.println("Vehicle stopped");
    }
}
class Car extends Vehicle
{
    void start()
    {
         System.out.println("Car starts with a key"); 
    }
    public static void main(String args[])
    {
       Car myCar=new Car();
       myCar.start();
       myCar.stop();
    }
}