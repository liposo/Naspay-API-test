package felipe.TestDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TransactionTest {

    private static final String terminalKey = "api-demo";
    private static final String terminalSecret = "test123";

    private static final String authorized = "dbb46d0c4cfc4cdd9f923aa229106287";
    private static final String declined = "5ce5fbd950294c4cbf3f3276e645668a";
    private static final String timeout = "8a0885e6526c4257ba213292a0d956b0";
    private static final String completed = "1261481f9625430887e155817e45ec33";
    private static final String notFound = "f33ae3006b074e649c1095ff8fb35e93";


    @Test
    public void isEqualsTest() {
    	Client client = new Client(terminalKey, terminalSecret);
    
        assertEquals("AUTHORIZED", client.getTransactionStatus(authorized));
        assertEquals("DECLINED", client.getTransactionStatus(declined));
        assertEquals("TIMEOUT", client.getTransactionStatus(timeout));
        assertEquals("COMPLETED", client.getTransactionStatus(completed));
        assertEquals("Transaction not found", client.getTransactionStatus(notFound));
    }
}