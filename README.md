# Shipping Management Console Application

A console app that let you manage diverse set of logistics services. User can choose on delivering goods of any kind, to any place via air, ocean, road or rail. Inheritance hierarchy is implemented as below:  

![Image of Yaktocat](https://github.com/rochitranjan/Shipping-Management-Console-Application/blob/master/3577_shipment%20mode.png)

User chooses the shipment mode and enters shipment details. Console app adds the shipment details into a list, lets user run a search query on the created list and displays search result in the following format:  

Parameters/Search Results for AirTransport (int id, String customerName, String arrivalPort, String departurePort, float weight, String airwaysName).  
Parameters/Search Results for GroundTransport (int id, String customerName, String arrivalPort, String departurePort, float weight, String capacity).  
Parameters/Search Results for WaterTransport (int id, String customerName, String arrivalPort, String departurePort, float weight, String capacity).  
Parameters/Search Results for Truck (int id, String customerName, String arrivalPort, String departurePort, float weight, int sizeOfContainer, String capacity).  
Parameters/Search Results for Rail (int id, String customerName, String arrivalPort, String departurePort, float weight, int numberOfContainer, String capacity).  
Parameters/Search Results for BulkCarrier (int id, String customerName, String arrivalPort, String departurePort, float weight, String companyName, String capacity)  
Parameters/Search Results for ContainerShip (int id, String customerName, String arrivalPort, String departurePort, float weight, String companyName, String capacity)  
Parameters/Search Results for Ferries (int id, String customerName, String arrivalPort, String departurePort, float weight, String agentName, String capacity)   

# Sample Input and Output :
Enter the number of shipments  
3  
Enter the transportation 1 details :  
Select the transportation mode  
1)Air  
2)Truck  
3)Rail  
4)BulkCarrier  
5)ContainerShip  
6)Ferries  
Enter your choice  
1  
Enter the shipment 1 details  
1,Vicky,Chennai,Mumbai,65,KingFisher  
Enter the transportation 2 details:  
Select the transportation mode  
1)Air  
2)Truck  
3)Rail  
4)BulkCarrier  
5)ContainerShip  
6)Ferries  
Enter your choice  
5  
Enter the shipment 2 details  
2,Martin,America,India,100,12,100  
Enter the transportation 3 details: 
Select the transportation mode  
1)Air  
2)Truck  
3)Rail  
4)BulkCarrier  
5)ContainerShip  
6)Ferries  
Enter your choice  
5  
Enter the shipment 3 details  
3,mark,America,Australia,1000,10,1000  
Enter the mode to display  
Ferries  
No shipment available  








