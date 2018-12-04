import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the number of shipments");
        int n = Integer.parseInt(buf.readLine());
        Shipment[] shipmentArray = new Shipment[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the transportation "+(i+1)+" details :");
            System.out.println("Select the transportation mode");
            System.out.println("1)Air\n2)Truck\n3)Rail\n4)BulkCarrier\n5)ContainerShip\n6)Ferries");
            System.out.println("Enter your choice");
            int option = Integer.parseInt(buf.readLine());
            String details;
            switch(option){
                case 1: 
                    System.out.println("Enter the shipment "+(i+1)+" details");
                    details=buf.readLine();
                    shipmentArray[i]=new AirTransport(Integer.parseInt(details.split(",")[0]),details.split(",")[1],details.split(",")[2],details.split(",")[3],Float.parseFloat(details.split(",")[4]),details.split(",")[5]);
                    break;
                case 2:
                    System.out.println("Enter the shipment "+(i+1)+" details");
                    details=buf.readLine();
                    shipmentArray[i]=new Truck(Integer.parseInt(details.split(",")[0]),details.split(",")[1],details.split(",")[2],details.split(",")[3],Float.parseFloat(details.split(",")[4]),Integer.parseInt(details.split(",")[5]),details.split(",")[6]);
                    break;
                case 3:
                    System.out.println("Enter the shipment "+(i+1)+" details");
                    details=buf.readLine();
                    shipmentArray[i]=new Rail(Integer.parseInt(details.split(",")[0]),details.split(",")[1],details.split(",")[2],details.split(",")[3],Float.parseFloat(details.split(",")[4]),Integer.parseInt(details.split(",")[5]),details.split(",")[6]);
                    break;
                case 4:
                    System.out.println("Enter the shipment "+(i+1)+" details");
                    details=buf.readLine();
                    shipmentArray[i]=new BulkCarrier(Integer.parseInt(details.split(",")[0]),details.split(",")[1],details.split(",")[2],details.split(",")[3],Float.parseFloat(details.split(",")[4]),details.split(",")[5],details.split(",")[6]);
                    break;
                case 5:
                    System.out.println("Enter the shipment "+(i+1)+" details");
                    details=buf.readLine();
                    shipmentArray[i]=new ContainerShip(Integer.parseInt(details.split(",")[0]),details.split(",")[1],details.split(",")[2],details.split(",")[3],Float.parseFloat(details.split(",")[4]),details.split(",")[5],details.split(",")[6]);
                    break;
                case 6:
                    System.out.println("Enter the shipment "+(i+1)+" details");
                    details=buf.readLine();
                    shipmentArray[i]=new Ferries(Integer.parseInt(details.split(",")[0]),details.split(",")[1],details.split(",")[2],details.split(",")[3],Float.parseFloat(details.split(",")[4]),details.split(",")[5],details.split(",")[6]);
                    break;
            }
        }
        System.out.println("Enter the mode to display");
        String mode = buf.readLine();
        boolean flag=false;
        for(int i=0;i<shipmentArray.length;i++){
            if(shipmentArray[i].getClass().getName().contains(mode)){
                flag=true;
                switch(mode){
                    case "Air":
                        System.out.println("Mode of Transportation : Air");
                        System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s\n","Id","Customer name","Arrival port","Departure port","Weight","AirwaysName");                        
                        break;
                    case "Truck":
                        System.out.println("Mode of Transportation : Ground");
                        System.out.format("%-15s%-15s%-15s%-15s%-15s%-20s%-15s\n","Id","Customer name","Arrival port","Departure port","Weight","Size of container","Capacity");
                        break;
                    case "Rail":
                        System.out.println("Mode of Transportation : Ground");
                        System.out.format("%-15s%-15s%-15s%-15s%-15s%-20s%-15s\n","Id","Customer name","Arrival port","Departure port","Weight","No of containers","Capacity");
                        break;
                    case "BulkCarrier":
                        System.out.println("Mode of Transportation : Water");                        
                        System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","Id","Customer name","Arrival port","Departure port","Weight","Company name","Capacity");
                        break;
                    case "ContainerShip":
                        System.out.println("Mode of Transportation : Water");                        
                        System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","Company name","Capacity","Sid","Customer name","Arrival port","Departure port","Weight");
                        break;
                    case "Ferries":
                        System.out.println("Mode of Transportation : Water");                        
                        System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","Id","Customer name","Arrival port","Departure port","Weight","Agent name","Capacity");
                        break;
                }
                break;
            }
        }
        if(flag==true){
            for(int i=0;i<shipmentArray.length;i++){
                if(shipmentArray[i].getClass().getName().contains(mode)){
                    shipmentArray[i].displayDetails();    
                }
            }    
        }
        else{
            System.out.println("No shipment available");
        }
    } 
}
