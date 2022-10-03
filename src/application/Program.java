package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		System.out.print("How many students for course A: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int value = sc.nextInt();
			a.add(value);
		}

		System.out.print("How many students for course B: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int value = sc.nextInt();
			b.add(value);
		}

		System.out.print("How many students for course C: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int value = sc.nextInt();
			c.add(value);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.print("Total Students: " + total.size());
		
		sc.close();
	}

}
