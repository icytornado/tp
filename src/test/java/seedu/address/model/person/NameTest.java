package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class NameTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Name(null));
    }

    @Test
    public void constructor_invalidName_throwsIllegalArgumentException() {
        String invalidName = "";
        assertThrows(IllegalArgumentException.class, () -> new Name(invalidName));
    }

    @Test
    public void isValidName() {
        // null name
        assertThrows(NullPointerException.class, () -> Name.isValidDoctor(null));

        // invalid name
        assertFalse(Name.isValidDoctor("")); // empty string
        assertFalse(Name.isValidDoctor(" ")); // spaces only
        assertFalse(Name.isValidDoctor("^")); // only non-alphanumeric characters
        assertFalse(Name.isValidDoctor("peter*")); // contains non-alphanumeric characters

        // valid name
        assertTrue(Name.isValidDoctor("peter jack")); // alphabets only
        assertTrue(Name.isValidDoctor("12345")); // numbers only
        assertTrue(Name.isValidDoctor("peter the 2nd")); // alphanumeric characters
        assertTrue(Name.isValidDoctor("Capital Tan")); // with capital letters
        assertTrue(Name.isValidDoctor("David Roger Jackson Ray Jr 2nd")); // long names
    }
}
