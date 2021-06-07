package exercises.lsn6inheritance;

public class Computer extends AbstractEntity {
    private int ram;
    private int storage;
    private boolean hasScreen;


    public Computer(int ram, int storage, boolean hasScreen) {
        this.ram = ram;
        this.storage = storage;
        this.hasScreen = hasScreen;
    }

    public void increaseRam(int number){
        this.ram = this.ram + number;

    }
    public void increaseStorage(int number){
        this.storage = this.storage + number;

    }
}
