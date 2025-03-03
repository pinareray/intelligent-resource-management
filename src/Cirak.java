public class Cirak extends Employee{
    public Cirak(String ad, String soyad, int GSM){
        super(ad, soyad, GSM);
    }

    @Override
    public void gorevBilgisi(){
        System.out.println("Cirak ustanin verdigi isleri dogru bir sekilde yerine getirir.");
    }

    public void isTamamla(String isDetayi, Ekipman ekipman){
        if (ekipman.isKullanimda()) {
            System.out.println("Cirak " + getAd() + " su isi tamamladi: " + isDetayi);
            ekipman.bosalt();
        } else {
            System.out.println("Ekipman hazir degil! İs tamamlanamadi.");
        }

    }

}
