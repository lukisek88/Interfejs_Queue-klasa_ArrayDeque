import java.util.*;


class Books{
    private String title;
    private String author;
    private int date;

    public Books(String author,String title,int date){
        this.author=author;
        this.title=title;
        this.date=date;

    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getDate(){
        return date;
    }
    @Override
    public String toString(){
        return "Autor: "+getAuthor()+" "+" Tytul: \""+getTitle()+"\" "+" Data: "+getDate();

    }

}
class HashBook{

    public void getBooks(){


        Books b1 = new Books("Kathy Sierra","Rusz Głowa Java",2011);
        Books b2 = new Books("Robert C. Martin","Czysty Kod",2009);
        Books b3 = new Books("Adam Mickiewicz","Pan Tadeusz",1834);
        Books b4 = new Books("Henryk Sienkiewicz","Potop",1886);
        Books b5 = new Books("Henryk Sienkiewicz","Ogniem i Mieczem",1884);

        Deque<Books> booksSet = new ArrayDeque<>();


        booksSet.offer(b1);
        booksSet.offer(b2);
        booksSet.offer(b3);
        booksSet.offer(b4);
        booksSet.offer(b5);

        System.out.println("1st check que: "+booksSet.size());


        Books tempbook = null;
        while(!booksSet.isEmpty()) {
            tempbook= booksSet.poll();

        }



        System.out.println("2nd check que: "+booksSet.size());
        System.out.println("Last Element: "+tempbook);




    }
}

public class Kodilla {
    public static void main (String[] args) {
        HashBook hashbook = new HashBook();
        hashbook.getBooks();
    }
}