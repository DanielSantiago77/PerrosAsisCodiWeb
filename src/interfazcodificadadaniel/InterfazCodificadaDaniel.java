
package interfazcodificadadaniel;

/**
 *
 * @author DANIEL BARRANTES
 */

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class InterfazCodificadaDaniel extends JFrame implements ActionListener {

    JLabel l1,l5;
    JTextField t1;
    JLabel l2;
    JTextField t2;
    JLabel l3;
    JTextField t3;
    JLabel l4;
    JTextField t4;

    JButton b1;

    public static void main(String[] args) {
        
        InterfazCodificadaDaniel gato = new InterfazCodificadaDaniel();
    }

    public InterfazCodificadaDaniel() {

        setBounds(300, 250, 500, 500); // Ajustar el tamaño de la ventana
        setLayout(new FlowLayout());
        setBackground(Color.lightGray);

        l1 = new JLabel("Escribe cuantas horas vas a pasear a los perros");
        t1 = new JTextField(7);

        l2 = new JLabel("Escribe cuantos perros Grandes vas a pasear");
        t2 = new JTextField(7);

        l3 = new JLabel("Escribe cuantos perros Medianos vas a pasear");
        t3 = new JTextField(7);

        l4 = new JLabel("Escribe cuantos perros Pequeños vas a pasear");
        t4 = new JTextField(7);
        
        l5 = new JLabel();
        
        l5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfazCodificadaDaniel/alturaperros.png")));

        b1 = new JButton("CALCULO TOTAL");
        b1.addActionListener(this);
        
        l1.setForeground(Color.blue);
        l2.setForeground(Color.blue);
        l3.setForeground(Color.blue);
        l4.setForeground(Color.blue);
        b1.setBackground(Color.green);
        b1.setForeground(Color.black);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);

        add(b1);
        
        add(l5);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
        if (accion.equals("CALCULO TOTAL")) { 

                int numh=Integer.parseInt(t1.getText());
                int numpG=Integer.parseInt(t2.getText());
                int numpM=Integer.parseInt(t3.getText());
                int numpP=Integer.parseInt(t4.getText());
                
                int operacion = (numpG*10000 + numpM*5000+numpP*3000)*numh;
                int sumaoperacion= numpG+numpM+numpP;
                if (sumaoperacion > 1) {
                int descuento = (int) (operacion * 0.10);
                operacion -= descuento;
                System.out.println("el costo total de los perros paseados son = "+operacion);
                }

                JOptionPane.showMessageDialog(this, "Total a pagar: " + operacion);
        }
    }
}