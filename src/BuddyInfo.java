public class BuddyInfo {

    private String name;
    private int age;

    public BuddyInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public BuddyInfo() {

        this.name = "Homer";
        this.age = 18;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }



    public static void main(String[] args) {

        BuddyInfo Homer = new BuddyInfo();
        BuddyInfo Mary = new BuddyInfo("Mary",18);
        System.out.println("Hello World");
        System.out.println(Homer.getName());
        BuddyInfo buddy = new BuddyInfo("Tom",22);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        addressBook.addBuddy(Mary);
        addressBook.removeBuddy(Mary);
    }
}
