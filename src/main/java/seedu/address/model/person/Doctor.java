package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Person's name in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidDoctor(String)}
 */
public class Doctor {




    public static final String MESSAGE_CONSTRAINTS =
            "Doctors should only contain alphanumeric characters and spaces, and it should not be blank";

    /*
     * The first character of the address must not be a whitespace,
     * otherwise " " (a blank string) becomes a valid input.
     */
    public static final String VALIDATION_REGEX = "[\\p{Alnum}][\\p{Alnum} ]*";

    public final String fullName;

    /**
     * Constructs a {@code Doctor}.
     *
     * @param doctor A valid doctor.
     */
    public Doctor(String doctor) {
        requireNonNull(doctor);
        checkArgument(isValidDoctor(doctor), MESSAGE_CONSTRAINTS);
        fullName = doctor;
    }

    /**
     * Returns true if a given string is a valid name.
     */
    public static boolean isValidDoctor(String test) {
        return test.matches(VALIDATION_REGEX);
    }


    @Override
    public String toString() {
        return fullName;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Doctor // instanceof handles nulls
                && fullName.equals(((Doctor) other).fullName)); // state check
    }

    @Override
    public int hashCode() {
        return fullName.hashCode();
    }

}
