import java.io.IOException;


public class GetIP extends EchoClientR2{
	 
	 GetIP() throws IOException {
	    	try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  
	        out.println("root");

	        String tekst []=new String[20];
	        String parts[];
	        
	        try{
	        	out.println("ifconfig ra0");
	        	int a = 0;
	        	while ((tekst[a]= in.readLine())!=null){
	        		a++;
	        	}

	        }catch(java.net.SocketTimeoutException e){
//	        	System.out.println("przestalem czytac bufor:"+ e);

	        }
	        parts=tekst[11].split("\\s+");
	        String ipaddr[];
	        ipaddr= parts[2].split("\\:");
	        String ipaddress= ipaddr[1];
	        System.out.println(ipaddress+":24");
	    	
	    }
	
}
