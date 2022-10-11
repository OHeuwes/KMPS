package Praktikum;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Funktional {
    public static void main(String[] args) throws IOException {
        byte[] file_contents = Files.readAllBytes(Paths.get("C:\\Users\\Oscar\\IdeaProjects\\KMPS\\src\\main\\java\\Praktikum\\alben.xml"));
    }
}
