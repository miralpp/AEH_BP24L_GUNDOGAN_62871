package LAB9;

public class myNinthApp {
    public static void main(String[] args) {
        Warehouse w = new Warehouse("W01", 5000, "Tom", "owner@magazyn.pl", "+48 123 456 789");
        w.addGoods(3000);
        w.removeGoods(1000);
        w.addGoods(2500);
        w.checkOccupancy();
        w.updateContact("newowner@mail.com", "+48 987 654 321");
        w.addGoods(1000);
    }
}
