package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class DatetimeTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Datetime(null));
    }

    @Test
    public void constructor_invalidDatetime_throwsIllegalArgumentException() {
        String invalidDatetime = "";
        assertThrows(IllegalArgumentException.class, () -> new Datetime(invalidDatetime));
    }

    @Test
    public void isValidDatetime() {
        // null datetime
        assertThrows(NullPointerException.class, () -> Datetime.isValidDatetime(null));

        // invalid datetime
        assertFalse(Datetime.isValidDatetime("")); // empty string
        assertFalse(Datetime.isValidDatetime(" ")); // spaces only

        // valid datetime
        assertTrue(Datetime.isValidDatetime("Dec 15 2020 1.5OPM"));
        assertTrue(Datetime.isValidDatetime("-")); // one character
        assertTrue(Datetime.isValidDatetime("Dec 16 2020 1.5OPM Dec 15 2020 1.5OPM Dec 17 2020 1.5OPM")); // long time
    }
}
