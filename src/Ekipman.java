public class Ekipman {
    private String isim;
    private boolean kullanimda;


    public Ekipman(String isim) {
        this.isim = isim;
        this.kullanimda = false;
    }


    public void kullan() {
        this.kullanimda = true;
        System.out.println(isim + " ekipmani kullanimdadir");
    }

    public void kullan(int saat) {
        
    }

    public void kullanimDisiBirak() {
        this.kullanimda = false;
        System.out.println(isim + " ekipmani kullanim disi birakildi.");
    }

    public boolean isKullanimda() {
        return kullanimda;
    }

    public void bosalt() {
    }
}
