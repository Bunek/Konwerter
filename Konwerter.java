package com.company;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Konwerter {

    public static final JTextComponent lblNewLabel = null;
    private JFrame frmKonwerter;
    private JTextField textField;
    private JComboBox comboBox_1;
    private JButton btnNewButton_1;
    private JTextField textField_1;
    private JLabel lblNewLabel_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Konwerter window = new Konwerter();
                    window.frmKonwerter.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Konwerter() {
        initialize(this);
    }

    /**
     * Initialize the contents of the frame.
     * @param konwerter
     */
    private static void initialize(final Konwerter konwerter) {
        konwerter.frmKonwerter = new JFrame();
        konwerter.frmKonwerter.setTitle("Konwerter");
        konwerter.frmKonwerter.setBounds(100, 100, 450, 300);
        konwerter.frmKonwerter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        konwerter.frmKonwerter.getContentPane().setLayout(null);

        konwerter.textField = new JTextField();// textField na górze do wprowadzania danych do programu
        konwerter.textField.setBounds(67, 11, 300, 40);
        konwerter.frmKonwerter.getContentPane().add(konwerter.textField);
        konwerter.textField.setColumns(10);

        JComboBox comboBox = new JComboBox(Wybor.lista1); //comboBox po lewej stronie z rodzajami jednostek
        comboBox.setBounds(83, 76, 82, 52);
        konwerter.frmKonwerter.getContentPane().add(comboBox);

        konwerter.comboBox_1 = new JComboBox(Wybor.lista2);// comboBox po prawej stronie z rodzajami jednostek
        konwerter.comboBox_1.setBounds(219, 76, 82, 52);
        konwerter.frmKonwerter.getContentPane().add(konwerter.comboBox_1);

        konwerter.btnNewButton_1 = new JButton("Licz"); // przycisk który uaktywnia liczenie. sprawdza ustawienie obu comboBoxow stosuje odpowiedni przelicznik do danej kombinacji
        konwerter.btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    if (comboBox.getSelectedItem().equals("Metry") && konwerter.comboBox_1.getSelectedItem().equals("Kilometry")) {
                        Obliczenia(konwerter, 0.001, " metry(ów) to ", " kilometrów");
                    } else if (comboBox.getSelectedItem().equals("Metry") && konwerter.comboBox_1.getSelectedItem().equals("Stopy")) {
                        Obliczenia(konwerter, 3.2808398950, " metry(ów) to ", " stóp");
                    } else if (comboBox.getSelectedItem().equals("Metry") && konwerter.comboBox_1.getSelectedItem().equals("Jardy")) {
                        Obliczenia(konwerter, 1.0936132983, " metry(ów) to ", " jardów");
                    } else if (comboBox.getSelectedItem().equals("Metry") && konwerter.comboBox_1.getSelectedItem().equals("Mile")) {
                        Obliczenia(konwerter, 0.0006213712, " metry(ów) to ", " mil");
                    } else if (comboBox.getSelectedItem().equals("Kilometry") && konwerter.comboBox_1.getSelectedItem().equals("Metry")) {
                        Obliczenia(konwerter, 1000, " kilometry(ów) to ", " metrów");
                    } else if (comboBox.getSelectedItem().equals("Kilometry") && konwerter.comboBox_1.getSelectedItem().equals("Stopy")) {
                        Obliczenia(konwerter, 3280.8398950131, " kilometry(ów) to ", " stóp");
                    } else if (comboBox.getSelectedItem().equals("Kilometry") && konwerter.comboBox_1.getSelectedItem().equals("Jardy")) {
                        Obliczenia(konwerter, 1093.6132983377, " kilometry(ów) to ", " jardów");
                    } else if (comboBox.getSelectedItem().equals("Kilometry") && konwerter.comboBox_1.getSelectedItem().equals("Mile")) {
                        Obliczenia(konwerter, 0.6213711922, " kilometry(ów) to ", " mil");
                    } else if (comboBox.getSelectedItem().equals("Stopy") && konwerter.comboBox_1.getSelectedItem().equals("Metry")) {
                        Obliczenia(konwerter, 0.3048000000, " stopy(óp) to ", " metrów");
                    } else if (comboBox.getSelectedItem().equals("Stopy") && konwerter.comboBox_1.getSelectedItem().equals("Kilometry")) {
                        Obliczenia(konwerter, 0.0003048000, " stopy(óp) to ", " kilometrów");
                    } else if (comboBox.getSelectedItem().equals("Stopy") && konwerter.comboBox_1.getSelectedItem().equals("Jardy")) {
                        Obliczenia(konwerter, 0.3333333333, " stopy(óp) to ", " jardów");
                    } else if (comboBox.getSelectedItem().equals("Stopy") && konwerter.comboBox_1.getSelectedItem().equals("Mile")) {
                        Obliczenia(konwerter, 0.0001893939, " stopy(óp) to ", " mil");
                    } else if (comboBox.getSelectedItem().equals("Jardy") && konwerter.comboBox_1.getSelectedItem().equals("Metry")) {
                        Obliczenia(konwerter, 0.9144000000, " jardy(ów) to ", " metrów");
                    } else if (comboBox.getSelectedItem().equals("Jardy") && konwerter.comboBox_1.getSelectedItem().equals("Kilometry")) {
                        Obliczenia(konwerter, 0.000914400, " jardy(ów) to ", " kilometrów");
                    } else if (comboBox.getSelectedItem().equals("Jardy") && konwerter.comboBox_1.getSelectedItem().equals("Stopy")) {
                        Obliczenia(konwerter, 3, " jardy(ów) to ", " stóp");
                    } else if (comboBox.getSelectedItem().equals("Jardy") && konwerter.comboBox_1.getSelectedItem().equals("Mile")) {
                        Obliczenia(konwerter, 0.0005681818, " jardy(ów) to ", " mil");
                    } else if (comboBox.getSelectedItem().equals("Jardy") && konwerter.comboBox_1.getSelectedItem().equals("Mile")) {
                        Obliczenia(konwerter, 0.0005681818, " jardy(ów) to ", " mil");
                    } else if (comboBox.getSelectedItem().equals("Mile") && konwerter.comboBox_1.getSelectedItem().equals("Metry")) {
                        Obliczenia(konwerter, 1609.3440000001, " mil(a) to ", " metrów");
                    } else if (comboBox.getSelectedItem().equals("Mile") && konwerter.comboBox_1.getSelectedItem().equals("Kilometry")) {
                        Obliczenia(konwerter, 1.6093440000, " mil(a) to ", " kilometrów");
                    } else if (comboBox.getSelectedItem().equals("Mile") && konwerter.comboBox_1.getSelectedItem().equals("Stopy")) {
                        Obliczenia(konwerter, 5280.0000000003, " mil(a) to ", " stóp");
                    } else if (comboBox.getSelectedItem().equals("Mile") && konwerter.comboBox_1.getSelectedItem().equals("Stopy")) {
                        Obliczenia(konwerter, 5280.0000000003, " mil(a) to ", " stóp");
                    } else if (comboBox.getSelectedItem().equals("Mile") && konwerter.comboBox_1.getSelectedItem().equals("Jardy")) {
                        Obliczenia(konwerter, 1760.0000000001, " mil(a) to ", " jardów");
                    } else {
                        JOptionPane.showMessageDialog(null, "Podaj dwie różne jednostki odległości"); // w przypadku ustawienia 2 takich samych jednostek wyskakuje powiadomienie
                    }
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Podaj tylko cyfry");
                }


            }
        });
        konwerter.btnNewButton_1.setBounds(324, 91, 89, 23);
        konwerter.frmKonwerter.getContentPane().add(konwerter.btnNewButton_1);

        konwerter.textField_1 = new JTextField(); // textField z odpowiedzią
        konwerter.textField_1.setEditable(false);
        konwerter.textField_1.setFont(new Font("Tahoma", Font.BOLD, 13));
        konwerter.textField_1.setBounds(67, 185, 300, 40);
        konwerter.frmKonwerter.getContentPane().add(konwerter.textField_1);
        konwerter.textField_1.setColumns(10);

        konwerter.lblNewLabel_1 = new JLabel("na"); // label estetyczny
        konwerter.lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        konwerter.lblNewLabel_1.setBounds(183, 93, 46, 14);
        konwerter.frmKonwerter.getContentPane().add(konwerter.lblNewLabel_1);
    }

    private static void Obliczenia(Konwerter konwerter, double v, String firstUnit, String secondUnit) {// metoda do buttona "licz"
        double firstNumber, secondNumber, result; // firstNumber to liczba która mówi ile jednostki a jest w jednostce b. secondNumber to liczba jednostki konwertowanej. podawana jest przez uzytkownika. result to wynik liczenia
        firstNumber= v;
        secondNumber= Double.parseDouble(konwerter.textField.getText());
        result=firstNumber*secondNumber;
        String resultString= Double.toString(result);
        konwerter.textField_1.setText(konwerter.textField.getText()+firstUnit+resultString+secondUnit);
    }
}
class Wybor{  // klasa przechowujaca elementy comboBoxow w tablicy String
    public static String[] lista1 ={"Metry", "Kilometry","Stopy","Jardy","Mile"};
    public static String[] lista2 ={"Metry", "Kilometry","Stopy","Jardy","Mile"};

}