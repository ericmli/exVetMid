package S1;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		int vet[] = new int[20];
		som(vet);
		replacement(vet);

	}

	public static void som(int vet[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}

	}

	public static void replacement(int vet[]) {

		int x, i, end = 19;
		for (i = 0; i < 20; i++) {
			System.out.println(vet[i]);
		}

		for (i = 0; i < 10; i++) {
			x = vet[i];
			vet[i] = vet[end];
			vet[end] = x;
			end--;

		}
		for (i = 0; i <= 19; i++) {
			System.out.println("N[" + i + "] = " + vet[i]);
		}
	}

}