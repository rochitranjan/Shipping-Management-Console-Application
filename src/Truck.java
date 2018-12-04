public class Truck extends GroundTransport{
    private int sizeOfContainer;
    
    Truck(int id, String customerName, String arrivalPort, String departurePort, float weight, int sizeOfContainer, String capacity){
        super(id, customerName, arrivalPort, departurePort, weight, capacity);
        setSizeOfContainer(sizeOfContainer);
    }    
    public void setSizeOfContainer(int sizeOfContainer){
        this.sizeOfContainer=sizeOfContainer;
    }    
    public int getSizeOfContainer(){
        return this.sizeOfContainer;
    }
    void displayDetails(){
        System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s",this.getId(),this.getCustomerName(),this.getArrivalPort(),this.getDeparturePort(),this.getWeight(),this.getSizeOfContainer(),this.getCapacity());
    }
}
