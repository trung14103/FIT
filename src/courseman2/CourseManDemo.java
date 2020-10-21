package courseman2;

import courseman2.controllers.ModuleManager;
import courseman2.controllers.StudentManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @overview Represents the main class of the CourseMan program.
 *
 * @attributes
 *  sman StudentManager
 *  mman ModuleManager
 *  gui JFrame
 *
 * @abstract_properties
 *   optional(sman) = false /\
 *   optional(mman) = false /\
 *   optional(gui) = false
 *
 * @author congnv
 */
public class CourseManDemo extends WindowAdapter implements ActionListener {
    @DomainConstraint(type= DomainConstraint.Type.String,optional=false)
    private StudentManager sman; // the student manager
    @DomainConstraint(type= DomainConstraint.Type.String,optional=false)
    private ModuleManager mman; // the module manager

    @DomainConstraint(type= DomainConstraint.Type.Object,optional=false)
    private JFrame gui;

    /**
     * @effects initialise <tt>sman, mman</tt> <br>
     *          {@link #createGUI()}: create <tt>gui</tt>
     */
    public CourseManDemo() {
        createGUI();
    }

    /**
     * @modifies this.gui
     * @effects create <tt>gui</tt> that has a menu bar with:
     *          <ol>
     *          <li>File menu has one item: Exit
     *          <li>Student menu has one item: New Student (to create a new student)
     *          <li>Module menu has one item: New Module (to create a new module)
     *          </ol>
     *          The action listener of the menu items is <tt>this</tt>.
     */
    public void createGUI() {
        gui = new JFrame("CourseMan 2");
        gui.setSize(400, 300);
        gui.setLayout(new GridLayout(3, 1));
        JLabel headerLabel = new JLabel("", JLabel.CENTER);
        JLabel statusLabel = new JLabel("", JLabel.CENTER);
        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        statusLabel.setSize(350, 100);
        gui.add(headerLabel);
        gui.add(statusLabel);
        gui.setVisible(true);
    }

    /**
     * @effects show <tt>gui</tt>
     */
    public void display() {
        // create menus
        final JMenuBar menuBar = new JMenuBar(); // Tao cac menu
        JMenu fileMenu = new JMenu("File");
        JMenu studentMenu = new JMenu("Student");
        JMenu moduleMenu = new JMenu("Module");
        final JMenu aboutMenu = new JMenu("About");
        final JMenu linkMenu = new JMenu("Links");

        // create item for each menu
        JMenuItem newStudentMenuItem = new JMenuItem("New Student");
        newStudentMenuItem.setActionCommand("New Student");
        JMenuItem newModuleMenuItem = new JMenuItem("New Module");
        newModuleMenuItem.setActionCommand("New Module");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setActionCommand("Exit");
        KeyStroke keyStrokeToOpen
                = KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK);
        exitMenuItem.setAccelerator(keyStrokeToOpen);

        newStudentMenuItem.addActionListener(this);
        newModuleMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);

        fileMenu.add(exitMenuItem);
        studentMenu.add(newStudentMenuItem);
        moduleMenu.add(newModuleMenuItem);

        menuBar.add(fileMenu);
        menuBar.add(studentMenu);
        menuBar.add(moduleMenu);
        gui.setJMenuBar(menuBar);
        gui.setVisible(true);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO: complete this code
    }

    /**
     * @effects handles user actions on the menu items
     *
     *          <pre>
     *          if menu item is Student/New Student
     *            {@link #sman}.display()}
     *          else if menu item is Module/New Module
     *            {@link #mman}.display()
     *          else if menu item is File/Exit
     *            {@link #shutDown()}
     *          </pre>
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch (action) {
            case "New Student":
                sman.display();
                break;
            case "New Module":
                mman.display();
                break;
            case "Exit":
                System.exit(0);
                break;
        }
    }

    /**
     * @effects start up <tt>sman, mman</tt>
     */
    public void startUp() {
        // TODO: complete this code
    }

    /**
     * @effects shut down <tt>sman, mman</tt> <br>
     *          dispose <tt>gui</tt> and end the program.
     */
    public void shutDown() {
        // TODO: complete this code
    }

    /**
     * The run method
     *
     * @effects create an instance of <tt>CourseManDemo</tt> {@link #startUp()}:
     *          start up the <tt>CourseManDemo</tt> instance {@link #display()}:
     *          display the main gui of <tt>CourseManDemo</tt> instance
     */
    public static void main(String[] args) {
        CourseManDemo app = new CourseManDemo();
        app.startUp();
        app.display();
    }
}
