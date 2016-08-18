package shape_print;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileHelper {
	private static final String INPUT_FILE_PATH = "/home/buse_firat/workspace/ShapeExample/in";
	private static final String OUTPUT_FILE_PATH = "/home/buse_firat/workspace/ShapeExample/out";

	public static String[] readFile() throws IOException {

		List<String> lines = null;

		try {
			lines = Files.readAllLines(Paths.get(INPUT_FILE_PATH));

		} catch (IOException e) {

			e.printStackTrace();
		}

		String[] readFile = null;

		for (String line : lines) {
			readFile = line.split(",");
		}

		for (String c : readFile) {
			System.out.println(c);
		}
		return readFile;
	}

	public static void createFile(String pathAndFile) throws IOException {

		try {
			Path FilePath = Paths.get(pathAndFile);
			Files.createFile(FilePath);
			System.out.println(pathAndFile + " oluşturuldu.");
		} catch (FileAlreadyExistsException e) {
			System.out.println("Dosya zaten var.");
		}
	}

	public static void writeToFile(String content) throws IOException {

		Files.write(Paths.get(OUTPUT_FILE_PATH), content.getBytes());
		System.out.println(content.toString());

	}
}
