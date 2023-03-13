public class CoqBatch {

    //ATTRIBUTES
    private Club[] clubs;
    private Event[] events;
    private int clubCount;
    private int eventCount;

    //CONSTRUCTORS
    public CoqBatch(int choice) {
        switch (choice) {
            case 0:
                clubs = new Club[100];
                clubCount = 0;
                break;

            case 1:
                events = new Event[100];
                eventCount = 0;
                break;
        }
    }

    //METHODS

    //methods for club batch
    public int getClubCount() {
        return clubCount;
    }

    public int findClub(String clubName) {
        for (int i = 0; i < clubCount; i++) {
            if (clubs[i].getClubName() == clubName) {
                return i;
            }
        }

        return -1;
    }

    public void addClub(Club newClub) throws Exception {
        if (clubCount == clubs.length) {
            throw new Exception("Club batch limit exceeded.");
        }

        else {
            clubs[clubCount++] = newClub;
        }
    }

    public void removeClub(String clubName) throws Exception {
        int i = findClub(clubName);

        if (i < 0) {
            throw new Exception("Unfound club cannot be removed.");
        }

        else {
            for (int j =  0; j < clubCount; j++) {
                if (j + 1 < clubs.length) {
                    clubs[j] = clubs[j + 1];
                }
            }

            clubCount--;
        }
    }

    public String clubsToString() {
        String sr = "";

        for (int i = 0; i < clubCount; i++) {
            sr += clubs[i].getClubName() + "\n";
        }

        return sr;
    }

    //methods for event batch
    public int getEventCount() {
        return eventCount;
    }

    public int findEvent(String eventName) {
        for (int i = 0; i < eventCount; i++) {
            if (events[i].getEventName() == eventName) {
                return i;
            }
        }

        return -1;
    }

    public void addEvent(Event newEvent) throws Exception {
        if (eventCount == events.length) {
            throw new Exception("Event batch limit exceeded.");
        }

        else {
            events[eventCount++] = newEvent;
        }
    }

    public void removeEvent(String eventName) throws Exception {
        int i = findEvent(eventName);

        if (i < 0) {
            throw new Exception("Unfound event cannot be removed.");
        }

        else {
            for (int j =  0; j < eventCount; j++) {
                if (j + 1 < events.length) {
                    events[j] = events[j + 1];
                }
            }

            eventCount--;
        }
    }

    public String eventsToString() {
        String sr = "";

        for (int i = 0; i < eventCount; i++) {
            sr += events[i].getEventName() + "\n";
        }

        return sr;
    }
}
