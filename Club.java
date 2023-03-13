public class Club {

    //ATTRIBUTES
    private String clubName;
    private UserBatch members;

    //CONSTRUCTORS
    public Club(String clubName, int maxsz) {
        this.clubName = clubName;
        members = new UserBatch(maxsz);
    }

    //METHODS
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubName() {
        return clubName;
    }

    public UserBatch getMembers() {
        return members;
    }
}
