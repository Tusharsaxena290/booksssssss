import java.util.Scanner;
public class BOOKSSS {
    private String bookname;
    private String authorname;
    private long ISBN;

    public String getBookname() {
        return bookname;
    }

    public String getAuthorname() {
        return authorname;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }
    public void Books(String Bookname, String Authorname, long ISBN){
        this.bookname=Bookname;
        this.authorname=Authorname;
        this.ISBN=ISBN;
    }
    @Override
    public String toString(){
        return
                ("Book Name:" + bookname + "\nAuthor Name:" + authorname +"\nISBN:" +ISBN);
    }


}

class Test{
    public static void main(String[] args) {
        System.out.println("enter the number of books");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        String bookname[]=new String[n];
        String authorname[]=new String[n];
        long ISBN[]=new long[n];
        scanner.nextLine();
        if(n==0){
            System.out.println("N/A");
        }
        else{
            for(int i=0 ; i<n; i++){
                bookname[i]=scanner.nextLine();
                authorname[i]=scanner.nextLine();
                ISBN[i]=scanner.nextLong();
                scanner.nextLine();


            }
        }
        for (int j=0;j<n;j++){
            System.out.println("--------------------------------");
            System.out.println("Book Name:" +bookname[j]  + "\nAuthor name:" +authorname[j] +"\nISBN:" +ISBN[j] );
            System.out.println("--------------------------------");
        }

    }
}

