public class Question5 {
    // Lớp lồng Point
    class Point {
        private double x, y;

        // Constructor
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    // Lớp lồng Main
    public class Main {
        public void run() {
            Point p = new Point(3, 4); // Tạo đối tượng Point với x=3, y=4
            System.out.println("Tọa độ ban đầu: " + p);

            p.setX(5); // Thay đổi giá trị x thành 5
            p.setY(6); // Thay đổi giá trị y thành 6
            System.out.println("Tọa độ mới: " + p);
        }
    }

    public static void main(String[] args) {
        Question5 q5 = new Question5();
        Question5.Main mainProgram = q5.new Main();
        mainProgram.run();
    }
}
