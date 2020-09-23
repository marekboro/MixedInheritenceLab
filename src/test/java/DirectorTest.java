import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("John Wick",1234567,200000.00,"Hostile takeovers", 1000000.00);
    }

    @Test
    public void hasName(){
        assertEquals("John Wick",director.getName());
    }
    @Test
    public void hasNI(){
        assertEquals(1234567,director.getNI());
    }
    @Test
    public void hasSalary(){
        assertEquals(200000.00,director.getSalary(),0.01);
    }
    @Test
    public void hasDeptName(){
        assertEquals("Hostile takeovers",director.getDeptName());
    }
    @Test
    public void canRaiseSalary(){
        director.raiseSalary(2400.00);
        assertEquals(202400.00,director.getSalary(),0.01);
    }
    @Test
    public void canGetPayBonus(){
        assertEquals(4000.00,director.payBonus(),0.01);
    }
    @Test
    public void hasBudget(){
        assertEquals(1000000.00,director.getBudget(),0.01);
    }

    @Test
    public void canChangeName(){
        director.setName("John Wick 2");
        assertEquals("John Wick 2",director.getName());
    }

    @Test
    public void cannotChangeNameIfNameIsNull(){
        director.setName(null);
        assertEquals("John Wick",director.getName());
    }
    @Test
    public void cannotRaiseSalaryIfSalaryIsNegative(){
        director.raiseSalary(-2400.00);
        assertEquals(200000.00,director.getSalary(),0.01);
    }



}
