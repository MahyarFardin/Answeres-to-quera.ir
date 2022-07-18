import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // matrix multuplication
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int Z = scan.nextInt();
        int matrix1[][] = new int[X][Y];
        int matrix2[][] = new int[Y][Z];
        int multupluedMatrix[][] = new int[X][Z];

        // initializing
        // first matrix
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }
        // second matrix
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < Z; j++) {
                matrix2[i][j] = scan.nextInt();
            }
        }

        // process
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Z; j++) {
                for (int k = 0; k < Y; k++) {
                    multupluedMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // printing
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Z; j++) {
                System.out.print(multupluedMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
