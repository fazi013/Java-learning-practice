
class company {

    private String Name ;
    private String Department;
    private String Experience;
    private int salary;



    //constructors
        public company(){

            System.out.println("Defualt");
        }


        public company(String Name){      // single parameter 

            this .Name=Name;
            System.out.println("single parameter");
        }


        public company(String Name,String Department){      // double parameter 

            this .Name=Name;
            this .Department=Department;
            System.out.println("double parameter");
        }


        public company(String Name,String Department ,String Experience){      // Three parameter 

            this .Name=Name;
            this .Department=Department;
            this . Experience = Experience;

            System.out.println("three parameters");
        }





            // Set the Data
    public  void setName(String Name){
        this.Name=Name;

    }
    public  void setDepartment(String Department){
        this.Department=Department;

    }
    public  void setExperience(String Experience){
        this.Experience=Experience;

    }
    public  void setsalary(int salary){
        this.salary=salary;

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







public class constructors {
      


    public static void main(String[] args) {
       
        // default constructor
        company emp = new company();
        emp.setName("Faisal");
        emp.setDepartment("Computer Science");
        emp.setExperience("Fresher");
        emp.setsalary(100);

        //parameterized conctructors
        company emp1 = new company("Ahmad");
        company emp2 = new company("Ali akbar","Medical");
        company emp3 = new company("zahid","artrs","7 years");

        


        company array[]= new company[4];//array objects
            array[0]=emp;
            array[1]=emp1;
            array[2]=emp2;
            array[3]=emp3;

                // for each loop or enhancd loop for printing array objects
            for (company i : array){
                System.out.println(i.getName() + " : "+  i.getDepartment() + " : "  + i.getExperience() + " : " + i.getsalary() );

            }
        





    }
}
