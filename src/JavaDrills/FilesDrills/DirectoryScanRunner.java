package JavaDrills.FilesDrills;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {
    //Below lists all the files and their directories
    public static void main(String[] args) throws IOException {
        Path currentDirectory = Paths.get(".");
        //Files.list(currentDirectory).forEach(System.out::println);

        //Below searches a directory recursively, and returns a stream
        //Files.walk(currentDirectory,4).forEach(System.out::println);

        //Walking through a current directory and printing files that match a specific condition
        Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
        //Files.walk(currentDirectory,4).filter(predicate).forEach(System.out::println);

        //Find method gives us better filters, name of file, path and certain characteristics
        BiPredicate<Path, BasicFileAttributes> matcher = (path,attributes) -> String.valueOf(path).contains(".java");
        Files.find(currentDirectory,4, matcher).forEach(System.out::println);
    }
}
