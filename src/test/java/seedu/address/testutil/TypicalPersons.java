package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_DATETIME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_DATETIME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_DOCTOR_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_DOCTOR_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.person.Person;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Person ALICE = new PersonBuilder().withName("Alice Pauline")
            .withDoctor("Bob")
            .withPhone("94351253")
            .withEmail("alice@example.com")
            .withAddress("123, Jurong West Ave 6, #08-111")
            .withDatetime("Dec 10, 1.50PM")
            .withTags("friends").build();
    public static final Person BENSON = new PersonBuilder().withName("Benson Meier")
            .withDoctor("Alice Bng")
            .withPhone("98765432")
            .withEmail("johnd@example.com")
            .withAddress("311, Clementi Ave 2, #02-25")
            .withDatetime("Dec 16, 1.50PM")
            .withEmail("johnd@example.com")
            .withTags("owesMoney", "friends").build();
    public static final Person CARL = new PersonBuilder().withName("Carl Kurz")
            .withDoctor("Alice Jong")
            .withPhone("95352563").withEmail("heinz@example.com").withAddress("wall street")
            .withDatetime("Dec 17, 1.50PM").build();
    public static final Person DANIEL = new PersonBuilder().withName("Daniel Meier")
            .withDoctor("Alice Cong").withPhone("87652533")
            .withEmail("cornelia@example.com").withAddress("10th street")
            .withDatetime("Dec 18, 1.50PM").withTags("friends").build();
    public static final Person ELLE = new PersonBuilder().withName("Elle Meyer")
            .withDoctor("Alice Bong").withPhone("9482224")
            .withEmail("werner@example.com").withAddress("michegan ave")
            .withDatetime("Dec 19, 1.50PM").build();
    public static final Person FIONA = new PersonBuilder().withName("Fiona Kunz")
            .withDoctor("Alice Aong").withPhone("9482427")
            .withEmail("lydia@example.com").withAddress("little tokyo")
            .withDatetime("Dec 20, 1.50PM").build();
    public static final Person GEORGE = new PersonBuilder().withName("George Best")
            .withDoctor("Alice Png").withPhone("9482442")
            .withEmail("anna@example.com").withAddress("4th street")
            .withDatetime("Dec 21, 1.50PM").build();

    // Manually added
    public static final Person HOON = new PersonBuilder().withName("Hoon Meier")
            .withDoctor("Alie Baulie").withPhone("8482424")
            .withEmail("stefan@example.com").withAddress("little india")
            .withDatetime("Dec 17 1.50pm").build();
    public static final Person IDA = new PersonBuilder().withName("Ida Mueller")
            .withDoctor("Alie Paumie").withPhone("8482131")
            .withEmail("hans@example.com").withAddress("chicago ave")
            .withDatetime("Dec 18 1.50pm").build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder().withName(VALID_NAME_AMY)
            .withDoctor(VALID_DOCTOR_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY)
            .withDatetime(VALID_DATETIME_AMY).withTags(VALID_TAG_FRIEND).build();
    public static final Person BOB = new PersonBuilder().withName(VALID_NAME_BOB)
            .withDoctor(VALID_DOCTOR_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB)
            .withDatetime(VALID_DATETIME_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Person person : getTypicalPersons()) {
            ab.addPerson(person);
        }
        return ab;
    }

    public static List<Person> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
