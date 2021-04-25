package miniProjeAsalSAyi;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int number = 125;
		int bolen = 0;
		
		for (int deger = 2; deger < number/2; deger++) {			
			int remainder = number %deger;
			if (remainder == 0) {
				bolen = bolen +1;
			}			
		}		
		
		if (bolen >= 1) {
			System.out.println("sayý asal deðil");
		}
		else {
			System.out.println("sayý asal");
		}
		

	}

}
