package Exercise3;

public abstract class Building {
    String owner, address;
    double area;
    public Building(String owner, String address, double area){
        this.owner = owner;
        this.address = address;
        this.area = area;
    }

    public abstract double tax();
    public abstract String print();
}
