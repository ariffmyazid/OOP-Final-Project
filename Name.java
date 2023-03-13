public class Name {

    //ATTRIBUTES
    private String fname;
    private String mname;
    private String lname;

    //CONSTRUCTORS
    public Name() {

    }

    //METHODS
    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFname() {
        return fname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMname() {
        return mname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLname() {
        return lname;
    }

    public String getFullName() {
        String sr = "";
        sr = fname + " " + mname + " " + lname;

        return sr;
    }
}
