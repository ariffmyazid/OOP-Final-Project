public class User {

    //ATTRIBUTES
    private Name name;
    private String ID;
    private String email;
    private String username;
    private UserBatch friends;
    private Club club;
    private CoqBatch events;
    private String similarities;

    //CONSTRUCTORS
    public User(String fname, String mname, String lname, String ID) {
        name = new Name();
        name.setFname(fname);
        name.setMname(mname);
        name.setLname(lname);
        this.ID = ID;
        friends = new UserBatch(100);
        events = new CoqBatch(1);
    }

    //METHODS
    public void setName(String fname, String mname, String lname) {
        name.setFname(fname);
        name.setMname(mname);
        name.setLname(lname);
    }

    public Name getName() {
        return name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public UserBatch getFriends() {
        return friends;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Club getClub() {
        return club;
    }

    public CoqBatch getEvents() {
        return events;
    }

    public void setSimilarities(String similarities) {
        this.similarities = similarities;
    }

    public String getSimilarities() {
        return similarities;
    }
}
