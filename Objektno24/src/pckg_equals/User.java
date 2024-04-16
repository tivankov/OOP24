package pckg_equals;

public class User {

    private String userName;
    private int id;
    private static int cntID = 30;

    public User(String userName) {
        this.userName = userName;
        this.id = cntID++;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                '}';
    }

    public void showHashCodeHex(){
        System.out.println(getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode()));
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public boolean equals(Object oth){
        User other = (User) oth;
        return this.getUserName().length() == other.getUserName().length();
    }
}
