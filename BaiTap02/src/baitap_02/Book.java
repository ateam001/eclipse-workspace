/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_02;

import java.util.Scanner;

/**
 *
 * @author Diep.Tran
 */
public class Book {
    String bookName;
    String createdAt;
    String nickname;

    public Book() {
    }

    public Book(String bookName, String createdAt, String nickname) {
        this.bookName = bookName;
        this.createdAt = createdAt;
        this.nickname = nickname;
    }
    
    public void input() {
        System.out.println("--------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten sach : ");
        bookName = input.nextLine();
        
        System.out.println("Ngay xuat ban : ");
        createdAt = input.nextLine();
        
        System.out.println("Nhap but danh : ");
        nickname = input.nextLine();
    }
    
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", createdAt=" + createdAt + ", nickname=" + nickname + '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    
}
