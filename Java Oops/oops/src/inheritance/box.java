package inheritance;

public class box {
    double l;
    double h;
    double w;

    box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    box(double x){
        this.l = x;
        this.h = x;
        this.w = x;
    }

    box(box box){
        this.l = box.l;
        this.h = box.h;
        this.w = box.w;
    }
}
