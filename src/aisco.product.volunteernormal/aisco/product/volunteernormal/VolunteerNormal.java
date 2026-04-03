package aisco.product.volunteernormal;

import aisco.volunteer.core.Volunteer;
import aisco.volunteer.core.VolunteerImpl;

public class VolunteerNormal {
    public static void main(String[] args) {
        System.out.println("=== Product: Volunteer Tanpa Medis ===");

        VolunteerImpl vol = new VolunteerImpl();

        vol.addVolunteer(new VolunteerImpl("Budi", "budi@mail.com", "+62812 0001"));
        vol.addVolunteer(new VolunteerImpl("Sari", "sari@mail.com", "+62812 0002"));
        vol.addVolunteer(new VolunteerImpl("Rudi", "rudi@mail.com", "+62812 0003"));

        System.out.println(vol.getVolunteer());
    }
}