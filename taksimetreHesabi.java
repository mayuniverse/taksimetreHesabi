import java.util.Scanner;

public class taksimetreHesabi{

    public static void main(String[] args) {
     // değişkenleri tanımlayalım
     double kacKM,ucretiniz;
     
     // import sınıfını tanımlayalım 
     Scanner input = new Scanner(System.in);

     // kullanıcıdan input alalım
     System.out.println("Kaç km gideceksiniz ?");
     kacKM = input.nextDouble();

     //ücret hesabını yapalım
     ucretiniz = 10 + kacKM*2.20;

    ucretiniz = (ucretiniz < 20) ? 20 : ucretiniz;
     
    System.out.println("Ücretiniz " + ucretiniz );

    



    }
}
