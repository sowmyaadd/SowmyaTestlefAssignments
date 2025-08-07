package week3.day1;

public class APIClient {
	public void sendRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
        
        System.out.println("Request sent successfully.\n");
    }

    
    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request body: " + requestBody);
        System.out.println("Expected request success: " + requestStatus);
        
        if (requestStatus) {
            System.out.println("Request succeeded with body: " + requestBody + "\n");
        } else {
            System.out.println("Request failed for endpoint: " + endpoint + "\n");
        }
    }

    public static void main(String[] args) {
        APIClient client = new APIClient();

        
        client.sendRequest("https://api.example.com/data");

        
        client.sendRequest(
            "https://api.example.com/update",
            "{ \"name\": \"Alice\", \"action\": \"update\" }",
            true
        );

        
        client.sendRequest(
            "https://api.example.com/delete",
            "{ \"id\": 12345 }",
            false
        );
    }
}

