public class App {
    public abstract class Createshapes {
        public abstract void shape();
    }

    public class Circle extends Createshapes {
        public void shape() {
            System.out.println("Circle");
        }
    }

    public class Square extends Createshapes {
        public void shape() {
            System.out.println("Square");
        }
    }
    
    public static void main(String[] args) {
        App Myapp = new App();
        Createshapes circle = Myapp.new Circle();
        circle.shape();
        Createshapes square = Myapp.new Square();
        square.shape();
    }
}
