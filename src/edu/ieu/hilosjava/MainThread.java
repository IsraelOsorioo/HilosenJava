package edu.ieu.hilosjava;

public class MainThread {
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(" Cliente Michell",
				new int[] {2,2,1,5,2} );
		Cliente cliente2 = new Cliente(" Cliente Eduardo",
				new int[] {1,3,5,1,1} );
		Cliente cliente3 = new Cliente(" El mejor cliente Israel",
				new int[] {4,2,1,1,3} );
		
		long initialTime = System.currentTimeMillis();
		
		CajeraThread cajero1 = new CajeraThread("Cajero Cesar",
				cliente1, initialTime);
		CajeraThread cajero2 = new CajeraThread("Cajero Isidro",
				cliente2, initialTime);
		CajeraThread cajero3 = new CajeraThread("Cajero Ramón",
				cliente2, initialTime);
		
		cajero1.start();
		cajero2.start();
		cajero3.start();
	}
}
