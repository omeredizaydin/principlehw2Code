/**
 * This class helps to store KW Library Information as a Object.
 *
 * @author dsahu1
 *
 */
public class LibraryDetails {
    private Long libraryID;
    private String name;
    private String address;
    private Boolean isActive;
    private String ownerName;
    private Boolean isPublicLibrary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Boolean getIsActive() {
        return isActive;
    }
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public Boolean getIsPublicLibrary() {
        return isPublicLibrary;
    }
    public void setIsPublicLibrary(Boolean isPublicLibrary) {
        this.isPublicLibrary = isPublicLibrary;
    }
    public Long getLibraryID() {
        return libraryID;
    }
    public void setLibraryID(Long libraryID) {
        this.libraryID = libraryID;
    }
}
