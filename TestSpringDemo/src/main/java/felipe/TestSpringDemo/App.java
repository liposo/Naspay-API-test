package felipe.TestSpringDemo;

public class App {

    public static void main(String[] args) {

        String baseUrl  = "https://demo.naspay.net";
        String terminalKey = "api-demo";
        String terminalSecret = "test123";
               
        Client client = new Client(baseUrl, terminalKey, terminalSecret);
        
//        System.out.println(client.getTransactionStatus(baseUrl , "dbb46d0c4cfc4cdd9f923aa229106287"));
//        System.out.println(client.getTransactionStatus(baseUrl , "5ce5fbd950294c4cbf3f3276e645668a"));
//        System.out.println(client.getTransactionStatus(baseUrl , "8a0885e6526c4257ba213292a0d956b0"));
//        System.out.println(client.getTransactionStatus(baseUrl , "1261481f9625430887e155817e45ec33"));
//        System.out.println(client.getTransactionStatus(baseUrl , "f33ae3006b074e649c1095ff8fb35e93"));
    }
}


