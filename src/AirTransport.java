public class AirTransport extends Shipment{
    private String airwaysName;
   
    AirTransport(int id, String customerName, String arrivalPort, String departurePort, float weight, String airwaysName){
        super(id, customerName, arrivalPort, departurePort, weight);
        setAirwaysName(airwaysName);
    }   
    public void setAirwaysName(String airwaysName){
        this.airwaysName=airwaysName;    
    }    
    public String getAirwaysName(){
        return this.airwaysName;
    }    
    void displayDetails(){
        System.out.format("%-15s %-15s %-15s %-15s%-15s%-15s",this.getId(),this.getCustomerName(),this.getArrivalPort(),this.getDeparturePort(),this.getWeight(),this.getAirwaysName());
    }
}
