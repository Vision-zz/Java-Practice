package LoginSystem;

import java.util.HashMap;

public final class Database {
    private final HashMap<String, UserAccount> database = new HashMap<String, UserAccount>();

    private Database() {
    }

    private static Database databaseInstance = null;

    public static final Database getInstance() {
        if (databaseInstance == null)
            databaseInstance = new Database();
        return databaseInstance;
    }

    public boolean checkIfUserExist(String username) {
        return database.containsKey(username);
    }

    public UserAccount getUser(String username) {
        if (!checkIfUserExist(username))
            return null;
        return database.get(username);
    }

    public boolean checkLoginCredentials(String username, String password) {
        if (!checkIfUserExist(username))
            return false;

        UserAccount user = database.get(username);
        return user.getPassword().equals(password);
    }

    public boolean checkIfAdmin(String username) {
        if (!checkIfUserExist(username))
            return false;
        return database.get(username).isAdmin;
    }

}
