package src;

abstract public class DongVat {
    private int chan;
    public void soChan(int chan){
        if (chan %2 == 0){
            this.chan = chan;
        }
        else{
            System.out.println("So chan khong hop le");
        }
    }
    abstract public void keu();
}

