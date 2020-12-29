
import java.util.Map;
import java.util.Map.Entry;


public class LibraryImpl implements Library {



    @Override
    public void displayLibraryInfo(Map<Long, LibraryDetails> LibraryMap) {

        java.util.Iterator<Entry<Long, LibraryDetails>> itr = LibraryMap.entrySet().iterator();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("******* Library Information *******").append(Constants.LINECHANGE);
        while(itr.hasNext()){
            Entry<Long, LibraryDetails> entry = itr.next();
            LibraryDetails libraryDetails = entry.getValue();
            stringBuilder.append(entry.getKey()).append(Constants.TABSPACE).append(libraryDetails.getName()).append(Constants.TABSPACE).append(libraryDetails.getAddress()).append(Constants.LINECHANGE);
        }
        System.out.println(stringBuilder);
    }

    @Override
    public void addLibrary(LibraryDetails libraryDetails,
                           Map<Long, LibraryDetails> map) {

        map.put(libraryDetails.getLibraryID(), libraryDetails);

        //return Boolean.TRUE.booleanValue();

    }

    @Override
    public void searchLibrary(String Name, Map<Long, LibraryDetails> map) {
        // TODO Auto-generated method stub

    }

    @Override
    public void updateLibrary(LibraryDetails libraryDetails,
                              Map<Long, LibraryDetails> map) {
        // TODO Auto-generated method stub

    }

}
