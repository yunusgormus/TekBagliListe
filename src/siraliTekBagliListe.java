public class siraliTekBagliListe {
    public Dugum ilk;
    public siraliTekBagliListe(){
        this.ilk=null;
    }
    //bu fonksiyon sayıları küçükten büyüğe olacak şekilde listeye eklesin
    public void elemanEkle(int deger){
        Dugum yeni=new Dugum(deger);
       if(this.ilk==null||ilk.veri>=deger){
           yeni.sonraki=ilk;
           this.ilk=yeni;
       }
       else {
           Dugum temp=this.ilk;
           while (temp.sonraki != null && temp.sonraki.veri < deger) {
               temp = temp.sonraki;
           }
           yeni.sonraki = temp.sonraki;
           temp.sonraki = yeni;
       }
    }
    public void listele(){
        Dugum temp=this.ilk;
        if(temp==null){
            System.out.println("liste boş");
        }
        while (temp!=null){
            temp.Yazdir();
            temp=temp.sonraki;
        }
    }
}
