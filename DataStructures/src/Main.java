import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		new GUI();
		
	}

	private static void printData(ArrayList<String> names, String text) {
		System.out.println("-------"+text+"--------");
		for (String name: names)
			System.out.println(name);
	}

}
