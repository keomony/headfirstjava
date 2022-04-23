package cambodian.technologist.chapter2;

public abstract class Shape {
    private String nameShape;

    public Shape(String nameShape) {
        this.nameShape = nameShape;
    }

    public void playSound(){
        System.out.println(this.nameShape + " plays sound");
    }

    public void rotate() {
        System.out.println(this.nameShape + " rotates");
    }

    public abstract void foo();
}
