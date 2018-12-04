
public class GroundTransport extends Shipment{
    private String capacity;
    
    GroundTransport(int id, String customerName, String arrivalPort, String departurePort, float weight, String capacity){
        super(id, customerName, arrivalPort, departurePort, weight);
        setCapacity(capacity);
    }    
    public void setCapacity(String capacity){
        this.capacity=capacity;
    }    
    public String getCapacity(){
        return this.capacity;
    }        
}
