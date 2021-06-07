package org.launchcode.java.demos.lsn5unittesting.test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class CarTest {
    Car testCar;
    @Before
    public void createCar() {
        testCar = new Car("Toyota", "prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)

    @Test
    public void emptyTest() {
       assertEquals(10,10,0);

    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {

        assertEquals(10, testCar.getGasTankLevel(), 0);

    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving(){
      testCar.drive(50);
      assertEquals(9,testCar.getGasTankLevel(),0);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void gasTankLevelAccurateDrivingPastRange() {
        testCar.drive(400);
        System.out.println(testCar.getGasTankLevel());
    }

    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException(){
        testCar.addGas(5);

        fail("shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }




//    @Test
//    public void testInitialGasTank2() {
//        Car test_car = new Car("Toyota", "Prius", 10, 50);
//        assertEquals(10, test_car.getGasTankLevel(), .001);
//        assertEquals("Toyota", test_car.getMake());
//    }

}



