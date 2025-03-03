public class UstaKaynakci extends Employee{
    public UstaKaynakci(String ad, String soyad, int GSM) {
        super(ad, soyad, GSM);
    }

    public void isEmriOlustur(String isDetayi) {
        System.out.println(getAd() + " usta is emri olusturdu: " + isDetayi);
    }


    public void isEmriOlustur(String isDetayi, String malzeme, int miktar) {
        System.out.println(getAd() + " usta is emri olusturdu: " + isDetayi +
                ". Kullanilacak malzeme: " + malzeme + " (" + miktar + " adet)"
        );
    }

    @Override
    public void gorevBilgisi(){
        System.out.println("Usta kaynakci ana isleri yapar ve ciragin islerini kontrol eder.");
    }

}
