import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> ogrenciNotu = new HashMap<>();

            ogrenciNotu.put("Serdal Akyol",76);
            ogrenciNotu.put("Merve Duygu Akyol",90);
            ogrenciNotu.put("Resul Eren Emmez",65);
            ogrenciNotu.put("Ali Ali",49);

        System.out.println(ogrenciNotu);
        System.out.println("Serdal Akyol'un Notu : " + ogrenciNotu.get("Serdal Akyol"));
        System.out.println("Bütün Anahtar Değerleri : " + ogrenciNotu.keySet());
        System.out.println("Bütün Değerler : " + ogrenciNotu.values());
        System.out.println("Bütün Girdi Çiftleri : " + ogrenciNotu.entrySet());
        ogrenciNotu.replace("Merve Duygu Akyol",95); // Eski Tanımlananı   Güncellmek için kullanılır
        System.out.println(ogrenciNotu);
        ogrenciNotu.remove("Serdal Akyol",76);
        System.out.println(ogrenciNotu);
    }
}
