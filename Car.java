public class Car{
    private float effeciency;
    private float fuel;

    //constructor for effeciency and fuel
    public Car(float effeciency) {
        this.effeciency = effeciency;
        fuel = 0;
    }

    //setter for effeciency
    public void setEffeciency(float effeciency){
        if(effeciency > 0){
             this.effeciency = effeciency;
        }
    }

    //setter for fuel
    public void setFuel(float fuel) {
        if(fuel >= 0) {
            this.fuel = fuel;
        }
    }

    //getter for effeciency
    public float getEffeciency() {
        return effeciency;
    }

    //getter for fuel and also the method called getGass
    public float getGasLevel() {
        return fuel;
    }


    //the drive method
    public void drive(float distance) {
         float fuelConsumed = distance / effeciency;
         if (fuel >= fuelConsumed) {
            fuel -= fuelConsumed;
         } else {
            System.out.println("Your fuel is finished, top up man!.");
         }
    }



    //method for addGas
    public void addGas(float gallons) {
        if (gallons >= 0) {
            fuel += gallons;
        }
    }
    
}


