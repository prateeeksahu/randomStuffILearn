package inheritance;

public class boxMain {
    public static void main(String[] args) {
        box box1 = new box();
        box box2 = new box(4);
        box box3 = new box(4,6,8);
        box box4 = new box(box3);
        box box5 = new boxWeight()(4, 6, 8, 10);

        System.out.println(box1.l + " " + box1.h + " " + box1.w);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);
        System.out.println(box3.l + " " + box3.h + " " + box3.w);
        System.out.println(box4.l + " " + box4.h + " " + box4.w);
        System.out.println(box5.l + " " + box5.h + " " + box5.w);
    }
}
