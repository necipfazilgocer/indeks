package vücutkitle;
import java.util.Scanner;
public class vücutkitle {
	public static void main(String[] args) {
		double kilo,boy,indeks;
		System.out.print("Boyunuzu giriniz.");
		Scanner scanner=new Scanner(System.in);
		boy=scanner.nextInt();
		System.out.print("kilonuzu giriniz.");
		kilo=scanner.nextInt();
		indeks=kilo/(boy*boy);
		System.out.print("Vücut kitle endeksiniz="+indeks);
		
	
		
	}
}
