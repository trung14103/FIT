package courseman2.controllers;

import courseman2.DomainConstraint;
import courseman2.models.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

// TODO: consider StudentManager as an example & complete this class
public class ModuleManager extends WindowAdapter implements ActionListener {
    private final String STORAGE_FILE = "students.dat";
    @DomainConstraint(type= DomainConstraint.Type.Object,optional=false)
    private ArrayList<Student> students;

    // view elements
    @DomainConstraint(type= DomainConstraint.Type.Object,optional=false)
    private JFrame gui;
    // TODO: you may consider to add other attributes for view elements here

    /**
     * @effects
     *  initialise <tt>this</tt> with an empty set of students <br>
     *  {@link #createGUI()}: create <tt>gui</tt>
     */
    public ModuleManager() {
        // TODO: complete this code
    }

    /**
     * @modifies this.gui
     * @effects create <tt>gui</tt> as required (mockup image) <br>
     *          The action listener of the buttons is <tt>this</tt>.
     */
    public void createGUI() {

    }

    /**
     * @requires <tt>gui != null</tt>
     * @effects show <tt>gui</tt>
     */
    public void display() {
        // TODO: complete this code
    }

    /**
     * @effects handles user actions on the buttons
     *
     *          <pre>
     *          if button is OK
     *            {@link #createStudent()}: create a new student from form data
     *          else if button is Cancel
     *            {@link #clearInput()}: reset form fields
     *          </pre>
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO: complete this code
    }

    /**
     * @effects
     *
     *          <pre>
     *  create a new student from the data in the data panel of gui and add it to <tt>this.students</tt>
     *
     *  if not success (exception is thrown)
     *      display the exception message on the GUI dialog
     *          </pre>
     */
    private void createStudent() {
        // TODO: complete this code
    }

    /**
     * @requires this.tfName != null /\ this.tfDob != null /\ this.tfAddress != null
     *           /\ this.tfEmail != null
     */
    private void clearInput() {
        // TODO: complete this code
    }

    /**
     * @requires <tt>gui != null</tt>
     * @effects hide <tt>gui</tt>
     */
    @Override
    public void windowClosing(WindowEvent e) {
        // TODO: complete this code
    }

    /**
     * @requires <tt>students != null</tt>
     * @modifies this
     * @effects load into <tt>students</tt> the data students in the storage file
     *          <tt>students.dat</tt> that was saved before.
     *
     *          <pre>
     *          if succeeds
     *            display a console message
     *          else
     *            display a console error message
     *          </pre>
     */
    public void startUp() {
        // TODO: complete this code
    }

    /**
     * @requires <tt>gui != null</tt>
     * @modifies this
     * @effects
     *
     *          <pre>
     *          dispose <tt>gui</tt> and clear <tt>students</tt>
     *          store <code>this.students</code> to file and shutdown the application
     *          </pre>
     */
    public void shutDown() {
        // TODO: complete this code
    }
}
