import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 18; ++i) {
            System.out.print("-> ");
            String strOfWeek = scan.nextLine();
            if (strOfWeek.equals("42")) {
                System.out.println(str);
                return;
            }
            //дописать проверку на номер недели
            str.append(strOfWeek).append(" ");

           	System.out.print("-> ");
           	//Scanner values = new Scanner(System.in);
           	str.append(getMin(scan));
        }
        scan.close();
        System.out.println(str);
    }

    static String getMin(Scanner values){
        StringBuilder result = new StringBuilder();
        //дописать проверку на количество значений
        //проверку на величину каждого значения не более 9
        values.useDelimiter(" ");
    	int min = values.nextInt();
    	//System.out.println(min);
    	while(values.hasNext()){
			int num = values.nextInt();
    		System.out.println("----> "+num);
			if(num < min)
				min = num;
		}
		System.out.println("<----> ");
		for(int i = 0; i < min; ++i)
            result.append("=");
        result.append(">\n");
        System.out.println("<<----> ");
		return result.toString();
    }
}