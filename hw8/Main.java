public class Main{
    public static int defineLevel(String role) {
        int level;
        switch (role){
            case "guest": level = 0;
                break;
            case "customer": level = 1;
                break;
            case "regular customer": level = 2;
                break;
            case "employee": level = 3;
                break;
            case "assistant": level = 4;
                break;
            case "admin": level = 5;
                break;
            default: throw new IllegalArgumentException("Non-Authentic role");
        }
        return level;
    }
}

