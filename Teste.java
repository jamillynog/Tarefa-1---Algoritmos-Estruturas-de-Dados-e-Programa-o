import java.util.Random;
import java.util.Scanner;

public class Teste{
    static void geraVetor(int[] v){
        Random r = new Random();
        for(int i = 0; i < v.length; i++){
            v[i] = r.nextInt(v.length);
        }
    }

    static void exibeVetor(int[] v){
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    static void insertionSort(int[] v){
        for(int i = 1; i < v.length; i++){
            int chave = v[i];
            int j = i - 1;
            while(j >= 0 && v[j] > chave){
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = chave;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int n = scanner.nextInt();

        int[] v = new int[n];
        geraVetor(v);
        exibeVetor(v);

        long tempoInicial = System.currentTimeMillis();
        insertionSort(v);
        long tempoFinal = System.currentTimeMillis();

        exibeVetor(v);
        System.out.println((tempoFinal - tempoInicial) + " milissegundos.");

        scanner.close();
    }
}
