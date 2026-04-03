package aisco.product.volunteermedis;

import aisco.volunteer.core.Volunteer;

public class VolunteerMedis {
    public static void main(String[] args) {
        System.out.println("=== Product: Volunteer Dengan Medis ===");

        aisco.volunteer.core.VolunteerImpl coreVol = new aisco.volunteer.core.VolunteerImpl();

        coreVol.addVolunteer(new aisco.volunteer.medis.VolunteerImpl(
            new aisco.volunteer.core.VolunteerImpl("Budi", "budi@mail.com", "+62812 0001"),
            "Dokter Umum", "STR-12345", "CPR, First Aid"
        ));
        coreVol.addVolunteer(new aisco.volunteer.medis.VolunteerImpl(
            new aisco.volunteer.core.VolunteerImpl("Sari", "sari@mail.com", "+62812 0002"),
            "Perawat", "STR-67890", "First Aid, Trauma Care"
        ));
        coreVol.addVolunteer(new aisco.volunteer.medis.VolunteerImpl(
            new aisco.volunteer.core.VolunteerImpl("Rudi", "rudi@mail.com", "+62812 0003"),
            "Paramedis", "STR-11111", "CPR, Trauma Care"
        ));

        aisco.volunteer.medis.VolunteerImpl medisVol = new aisco.volunteer.medis.VolunteerImpl(
            coreVol, "Dokter Umum", "STR-12345", "CPR, First Aid"
        );

        System.out.println(medisVol.getVolunteer());
    }
}
