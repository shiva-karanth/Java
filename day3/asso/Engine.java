package day3.asso;
// Composition
public class Engine {
    private double cc;

    public Engine(double cc) {
        this.cc = cc;
    }

    public double getCc() {
        return this.cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public void displayEngine(){
        System.out.println("Engine Details:");
        System.out.println("------------------------");
        System.out.println("Engine CC:"+cc);
    }
}
