//calculate the avg marks from an array containing marks of all students in physics using for-each loops

public class q26 {
    public static void main(String[] args) {
        float [] marks={2.1f,3.4f,4.6f,5.98f,6.1f};
        float sum=0;
        for (float element:marks){
            sum=sum+element;
        }
        System.out.println("The avg marks : "+sum/marks.length);
    }
}
