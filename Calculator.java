package solution;

import java.awt.BorderLayout;
//import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This is a calculator that does calc.
 * 
 * @author Peter
 * @version 09/21/2020
 */
public class Calculator implements ActionListener
{
    private JFrame frame;
    private String Name;
    JLabel resultLabel;
    JTextField txtField1;
    JTextField txtField2;

    /*
     * this is a con that does the calcing part.
     */
    public Calculator()
    {
        // frame layout
        frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");

        frame.setVisible(true);

        // button layout
        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("ADD");
        JButton subButton = new JButton("SUB");
        JButton multButton = new JButton("MULT");
        JButton divButton = new JButton("DIV");

        // setting the buttons name
        addButton.setName("addButton");
        subButton.setName("subButton");
        multButton.setName("multButton");
        divButton.setName("divButton");

        // adding the buttons to the pannel.
        buttonPanel.add(addButton);
        buttonPanel.add(subButton);
        buttonPanel.add(multButton);
        buttonPanel.add(divButton);

        // adding the button pannel to the frame.
        frame.add(buttonPanel, BorderLayout.PAGE_END);

        // result result layout
        JPanel resultPanel = new JPanel();
        resultLabel = new JLabel("Result = ");
        resultLabel.setName("resultLabel");
        resultPanel.add(resultLabel);

        // adding the pannel to the frame
        frame.add(resultPanel, BorderLayout.WEST);

        // textlayout
        JPanel txtFieldPanel = new JPanel();
        txtField1 = new JTextField(10);
        txtField2 = new JTextField(10);

        // naming the text box and putting them into the frame
        txtField1.setName("leftOperand");
        txtField2.setName("rightOperand");
        txtFieldPanel.add(txtField1, BorderLayout.WEST);
        txtFieldPanel.add(txtField2, BorderLayout.EAST);
        frame.add(txtFieldPanel, BorderLayout.PAGE_START);

        // adding them to the actionlistener
        txtField1.addActionListener(this);
        txtField2.addActionListener(this);
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        multButton.addActionListener(this);
        divButton.addActionListener(this);

    }

    /*
    public void initializeComponents()
    {
    
    }
    */

    /**
     * this is the main that only calls the calc.
     * 
     * @param args
     *            calls the calc.
     */
    public static void main(String[] args)
    {

        Calculator calc3 = new Calculator();
    }

    /**
     * get the fram of the calc.
     * 
     * @return the frame for the calc.
     */
    public JFrame getFrame()
    {
        return frame;
    }

    /**
     * does the name part.
     * 
     * @param name
     *            will return the name
     */
    public void setName(String name)
    {
        Name = name;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String opt = e.getActionCommand();
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;

        // n3 = Integer.parseInt(resultLabel.getText());

        try
        {
            n1 = Double.parseDouble(txtField1.getText());
            n2 = Double.parseDouble(txtField2.getText());
        } catch (NumberFormatException e2)
        {
            resultLabel.setText("Result = Error");
            return;
        }

        /*        switch (opt)
        {
            case "+":
                n3 = n1 + n2;
                break;
            case "-":
                n3 = n1 - n2;
                break;
            case "*":
                n3 = n1 * n2;
                break;
            case "/":
                if (n2 == 0)
                {
                    resultLabel.setText("Result = Error");
                }
                else {
                    n3 = n1 / n2;
                }
                break;
                
                default:
                resultLabel.setText("Result = " + n3);
            
            
        }
        */

        if (opt.equals("ADD"))
        {
            n3 = n1 + n2;
            resultLabel.setText("Result = " + n3);
        } else if (opt.equals("SUB"))
        {
            n3 = n1 - n2;
            resultLabel.setText("Result = " + n3);
        } else if (opt.equals("MULT"))
        {
            n3 = n1 * n2;
            resultLabel.setText("Result = " + n3);
        } else if (opt.equals("DIV"))
        {
            if (n2 == 0)
            {
                resultLabel.setText("Result = Error");
            } else
            {

                n3 = n1 / n2;
                resultLabel.setText("Result = " + n3);
            }
        }
        /*        else if (opt.equals(""))
        {
            System.out.println("Error");
        }
        */

    }

}
