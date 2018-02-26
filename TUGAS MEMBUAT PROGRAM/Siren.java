import java.util.Scanner;
public class Siren {


    public static void main(String[] args) 
    {
        double panjang, hasil;
        String karakter;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Program Konversi Satuan Panjang");
        System.out.print("Masukan Panjang Dalam Meter: ");
        panjang = input.nextInt();
               
        System.out.println("Pilih Konversi km, hm, da, m, dm, cm, atau mm: ");
        karakter = input.next();
        switch(karakter)
        {
            case "km":
                hasil = panjang / 1000;
				System.out.println("Panjangnya adalah: " + hasil + "km");
                break;
                
            case "hm":
                hasil = (panjang / 100);
				System.out.println("Panjangnya adalah: " + hasil + "hm");
                break;
			
			case "da":
                hasil = (panjang / 10);
				System.out.println("Panjangnya adalah: " + hasil + "da");
                break;
			
			case "m":
                hasil = (panjang * 1);
				System.out.println("Panjangnya adalah: " + hasil + "m");
                break;
				
			case "dm":
                hasil = (panjang * 10 );
				System.out.println("Panjangnya adalah: " + hasil + "dm");
                break;
				
			case "cm":
                hasil = (panjang * 100);
				System.out.println("Panjangnya adalah: " + hasil + "cm");
                break;
				
			case "mm":
                hasil = (panjang * 1000);
				System.out.println("Panjangnya adalah: " + hasil + "mm");
                break;
                
            default:
                System.out.print("Anda salah memasukan inputan");
                break;
        }
    }
    
}