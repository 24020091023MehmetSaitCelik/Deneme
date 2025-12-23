package tr.edu.istiklal;

public class TestTriangle {

    public static void main(String[] args) {

        try {
            Triangle t1 = new Triangle(3, 4, 5);
            t1.setRenk("mavi");
            t1.setDoluluk(true);

            System.out.println("Geçerli Üçgen:");
            System.out.println(t1);
            System.out.println("Alan: " + t1.getArea());
            System.out.println("Çevre: " + t1.getPerimeter());
            System.out.println("Özellikler: " + t1.toString());
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-----------------------------");

        try {
            Triangle t2 = new Triangle(1, 2, 3);
        } catch (IllegalTriangleException e) {
            System.out.println("Hata yakalandı:");
            System.out.println(e.getMessage());
        }
    }
}
