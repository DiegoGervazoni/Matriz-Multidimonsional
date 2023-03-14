import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4]; //primeiro colchete[] representa linha e o segundo[] a coluna

        for(int i = 0; i < matriz.length; i++){ //for para a primeira linha da matriz
            for(int j = 0; j < matriz[i].length; j++){ //for para a segunda linha da matriz
                matriz[i][j] = random.nextInt(9); //cria numeros aleatorios para a matriz
            }
        }

        System.out.println("Matriz: ");
        for(int[] linha : matriz){ //pega cada elemento de dentro de cada linha
            for(int coluna: linha){ //pega cada elemento de dentro de cada coluna
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
