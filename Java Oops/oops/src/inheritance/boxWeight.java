package inheritance;

public class boxWeight extends box {
    double wt;

    public boxWeight() {
        this.wt = -1;
    }

    public boxWeight(double l, double h, double w, double wt) {
        super(l, h, w); // calling parent class constructor and setting the value
        this.wt = wt;
    }
}
