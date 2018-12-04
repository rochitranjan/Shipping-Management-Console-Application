public class Ferries extends WaterTransport{    
    private String agentName;
    
    Ferries(int id, String customerName, String arrivalPort, String departurePort, float weight, String agentName, String capacity){
        super(id, customerName, arrivalPort, departurePort, weight, capacity);
        setAgentName(agentName);
    }
    
    public void setAgentName(String agentName){
        this.agentName=agentName;
    }
    
    public String getAgentName(){
        return this.agentName;
    }
    
    void displayDetails(){
        System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s",this.getId(),this.getCustomerName(),this.getArrivalPort(),this.getDeparturePort(),this.getWeight(),this.getAgentName(),this.getCapacity());
    }
}
