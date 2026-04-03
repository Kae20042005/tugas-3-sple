package aisco.volunteer.core;

public abstract class VolunteerComponent implements Volunteer {

    protected String name;
    protected String email;
    protected String phone;

    public VolunteerComponent() {}

    public VolunteerComponent(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName()  { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }

    public abstract String getVolunteer();
    public abstract void printHeader();
    public abstract void addVolunteer(Object volunteer);

    public String toString() {
        return "- " + name + " | " + email + " | " + phone + "\n";
    }
}