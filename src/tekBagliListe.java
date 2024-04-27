public class tekBagliListe {
    public Dugum ilk; //head: listenin başlangıcını tutan değişken
    public tekBagliListe(){
        this.ilk=null; //liste boş olarak oluşturulur
    }
    public void basaEkle(int deger){
        Dugum yeni=new Dugum(deger);
        yeni.sonraki=ilk;
        this.ilk=yeni;
    }

    //baştan sona ilerle son düğümü bul onun sonraki bileşeni yeni düğüm olacak şeklide kodla
    public void sonaEkle(int deger){
        Dugum yeni=new Dugum(deger);
        if(this.ilk==null){
            this.ilk=yeni;
        }
        Dugum temp=this.ilk;
        while (temp.sonraki!=null){
            temp=temp.sonraki;
        }
            temp.sonraki=yeni;
    }

    public void arayaEkle(int deger, int indis){
        if(this.ilk==null || indis==1){
            this.basaEkle(deger);
            return;
        }
        Dugum yeni=new Dugum(deger);
        Dugum temp=this.ilk;
        int sayac=1;
        while (temp.sonraki!=null){
            if(sayac+1==indis)
                break;
            sayac++;
            temp=temp.sonraki;
        }
        yeni.sonraki=temp.sonraki;
        temp.sonraki=yeni;
    }
    public int elemanSayisi(){
        Dugum temp=this.ilk;
        int sayac=0;
        while (temp!=null){
            temp=temp.sonraki;
            sayac++;
        }
        return sayac;
    }
    //istenilen değeri arayıp bulup geri döndüren fonksiyon
    public Dugum elemanBul(int deger){

        Dugum temp=this.ilk;
        Dugum bulunan=null;
        while (temp!=null){
            if(temp.veri!=deger){
                temp=temp.sonraki;
            }
            else{
                bulunan=temp;
                break;
            }
        }
        return bulunan;
    }
    //istenen değeri listeden siler
    //boş listeden eleman silinmeye çalışılırsa fonk -1 değerini döndürür
    //eleman başarılı bir şekilde silinirse 0 değerini döndürür
    //silmeye çalışılan eleman listede  yoksa -2 döndürür
    public int elemanSil(int deger){
        if(this.ilk==null){ //liste boş ise -1 döndür
            return -1;
        }
        if(this.ilk.veri==deger){   //ilk eleman silinecekse, liste başlangıcı değiştirilmeli
            this.ilk=this.ilk.sonraki; //sonraki düğümü liste başlangıcı olarak ayarlanmalı
            return 0;
        }
        Dugum temp=this.ilk;
        while (temp.sonraki.veri!=deger){
            if(temp.sonraki.sonraki==null){ //liste sonuna gelinmişse eleman yoktur -2 döndür
                return -2;
            }
            temp=temp.sonraki;
        }
        temp.sonraki=temp.sonraki.sonraki;
        return 0;
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





















