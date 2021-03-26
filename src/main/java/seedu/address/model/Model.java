package seedu.address.model;

import java.nio.file.Path;
import java.util.function.Predicate;

import javafx.collections.ObservableList;
import seedu.address.commons.core.GuiSettings;
import seedu.address.model.appointment.Appointment;
import seedu.address.model.person.Patient;

/**
 * The API of the Model component.
 */
public interface Model {
    /** {@code Predicate} that always evaluate to true */
    Predicate<Patient> PREDICATE_SHOW_ALL_PATIENTS = unused -> true;
    Predicate<Appointment> PREDICATE_SHOW_ALL_APPOINTMENTS = unused -> true;

    /**
     * Replaces user prefs data with the data in {@code userPrefs}.
     */
    void setUserPrefs(ReadOnlyUserPrefs userPrefs);

    /**
     * Returns the user prefs.
     */
    ReadOnlyUserPrefs getUserPrefs();

    /**
     * Returns the user prefs' GUI settings.
     */
    GuiSettings getGuiSettings();

    /**
     * Sets the user prefs' GUI settings.
     */
    void setGuiSettings(GuiSettings guiSettings);

    //=========== PatientRecords ================================================================================
    /**
     * Returns the user prefs' address book file path.
     */
    Path getPatientRecordsFilePath();

    /**
     * Sets the user prefs' address book file path.
     */
    void setPatientRecordsFilePath(Path addressBookFilePath);

    /**
     * Replaces address book data with the data in {@code addressBook}.
     */
    void setPatientRecords(ReadOnlyAddressBook<Patient> addressBook);

    /** Returns the AddressBook */
    ReadOnlyAddressBook<Patient> getPatientRecords();

    /**
     * Returns true if a person with the same identity as {@code person} exists in the address book.
     */
    boolean hasPatient(Patient patient);

    /**
     * Deletes the given person.
     * The person must exist in the address book.
     */
    void deletePatient(Patient target);

    /**
     * Adds the given person.
     * {@code person} must not already exist in the address book.
     */
    void addPatient(Patient patient);

    /**
     * Replaces the given person {@code target} with {@code editedPerson}.
     * {@code target} must exist in the address book.
     * The person identity of {@code editedPerson} must not be the same as another existing person in the address book.
     */
    void setPatient(Patient target, Patient editedPatient);

    /** Returns an unmodifiable view of the filtered person list */
    ObservableList<Patient> getFilteredPatientList();

    /** Returns an unmodifiable view of the filtered doctor list */
    ObservableList<String> getFilteredDoctorList();

    /**
     * Updates the filter of the filtered person list to filter by the given {@code predicate}.
     * @throws NullPointerException if {@code predicate} is null.
     */
    void updateFilteredPatientList(Predicate<? super Patient> predicate);

    //=========== AppointmentSchedule ========================================================================
    /**
     * Returns the user prefs' appointment schedule file path.
     */
    Path getAppointmentScheduleFilePath();

    /**
     * Sets the user prefs' appointment schedule file path.
     */
    void setAppointmentScheduleFilePath(Path appointmentScheduleFilePath);

    /**
     * Replaces appointment schedule book data with the data in {@code addressBook}.
     */
    void setAppointmentSchedule(ReadOnlyAppointmentSchedule appointmentSchedule);

    /** Returns the AppointmentSchedule */
    ReadOnlyAppointmentSchedule getAppointmentSchedule();

    /**
     * Returns true if patient has existing appointments in the appointment schedule.
     */
    boolean hasPatientInAppointmentSchedule(Patient patient);

    /**
     * Returns true if an appointment that conflicts with {@code appointment} exists in the appointment schedule.
     */
    boolean hasConflictingAppointment(Appointment appointment);

    /**
     * Returns true if an appointment that conflicts with {@code appointment}
     * exists in the appointment schedule excluding the target.
     */
    boolean hasConflictingAppointmentExcludingTarget(Appointment target, Appointment appointment);

    /**
     * Deletes the given appointment.
     * The appointment must exist in the appointment schedule.
     */
    void deleteAppointment(Appointment target);

    /**
     * Adds the given appointment.
     * {@code appointment} must not be in conflict with existing appointments in the appointment schedule.
     */
    void addAppointment(Appointment appointment);

    /**
     * Replaces the given appointment {@code target} with {@code editedAppointment}.
     * {@code target} must exist in the appointment schedule.
     * The {@code editedAppointment} must not be in conflict with another appointment in the appointment schedule
     */
    void setAppointment(Appointment target, Appointment editedAppointment);

    /** Returns an unmodifiable view of the filtered appointment list */
    ObservableList<Appointment> getFilteredAppointmentList();

    /**
     * Updates the filter of the filtered appointment list to filter by the given {@code predicate}.
     * @throws NullPointerException if {@code predicate} is null.
     */
    void updateFilteredAppointmentList(Predicate<Appointment> predicate);
}
