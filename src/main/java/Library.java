
import java.util.Map;

public interface Library {

    public void addLibrary(LibraryDetails libraryDetails, Map<Long, LibraryDetails> map);

    public void searchLibrary(String Name, Map<Long, LibraryDetails> map);

    public void updateLibrary(LibraryDetails libraryDetails, Map<Long, LibraryDetails> map);

    public void displayLibraryInfo(Map<Long, LibraryDetails> LibraryMap);

}
