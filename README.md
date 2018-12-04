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







