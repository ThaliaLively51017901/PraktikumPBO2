import java.util.Scanner;
public class latihan5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nilai;
		
		System.out.print("Masukan Nilai: ");
		nilai = input.nextInt();
		
		if(nilai>=0) {
			System.out.print("Positive"); }
		else if(nilai<=0) {
			System.out.print("Negative"); }
		System.out.println();
	}
}