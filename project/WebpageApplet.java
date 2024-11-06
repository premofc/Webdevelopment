import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// This is necessary to use an Applet
public class WebpageApplet extends Applet implements ActionListener {
    
    // Declare components
    Label nameLabel, emailLabel, messageLabel;
    TextField nameText, emailText;
    TextArea messageText;
    Button submitButton;

    // Initialize the components in the init() method
    public void init() {
        // Set layout for the applet
        setLayout(new GridLayout(4, 2, 5, 5));
        
        // Create components
        nameLabel = new Label("Name:");
        nameText = new TextField(20);
        
        emailLabel = new Label("Email:");
        emailText = new TextField(20);
        
        messageLabel = new Label("Message:");
        messageText = new TextArea(5, 20);
        
        submitButton = new Button("Submit");
        
        // Add components to the applet
        add(nameLabel);
        add(nameText);
        
        add(emailLabel);
        add(emailText);
        
        add(messageLabel);
        add(messageText);
        
        add(new Label()); // Placeholder for layout alignment
        add(submitButton);

        // Add ActionListener to the button
        submitButton.addActionListener(this);
    }

    // Define actionPerformed to handle button clicks
    public void actionPerformed(ActionEvent e) {
        // Basic event handling: on button click, display details in console
        String name = nameText.getText();
        String email = emailText.getText();
        String message = messageText.getText();
        
        // Display the entered information in the console
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Message: " + message);
    }
    
    // Define the size of the applet
    public void paint(Graphics g) {
        setSize(400, 300);
    }
}