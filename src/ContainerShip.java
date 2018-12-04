public class ContainerShip extends WaterTransport {
    private String companyName;
    
    ContainerShip(int id, String customerName, String arrivalPort, String departurePort, float weight, String companyName, String capacity){
        super(id, customerName, arrivalPort, departurePort, weight, capacity);
        setCompanyName(companyName);
    }
    
    public void setCompanyName(String companyName){
        this.companyName=companyName;
    }
    
    public String getCompanyName(){
        return this.companyName;
    }
    
    void displayDetails(){
        System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s",this.getId(),this.getCustomerName(),this.getArrivalPort(),this.getDeparturePort(),this.getWeight(),this.getCompanyName(),this.getCapacity());
    }
}
