import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class TesteVetores {

    static void geraVetor (int[] v) {
        Random random = new Random();
        for (int i=0; i < v.length; i++  )
            v[i] = random.nextInt(10*v.length);
    }
    static void exibeVetor (String msg, int[] v) {
        System.out.println("\n" +  msg);
        for (int i=0; i < v.length; i++  ) 
            System.out.print(v[i] +  " ");
        System.out.println();
    }
    static void bubbleSort (int[] v) {
        for (int i=1; i<v.length; i++  ) {
            for (int j=0; j < v.length-i; j++  ) {
                if (v[j] > v[j +1]) {
                    int temp = v[j];
                    v[j] = v[j +1];
                    v[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] v;
        do {
            System.out.print("\ndigite o tamanho do vetor: ");
            n = scanner.nextInt();
            if (n>0) {
                v = new int[n];
                geraVetor (v);
                //exibeVetor ("vetor gerado randomicamente", v);
                long inicio = new Date().getTime();
                bubbleSort(v);
                long fim = new Date().getTime();
                //exibeVetor("vetor ordenado pelo bubble", v);
                System.out.println("\ntempo do bubble: " +  (fim-inicio) +  " milissegundos");
            }
        } while (n>0);
        scanner.close();
    }
}