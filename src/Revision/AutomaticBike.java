package Revision;

public class AutomaticBike {

    private boolean isBikeOn;
    private boolean isBikeOff;
    private int speed;
    private int gear = 1;

    public boolean isBikeOn() {
        return isBikeOn;
    }
    public boolean isBikeOff() {
        return isBikeOff;
    }

    public void setBikeOff(boolean bikeOff) {
        isBikeOff = bikeOff;
    }

    public void setBikeOn(boolean bikeOn) {

        isBikeOn = bikeOn;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed ( int speed){
        this.speed = speed;

    }

    public int getGear() {
        if (speed >= 0 && speed <= 20) {
            gear = 1;
        } else if (speed >= 21 && speed <= 30) {
            gear = 2;
        } else if (speed >= 31 && speed <= 40) {
            gear = 3;
        } else {
            gear = 4;
        }
        return gear;
    }


    public void accelerateSpeed() {

        if (isBikeOn )  {
            gear = getGear();
            if (gear == 1){
                speed += 1;
            }else if(gear ==2){
                speed += 2;
            }else if(gear ==3){
                speed += 3;
            }else if(gear ==4){
                speed += 4;
            }


        }
    }

    public void decelerateSpeed() {
        if (isBikeOn) {
            gear = getGear();
            if (gear == 1) {
                speed -= 1;
            } else if (gear == 2) {
                speed -= 2;
            } else if (gear == 3) {
                speed -= 3;
            } else if (gear == 4) {
                speed -= 4;
            }
        }


    }
}