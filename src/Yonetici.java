public class Yonetici extends Employee {

    public Yonetici(String ad, String soyad, int GSM){
        super(ad, soyad, GSM);
    }

    @Override
    public void gorevBilgisi(){
        System.out.println("Yonetici calisanlari ve yaptiklari isler kontrol eder, sonrasinda rapor yazar");
    }

    public void raporla(String raporDetayi){
        System.out.println("Yonetici " + getAd() + " " + getSoyad() + " isleri kontrol etti ve rapor yazdi:" + raporDetayi);
    }

}
