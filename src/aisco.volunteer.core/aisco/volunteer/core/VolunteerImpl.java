package aisco.volunteer.core;

import java.util.ArrayList;
import java.util.List;

public class VolunteerImpl extends VolunteerComponent {

    List<Object> volunteerList;

    public VolunteerImpl() {
        volunteerList = new ArrayList<>();
    }

    public VolunteerImpl(String name, String email, String phone) {
        super(name, email, phone);
    }

    @Override
    public void printHeader() {
        System.out.println("=== Daftar Volunteer ===");
    }

    @Override
    public String getVolunteer() {
        printHeader();
        StringBuilder sb = new StringBuilder();
        for (Object v : volunteerList) {
            sb.append(v.toString());
        }
        return sb.toString();
    }

    @Override
    public void addVolunteer() {
        volunteerList.add(new VolunteerImpl("Budi", "budi@mail.com", "+62812 0001"));
        volunteerList.add(new VolunteerImpl("Sari", "sari@mail.com", "+62812 0002"));
        volunteerList.add(new VolunteerImpl("Rudi", "rudi@mail.com", "+62812 0003"));
    }

    public String toString() {
        return "- " + name + " | " + email + " | " + phone + "\n";
    }
}