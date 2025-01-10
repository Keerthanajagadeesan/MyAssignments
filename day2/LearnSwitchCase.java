package Week1.day2;

public class LearnSwitchCase {

	public static void main(String[] args) {
		String browser = "edge";
// Only equality based condition used unlike if else which uses different complex conditions
// Default case is available unlike if else
		switch(browser) {
		case "Chrome":
			System.out.println("open chrome browser");
			break;
		case "edge":
			System.out.println("open edge browser");
			break;
		case "safari":
			System.out.println("open safari browser");
			break;
		case "default":
			System.out.println("open IE browser");
			break;
		}
		}
		
	}
