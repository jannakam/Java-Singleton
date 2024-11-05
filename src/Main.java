public class Main {
    public static void main(String[] args) {
        //create an instance
        IPhoneSettings settings = IPhoneSettings.getInstance();

        //testing brightness
        int brightness = settings.getBrightness();
        System.out.println(brightness);
        settings.setBrightness(80);
        System.out.println(settings.getBrightness());

        //testing volume
        settings.setVolume(-3);
        System.out.println(settings.getVolume());
        settings.setVolume(30);
        System.out.println(settings.getVolume());

        //testing wifi
        settings.invertWifiStatus(true);
        boolean wifiStatus = settings.getWifiStatus();
        System.out.println(wifiStatus);
    }
}