import java.util.Scanner;
public class class9 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите номер дня недели: ");
		int day = in.nextInt();
		in.close();
		switch(day) {
		case 1 :
			System.out.print("Это понедельник.");
			break;
		case 2 :
			System.out.print("Это вторник.");
			break;
		case 3 :
			System.out.print("Это среда.");
			break;
		case 4 :
			System.out.print("Это четверг.");
			break;
		case 5 :
			System.out.print("Это пятница.");
			break;
		case 6 :
			System.out.print("Это суббота.");
			break;
		case 7 :
			System.out.print("Это воскресенье.");
			break;
		default :
			System.out.print("В неделе всего 7 дней.");
		}
	}
}