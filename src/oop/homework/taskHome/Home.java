package oop.homework.taskHome;

public class Home {
    private String name;
    private int aFloor;
    private int bFloor;
    private int cFloor;
    private int dFloor;
    private int aFloor1;
    private int bFloor2;
    private int cFloor3;
    private int dFloor4;
    private int aCeil;
    private int bCeil;
    private int cCeil;
    private int dCeil;
    private int aCeil1;
    private int bCeil2;
    private int cCeil3;
    private int dCeil4;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getaFloor() {
        return aFloor;
    }
    public int getbFloor() {
        return bFloor;
    }
    public int getcFloor() {
        return cFloor;
    }
    public int getdFloor() {
        return dFloor;
    }
    public int getaFloor1() {
        return aFloor1;
    }
    public int getbFloor2() {
        return bFloor2;
    }
    public int getcFloor3() {
        return cFloor3;
    }
    public int getdFloor4() {
        return dFloor4;
    }

    public void setaFloor(int aFloor) {
        this.aFloor = aFloor;
    }
    public void setbFloor(int bFloor) {
        this.bFloor = bFloor;
    }
    public void setcFloor(int cFloor) {
        this.cFloor = cFloor;
    }
    public void setdFloor(int dFloor) {
        this.dFloor = dFloor;
    }
    public void setaFloor1(int aFloor1) {
        this.aFloor1 = aFloor1;
    }
    public void setbFloor2(int bFloor2) {
        this.bFloor2 = bFloor2;
    }
    public void setcFloor3(int cFloor3) {
        this.cFloor3 = cFloor3;
    }
    public void setdFloor4(int dFloor4) {
        this.dFloor4 = dFloor4;
    }

    public int getaCeil() {
        return aCeil;
    }
    public int getbCeil() {
        return bCeil;
    }
    public int getcCeil() {
        return cCeil;
    }
    public int getdCeil() {
        return dCeil;
    }
    public int getaCeil1() {
        return aCeil1;
    }
    public int getbCeil2() {
        return bCeil2;
    }
    public int getcCeil3() {
        return cCeil3;
    }
    public int getdCeil4() {
        return dCeil4;
    }

    public void setaCeil(int aCeil) {
        this.aCeil = aCeil;
    }
    public void setbCeil(int bCeil) {
        this.bCeil = bCeil;
    }
    public void setcCeil(int cCeil) {
        this.cCeil = cCeil;
    }
    public void setdCeil(int dCeil) {
        this.dCeil = dCeil;
    }
    public void setaCeil1(int aCeil1) {
        this.aCeil1 = aCeil1;
    }
    public void setbCeil2(int bCeil2) {
        this.bCeil2 = bCeil2;
    }
    public void setcCeil3(int cCeil3) {
        this.cCeil3 = cCeil3;
    }
    public void setdCeil4(int dCeil4) {
        this.dCeil4 = dCeil4;
    }

    public Home() {}
    public Home(String name) {this.name = name;}
    public Home(int aFloor,int bFloor,int cFloor,int dFloor,int aFloor1,int bFloor2,int cFloor3,int dFloor4, int aCeil,int bCeil,int cCeil,int dCeil,int aCeil1,int bCeil2,int cCeil3,int dCeil4){
        this.aFloor = aFloor; this.bFloor = bFloor; this.cFloor = cFloor; this.dFloor = dFloor;
        this.aFloor1 = aFloor1; this.bFloor2 = bFloor2; this.cFloor3 = cFloor3; this.dFloor4 = dFloor4;
        this.aCeil = aCeil; this.bCeil = bCeil; this.cCeil = cCeil; this.dCeil = dCeil;
        this.aCeil1 = aCeil1; this.bCeil2 = bCeil2; this.cCeil3 = cCeil3; this.dCeil4 = dCeil4;
    }
    public Home(int...numbers){}

}