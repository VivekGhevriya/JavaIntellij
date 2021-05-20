public class ClassObjectPractice {




        String subject;
        String hobby;
        int marks;
        int age;

        public ClassObjectPractice(String subjects,String hobbies,int mark){
            subject=subjects;
            hobby=hobbies;
            marks=mark;


        }

        public void studentData(String subject,String hobby,int marks){
            System.out.println("I have taken"+" "+ subject+" "+"I got"+ marks+ "My hobby is "+" "+hobby);



    }

    public static void main(String[] args) {
        ClassObjectPractice st =new ClassObjectPractice("Science","reading",23);
        System.out.println(st.subject);
    }
}
