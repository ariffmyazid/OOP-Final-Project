public class Event {
    //ATTRIBUTES
    private String eventName;
    private UserBatch members;

    //CONSTRUCTORS
    public Event(String eventName, int maxsz) {
        this.eventName = eventName;
        members = new UserBatch(maxsz);
    }

    //METHODS
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public UserBatch getMembers() {
        return members;
    }
}
