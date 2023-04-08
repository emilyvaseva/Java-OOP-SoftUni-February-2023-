package robots;

import org.junit.Assert;
import org.junit.Test;

public class ServiceTests {
    @Test(expected = NullPointerException.class)
    public void testCreateServiceWithInvalidName(){
        new Service(null,5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateServiceWithInvalidCapacity(){
        new Service("Service",-4);
    }

    @Test(expected = NullPointerException.class)
    public void testCreateServiceWithInvalidNameEmpty(){
        new Service("",5);
    }

    @Test
    public void testCreateService(){
        Service service = new Service("dvr",10);
        Assert.assertEquals("dvr",service.getName());
        Assert.assertEquals(10,service.getCapacity());
    }

    @Test
    public void testAddRobot(){
        Service service = new Service("Ser",10);
        Robot mike = new Robot("Mike");
        Assert.assertEquals(0,service.getCount());
        service.add(mike);
        Assert.assertEquals(1,service.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddCart(){
        Service service = new Service("Ser",1);
        Robot mike = new Robot("Mike");
        service.add(mike);
        Assert.assertEquals(1,service.getCount());

        Robot betty = new Robot("Betty");
        service.add(betty);
    }

    @Test
    public void testRemove(){
        Service service = new Service("House",10);
        Robot mike = new Robot("Mike");
        Robot betty = new Robot("Betty");
        service.add(mike);
        service.add(betty);

        Assert.assertEquals(2,service.getCount());

        service.remove("Betty");
        Assert.assertEquals(1,service.getCount());

        service.remove("Mike");
        Assert.assertEquals(0,service.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveArgument(){
        Service service = new Service("Ser",10);
        service.remove("Ivan");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRobot(){
        Service service = new Service("House",10);
        service.forSale("Ivan");
    }

    @Test
    public void testtt(){
        Service service = new Service("1",10);
        Robot mike = new Robot("Mike");
        Robot betty = new Robot("Betty");
        Robot john = new Robot("John");

        service.add(mike);
        service.add(betty);
        service.add(john);

        Assert.assertEquals("The robot Mike, Betty, John is in the service 1!", service.report());
    }

    @Test
    public void testtmt(){
        Service service = new Service("1",10);
        Robot mike = new Robot("Mike");
        service.add(mike);

        Robot returned = service.forSale("Mike");
        Assert.assertFalse(returned.isReadyForSale());
    }

}
