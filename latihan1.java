public class latihan1 {
	public static void main(String[] args) {
		char hurufAwal = 'a';
		System.out.print("Masukan Huruf Awal Nama Anda: ");
		try {
			hurufAwal = (char)System.in.read();}
		catch(Exception e) {
			System.out.println("Salah ko menginput cess...!");}
		if(hurufAwal == 'a')
			System.out.println("Apa namamu Amin?");
		else if(hurufAwal == 'b')
			System.out.println("Apa namamu Bambang?");
		else if(hurufAwal == 'c')
			System.out.println("Apa namamu Cecep?");
		else if(hurufAwal == 'd')
			System.out.println("Apa namamu Daud?");
		else if(hurufAwal == 'e')
			System.out.println("Apa namamu Endang?");
		else
			System.out.println("Aku tidak bisa menebak");
	}
}