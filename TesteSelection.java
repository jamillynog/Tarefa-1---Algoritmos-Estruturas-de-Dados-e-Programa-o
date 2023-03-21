import java.util.Scanner;
import java.util.Random;

public class TesteSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(1000); 
        }
        
        long tempoInicial = System.currentTimeMillis();
        
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        long tempoFinal = System.currentTimeMillis(); 
        long tempoTotal = tempoFinal - tempoInicial;
        
        System.out.println("Vetor ordenado:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(tempoTotal + " milissegundos");
    }
}
