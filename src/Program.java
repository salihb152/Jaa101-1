import java.util.Scanner;
public class Program {
    
    public static void main(String[] args) {
        System.out.println("Matematik sonucunu gir : ");
        Scanner scanner = new Scanner(System.in);
        int matematik = scanner.nextInt();

        System.out.println("Fizik sonucunu gir : ");
        int fizik= scanner.nextInt();

        System.out.println("Kimya sonucunu gir : ");
        int kimya= scanner.nextInt();

        System.out.println("Türkçe sonucunu gir : ");
        int turkce= scanner.nextInt();

        System.out.println("Tarih sonucunu gir : ");
        int tarih=scanner.nextInt();

        System.out.println("Müzik sonucunu gir : ");
        int muzik= scanner.nextInt();

        int ortalama= (matematik+fizik+kimya+turkce+tarih+muzik)/6;

        String sonuc= ortalama >=60 ? "Sınıfı geçti" : "Sınıfı kaldı";
        
        System.out.println(sonuc);
        
        scanner.close();

       
    }
}
