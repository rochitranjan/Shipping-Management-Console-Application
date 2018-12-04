
public class Rail extends GroundTransport{
    private int numberOfContainer;
    
    Rail(int id, String customerName, String arrivalPort, String departurePort, float weight, int numberOfContainer, String capacity){
        super(id, customerName, arrivalPort, departurePort, weight, capacity);
        setNumberOfContainer(numberOfContainer);
    }    
    public void setNumberOfContainer(int numberOfContainer){
        this.numberOfContainer=numberOfContainer;
    }    
    public int getNumberOfContainer(){
        return this.numberOfContainer;
    }
    void displayDetails(){
        System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s",this.getId(),this.getCustomerName(),this.getArrivalPort(),this.getDeparturePort(),this.getWeight(),this.getNumberOfContainer(),this.getCapacity());
    }
}
