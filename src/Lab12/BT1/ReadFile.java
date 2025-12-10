package Lab12.BT1;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        try {
            in = new FileInputStream("dulieu.txt");

            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
