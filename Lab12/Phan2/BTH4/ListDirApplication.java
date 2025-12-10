package Lab12.Phan2.BTH4;

import java.io.IOException;
import java.nio.file.*;
import java.util.Iterator;

public class ListDirApplication {
    public static void main(String[] args) {
        Path pathObj = Paths.get("test");
        try (DirectoryStream<Path> dirStreamObj = Files.newDirectoryStream(pathObj)) {
            for (Iterator<Path> itrObj = dirStreamObj.iterator(); itrObj.hasNext();) {
                Path fileObj = itrObj.next();
                System.out.println(fileObj.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            System.err.println(e.getMessage());
        }
    }
}
