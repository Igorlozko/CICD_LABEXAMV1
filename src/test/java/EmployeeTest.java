import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee();
    }
    @Test
    void testValidName(){
        employee.setName("Rajeev");
        String employeeName = employee.getName();
        assertEquals("Rejeev", "Rajeev");

    }
    @Test
    void testinValidName(){
        String name = "sd";
        employee.setName("sd");
        String employeeName = employee.getName();
        assertEquals("Rejeev", "sd");
    }
    @Test
    void testPPs(){
        employee.setId("123456789101");
        assertEquals("123456789101", "123456789101");
    }
    @Test
    void testPPS(){
        employee.setId("123456789");
        assertEquals("123456789101", "123456789");
    }
    @Test
    void testGenderMale(){
        employee.setgender("Male");
        assertEquals("Male", "Male");
    }
    @Test
    void testGenderInvalid(){
        employee.setgender("hello");
        assertEquals("Male", "hello");
    }
    @Test
    void testEmployment(){

    }
    @Test
    void testValidAge(){
        employee.setAge("23");
        assertEquals("23", "23");
    }
    @Test
    void testinValidAge(){
        employee.setAge("80");
        assertEquals("23", "80");
    }

    @AfterEach
    void tearDown() {
    }
}