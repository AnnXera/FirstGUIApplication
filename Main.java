import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    
    private static JFrame frame;
    private static JPanel MainPanel, ButtonPanel, FormPanel;
    private static JLabel Label, lbOutput;
    private static JButton btnSubmit;
    private static JTextField tfInput;

    public static void main(String[] args) {
        
        frame = new JFrame("Name of the Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        
        MainPanel = new JPanel();
        MainPanel.setLayout(new BorderLayout());
        MainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        MainPanel.setBackground(Color.DARK_GRAY);
        
        FormPanel = new JPanel();
        FormPanel.setLayout(new GridLayout(3, 1, 20, 20));
        FormPanel.setBackground(Color.DARK_GRAY);
        
        ButtonPanel = new JPanel();
        ButtonPanel.setLayout(new GridLayout(3, 1, 20, 20));
        ButtonPanel.setBackground(Color.DARK_GRAY);
        
        Label = new JLabel("Enter your Name");
        Label.setForeground(Color.CYAN);
        
        tfInput = new JTextField();
        tfInput.setPreferredSize(new Dimension(50, 50));
        
        lbOutput = new JLabel("");
        lbOutput.setForeground(Color.CYAN);
        
        btnSubmit = new JButton("Submit");
        btnSubmit.setForeground(Color.MAGENTA);
        
        btnSubmit.addActionListener((ActionEvent e) -> {
            String input = tfInput.getText();
            lbOutput.setText(input);
        });
        
        FormPanel.add(Label);
        FormPanel.add(tfInput);
        
        ButtonPanel.add(lbOutput);
        ButtonPanel.add(btnSubmit);
        
        MainPanel.add(FormPanel, BorderLayout.NORTH);
        MainPanel.add(ButtonPanel, BorderLayout.CENTER);
        
        frame.add(MainPanel);
        frame.setVisible(true);
        
    }
    
}
