abstract class SchoolResource {
    private int resourceID;
    protected String resourceName;
    public String description;
    public static int totalResources = 0;
    public SchoolResource(String resourceName, String description) {
        this.resourceID = ++totalResources;
        this.resourceName = resourceName;
        this.description = description;
    }
    public abstract void allocateResource();

    public String getResourceDetails() {
        return "Resource ID: " + resourceID + ", Resource Name: " + resourceName + ", Description: " + description;
    }
}

class Employee extends SchoolResource {
    private double salary;
    public String department;

    public Employee(String resourceName, String description, double salary, String department) {
        super(resourceName, description);
        this.salary = salary;
        this.department = department;
    }

    public void work() {
        System.out.println(resourceName + " is working in " + department);
    }

    @Override
    public String getResourceDetails() {
        return super.getResourceDetails() + ", Salary: " + salary + ", Department: " + department;
    }

    @Override
    public void allocateResource() {
    }
}
class Equipment extends SchoolResource {
    protected String location;
    public boolean isFunctional;

    public Equipment(String resourceName, String description, String location, boolean isFunctional) {
        super(resourceName, description);
        this.location = location;
        this.isFunctional = isFunctional;
    }

    public void relocate(String newLocation) {
        location = newLocation;
    }

    public void repair() {
        isFunctional = true;
    }
    @Override
    public void allocateResource() {
    }
}
class TeachingMaterial extends SchoolResource {
    private String subject;
    public boolean isInUse;

    public TeachingMaterial(String resourceName, String description, String subject, boolean isInUse) {
        super(resourceName, description);
        this.subject = subject;
        this.isInUse = isInUse;
    }
    public void checkout() {
        isInUse = true;
    }
    public void checkin() {
        isInUse = false;
    }
    @Override
    public void allocateResource() {
    }
}