package patikaDev.Java102.CollectionMapInterface.Odev1;

public class Book {

    private String name;
    private int pageNum;
    private String author;
    private int publishDate;

    public Book(String name, int pageNum, String author, int publishDate) {
        this.name = name;
        this.pageNum = pageNum;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishDate() {
        return publishDate;
    }
}
