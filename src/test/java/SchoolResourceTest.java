import org.junit.Test;
import static org.junit.Assert.*;

public class SchoolResourceTest {

    @Test
    public void testEmployeeWork() {
        Employee employee = new Employee("John", "Teacher", 2000, "Math");
        employee.work();
    }

    @Test
    public void testEquipmentRelocation() {
        Equipment equipment = new Equipment("Projector", "HD Projector", "Room 101", true);
        equipment.relocate("Room 102");
        assertEquals("Room 102", equipment.location);
    }

    @Test
    public void testTeachingMaterialCheckout() {
        TeachingMaterial material = new TeachingMaterial("Textbook", "Math textbook", "Math", false);
        material.checkout();
        assertTrue(material.isInUse);
    }
}
