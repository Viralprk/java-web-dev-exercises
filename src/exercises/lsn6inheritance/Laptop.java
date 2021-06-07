package exercises.lsn6inheritance;

public class Laptop extends Computer {
    private int batteryLife;

    public Laptop(int ram, int storage, boolean hasScreen, int batteryLife) {
        super(ram, storage, hasScreen);
        this.batteryLife = batteryLife;
    }

    public boolean needsToPlugIn(){
        if (batteryLife < 10) {
            return true;
        }else{
            return false;
        }
    }
}
