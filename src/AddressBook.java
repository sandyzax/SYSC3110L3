import java.util.ArrayList;

public class AddressBook {

    ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy() {

        buddies.add(new BuddyInfo());
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);

    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}