package classesAndObjects;

public class staticKeword {
    // class Test  // ERROR
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("prateek");

        Test b = new Test("anurag");

        System.out.println(a.name); // prateek
        System.out.println(b.name); // anurag
    }
}
