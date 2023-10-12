package employee;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class EmployeeTesting{


    @Test
    public void testDA()
    {
        Employee emp = new Employee();
        emp.setBasicPay(40000);
        EmployeeService es = new EmployeeService(emp);
        assertEquals(16000,es.getDA(),0);
        

    }
    @Test
    public void testDeductTax()
    {
        Employee emp = new Employee();
        emp.setBasicPay(70000);
        EmployeeService es = new EmployeeService(emp);
        assertEquals(1142400,es.deductTax(),0);

    }


}
