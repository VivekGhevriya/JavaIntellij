public class ArrayPractice {

    int employeeId;
    String name;
    String employeePosition;

    public ArrayPractice(int employeeId,
            String name,
            String employeePosition){
        this.employeeId=employeeId;
        this.name=name;
        this.employeePosition=employeePosition;}

        public void employeeInfo(){
            System.out.println(this.employeeId+" "+this.employeePosition+" "+this.name);
        }





    public static void main(String[] args) {


//        ArrayPractice a2=new ArrayPractice(991,"HImen","prodction");
//        ArrayPractice a13=new ArrayPractice(992,"vivek","prodct");

        ArrayPractice[] ar= new ArrayPractice[1];
        ar[0]=new ArrayPractice(99,"vivek","prodct");
        for (Object o:ar) {
            ar[0].employeeInfo();

        }



//        int[][] arr = {{2, 3}, {2, 5}, {2, 34}, {2, 5}};
//
//
//        for (int[] temp : arr) {
//            for (int n : temp) {
//                System.out.println(n);
//            }
//
//        }
//        int[][] arrr = new int[4][4];
//        System.out.println(arrr[0].length);
//        String[] name = {"Vivek", "Atin"};
//
//        greet("Vivek", "Atin");
//    }
//    public static void greet(String... name) {
//        for(String n:name){
//            System.out.println("hello"+n);
//        }




//    }
//    public class student{
//        String name;
//        Int id;
//        Int age;
//        String major;
//        float gpa;
//        public void studenDetails(){
//            studenDetails=new studentDetails();


    }
}