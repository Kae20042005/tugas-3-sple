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
    public void addVolunteer(Object volunteer) {
        volunteerList.add(volunteer);
    }

    public String toString() {
        return "- " + name + " | " + email + " | " + phone + "\n";
    }
}