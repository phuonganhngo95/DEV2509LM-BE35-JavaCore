package Lab12.Phan1.BTH1.Devmaster.sinhvien;

import java.io.File;
import java.io.IOException;

public class db {
    void createFolder(String path) {
        File folder = new File(path);
        if (folder.exists()) {
            System.out.println("Tồn tại đường dẫn này");
            if (folder.isDirectory()) {
                System.out.println("Tồn tại thư mục này");
            }
        } else {
            folder.mkdirs();
            System.out.println("Không tồn tại đường dẫn này, đã tạo mới");
        }
    }

    void createFile(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("Tồn tại file này");
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Lỗi tạo file: " + e.toString());
            }
            System.out.println("Không tồn tại file này, đã tạo mới");
        }
    }
}
