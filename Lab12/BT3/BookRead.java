package Lab12.BT3;

import java.io.*;
import java.util.ArrayList;

public class BookRead {
    private ArrayList<Book> booksFile = new ArrayList<>();

    public void readFromFile() {
        try {
            FileReader fr = new FileReader("book.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" - ");
                if (parts.length == 5) {
                    String isbn = parts[0];
                    String name = parts[1];
                    String author = parts[2];
                    String publisher = parts[3];
                    float price = Float.parseFloat(parts[4]);

                    Book b = new Book(isbn, name, author, publisher, price);
                    booksFile.add(b);
                }
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayBook() {
        System.out.println("\n--- DANH SÁCH SÁCH ĐÃ ĐỌC ---");
        for (Book b : booksFile) {
            System.out.println(b.toString());
        }
    }

    public void searchBook(String nameSearch) {
        boolean found = false;
        for (Book b : booksFile) {
            if (b.getBookName().toLowerCase().contains(nameSearch.toLowerCase())) {
                System.out.println(b.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sách");
        }
    }

    public static void main(String[] args) throws IOException {
        BookRead reader = new BookRead();
        reader.readFromFile();
        reader.displayBook();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nNhập tên sách cần tìm: ");
        String search = br.readLine();
        reader.searchBook(search);
    }
}
