import java.util.Scanner;

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String errorMessage) {

        super(errorMessage);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập độ dài cạnh thứ nhất: ");
            double a = scanner.nextDouble();

            System.out.println("Nhập độ dài cạnh thứ hai: ");
            double b = scanner.nextDouble();

            System.out.println("Nhập độ dài cạnh thứ ba: ");
            double c = scanner.nextDouble();

            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalTriangleException("Các cạnh phải là số dương");
            }

            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalTriangleException("Không phải tam giác hợp lệ");
            }

            System.out.println("Tam giác hợp lệ");
            
        } catch (IllegalTriangleException e) {
            System.err.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Lỗi: " + e.getMessage());

        }
    }
}
