package Lab11.Phan2.BTH1;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<String> lstSinhVien = new ArrayList<>();

    public void testList() {
        lstSinhVien.add("Tuấn");
        lstSinhVien.add("Hà");
        lstSinhVien.add("Linh");
        System.out.println("ArrayList Student");
        System.out.println("\t" + lstSinhVien + "\n");
    }

    public void updateList() {
        lstSinhVien.set(1, "Hồng Hà");
        System.out.println("Update ArrayList Student");
        System.out.println("\t" + lstSinhVien + "\n");
    }

    public void deleteList() {
        lstSinhVien.remove(0);
        System.out.println("Delete ArrayList Student");
        System.out.println("\t" + lstSinhVien + "\n");
    }

    public static void main(String[] args) {
        StudentManager st = new StudentManager();
        st.testList();
        st.updateList();
        st.deleteList();
    }
}
