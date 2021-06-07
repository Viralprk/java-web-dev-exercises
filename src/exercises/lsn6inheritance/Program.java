package exercises.lsn6inheritance;

public class Program {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop(800,8,true,100);
        Smartphone myPhone = new Smartphone(128,4,true,0);

        System.out.println(myLaptop.getId());
        System.out.println(myPhone.getId());

        myPhone.takeSelfie();
        System.out.println(myLaptop.needsToPlugIn());
        System.out.println(myPhone.getNumberOfSelfies());
        myPhone.takeSelfie();
        System.out.println(myLaptop.needsToPlugIn());
        System.out.println(myPhone.getNumberOfSelfies());
        myPhone.takeSelfie();

    }

}
