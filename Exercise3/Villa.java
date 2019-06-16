package Exercise3;

public class Villa extends Building{
    int roomCounter;
    boolean swimmingpool;
    public Villa(String owner, String address, double area, int roomCounter, boolean swimmingpool){
        super(owner,address,area);
        this.roomCounter = roomCounter;
        this.swimmingpool = swimmingpool;
    }

    @Override
    public double tax() {
        double result = 100 * roomCounter;
        if(swimmingpool){
            result = result + 750;
        }
        return result ;
    }

    @Override
    public String print() {
        return "owner : "+ owner + "address : " + address + "area : " + area + "roomCounter : "+roomCounter + "swimmingpool : " + swimmingpool;
    }
}
