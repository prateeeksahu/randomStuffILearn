public class classesAndObjects {
    public static void main(String[] args) {

        Student stud = new Student("Prateek", 18);
        System.out.println(stud.name);
        System.out.println(stud.rollNo);
        System.out.println(stud);

    }

    public static class Student{
        String name;
        int rollNo;



        public Student(String name, int rollNo){
            this.name = name;
            this.rollNo = rollNo;
        }
    }

}