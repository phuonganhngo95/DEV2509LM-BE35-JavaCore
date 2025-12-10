package Lab12.BT3;

import java.io.*;
import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> listBooks = new ArrayList<>();

    public void inputBook() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhập số lượng sách: ");
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Book " + (i+1));
            System.out.print("Nhập isbn: ");
            String isbn = br.readLine();
            System.out.print("Nhập book name: ");
            String name = br.readLine();
            System.out.print("Nhập author: ");
            String author = br.readLine();
            System.out.print("Nhập publisher: ");
            String publisher = br.readLine();
            System.out.print("Nhập price: ");
            float price = Float.parseFloat(br.readLine());

            Book b = new Book(isbn, name, author, publisher, price);
            listBooks.add(b);
        }
    }

    public void saveToFile() {
        try {
            FileWriter fw = new FileWriter("book.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for (Book b : listBooks) {
                String line = b.getIsbn() + " - " + b.getBookName() + " - " + b.getAuthor() + " - " + b.getPublisher() + " - " + b.getPrice();
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            fw.close();
            System.out.println("Ghi dữ liệu thành công");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        BookManager manager = new BookManager();
        manager.inputBook();
        manager.saveToFile();
    }
}
