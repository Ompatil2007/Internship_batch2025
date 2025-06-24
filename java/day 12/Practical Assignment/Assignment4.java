interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing document...");
    }
}

class Photo implements Printable {
    public void print() {
        System.out.println("Printing photo...");
    }
}
class Assignment4{
    public static void main(String[] args) {
        Document d=new Document();
        d.print();
        Photo p=new Photo();
        p.print();
    }
}