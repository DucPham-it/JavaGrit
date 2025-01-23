public class showline {
    public class Test {
        public void display(Test obj) {
            System.out.println("Đối tượng hiện tại: " + obj);
        }

        public void show() {
            display(this); // Truyền đối tượng hiện tại
        }
    }

    public class Main {
        public static void main(String[] args) {
            Test t = new Test();
            t.show();
        }
    }

}
