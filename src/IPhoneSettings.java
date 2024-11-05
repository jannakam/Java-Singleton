public class IPhoneSettings {

    //add some properties for the custom methods


    //let's say brightness is a percentage from 0-100
    private int brightness;
    //let's say volume is a percentage from 0-100
    private int volume;
    private boolean wifi;

    //private constructor
    private IPhoneSettings() {
    }

    //private static variable for single instance
    private static IPhoneSettings instance;

    //getinstance method
    public static IPhoneSettings getInstance() {
        if (instance == null) {
            instance = new IPhoneSettings();
        }
        return instance;
    }

    //getters
    public int getBrightness() {
        return brightness;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getWifiStatus() {
        return wifi;
    }

    //setters
    public void setBrightness(int brightness) {
        if (brightness >=0 && brightness <= 100) {
            this.brightness = brightness;
        }
    }

    public void setVolume(int volume) {
        if (volume >=0 && volume <= 100) {
            this.volume = volume;
        }
        else {
            this.volume = 0;
        }
    }

    public void invertWifiStatus(boolean wifi) {
        this.wifi = !wifi;
    }

}
