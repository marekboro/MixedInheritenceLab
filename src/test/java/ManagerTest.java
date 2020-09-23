import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("John Rambo",90210,100000.00,"Tech");
    }

    @Test
    public void hasName(){
        assertEquals("John Rambo",manager.getName());
    }
    @Test
    public void hasNI(){
        assertEquals(90210,manager.getNI());
    }
    @Test
    public void hasSalary(){
        assertEquals(100000.00,manager.getSalary(),0.01);
    }
    @Test
    public void hasDeptName(){
        assertEquals("Tech",manager.getDeptName());
    }
    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1200.00);
        assertEquals(101200.00,manager.getSalary(),0.01);
    }
    @Test
    public void canGetPayBonus(){
        assertEquals(1000.00,manager.payBonus(),0.01);
    }



}

