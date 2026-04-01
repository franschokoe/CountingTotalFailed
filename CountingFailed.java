public class CountingFailed {
    public static void main(){
        int [] marksArray = {50 , 40 , 60 , 85 , 55 , 28 , 11 , 70};
        //for adding total users
        int totalFailed = 0 ;
        // looping the array
        for (int i = 0 ; i < marksArray.length; i++){
            //selecting
            if (marksArray[i] < 50){
                totalFailed += 1;
            }

        }
        System.out.print("............................................\n");
        System.out.print("Number of failed students : " + totalFailed + "\n");
        System.out.print("............................................");

    }
}
