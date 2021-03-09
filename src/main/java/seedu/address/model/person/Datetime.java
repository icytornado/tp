package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Person's datetime in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidDatetime(String)}
 */
public class Datetime {

    public static final String MESSAGE_CONSTRAINTS = "Datetime can take any values, and it should not be blank";

    /*
     * The first character of the datetime must not be a whitespace,
     * otherwise " " (a blank string) becomes a valid input.
     */
    public static final String VALIDATION_REGEX = "[^\\s].*";

    public final String value;

    /**
     * Constructs an {@code Datetime}.
     *
     * @param datetime A valid datetime.
     */
    public Datetime(String datetime) {
        requireNonNull(datetime);
        checkArgument(isValidDatetime(datetime), MESSAGE_CONSTRAINTS);
        value = datetime;
    }

    /**
     * Returns true if a given string is a valid email.
     */
    public static boolean isValidDatetime(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Datetime // instanceof handles nulls
                && value.equals(((Datetime) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

}
