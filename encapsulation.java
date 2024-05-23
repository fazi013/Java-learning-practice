class employees {

    private String Name ;
    private String Department;
    private String Experience;
    private int salary;

            // Set the Data
    public  void setName(String n){
        Name=n;

    }
    public  void setDepartment(String d){
        Department=d;

    }
    public  void setExperience(String e){
        Experience=e;

    }
    public  void setsalary(int s){
        salary=s;

    }


        //get the data

        public  String getName(){
            return Name;
    
        }
        public  String getDepartment(){
            return Department;
    
        }
        public  String getExperience(){
            return Experience;
    
        }
        public  int getsalary(){
            return salary;
    
        }


}






public class encapsulation {
    public static void main(String[] args) {
        employees emp = new employees();

        emp.setName("Faisal");
        emp.setDepartment("Computer Science");
        emp.setExperience("Fresher");
        emp.setsalary(100);

        System.out.println(emp.getName());
        System.out.println(emp.getDepartment());
        System.out.println(emp.getExperience());
        System.out.println(emp.getsalary());

    }
}
