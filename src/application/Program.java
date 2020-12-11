package application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		Date d = new Date(); 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm"); 
		
		System.out.println("Bom dia!!!");
		System.out.println("Boa Tarde");
		System.out.println("Boa Noite!!!");
		System.out.println("----------------------------");
		System.out.println("Data de Hoje: "+sdf.format(d));
		System.out.println("Hota atual: " +sdf1.format(d));
		System.out.println("----------------------------");
		
		

	}

}
