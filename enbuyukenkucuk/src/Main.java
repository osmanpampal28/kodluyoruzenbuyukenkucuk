import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("kaç tane sayı girmek istiyorsunuz : ");
        int sayi=scanner.nextInt();
        while(sayi<0){
            System.out.println("hatalı! Tekrar sayı giriniz : ");
            sayi=scanner.nextInt();
        }
        int[] dizi=new int[sayi];
        for(int i=0;i<sayi;i++){
            System.out.println("sayıyı giriniz : ");
            dizi[i]=scanner.nextInt();
        }
        int eb=dizi[0],ek=dizi[0];
        for(int a:dizi){
            if(a>eb){
                eb=a;
            }
            if(a<ek){
                ek=a;
            }
        }
        System.out.println("en büyük sayı : "+eb);
        System.out.println("en küçük sayı : "+ek);
    }
}
