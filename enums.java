enum Day {
    Monday(10,"working day"),Tuesday("working day"),Wednesday (30),Thursday(40,"working day"), Friday(50,"working day") ,Staturday(60,"holiday"), Sunday(70,"holiday");
     
    private int number;
    private String status;

    private Day(String status) {
        this.status = status;
        number = 20;
    }


    private Day(int number) {
        this.number = number;
        status= "working day";
    }


    private Day(int number, String status) {
        this.number = number;
        this.status = status;
    }


    public int getNumber() {
        return number;
    }


    public String getStatus() {
        return status;
    }

    




    


}




public class enums {
    public static void main(String[] args) {
        //Day day =Day.Monday;
       // System.out.println(day + " number is : "+ day.getNumber() + ",  The status is : "+ day.getStatus());

        Day days[]=Day.values();

        for(Day i:days){

            System.out.println(i + " number is : "+ i.getNumber() + ",  The status is : "+ i.getStatus());
            System.out.println();
        }
        
    }
}
