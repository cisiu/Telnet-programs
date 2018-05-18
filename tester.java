import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class tester {
    public static void main(String[] args) throws IOException {

        Socket pingSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        BufferedReader stdIn = null;
        try {
            pingSocket = new Socket("rainmaker.wunderground.com", 23);
            pingSocket.setSoTimeout(2000); // tu jest zajebista metoda ktora wyrzuca blad jak czemakmy na odpowiedz dluzej niz 2 sekundy
            out = new PrintWriter(pingSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(pingSocket.getInputStream()));
        } catch (IOException e) {
            return;
        }
    
        
        //tu jest kod ktory zczytuje adres IP
        
        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  

        String tekst []=new String[50];
        String parts[];
        
        
        try{
        	out.println("\n");
        	int a = 0;
        	while (((tekst[a]= in.readLine())!=null)&&a<30 ){
        		System.out.println(tekst[a]);
        		a++;
        	}

        }catch(java.net.SocketTimeoutException e){
        	System.out.println("przestalem czytac bufor:"+ e);

        }


        
        
        in.close();
    	out.close();
    	pingSocket.close();
    }
}