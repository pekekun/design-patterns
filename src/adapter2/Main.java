package adapter2;

import java.io.IOException;

public class Main {
	public static void main(String args[]) {
		FileIO f = new FileProperties();
		// fileは仮
		try {
			f.readFromFile("file.txt");
			f.setValue("year", "2017");
			f.setValue("month", "4");
			f.setValue("day", "21");
			f.writeToFile("newfile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
