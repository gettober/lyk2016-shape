package shape_print;

public class Shape {
	private int width;
	private int height;
	private char character;

	public Shape(int width, int height, char character) {
		super();
		this.width = width;
		this.height = height;
		this.character = character;
	}

	public String getShape() {
		StringBuilder resultBuilder = new StringBuilder();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				resultBuilder.append(character);
			}
			resultBuilder.append(System.lineSeparator());
		}
		System.out.println("\n");
		String result = resultBuilder.toString();
		return result;
	}

}
