import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin admin;

    @Before
    public void before(){
        admin = new DatabaseAdmin("John Matrix",90001,100000.00);
    }

    @Test
    public void hasName(){
        assertEquals("John Matrix",admin.getName());
    }
    @Test
    public void hasNI(){
        assertEquals(90001,admin.getNI());
    }
    @Test
    public void hasSalary(){
        assertEquals(100000.00,admin.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary(){
        admin.raiseSalary(1200.00);
        assertEquals(101200.00,admin.getSalary(),0.01);
    }
    @Test
    public void canGetPayBonus(){
        assertEquals(1000.00,admin.payBonus(),0.01);
    }




}
