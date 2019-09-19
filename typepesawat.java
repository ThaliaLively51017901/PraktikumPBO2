import java.util.Scanner;
public class typepesawat {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nilai;
		
		System.out.print("Masukan Nilai: ");
		nilai = input.nextInt();
		
		if(nilai == 1){
			System.out.println("Pesawat Garuda");}
		else if(nilai == 2){
			System.out.println("Pesawat Batik");}
		else if(nilai == 3){
			System.out.println("Pesawat Lion");}
		else
			System.out.print("Kode yang Dimasukan Salah");
	}
}