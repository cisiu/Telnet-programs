
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClientR2 {
	Socket pingSocket = null;
    PrintWriter out = null;
    BufferedReader in = null;
    BufferedReader stdIn = null;
    
	EchoClientR2(){
    	
        try {
            pingSocket = new Socket("192.168.1.100", 23);
            pingSocket.setSoTimeout(2000); // tu jest zajebista metoda ktora wyrzuca blad jak czemakmy na odpowiedz dluzej niz 2 sekundy
            out = new PrintWriter(pingSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(pingSocket.getInputStream()));
        } catch (IOException e) {
            return;
        }
    }
    
    
}
    
	
    
    
    
    
//    public static void main(String[] args) throws IOException {
//
//        Socket pingSocket = null;
//        PrintWriter out = null;
//        BufferedReader in = null;
//        BufferedReader stdIn = null;
//        try {
//            pingSocket = new Socket("192.168.1.100", 23);
//            pingSocket.setSoTimeout(2000); // tu jest zajebista metoda ktora wyrzuca blad jak czemakmy na odpowiedz dluzej niz 2 sekundy
//            out = new PrintWriter(pingSocket.getOutputStream(), true);
//            in = new BufferedReader(new InputStreamReader(pingSocket.getInputStream()));
//        } catch (IOException e) {
//            return;
//        }
//    
//        
//        //tu jest kod ktory zczytuje adres IP
//        
//        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  
//        
//        out.println("root");
//
//        String tekst []=new String[20];
//        String parts[];
//        
//        
//        try{
//        	out.println("ifconfig ra0");
//        	int a = 0;
//        	while ((tekst[a]= in.readLine())!=null){
//        		a++;
//        	}
//
//        }catch(java.net.SocketTimeoutException e){
////        	System.out.println("przestalem czytac bufor:"+ e);
//
//        }
//        parts=tekst[11].split("\\s+");
//        String ipaddr[];
//        ipaddr= parts[2].split("\\:");
//        String ipaddress= ipaddr[1];
//        System.out.println(ipaddress+"\ndupa");
//        
//        try{
//        	out.println("cat /var/keys/oscam_sci0/oscam.server");
//        	int a = 0;
//        	while ((tekst[a]= in.readLine())!=null){
//        		System.out.println(tekst[a]);
//        		a++;
//        	}
//        }catch(java.net.SocketTimeoutException d){
//        	
//        }
//
//        //        pingujemy google
//        try{
//        	out.println("ping 8.8.8.8");
//        	int a = 0;
//        	while ((tekst[a]= in.readLine())!=null){
//        		System.out.println(tekst[a]);
//        		a++;
//        	}
//        }catch(java.net.SocketTimeoutException d){
//        	
//        }
//        
////        tekst[0]= in.readLine();
////        tekst[1]= in.readLine();
////        System.out.println(tekst[0]+tekst[1]);
//        
//        
//        in.close();
//    	out.close();
//    	pingSocket.close();
//    }
//}