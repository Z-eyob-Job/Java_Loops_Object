class Reel {
    public String user;
    public int lengthInSeconds;
    public boolean isPublished;
}

public class Loops {
    public static void main(String[] args) {
        int i = 10;
        while (i <= 20) {
            System.out.println("This is a While loop: " + i);
            i++;
        }

        int j = 10;
        do {
            System.out.println("This a Do-while loop: " + j);
            j++;
        } while (j <= 20);

        Reel Person1 = new Reel();
        Person1.user = "User_001";
        Person1.lengthInSeconds = 60;
        Person1.isPublished = false;

        Reel Person2 = new Reel();
        Person2.user = "User_002";
        Person2.lengthInSeconds = 45;
        Person2.isPublished = true;

        System.out.println("\n## Person 1:");
        System.out.println("User: " + Person1.user);
        System.out.println("Length: " + Person1.lengthInSeconds + " seconds");
        System.out.println("Published: " + Person1.isPublished);

        System.out.println("\n## Person2:");
        System.out.println("User: " + Person2.user);
        System.out.println("Length: " + Person2.lengthInSeconds + " seconds");
        System.out.println("Published: " + Person2.isPublished);
    }
}
