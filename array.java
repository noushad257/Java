public class array {
    public static void main(String[] args) {
           //classroom of 500 students
        //we can declare an array in three ways
        //int [] marks=new int[5];--1/declaration and   memory allocation
//        int[]marks; ----2//declaration and then memory allocation
//        marks=new int[5];
//        marks[0]=100;
//        marks[1]=10;
//        marks[2]=40;
//        marks[3]=70;
//        marks[4]=80;
        int [] marks={100,10,40,70,80};//---3/declaration,memory allocation and initialization together
        System.out.println(marks[3]);
        //System.out.println(marks[5]);--because our size of array is 5
    }
}
