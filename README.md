# Shipping Management Console Application

A console app that let you manage diverse set of logistics services. User can choose on delivering goods of any kind, to any place via air, ocean, road or rail. Inheritance hierarchy is implemented as below:  

![Image of Yaktocat](https://github.com/rochitranjan/Shipping-Management-Console-Application/blob/master/3577_shipment%20mode.png)

User chooses the shipment mode and enters shipment details. Console app adds the shipment details into a list, lets user run a search query on the created list and displays search result in the following format:  

Parameters for AirTransport (int id, String customerName, String arrivalPort, String departurePort, float weight, String airwaysName).  
Search Results format for AirTransport "Id","Customer name","Arrival port","Departure port","Weight","Airways name"  
Parameters for GroundTransport (int id, String customerName, String arrivalPort, String departurePort, float weight, String capacity).  
Search Results format for GroundTransport "Id","Customer name","Arrival port","Departure port","Weight","Capacity"  
Parameters for WaterTransport (int id, String customerName, String arrivalPort, String departurePort, float weight, String capacity).  
Search Results format for WaterTransport "Id","Customer name","Arrival port","Departure port","Weight","Capacity"  
Parameters for Truck (int id, String customerName, String arrivalPort, String departurePort, float weight, int sizeOfContainer, String capacity).  
Search Results format for Truck "Id","Customer name","Arrival port","Departure port","Weight",Number of container","Capacity"  
Parameters for Rail (int id, String customerName, String arrivalPort, String departurePort, float weight, int numberOfContainer, String capacity).  
Search Results format for Rail "Id","Customer name","Arrival port","Departure port","Weight",Number of container","Capacity"  
Parameters for BulkCarrier (int id, String customerName, String arrivalPort, String departurePort, float weight, String companyName, String capacity)  
Search Results format for BulkCarrier "Id","Customer name","Arrival port","Departure port","Weight","Company name","capacity"  
Parameters for ContainerShip (int id, String customerName, String arrivalPort, String departurePort, float weight, String companyName, String capacity)  
Search Results format for ContainerShip "Id","Customer name","Arrival port","Departure port","Weight","Company name","Capacity"  
Parameters for Ferries (int id, String customerName, String arrivalPort, String departurePort, float weight, String agentName, String capacity)   
Search Results format for Ferries "Id","Customer name","Arrival port","Departure port","Weight","Agent name","Capacity"







