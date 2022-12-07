public class Employee {

    private String name;
    private String ppsid;
    private String department;
    private String gender;
    private String age;

    public Employee(){
    }

    public Employee(String id, String name, String department){
        this.ppsid = id;
        this.name = name;
        this.department = department;
        this.gender = gender;
        this.age = age;
    }

    //constructor with age argument
    public Employee(String id, String name, String department, String age){
        this.ppsid = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public String getId() {
        return ppsid;
    }

    public void setId(String id) {
        this.ppsid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public String getgender() {
        return age;
    }

    public void setgender(String age) {
        this.age = age;
    }

    public String toString(){

        return "[" +
                this.getId() +
                " : " +
                this.getName() +
                " : " +
                this.getDepartment() +
                "]";
    }
}
