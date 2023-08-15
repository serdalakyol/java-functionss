import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> isimListesi = new ArrayList<>();

        isimListesi.add("Serdal");
        isimListesi.add("Merve");
        System.out.println(isimListesi);
        isimListesi.add("Eren");
        isimListesi.add("Malik");
        System.out.println(isimListesi);
        System.out.println(isimListesi.get(0)); // get  int komutu 0 dan başlayarak diğer değerleri tek tek yazdırmak için kullanılabilir
        isimListesi.set(2,"Emre");//String ifadesini değiştirmek için set ifadesi kullanılır.
        System.out.println(isimListesi);
       String silinenIsim = isimListesi.remove(3);//String ifadesinin içerisinde bulunanı silmeye yarar. (remove)
        isimListesi.remove(silinenIsim );
        System.out.println( silinenIsim +  "  İsim Listeden Çıkartılmıştır");
        System.out.println(isimListesi);
        isimListesi.add("Melisa");
        isimListesi.add("Ali Asaf");
        isimListesi.add("Miray ");
        System.out.println(isimListesi);
        System.out.println(" Listemizin Boyutu : "+ isimListesi.size() + " Kişi"); // size komutu liste kişi sayısını belirtir

        System.out.println("Listemizde Serdal İsmi : " + isimListesi.contains("Serdal"));
        System.out.println("Listemizde Mehmet İsmi : " + isimListesi.contains("Mehmet"));

        System.out.println("İsmin Liste Numarası : " + isimListesi.indexOf("Miray")); //indexOf anahatar kelimesi nesne konumunu belirtir
        System.out.println(isimListesi.isEmpty());//isim listesi boş mu anlamını taşı

        System.out.println("----------------------------------------------------------------");

        for (String isim:isimListesi){   //Alt alta yazddırmak için for döngüsü bu şekilde yazılır

            System.out.println(isim);
        }




    }
}
