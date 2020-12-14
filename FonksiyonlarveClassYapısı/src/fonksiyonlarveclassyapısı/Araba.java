package fonksiyonlarveclassyapısı;
public class Araba {
    
    int hiz;
    String renk;
    String Marka;
    String Model;
    int motorGucu;
    String VitesTuru;
    double Kilometre;
    String YakitTuru;
    
    public void hizArtir(int eklenilecekHiz){
        int yeniHiz = eklenilecekHiz + hiz;
        System.out.println("Arabanın yeni hızı --> " + yeniHiz);
    }
    public void hizAzalt(int eklenilecekHiz){
        int yeniHiz = eklenilecekHiz - hiz;
        if(yeniHiz < 0)
            yeniHiz = yeniHiz * -1;
        System.out.println("Arabanın yeni hızı --> " + yeniHiz);
    }
    
}
