public class UserBatch {

    //ATTRIBUTES
    private User[] users;
    private int count;

    //CONSTRUCTORS
    public UserBatch(int maxsz) {
        users = new User[maxsz];
        count = 0;
    }

    //METHODS
    public int getCount() {
        return count;
    }

    public int findUser(String ID) {
        for (int i = 0; i < count; i++) {
            if (users[i].getID() == ID) {
                return i;
            }
        }

        return -1;
    }

    public void addUser(User newUser) throws Exception {
        if (count == users.length) {
            throw new Exception("User batch limit exceeded.");
        }

        else {
            users[count++] = newUser;
        }
    }

    public void removeUser(String ID) throws Exception {
        int i = findUser(ID);

        if (i < 0) {
            throw new Exception("Unfound user cannot be removed.");
        }

        else {
            for (int j =  0; j < count; j++) {
                if (j + 1 < users.length) {
                    users[j] = users[j + 1];
                }
            }

            count--;
        }
    }

    public String toString() {
        String sr = "";

        for (int i = 0; i < count; i++) {
            sr += users[i].getName().getFullName() + "\n";
        }

        return sr;
    }

    public static void main(String args[]) {
        UserBatch ub = new UserBatch(100);
        try {
            ub.addUser(new User("Ali", "Bin" , "Abu", "22000399"));
            ub.addUser(new User("Basrah", "Al" , "Amin", "21000077"));
            ub.addUser(new User("Casey", "\b" , "Neistat", "20000851"));
            System.out.println("Users: \n" + ub.toString() + "\n");

            ub.removeUser("22000399");
            System.out.println("Users: \n" + ub.toString() + "\n");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
