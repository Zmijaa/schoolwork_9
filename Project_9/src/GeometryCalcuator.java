import java.util.Scanner;
public class GeometryCalcuator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Изберете геометриска фигура за пресметување:");
            System.out.println("1. Квадрат");
            System.out.println("2. Круг");
            System.out.println("3. Триаголник");
            System.out.println("4. Круг волумен");
            System.out.println("5. Излез");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    calculateSquare();
                    break;
                case 2:
                    calculateCircle();
                    break;
                case 3:
                    calculateTriangle();
                    break;
                case 4:
                    calculateCube();
                    break;
                case 5:
                    System.out.println("Догледање!");
                    break;
                default:
                    System.out.println("Внесете валидна опција.");
            }
        } while (choice != 5);

        input.close();
    }

    // Пресметување на периметар и плоштина на квадрат
    public static void calculateSquare() {
        Scanner input = new Scanner(System.in);
        System.out.print("Внесете должина на страната на квадратот: ");
        double side = input.nextDouble();

        double perimeter = 4 * side;
        double area = side * side;

        System.out.println("Периметар на квадрат: " + perimeter);
        System.out.println("Плоштина на квадрат: " + area);
    }

    // Пресметување на периметар и плоштина на круг
    public static void calculateCircle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Внесете радиус на кругот: ");
        double radius = input.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Периметар на круг: " + perimeter);
        System.out.println("Плоштина на круг: " + area);
    }

    // Пресметување на периметар и плоштина на триаголник
    public static void calculateTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Внесете должина на страната на триаголникот: ");
        double side = input.nextDouble();

        double perimeter = 3 * side;
        double area = (Math.sqrt(3) / 4) * side * side;

        System.out.println("Периметар на триаголник: " + perimeter);
        System.out.println("Плоштина на триаголник: " + area);
    }

    // Пресметување на волумен на круг
    public static void calculateCube() {
        Scanner input = new Scanner(System.in);
        System.out.print("Внесете должина на страната на кубот: ");
        double side = input.nextDouble();

        double volume = Math.pow(side, 3);

        System.out.println("Волумен на круг: " + volume);
	}

}
