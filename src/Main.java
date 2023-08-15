// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Araba ilkArabam = new Araba();
        ilkArabam.setModel("Volvo");
        System.out.println("Araba : " + ilkArabam.getModel()+ "Araba Fiyatı: " + ilkArabam.arabaFiyati);
        ilkArabam.arabaFiyati = 450000;
        Araba ikinciArabam = new Araba();
        ikinciArabam.setModel("BMW");
        System.out.println("2. Araba : "+ikinciArabam.getModel()+" 2. Araba Fiyatı : "+ ikinciArabam.arabaFiyati);
    }
}



