import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		String str = "";
		for (int i = 1; i <= 18; ++i) {
			System.out.print("-> ");
            Scanner week = new Scanner(System.in);
            String strOfWeek = week.nextLine();
            if (strOfWeek.equals("42")) {
                System.out.println(str);
				return;
			}
			str += strOfWeek + " ";
			str += '\n';
		}
		System.out.println(str);
	}
}