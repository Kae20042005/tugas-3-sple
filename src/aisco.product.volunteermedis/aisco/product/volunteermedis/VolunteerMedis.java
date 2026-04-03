package aisco.product.volunteermedis;

import aisco.volunteer.core.Volunteer;

public class VolunteerMedis {
    public static void main(String[] args) {
        System.out.println("=== Product: Volunteer Dengan Medis ===");

        aisco.volunteer.core.VolunteerImpl coreVol = new aisco.volunteer.core.VolunteerImpl();
        coreVol.addVolunteer();

        aisco.volunteer.medis.VolunteerImpl medisVol = new aisco.volunteer.medis.VolunteerImpl(
            coreVol,
            "Dokter Umum",
            "STR-12345",
            "CPR, First Aid, Trauma Care"
        );

        System.out.println(medisVol.getVolunteer());
        System.out.println("Spesialisasi: " + medisVol.getSpesialisasi());
        System.out.println("No. Lisensi : " + medisVol.getNomorLisensi());
        System.out.println("Keahlian    : " + medisVol.getKeahlianMedis());
    }
}
