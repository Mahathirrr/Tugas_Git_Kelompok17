package Library_PBO;

/**
 * Represents the Guest class, which contains a name.
 *
 * @author Muhammad Mahathir & Muhammad Ridho
 * @version 1.4
 */
public class Guest {
    private String name;

    /**
     * Constructs a Guest object with the specified name.
     *
     * @param name The name to initialize the Guest.
     */
    public Guest(String name) {
        this.name = name;
    }

    /**
     * Retrieves the name of the Guest.
     *
     * @return The name of the Guest.
     */
    public String getName() {
        return this.name;
    }
}
