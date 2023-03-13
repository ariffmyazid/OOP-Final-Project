public class Feed {
    //ATTRIBUTES
    private Post[] feed;
    private int count;

    //CONSTRUCTORS
    public Feed() {
        feed = new Post[1000];
        count = 0;
    }

    //METHODS
    public int getCount() {
        return count;
    }

    public int findPost(String title) {
        for (int i = 0; i < count; i++) {
            if (feed[i].getTitle() == title) {
                return i;
            }
        }

        return -1;
    }

    public void addPost(Post newPost) throws Exception {
        if (count == feed.length) {
            throw new Exception("Post limit exceeded.");
        }

        else {
            feed[count++] = newPost;
        }
    }

    public void removePost(String title) throws Exception {
        int i = findPost(title);

        if (i < 0) {
            throw new Exception("Unfound post cannot be removed.");
        }

        else {
            for (int j =  0; j < count; j++) {
                if (j + 1 < feed.length) {
                    feed[j] = feed[j + 1];
                }
            }

            count--;
        }
    }

    public String toString() {
        String sr = "";

        for (int i = 0; i < count; i++) {
            sr += feed[i].getTitle() + "\n";
        }

        return sr;
    }
}
