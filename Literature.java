import java.util.Scanner;
class Publisher {

    Scanner reader=new Scanner(System.in);
    String name;
    public Publisher(){
        name=" ";
    }
    public void read(){
        System.out.print("Enter the Publisher: ");
        name=reader.next();
    }
}
class Book extends Publisher {
    String auth,bkname;
    

    public Book() {
        bkname = " ";
        auth = " ";
    }

    public void bkread() {
        System.out.print("Enter the Author: ");
        auth = reader.next();
        System.out.print("Enter the Book Name: ");
        bkname = reader.next();

    }
}
class Fiction extends Book{
    String fic;
    public Fiction(){
        fic=" ";
    }
    void ficread(){
        System.out.print("Fiction or Non Fiction: ");
        fic=reader.next();
    }
}
class Literature extends Book {
    String lit;

    public Literature() {
        lit = " ";
    }

    void litread() {
        System.out.print("Type of Literature: ");
        lit = reader.next();
    }

    public static void main(String[] args) {
        Literature i = new Literature();
        Fiction f=new Fiction();
        i.read();
        i.bkread();
        f.ficread();
        i.litread();
        System.out.println("\nBOOK DETAILS: ");
        System.out.println("==============");
        System.out.println("Publisher Name: " + i.name);
        System.out.println("Author: " + i.auth);
        System.out.println("Book Name: " + i.bkname);
        System.out.println("Fiction or non-fiction: " + f.fic);
        System.out.println("Literature type: " + i.lit);

    }
}
