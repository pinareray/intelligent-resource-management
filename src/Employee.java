public abstract class Employee {
    private String ad;
    private String soyad;
    private long GSM;

    public abstract void gorevBilgisi();

    public Employee(String ad, String soyad, long GSM){
        this.ad = ad;
        this.soyad = soyad;
        this.GSM = GSM;
        setGsm(GSM);
    }

    public String getAd(){return ad;}
    public String getSoyad() {return soyad;}
    public long getGsm() {return GSM;}


    public void setGsm(long GSM) {
        if (String.valueOf(GSM).length() == 9) {
            this.GSM = GSM;
        } else {
            System.out.println("Hata: Gecersiz GSM numarasi.");
        }
    }

}
