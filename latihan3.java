import java.util.Scanner;
public class latihan3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nilai;
		
		System.out.print("Masukan Nilai: ");
		nilai = input.nextInt();
		
		//posisi if berjalan
		if(nilai % 2 == 0){
			System.out.println("Angka yang dimasukan adalah Genap");}
		else
			System.out.print("Angka yang dimasukan bukan Ganjil");
	}
}