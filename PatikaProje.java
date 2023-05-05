import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dersSayisi = 5; 
		double toplamNot = 0;
		System.out.print("Matematik notunuz: ");
		int mat = input.nextInt();
		if (mat >= 0 && mat <= 100) {
			toplamNot += mat;
		}
		else dersSayisi--;
		
		System.out.print("Fizik notunuz: ");
		int fiz = input.nextInt();
		if (fiz >= 0 && fiz <= 100) {
			toplamNot += fiz;
		}
		else dersSayisi--;
		
		System.out.print("Türkçe notunuz: ");
		int tur = input.nextInt();
		if (tur >= 0 && tur <= 100) {
			toplamNot += tur;
		}
		else dersSayisi--;
		
		System.out.print("Kimya notunuz: ");
		int kim = input.nextInt();
		if (kim >= 0 && kim <= 100) {
			toplamNot += kim;
		}
		else dersSayisi--;
		
		System.out.print("Müzik notunuz: ");
		int muz = input.nextInt();
		if (muz >= 0 && muz <= 100) {
			toplamNot += muz;
		}
		else dersSayisi--;
		
		double average = 0;
		if (dersSayisi != 0) average  = toplamNot / dersSayisi;
		
		if (dersSayisi == 0) {
			System.out.println("Ortalaması hesaplanabilecek hiç bir not yok");
		}
		else {
			if (average <= 55) System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
			else System.out.println("Tebrikler, sınıfı geçtiniz!");
			System.out.println("Ortalamanız: " + average);
		}
	}

}
