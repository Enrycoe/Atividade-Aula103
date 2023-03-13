import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Digite o número de linhas da matriz: ");
		int m = sc.nextInt();
		System.out.print("Digite o número de colunas da matriz: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length;j++) {
				System.out.print("Dígite o valor da matriz na posição " + i+ ", "+ j+ " :");
				mat[i][j]= sc.nextInt();
			}
		}
		
		for(int i=0; i<mat.length; i++) {
			System.out.println();
			for(int j=0; j<mat[i].length;j++) {
				System.out.print(mat[i][j]+"  ");
			}
		}
		
		
		System.out.println("Qual número você deseja consultar? ");
		int x = sc.nextInt();

		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length;j++) {
				if(mat[i][j]==x) {
					System.out.println("Posição " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Abaixo: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		
		
		
		sc.close();
	}

}
