package Exercise3;

public class Company extends Building {
    String name;
    int employeeCounter;
    double avg;

    public Company(String owner, String address, double area, String name, int employeeCounter, double avg){
        super(owner,address,area);
        this.name = name;
        this.employeeCounter = employeeCounter;
        this.avg = avg;
    }

    @Override
    public double tax() {
        return area * 6.3;
    }

    @Override
    public String print() {

        return "owner : "+ owner + "address : " + address + "area : " + area + " name : "+name+" employeeCounter : "+ employeeCounter+ " avg : "+ avg;
    }
}
