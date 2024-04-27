//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        tekBagliListe listem=new tekBagliListe();

    listem.basaEkle(10);
    listem.basaEkle(11);
    listem.basaEkle(12);
    listem.basaEkle(13);
    System.out.println("-----");
    listem.arayaEkle(23,2);
    listem.sonaEkle(26);
    listem.elemanSil(12);
    System.out.println("-----");
    System.out.println("Lİstedeki eleman sayısı:"+listem.elemanSayisi());
    Dugum sonuc=listem.elemanBul(13);
    if(sonuc==null){
        System.out.println("aranan değer bulunmadı");
    }
    else
        System.out.println("aranan değer bulundu:"+sonuc.veri);

    listem.listele();
    System.out.println("--------------------------------------------");
        siraliTekBagliListe d=new siraliTekBagliListe();
        d.elemanEkle(20);
        d.elemanEkle(22);
        d.elemanEkle(15);
        d.elemanEkle(5);

        d.listele();

    }
}