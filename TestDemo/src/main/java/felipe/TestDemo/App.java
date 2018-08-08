package felipe.TestDemo;

public class App 
{
    public static void main( String[] args )
    {
    	String terminalKey = "api-demo";
        String terminalSecret = "test123";
    	
        Client client = new Client(terminalKey, terminalSecret);
        //GET transaction status by transaction id
        //client.getTransactionStatus(id);
    }
}
