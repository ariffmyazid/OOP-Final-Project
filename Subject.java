public class Subject {

    //ATTRIBUTES
    private String subjectName;
    private String date;
    private String time;
    private String venue;
    private Post review;

    //CONSTRUCTORS
    public Subject() {
        review = new Post();
    }

    //METHODS
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getVenue() {
        return venue;
    }

    public void setReview(String title, String review) {
        this.review.setType("Review");
        this.review.setTitle(title);
        this.review.setDescription(review);
    }

    public Post getReview() {
        return review;
    }
}
