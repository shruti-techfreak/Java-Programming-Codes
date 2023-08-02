package com.company;

class Library{
    String [] avlBooks= new String[10];
    //String [] avlBooks= {"The Alchemist", "Who Says You Can't", "Ikigai", "Asura"};
    String [] issuedBooks= new String[5];

    public Library(){
        avlBooks[0]= "The Alchemist";
        avlBooks[1]= "Who Says You Can't";
        avlBooks[2]= "Ikigai";
        avlBooks[3]= "Asura";

    }
    public void addBook(String add){
        System.out.println();
        for(int i= 0; i< avlBooks.length; i++){
            if (avlBooks[i]== null) {
                System.out.println(add+ " Book added successfully");
                avlBooks[i] = add;
                break;
            }
        }
        showAvailableBooks();

        /*
        int n= avlBooks.length;
        String newArr[]= new String[n+1];
        for(int i = 0; i<n; i++) {
            newArr[i] = avlBooks[i];
        }
        newArr[n] = add;

        System.out.println(add + " Book added");
        System.out.println(newArr[n]);


         */
    }

    public void issueBook(String s) {
        System.out.println();
        for(int i= 0; i<4; i++){
            if (s == avlBooks[i]) {
                System.out.println("Book issued");
                issuedBooks[0] = s;
                avlBooks[i]= null;
                break;
            }
        }
        if (issuedBooks[0] == null){
            System.out.println("Not issued! Enter correct book");
        }
        else{
            System.out.println("The issued Book is: " + issuedBooks[0]);
            showAvailableBooks();
        }

    }

    public void returnBook(String ret){  // in this first check the ret book is there or not in issued book then if it's there remove from issuedBooks[]  and add into avlBooks
        System.out.println();
        for(int i= 0; i< avlBooks.length; i++){
            if (avlBooks[i]== null) {
                System.out.println(ret+ " Book returned successfully");
                avlBooks[i] = ret;
                issuedBooks[0]= null;
                break;
            }
        }
        showAvailableBooks();
        System.out.println("Issued books: " + issuedBooks[0]);
    }

    public void showAvailableBooks(){
        System.out.println("\nThe available books are: ");
        for (String ab: avlBooks) {
            if (ab== null){
                continue;    //not writing 'break' bcoz if there is any null in between further books will not get displayed
            }
            System.out.println(ab);
        }
    }
}

public class Online_Library {
    public static void main(String[] args) {
        Library lb= new Library();
        System.out.println("Welcome to the Library!\n");

        lb.showAvailableBooks();
        lb.issueBook("Ikigai");
        lb.addBook("Hello");
        lb.returnBook("Ikigai");
        lb.addBook("Shruti");
    }
}
