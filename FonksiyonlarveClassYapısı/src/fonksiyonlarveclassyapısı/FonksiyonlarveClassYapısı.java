package fonksiyonlarveclassyapısı;
public class FonksiyonlarveClassYapısı {

    public static void main(String[] args) { // Ana Fonksiyon
        
        //Siniflar --> Birden fazla nesne oluşturmak için yeni bir alan oluşturmak.
        //Bu alanın içerisinde 2 çeşit yapı vardır.
        //1.si Durumlar 2.si Davranışlar
        Araba mercedes = new Araba();
        Araba bmw = new Araba();
        bmw.Marka = "BMW";
        bmw.Model = "X5";
        bmw.Kilometre = 80000;
        bmw.VitesTuru = "Manuel";
        bmw.YakitTuru = "Benzinli";
        bmw.hiz = 100;
        System.out.println("Aracın Markası --> " + bmw.Marka+"\nAracın Modeli --> " + bmw.Model + "\nAracın Kilo"
                + "metresi --> "+ bmw.Kilometre + "\nArabanın Vites Türü --> "+ bmw.VitesTuru + "\nAracın"
                + " Yakit Turu --> "+bmw.YakitTuru + "\nArabanın Hızı --> " + bmw.hiz);
        mercedes.hizArtir(90);
        mercedes.hizAzalt(50);
        System.out.println("-------------------------------------");
        mercedes.Marka = "Mercedes";
        mercedes.Model = "CLA";
        mercedes.Kilometre = 80000;
        mercedes.VitesTuru = "Manuel";
        mercedes.YakitTuru = "Benzinli";
        mercedes.hiz = 100;
        System.out.println("Aracın Markası --> " + mercedes.Marka+"\nAracın Modeli --> " + mercedes.Model + "\nAracın Kilo"
                + "metresi --> "+ mercedes.Kilometre + "\nArabanın Vites Türü --> "+ mercedes.VitesTuru + "\nAracın"
                + " Yakit Turu --> "+mercedes.YakitTuru + "\nArabanın Hızı --> " + mercedes.hiz);
        mercedes.hizArtir(90);
        mercedes.hizAzalt(50);
        
        
        //Fonksiyonlar --> Kod kalabalığının yada veri tekrarının önüne geçmek için bir kod parçacığı oluşturup 
        //Tekrar tekrar ana fonksiyonda çağırmak.
        /*deneme1();
        deneme2(12,15);
        System.out.println(deneme3());
        int z = deneme3();
        System.out.println(z);
        System.out.println(deneme4(9));
        int w = deneme4(12);
        System.out.println(w);*/
        
    }
    
    //Fonksiyon Türleri
    //Parametre = Argüment
    //1- Değer Döndürmeyen Parametre Almayan
    //2- Değer Döndürmeyen Parametre Alan
    //3- Değer Döndüren    Parametre Almayan
    //4- Değer Döndüren    Parametre Alan
    /*
    public static void deneme1(){
        int a = 12 , b = 13;
        System.out.println("Değer Döndürmeyen Parametre Almayan Fonksiyon");
        System.out.println(a+b);
    }
    
    public static void deneme2(int a , int b){
        System.out.println("Değer Döndürmeyen ve Parametre Alan Fonksiyon");
        System.out.println(a+b);
    }
    public static int deneme3(){
        int a = 12 , b = 25;
        System.out.println("Değer Döndüren ve Parametre Almayan Fonksiyon");
        return a+b;
    }
    
    public static int deneme4(int a){
        System.out.println("Değer Döndüren ve Parametre Alan Fonksiyon");
        return a*a;
    }
    public static int deneme5(int a){
        System.out.println("Değer Döndüren ve Parametre Alan Fonksiyon");
        return a*a;
    }
    */
}
