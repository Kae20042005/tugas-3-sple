package aisco.volunteer.core;

public abstract class VolunteerDecorator extends VolunteerComponent {

    public VolunteerComponent record;

    public VolunteerDecorator(VolunteerComponent record) {
        this.record = record;
    }

    public String getName()  { return record.getName(); }
    public String getEmail() { return record.getEmail(); }
    public String getPhone() { return record.getPhone(); }

    @Override
    public String getVolunteer() {
        return record.getVolunteer();
    }

    @Override
    public void printHeader() {
        record.printHeader();
    }

    @Override
    public void addVolunteer() {
        record.addVolunteer();
    }

    public String toString() {
        return record.toString();
    }

    /* delta adds method */
}