package cambodian.technologist.chapter2;

public class Main {


    public static void main(String[] args) {
//        Shape square = new Square();
//
//        //when the square is clicked then rotate
//        square.playSound();
//        square.rotate();
//
//        Triangle triangle = new Triangle();
//
//        //when the triangle is clicked then rotate and playSound
//        triangle.rotate();
//        triangle.playSound();
//
//        Amoeba amoeba = new Amoeba();
//
//        //when the triangle is clicked then rotate and playSound
//        amoeba.rotate();
//        amoeba.playSound();

        Main someMain = new Main();
        someMain.bar(new Amoeba());
        someMain.bar(new Square());
        someMain.bar(new Square());

    }

    public void bar(Shape shape) {
        shape.rotate();
        shape.playSound();
    }
}
