public class Guide {
    private int Service_number;
    private int Phone;
    private static String Name;
    private int Experience;

    public Guide(int service_number, int phone, String name, int experience) {
        Service_number = service_number;
        Phone = phone;
        Name = name;
        Experience = experience;
    }

    public int getService_number() {
        return Service_number;
    }

    public int getPhone() {
        return Phone;
    }

    public static String getName() {
        return Name;
    }

    public int getExperience() {
        return Experience;
    }

    @Override
    public String toString() {
        return String.format("Service_number: %d; Phone: %d; Name: %s; Experience: %s\n"
                , Service_number, Phone, Name, Experience);
    }
}
