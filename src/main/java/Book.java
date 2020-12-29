import java.util.Map;

public interface Book {

    public Boolean addBook(BookDetails bookDetails, Map<Long, BookDetails> BookMap);


    public Boolean deleteBook(Long bookID,Map<Long, BookDetails> BookMap);


    public BookDetails updateBook(BookDetails bookDetails, Map<Long, BookDetails> BookMap);


    public void displayAvailableBookInfo(Map<Long, BookDetails> BookMap);


    public void displayIssuedBookInfo(Map<Long, BookDetails> BookMap);
}
