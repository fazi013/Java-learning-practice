public class arrays {
    public static void main(String[] args){

        int nums []= new int[4];
       
       for (int i=0;i<4;i++){
            nums[i] =        (int) (Math.random()*10);   // rendom function gives redom values between 0 to 1 in double type
            System.out.print(nums[i] + "  ");



       }
       System.out.println( "Two dimenssion array  ");

       int twoDarray[][]= new int[5][7];
       for (int i=0;i<5;i++){

        for (int j=0;j<7;j++){
            twoDarray[i][j]=(int) (Math.random()*10);

        }
       }


       for (int i=0;i<5;i++){

        for (int j=0;j<7;j++){
            //twoDarray[i][j]
                System.out.print(twoDarray[i][j]  + "  ");
        }
        System.out.println();
       }






    }
}
