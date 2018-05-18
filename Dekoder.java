
class Dekoder extends Telnet_to_device {
	String nazwa;
	int ip;
	
	public Dekoder(String nazwa, int ip) {
		super(ip);
		System.out.print(nazwa);
		this.nazwa = nazwa;
		this.ip = ip;
	}
	public Dekoder() {
		System.out.println("Dekoder bez nazwy");
	}

	public void standby() {
		System.out.println("Dekoder w stanie standby");
	}
}



