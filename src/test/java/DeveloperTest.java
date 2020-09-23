import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Jarrod",912345,50000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Jarrod",developer.getName());
    }
    @Test
    public void hasNI(){
        assertEquals(912345,developer.getNI());
    }
    @Test
    public void hasSalary(){
        assertEquals(50000.00,developer.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1200.00);
        assertEquals(51200.00,developer.getSalary(),0.01);
    }
    @Test
    public void canGetPayBonus(){
        assertEquals(500.00,developer.payBonus(),0.01);
    }



}
