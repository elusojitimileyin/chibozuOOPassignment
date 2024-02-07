public class AutomaticBike {

    private boolean isBikeOn;
    private boolean isBikeOff;
    private int speed;
    private int gear;

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

    public void accelerateSpeed() {

        if (isBikeOn && gear == 0 ) speed++; {

        }
    }

    public void decelerateSpeed() {
        if (isBikeOn &&  gear == 0) speed--; {

        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed () {
        if (speed >= 0 && speed <= 20) {
            gear = 1;
        } else if (speed >= 21 && speed <= 30) {
            gear = 2;
        } else if (speed >= 31 && speed <= 40) {
            gear = 3;
        } else {
            gear = 4;
        }
    }

    public int getGear() {
        return gear;
    }

    public void setGear() {
        if (gear >= 1 && gear <= 4) {

        }
    }
}