package huncam.middleware;

public class SessionManager {

    private static int userId;
    private static String username;
    private static String role;

    public static void login(int id, String user, String userRole) {
        userId = id;
        username = user;
        role = userRole;
    }

    public static void logout() {
        userId = 0;
        username = null;
        role = null;
    }

    public static int getUserId() {
        return userId;
    }

    public static boolean isLoggedIn() {
        return username != null;
    }

    public static String getUsername() {
        return username;
    }

    public static String getRole() {
        return role;
    }

}
