package Lab12.Phan2.BTH3;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathApplication {
    public static void main(String[] args) {
        Path pathObj = Paths.get("C:/Java/Hello.txt");
        System.out.printf("FileName is: %s%n", pathObj.getFileName());
        System.out.printf("Parent is: %s%n", pathObj.getParent());
        System.out.printf("Name count is: %d%n", pathObj.getNameCount());
        System.out.printf("Root directory is: %s%n", pathObj.getRoot());
        System.out.printf("Is Absolute: %s%n", pathObj.isAbsolute());
    }
}
