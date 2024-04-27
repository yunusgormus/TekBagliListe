public class Dugum {
    public int veri;
    public Dugum sonraki;
    public Dugum(){
        this.veri=0;
        this.sonraki=null;
    }
    public Dugum(int deger){
        this.veri=deger;
        this.sonraki=null;
    }
    //Dügümün veri bileşenlerini ekrana yazmak
    public void Yazdir(){
        System.out.println(this.veri);
    }
}
