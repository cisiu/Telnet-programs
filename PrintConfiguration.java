import java.io.IOException;

public class PrintConfiguration extends EchoClientR2{

	PrintConfiguration() throws IOException {

		try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  
        out.println("root");
		String tekst []=new String[30];
		try{
			out.println("cat /var/keys/oscam_sci0/oscam.server");
			int a = 0;
			while ((tekst[a]= in.readLine())!=null){
				System.out.println(tekst[a]);
				a++;
			}
		}catch(java.net.SocketTimeoutException d){	
		}
	}
}
