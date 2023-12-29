package Solve;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solve_problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[10];
		System.out.println("숫자 입력: ");
		for(int i=0; i<10; i++) {
			int n = sc.nextInt();
			nums[i] = n % 42;
		}
		Set<Integer> num = new HashSet<>();
		for(int num1 : nums) {
			num.add(num1);
		}
		System.out.println(num.size());
		sc.close();
	}

}
