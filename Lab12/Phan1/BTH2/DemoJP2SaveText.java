package Lab12.Phan1.BTH2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoJP2SaveText {
    public DemoJP2SaveText() {
    }

    public void writeText2File(List<NhanVien> lstData) throws IOException {
        String filePath = "writeText2File.txt";
        boolean isVietTiep = false;
        File myFile = new File(filePath);
        FileOutputStream fos = new FileOutputStream(myFile, isVietTiep);
        OutputStreamWriter osw = new OutputStreamWriter(fos);

        for (NhanVien nhanVien : lstData) {
            osw.write(nhanVien.toString());
        }
        osw.flush();
        osw.close();
    }

    public void writeTextByLine(List<NhanVien> lstData) throws FileNotFoundException, IOException {
        String filePath = "writeTextByLine.txt";
        boolean isVietTiep = true;
        File myfile = new File(filePath);
        FileOutputStream fos = new FileOutputStream(myfile, isVietTiep);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        for (NhanVien nhanVien : lstData) {
            bw.write(nhanVien.toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public void readTextByLine() throws FileNotFoundException, IOException {
        String filePath = "writeTextByLine.txt";
        File myfile = new File(filePath);
        FileInputStream fos = new FileInputStream(myfile);
        BufferedReader br = new BufferedReader(new InputStreamReader(fos));
        String temp;
        int cnt = 1;
        while ((temp = br.readLine()) != null) {
            System.out.println(cnt + ".\t" + temp);
            cnt++;
        }
    }

    public static void main(String[] args) {
        try {
            DemoJP2SaveText demoJP2SaveText = new DemoJP2SaveText();

            List<NhanVien> lstNhanVien = new ArrayList<>();
            NhanVien nv1 = new NhanVien("Nguyen Van A", 18, "HN");
            NhanVien nv2 = new NhanVien("Elly Truong", 18, "HCM");
            NhanVien nv3 = new NhanVien("Ngoc Trinh", 18, "DN");

            lstNhanVien.add(nv1);
            lstNhanVien.add(nv2);
            lstNhanVien.add(nv3);

            demoJP2SaveText.writeTextByLine(lstNhanVien);
            demoJP2SaveText.readTextByLine();
            demoJP2SaveText.writeText2File(lstNhanVien);

            System.out.println("Ghi dữ liệu thành công");
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.toString());
            Logger.getLogger(DemoJP2SaveText.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
