import java.util.Scanner;
public class class10 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите день недели: ");
		String day = in.next();
		in.close();
		switch(day) {
		case "понедельник":
			System.out.println("Это первый день недели.");
			break;
		case "вторник":
			System.out.println("Это второй день недели.");
			break;
		case "среда":
			System.out.println("Это третий день недели.");
			break;
		case "четверг":
			System.out.println("Это четвертый день недели.");
			break;
		case "пятница":
			System.out.println("Это пятый день недели.");
			break;
		case "суббота":
			System.out.println("Это шестой день недели.");
			break;
		case "воскресенье":
			System.out.println("Это седьмой день недели.");
			break;
		default :
			System.out.println("В неделе нет такого дня.");
		}
	}
}