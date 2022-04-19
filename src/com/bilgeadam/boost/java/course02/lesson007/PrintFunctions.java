package com.bilgeadam.boost.java.course02.lesson007;

import javax.swing.JOptionPane;

public class PrintFunctions {

	public static void main(String[] args) {
		String hello = "Hello";
		String world = "world";
		
		//println sorumluluğunda olan kısmı yazdırdıktan sonra bir alt satıra geçer
//		System.out.println(hello+" "+world);
//		System.out.println(world);
		
		//print yazdırdıktan sonra alt satıra geçmez. Aynı satırda devam eder.
		System.out.print(hello+" ");
		System.out.print(world);
		
		//JOptionPane.showMessageDialog(null, hello, "Ilk Ornek",2 );
		//JOptionPane.showConfirmDialog(null, "Son kararınız mı?");
		
		
		
		
	}

}
