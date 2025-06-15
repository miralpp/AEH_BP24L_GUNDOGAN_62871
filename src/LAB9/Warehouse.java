package LAB9;

public class Warehouse {
    private String warehouseNumber;
    private int space;
    private int occupied;
    private String owner;
    private String email;
    private String phone;

    public Warehouse(String number, int space, String owner, String email, String phone) {
        this.warehouseNumber = number;
        this.space = space;
        this.owner = owner;
        this.email = email;
        this.phone = phone;
        this.occupied = 0;
    }

    public void addGoods(int units) {
        if (occupied + units <= space) {
            occupied += units;
            System.out.println("Added " + units + " units of goods. Remaining warehouse space: " + (space - occupied));
        } else {
            System.out.println("Not enough space in the warehouse. Remaining warehouse space: " + (space - occupied));
        }
    }

    public void removeGoods(int units) {
        if (units <= occupied) {
            occupied -= units;
            System.out.println("Removed " + units + " units of goods. Remaining warehouse space: " + (space - occupied));
        } else {
            System.out.println("Not enough goods in the warehouse.");
        }
    }

    public void checkOccupancy() {
        System.out.println("Occupied warehouse space: " + occupied);
        System.out.println("Available warehouse space: " + (space - occupied));
    }

    public void updateContact(String email, String phone) {
        this.email = email;
        this.phone = phone;
        System.out.println("Owner's contact details updated.");
        System.out.println("New email: " + email);
        System.out.println("New phone number: " + phone);
    }
}
