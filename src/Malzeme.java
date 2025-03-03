public class Malzeme {
    private String isim;
    private int miktar;

    public Malzeme(String isim, int miktar){
        this.isim = isim;
        this.miktar = miktar;
    }

    public String getIsim(){
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMiktar(){
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public void miktarEkle(int miktar){
        this.miktar += miktar;
        System.out.println(isim + "stoga eklendi. Yeni miktar:" +this.miktar);
    }

    public void miktarEkle(int miktar, String not) {
        this.miktar += miktar;
        System.out.println(isim + " stoga eklendi. Yeni miktar: " + this.miktar + " Not: " + not);
    }

    public boolean miktarAzalt (int miktar) throws MalzemeYetersizException{
        if(this.miktar >= miktar){
            this.miktar -= miktar;
            System.out.println(miktar + " adet " + isim + " kullanildi. Kalan: " + this.miktar);
            return true;
        } else {
            throw new MalzemeYetersizException(isim + " icin yeterli stok yok");
        }
    }

}
