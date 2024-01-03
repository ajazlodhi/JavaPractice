public class EnhancedSwitchFour {
    public static void main(String[] args) {
        String username = "Steve";
        String password = getPassword(username);
        System.out.println("Password for " + username + "is :" + password);

    }
    public static String getPassword(String username){
        String password;
        password = switch (username) {
            case "Alan" -> "A123";
            case "John" -> "J520";
            case "Steve" -> "S999";
            default -> {
                password = "Invalid User Name";
                yield password;
            }
        };
        return password;

    }
}

