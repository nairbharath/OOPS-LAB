import java.util.*;

class Publisher
{
    String publisherName;
    Publisher(String pName)
    {
        this.publisherName=pName;
    }
    void display()
    {
        System.out.println("Publisher Name: "+this.publisherName);
    }

}

class Book extends Publisher{
    String bookName;
    Book(String pName, String bName)
    {
        super(pName);
        this.bookName=bName;
    }
    void display()
    {
        super.display();
        System.out.println("BookName: "+this.bookName);
    }
}

class Literature extends Book{
    String Literature;

    Literature(String pName, String bName, String lName)
    {
        super(pName,bName);
        this.Literature=lName;
    }
    void display()
    {
        super.display();
        System.out.println("Literature: "+this.Literature);
    }
}

class Fiction extends Book{
    String Fiction;
    Fiction(String pName, String bName, String fName)
    {
        super(pName,bName);
        this.Fiction=fName;
    }
    void display()
    {
        super.display();
        System.out.println("Fiction: "+this.Fiction);
    }
}

class InheritenceBooks
{
    public static void main(String[] args) {
        Literature lObj[]=new Literature[2];
        Fiction fObj[]=new Fiction[2];
        lObj[0]=new Literature("McGraw-Hill", "A bee movie", "Lit");
        fObj[0]=new Fiction("Jain", "Ice age", "fiction");
        lObj[0].display();
        fObj[0].display();
    }
}