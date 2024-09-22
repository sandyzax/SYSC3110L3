import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {

        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);

    }

    public void printAddressBook() {
        if (buddies.isEmpty()) {
            System.out.println("The address book is empty.");
        } else {
            System.out.println("Address Book Contents:");
            for (BuddyInfo buddy : buddies) {
                System.out.println(buddy);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom",22);
        BuddyInfo buddy2 = new BuddyInfo("john",21);
        BuddyInfo buddy3 = new BuddyInfo("sue",12);
        AddressBook ab = new AddressBook();
        ab.addBuddy(buddy);
        ab.addBuddy(buddy2);
        ab.addBuddy(buddy3);
        ab.removeBuddy(buddy);
        //ab.printAddressBook();

        //ab.removeBuddy(buddy2);
        //System.out.println(buddy2.getName());
        //ab.removeBuddy(buddy3);
        //System.out.println(buddy3.getName());


    }
}