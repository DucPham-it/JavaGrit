package src;

public class Main {
    public static class Cho extends DongVat{
        void can(){
            System.out.println("Cho la loai co the can");
        }

        public void keu() {
            System.out.println("Gau Gau");
        }
    }
    public static class Meo extends DongVat{
        public void keu() {
            System.out.println("Mew Mew");
        }
    }
    public static void main(String[] args) {
        Cho a = new Cho();
        Meo b = new Meo();
        DongVat c = new DongVat() {
            @Override
            public void keu() {
                System.out.println("DO CON BO");
            }
        };
        a.keu();
        b.keu();
        c.keu();
    }
}

