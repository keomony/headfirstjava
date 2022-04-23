package cambodian.technologist.chapter2;

public class Amoeba extends Shape {

    public Amoeba() {
        super("Amoeba");
    }

    @Override
    public void playSound() {
        System.out.println("Amoeba plays a different sound");
    }

    @Override
    public void rotate() {
        System.out.println("Amoeba rotates differently");
    }

    @Override
    public void foo() {
        //do something
    }
}
