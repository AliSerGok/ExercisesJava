import java.util.Scanner;

public class CtrlSpace {
    public static void main(String[] args) {
        System.out.println("Ders 1");


        int yasAli=14;
        int boyMemo=198;

        if(yasAli>18 || yasAli==18){
            System.out.println("ali reşittir");
        }
        else{
            System.out.println("ali henüz reşit değil");
        }
        if(boyMemo>170){
            System.out.println("memo ortalamanın üzerinde bir boya sahiptir");


        }
        else {
            System.out.println("memonun boyu ortalamın altındadır");
        }

        System.out.println("kullanıcıdan değer çekme");
        Scanner kullanicininYasi= new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        int yas= kullanicininYasi.nextInt();

        System.out.println("kullanıcının yaşı: "+yas+"'dur");





    }
}
