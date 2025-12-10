package Lab12.BT2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadData {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("data.dat");
            DataInputStream dis = new DataInputStream(fis);

            int i = dis.readInt();
            double d = dis.readDouble();
            boolean b = dis.readBoolean();
            char c = dis.readChar();
            String s = dis.readUTF();

            System.out.println("Int: " + i);
            System.out.println("Double: " + d);
            System.out.println("Boolean: " + b);
            System.out.println("Char: " + c);
            System.out.println("String: " + s);
            dis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
