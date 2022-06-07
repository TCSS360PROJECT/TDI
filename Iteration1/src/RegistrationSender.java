import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author kemeria
 */
public class RegistrationSender extends JFrame{
    private JButton cancelButton;
    private JButton registerButton;
    private JPanel panel;

    public RegistrationSender(LoginPage login){
        setContentPane(panel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(200,110);
        setVisible(true);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistrationSender.this.dispose();
            }
        });
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login.dispose();
                RegistrationSender.this.dispose();
                RegisterPage page = new RegisterPage(login);
            }
        });
    }
}
