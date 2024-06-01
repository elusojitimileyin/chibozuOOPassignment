package Revision;

public class AirConditioner {

    private boolean isOn;
    private boolean isOff;
    private int temperature = 16 ;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isOff() {
        return isOff;
    }

    public void setOff(boolean off) {
        isOff = off;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {

        if (isOn && temperature >= 16 && temperature < 30) temperature++; {

        }
    }

    public void decreaseTemperature() {
        if (isOn && temperature > 16 && temperature <= 30) temperature--; {

        }
    }
}