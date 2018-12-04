public class Shipment {
    private int id;
    private String customerName;
    private String arrivalPort;
    private String departurePort;
    private Float weight;       
        
    Shipment(int id, String customerName, String arrivalPort, String departurePort, Float weight){
        setId(id);
        setCustomerName(customerName);
        setArrivalPort(arrivalPort);
        setDeparturePort(departurePort);
        setWeight(weight);
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void setArrivalPort(String arrivalPort){
        this.arrivalPort=arrivalPort;
    }
    public String getArrivalPort(){
        return this.arrivalPort;
    }
    public void setDeparturePort(String departurePort){
        this.departurePort=departurePort;
    }
    public String getDeparturePort(){
        return this.departurePort;
    }
    public void setWeight(Float weight){
        this.weight=weight;
    }
    public Float getWeight(){
        return this.weight;
    }
    void displayDetails(){
        System.out.format("%-15s %-15s %-15s %-15s%-15s",this.getId(),this.getCustomerName(),this.getArrivalPort(),this.getDeparturePort(),this.getWeight());
    }    
}
