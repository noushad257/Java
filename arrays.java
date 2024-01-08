public class arrays {
    public static void main(String[] args) {
        //int [] marks={100,10,40,70,80};

//        String [] students ={"noushad","hasan","rabbi","niloy"};
//        System.out.println(students.length);
//        System.out.println(students[2]);
        float [] marks={100.1F,10.6F,40.2f,70.7f,80.1f};
        System.out.println(marks.length);//array length
        //displaying array(naive way)
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        //display with loops
         for(int i=0;i<marks.length;i++){
             System.out.println(marks[i]);
         }

        //display reverse order
        System.out.println("Printing in reverse way");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        //Displaying the array (for-each loop)
        System.out.println("Printing using for loop for-each loop : ");
        for(float element:marks){
            System.out.println(element);
        }


    }
}
