package rumusmtk;

import java.util.Scanner;

public class persegi_panjang {
int p;
int l;
int p2;
int l2;
int luas;
int keliling;
Scanner input = new Scanner(System.in);

public void luaspersegipanjang(){
    System.out.print("Masukkan nilai P untuk menghitung luas = ");
    p = input.nextInt();
    System.out.print("Masukkan nilai L untuk menghitung luas = ");
    l = input.nextInt();
    luas = p * l;
}
public void kelilingpersegipanjang(){
    System.out.print("Masukkan nilai P untuk menghitung keliling = ");
    p2 = input.nextInt();
    System.out.print("Masukkan nilai L untuk menghitung keliling = ");
    l2 = input.nextInt();
    keliling = 2 * (p2 + l2);
}
public void hasil(){
    System.out.println("Hasil penjumlahan Luas Persegi Panjang dengan nilai P "+p+" dan nilai L "+l+" adalah = "+luas);
    System.out.println("Hasil penjummlahan Keliling Persegi Panjang dengan nilai P "+p2+" dan nilai L "+l2+" adalah = "+keliling);
}

}
