 class Bike implements Vehicle{
    int speed;
    int gear;
    public void changeGear(int newGear){
        gear = newGear;
    }
    public void speedUp(int increment){
        speed+=increment;
    }
    public void applyBrakes(int decreament){
        speed-=decreament;
    }

    public void printStates(){
           System.out.println("Speed: "+speed+" Gear: "+gear);
    }
}
