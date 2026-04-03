package aisco.product.volunteernormal;

import aisco.volunteer.core.Volunteer;
import aisco.volunteer.core.VolunteerImpl;

public class VolunteerNormal {
    public static void main(String[] args) {
        System.out.println("=== Product: Volunteer Tanpa Medis ===");

        VolunteerImpl vol = new VolunteerImpl();
        vol.addVolunteer();
        System.out.println(vol.getVolunteer());
    }
}