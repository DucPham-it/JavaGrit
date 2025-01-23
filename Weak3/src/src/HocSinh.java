package src;

public class HocSinh {
    private String ten;
    private int tuoi;

    //Constructor
    HocSinh(String ten, int tuoi){
        nhapTuoi(tuoi);
        nhapTen(ten);
    }

    public void nhapTuoi(int tuoi){
        if (tuoi >=0 && tuoi<=150){
            this.tuoi = tuoi; // tuoi cua doi tuong : cu the Toan
            System.out.println("Tuoi ban la:"+this.tuoi);
        }
        else{
            System.out.println("Tuoi khong hop le");
        }
    }
    public void nhapTen(String ten){
       this.ten = ten;
       System.out.println(this.ten);
    }

    public int tuoiCuaHS(int tuoi){
        return tuoi;
    }
    public double tuoiCuaHS(double tuoi){
        return tuoi;
    }
    // Tính đóng gói của lập trình trình hướng đối tượng
}
