package shape_print;

import java.io.IOException;

public class ShapeApplication {

	public static void main(String[] args) throws IOException {
		FileHelper fileHelper = new FileHelper();
		String[] input = fileHelper.readFile();

		int width = Integer.parseInt(input[0]);
		int height = Integer.parseInt(input[1]);
		char character = input[2].charAt(0);

		Shape shape = new Shape(width, height, character);

		final String result = shape.getShape();

		fileHelper.writeToFile(result);

	}

}
