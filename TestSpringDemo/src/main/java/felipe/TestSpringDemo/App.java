package felipe.TestSpringDemo;

public class App {

    public static void main(String[] args) {

        String baseUrl  = "https://demo.naspay.net";
        String terminalKey = "api-demo";
        String terminalSecret = "test123";
               
        Client client = new Client(baseUrl, terminalKey, terminalSecret);
        //GET transaction status by transaction id
        //client.getTransactionStatus(id);
    }
}


