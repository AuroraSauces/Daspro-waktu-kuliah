import java.util.Scanner;

public class Pemilihan2Percobaan226 {
    public static void main(String[] args) {
        Scanner sdt = new Scanner(System.in);

        float sudut1 , sudut2 , sudut3 , totalsudut ;
        System.out.print("Masukkan sudut 1 : ");
        sudut1 = sdt.nextFloat();
        System.out.print("Masukkan sudut 2 : ");
        sudut2 = sdt.nextFloat();
        System.out.print("Masukkan sudut 3 : ");
        sudut3 = sdt.nextFloat();

        totalsudut = sudut1+sudut2+sudut3;

        if (totalsudut == 180) {
            if ((sudut1 == 90)  || (sudut2 == 90) || (sudut3 == 90)){
            System.out.println("Segitiga tersebut adalah segitiga siku - siku");
             }else if (sudut1 == sudut2 && sudut2 == sudut3){
            System.out.println("Segitiga tersebut adalah sama sisi");
             } else if (sudut1 == sudut2 || sudut2 == sudut3 || sudut1 == sudut3){
            System.out.println("Segitiga tersebut adalah sama kaki"); 
             }else{
            System.out.println("Segitiga tersebut adalah segitiga sembarang");}
        } else {
            System.out.println("Bukan segitiga");
                
            
        }
        }
    }
    

