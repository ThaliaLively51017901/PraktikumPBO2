import java.util.Scanner;
public class latihan2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nilai;
		
		System.out.print("Masukan Nilai: ");
		nilai = input.nextInt();
		
		//posisi if berjalan
		if(nilai == 1){
			System.out.println("Angka yang dimasukan adalah satu");}
		else
			System.out.print("Angka yang dimasukan bukan satu");
	}
}