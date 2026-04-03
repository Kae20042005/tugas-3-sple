package aisco.volunteer.medis;

import aisco.volunteer.core.VolunteerDecorator;
import aisco.volunteer.core.VolunteerComponent;

public class VolunteerImpl extends VolunteerDecorator {

    private String spesialisasi;
    private String nomorLisensi;
    private String keahlianMedis;

    public VolunteerImpl(VolunteerComponent record,
                         String spesialisasi,
                         String nomorLisensi,
                         String keahlianMedis) {
        super(record);
        this.spesialisasi  = spesialisasi;
        this.nomorLisensi  = nomorLisensi;
        this.keahlianMedis = keahlianMedis;
    }

    @Override
    public void printHeader() {
        System.out.println("=== Volunteer Medis ===");
    }

    @Override
    public String getVolunteer() {
        printHeader();
        return record.getVolunteer();
    }

    @Override
    public void addVolunteer(Object volunteer) {
        record.addVolunteer(volunteer);
    }

    // delta adds methods
    public String getSpesialisasi()  { return spesialisasi; }
    public String getNomorLisensi()  { return nomorLisensi; }
    public String getKeahlianMedis() { return keahlianMedis; }

    public String toString() {
        return record.toString()
             + "  Spesialisasi: " + spesialisasi
             + " | Lisensi: "     + nomorLisensi
             + " | Keahlian: "    + keahlianMedis + "\n";
    }
}