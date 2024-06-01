package Revision;

public class TV {

    private boolean tvIsOn;
    private boolean tvIsOff;
    private int volume;
    private int channel;

    public boolean isTvIsOn() {
        return tvIsOn;
    }

    public void setTvIsOn(boolean tvIsOn) {
        this.tvIsOn = tvIsOn;
    }

    public boolean isTvIsOff() {
        return tvIsOff;
    }

    public void setTvIsOff(boolean tvIsOff) {
        this.tvIsOff = tvIsOff;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if( volume>=0 && volume <=200 ){
        this.volume = volume;
    }
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if( channel>=0 && channel <=100 ){
        this.channel = channel;
    }
    }

}
