package JavaDrills.FilesDrills;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {
    public static void main(String[] args) throws IOException {
        //In the path to the folder, add what file you want to create at the end
        Path pathFileToWrite = Paths.get("src/JavaDrills/FilesDrills/FilesResources/file-write.txt");
        List<String> list = List.of("Apple", "Boy", "Cat");

        Files.write(pathFileToWrite, list);
    }
}
