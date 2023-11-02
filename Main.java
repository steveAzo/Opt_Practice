public class Main{
    public static void main (String[] args) {
        Car myCar = new Car(50);
        myCar.addGas(20);
        myCar.drive(100);
        System.out.println("The gas level left is " + myCar.getGasLevel());
    }
}