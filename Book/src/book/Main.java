/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diep.Tran
 */
public class Main {
    public static void main(String[] args) {
        int choose, n;
        //quan ly danh sach tac gia
        ArrayList<Author> authorList = new ArrayList<>();
        
        //quan ly danh sach quan sach
        ArrayList<Book> bookList = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        
        do {
            showMenu();
            choose = Integer.parseInt(input.nextLine());
            
            switch(choose) {
                case 1:
                    System.out.println("Nhap so sach can them : ");
                    n = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < n; i++) {
                        Book book = new Book();
                        book.input();
                        boolean isFind = false;
                        for (int j = 0; j < authorList.size(); j++) {
                            if(authorList.get(j).getNickname().equalsIgnoreCase(book.getNickname())) {
                                isFind = true;
                                break;
                            }
                        }
                        if(!isFind) {
                            Author author = new Author(book.getNickname());
                            author.input();
                            
                            //luu thong tin tac gia
                            authorList.add(author);
                        }
                        
                        //luu doi tuong book vao mang bookList
                        bookList.add(book);
                    }
                    break;
                case 2:
                    for (Book book : bookList) {
                        book.display();
                    }
                    break;
                case 3:
                    //nhap thong tin tac gia
                    System.out.println("Nhap so tac gia can them : ");
                    n = Integer.parseInt(input.nextLine());
                    
                    for (int i = 0; i < n; i++) {
                        Author author = new Author();
                        author.input(authorList);
                        
                        //luu doi tuong autho vao mang authorList
                        authorList.add(author);
                    }
                    break;
                case 4:
                    System.out.println("Nhap ten but danh can tim kiem : ");
                    String nickname = input.nextLine();
                    
                    for (int i = 0; i < bookList.size(); i++) {
                        if(bookList.get(i).getNickname().equalsIgnoreCase(nickname)) {
                            bookList.get(i).display();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!!!");
                    break;
                default:
                    System.err.println("Nhap sai!!!");
                    break;
            }
        } while(choose != 5);
    }
    
    static void showMenu() {
        System.out.println("1. Nhap thong tin sach");
        System.out.println("2. Hien thi tat ca sach ra man hinh");
        System.out.println("3. Nhap thong tin tac gia");
        System.out.println("4. Tim kiem sach theo but danh");
        System.out.println("5. Thoat");
    }
}
