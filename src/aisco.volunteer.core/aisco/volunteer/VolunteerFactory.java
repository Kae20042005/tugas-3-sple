package aisco.volunteer;

import aisco.volunteer.core.Volunteer;
import java.lang.reflect.Constructor;
import java.util.logging.Logger;

public class VolunteerFactory {
    private static final Logger LOGGER = Logger.getLogger(VolunteerFactory.class.getName());

    private VolunteerFactory() {}

    public static Volunteer createVolunteer(String fullyQualifiedName, Object... base) {
        Volunteer record = null;
        if (checkConfig(fullyQualifiedName, base.length > 0 ? base[0] : null)) {
            try {
                Class<?> clz = Class.forName(fullyQualifiedName);
                Constructor<?> constructor = clz.getDeclaredConstructors()[0];
                record = (Volunteer) constructor.newInstance(base);
            }
            catch (IllegalArgumentException e) {
                LOGGER.severe("Failed to create instance of Volunteer.");
                LOGGER.severe("Given FQN: " + fullyQualifiedName);
                LOGGER.severe("Failed to run: Check your constructor argument");
                System.exit(20);
            }
            catch (ClassCastException e) {
                LOGGER.severe("Failed to create instance of Volunteer.");
                LOGGER.severe("Given FQN: " + fullyQualifiedName);
                LOGGER.severe("Failed to cast the object");
                System.exit(30);
            }
            catch (ClassNotFoundException e) {
                LOGGER.severe("Failed to create instance of Volunteer.");
                LOGGER.severe("Given FQN: " + fullyQualifiedName);
                LOGGER.severe("Class not Found");
                System.exit(40);
            }
            catch (Exception e) {
                System.out.println(e);
                LOGGER.severe("Failed to create instance of Volunteer.");
                LOGGER.severe("Given FQN: " + fullyQualifiedName);
                System.exit(50);
            }
        } else {
            System.out.println("Config Fail");
            System.exit(10);
        }
        return record;
    }

    public static boolean checkConfig(String fqn, Object base) {
        boolean a = true;
        if (fqn.equals("aisco.volunteer.medis.VolunteerImpl")) {
            String baseku = base.getClass().getCanonicalName();
            a = baseku.equals("aisco.volunteer.core.VolunteerImpl");
        }
        return a;
    }
}