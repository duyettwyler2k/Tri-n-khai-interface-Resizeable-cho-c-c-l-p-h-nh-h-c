public class Main {
    public static void main(String[] args) {

        Circle circles=new Circle(3,"red",true);
        circles.resize(50);
        System.out.println(circles.getRadius());
        Circle[] circle = new Circle[3];
        circle[0] = new Circle(1);
        circle[1] = new Circle(5.3);
        circle[2] = new Circle(9.3);
        System.out.println("Kích thước ban đầu");
        for (Circle x :circle) {
            System.out.println(x);
        }
        System.out.println("Kích thước sau tăng");
        for (Circle x : circle) {
            x.Tangkichthuoc();
            System.out.println(x);
        }
    }
}
