public class latihan6 {
	public static void main(String[] args) {
		char hurufAwal = 'a';
		System.out.print("Masukan Huruf Awal Nama Anda: ");
		try {
			hurufAwal = (char)System.in.read();}
		catch(Exception e) {
			System.out.println("Salah ko menginput cess...!");}
		switch(hurufAwal){
		case (char)-1 : System.out.println("Bukan Huruf Depan!!!"); break;
		case 'a' : System.out.println("Apa namamu Amin?"); break;
		case 'b' : System.out.println("Apa namamu Bambang?"); break;
		case 'c' : System.out.println("Apa namamu Cecep?"); break;
		case 'd' : System.out.println("Apa namamu Daud?"); break;
		case 'e' : System.out.println("Apa namamu Endang?"); break;
		default : System.out.println("Aku tidak bisa menebak");
		}
	}
}