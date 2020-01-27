public class Televisor {
    boolean isTvOn = false;
    void turnOn(){
        isTvOn = true;
    }
    void turnOff(){
        isTvOn = false;
    }
    void showStatus(){
        System.out.println("TV is on: " + isTvOn);
    }
}
