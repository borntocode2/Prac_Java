import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //입력받는 방법, 후에 in을 사용해서 입력받는다.
		
		int A = in.nextInt(); // Int로 입력받
		String B = in.next(); // 문자열은 그냥 next인
		
		System.out.println(A* (B.charAt(2)-'0'));
		System.out.println(A* (B.charAt(1) - '0'));
		System.out.println(A* (B.charAt(0) - '0'));
		System.out.println(A* (Integer.parseInt(B)));
		System.out.println("This");//int()가 Integer.parseInt() 
													  // Integer.toString() 은 정수를 문자열
		
		// this is for test that git remote and eclipse
}}