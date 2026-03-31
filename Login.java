import java.awt.*;
import javax.swing.*;
public class Login {

    JFrame frame;

    Login() {
        frame = new JFrame("Login");
        frame.setSize(400, 300);
        frame.setLayout(null);
        
        JLabel heading = new JLabel("LOGIN");
        heading.setBounds(170, 10, 100, 30); 
        heading.setFont(new Font("Arial",Font.BOLD, 20)); 
        frame.add(heading);

        JLabel label = new JLabel("Username:");
        label.setBounds(50, 50, 100, 30);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        JTextField tf = new JTextField();
        tf.setBounds(150, 50, 150, 30);

        JLabel label2 = new JLabel("Password:");
        label2.setBounds(50, 100, 100, 30);
        label2.setFont(new Font("Arial", Font.BOLD, 16));

        JPasswordField pf = new JPasswordField();
        pf.setBounds(150, 100, 150, 30);

        JButton showBtn = new JButton("Show");
        showBtn.setBounds(310, 100, 80, 30);
        showBtn.addActionListener(e -> {
            if (showBtn.getText().equals("Show")) {
                pf.setEchoChar((char) 0); // show password
                    showBtn.setText("Hide");
                } else {
                    pf.setEchoChar('*'); // hide password
                    showBtn.setText("Show");
                }
            });

        JButton btn = new JButton("Login");
        btn.setBounds(120, 160, 120, 40);

        btn.addActionListener(e -> {
            String username = tf.getText();
            String password = new String(pf.getPassword());

            if (username.equals("admin") && password.equals("1234")) {

                JOptionPane.showMessageDialog(frame, "Login Successful");
                frame.dispose();

                openDashboard(username);

            } else {
               JOptionPane.showMessageDialog(frame, "Invalid Credentials", "Login Error", JOptionPane.ERROR_MESSAGE);
                tf.setText("");    
                pf.setText(""); 
            }
        });

        frame.add(heading);
        frame.add(label);
        frame.add(tf);
        frame.add(label2);
        frame.add(pf);
        frame.add(btn);
        frame.add(showBtn);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    void openDashboard(String username) {

        JFrame dashboard = new JFrame("Dashboard");
        dashboard.setSize(400, 300);
        dashboard.setLayout(null);

        JLabel welcome = new JLabel("Welcome " + username);
        welcome.setBounds(120, 100, 200, 30);

        JButton logout = new JButton("Logout");
        logout.setBounds(130, 180, 120, 40);

        logout.addActionListener(e -> {
            dashboard.dispose();
            new Login();
        });

        dashboard.add(welcome);
        dashboard.add(logout);

        dashboard.setVisible(true);
        dashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Login();
    }
}