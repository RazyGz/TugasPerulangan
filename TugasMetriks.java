package Nilai.PelatihanArray;

import java.util.Scanner;

public class TugasMetriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Masukkan Jumlah Baris: ");
        int baris = input.nextInt();
    System.out.print("Masukkan Jumlah Kolom: ");
        int Kolom = input.nextInt();

        int matrix[][] = new int[baris][Kolom];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Masukkan Nilai Matrix: ");
                matrix[i][j] = input.nextInt();
            }
        }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + ", ");
                }
                System.out.println();
        }
    }
}
