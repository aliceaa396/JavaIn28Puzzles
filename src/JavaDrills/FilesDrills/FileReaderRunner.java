package JavaDrills.FilesDrills;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReaderRunner {
    public static void main(String[] args) throws IOException {
        Path pathFileToRead = Paths.get("src/JavaDrills/FilesDrills/FilesResources");
        Files.readAllLines(pathFileToRead);
        List<String> lines = Files.readAllLines(pathFileToRead);
        System.out.println(lines);

        Files.lines(pathFileToRead)
                .map(String::toLowerCase)
                .filter(str -> str.contains("a"))
                .forEach(System.out::println);
    }
}