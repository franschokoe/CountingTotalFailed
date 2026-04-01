import java.util.Arrays;
import java.util.List;

public class FilteringStudent {
    public static void main(String [] args){
        //declaring array
        double [] marksArray = {50 , 40 , 60 , 85 , 55 , 28 , 13 , 70};

        //for loop outputing ther marks
        for(int studentMark = 0 ; studentMark < marksArray.length ; studentMark++ ){
            //while loop since we do not know how many student are there
            while(marksArray[studentMark] > 50){
                System.out.print(marksArray[studentMark] + "\n");
                break;
            }

        }
        System.out.print("**************Completed*****************");
    }
}





//            do {
//                System.out.print(marksArray[studentMark] + "\n");
//                break;
//            }while (marksArray[studentMark] > 50);
////            if (marksArray[studentMark] > 50){
//
//
//                break;
//            }