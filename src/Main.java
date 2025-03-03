//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            UstaKaynakci usta1 = new UstaKaynakci("Deniz", "Yilmaz", 537494889);
            UstaKaynakci usta2 = new UstaKaynakci("Ahmet", "Demir", 539148948);
            Cirak cirak1 = new Cirak("Selim", "Ekin", 523659548);
            Cirak cirak2 = new Cirak("Efe", "Toprak", 524759680);
            Yonetici yonetici = new Yonetici("Vera","Aslan", 05360503443);
            Ekipman kaynakMakinesi = new Ekipman("Kaynak Makinesi");
            Ekipman koruyucuElbise = new Ekipman("Koruyucu elbise");
            Ekipman matkap = new Ekipman("Matkap");
            Ekipman eldiven = new Ekipman ("Eldiven");
            Ekipman kaynakMaskesi = new Ekipman ("Kaynak Maskesi");
            MalzemeTakip malzemeTakip = new MalzemeTakip();


            cirak1.setGsm(054573403);
            System.out.println("Cirak1 yeni GSM: " +cirak1.getGsm());

            usta1.gorevBilgisi();
            cirak1.gorevBilgisi();
            yonetici.gorevBilgisi();

            usta1.isEmriOlustur("Metal levha uzerine kaynak yapilacak.");
            usta2.isEmriOlustur("Matkapla demir delinecek.");

            malzemeTakip.malzemeEkle("Kaynak Teli", 10);
            malzemeTakip.malzemeKullan("Kaynak Teli", 3);
            malzemeTakip.stokGoruntule();

            kaynakMakinesi.kullan();
            koruyucuElbise.kullan();
            matkap.kullan();
            kaynakMaskesi.kullan();

            cirak1.isTamamla("Metal levha uzerine kaynak yapti.", kaynakMakinesi);
            cirak2.isTamamla("Matkapla demiri deldi.", matkap);
            yonetici.raporla("Tum kaynak isleri tamamlandi ve kontrol edildi.");
        }
    }
