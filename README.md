# Ticket Activity

## Overview
This project provides a simple example of ticket creation and retrieval using a REST API. The API allows you to create a ticket by sending a POST request with ticket details in JSON format, and then retrieve the created ticket in JSON or HTML format.

## Code Files
The code files for this project are located at:
- [TicketController.java](src/main/java/org/example/ticket/controller/TicketController.java)
- [Ticket.java](src/main/java/org/example/ticket/model/Ticket.java)
- [TicketReposity.java](src/main/java/org/example/ticket/repository/TicketRepository.java)
- [TicketRestAPI.java](src/main/java/org/example/ticket/restController/TicketRestAPI.java)
- [ticket.html](src/main/resources/templates/ticket.html)

## Using Postman to Create and Retrieve a Ticket

### Step 1: Create a Ticket (POST Request)
1. **Open Postman** and select the **POST** method.
2. Set the URL to: `localhost:8080/ticket` This will be the endpoint to which you will send a POST request to create a ticket.
3. Click on the **Body** tab located under the URL box.
4. Ensure the **Raw** radio button is selected, and change the dropdown to the right of the **Binary** button to **JSON**. This will automatically set your `Content-Type` header to `application/json`.
5. In the request body, enter your JSON data in the following format:
```json
{
    "firstName": "Joe",
    "lastName": "Dirt",
    "dob": "January 1, 1999",
    "flightNumber": 123,
    "departureTime": "2:30pm",
    "arrivalTime": "7:30pm",
    "departureAirport": "NS",
    "arrivalAirport": "BC"
}
```
6. Click Send. If any error occurs, Postman will display the error response.

### Step 2: Retrieve the Ticket (GET Request)
1. After successfully creating a ticket, you can retrieve the ticket information:
- To see the ticket in **JSON** format, navigate to: `http://localhost:8080/ticket`
- To view the ticket in the **served HTML**, navigate to `http://localhost:8080/getTicket`  


