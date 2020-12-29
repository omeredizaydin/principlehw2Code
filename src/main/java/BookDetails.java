
public class BookDetails {
    private Long bookID;
    private Boolean issued;
    private String title;
    private String author;
    private String publisher;
    private int totalPage;
    private Long libraryID;
    public Long getBookID() {
        return bookID;
    }
    public void setBookID(Long bookID) {
        this.bookID = bookID;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getTotalPage() {
        return totalPage;
    }
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
    public Long getLibraryID() {
        return libraryID;
    }
    public void setLibraryID(Long libraryID) {
        this.libraryID = libraryID;
    }
    public Boolean getIssued() {
        return issued;
    }
    public void setIssued(Boolean issued) {
        this.issued = issued;
    }

}
