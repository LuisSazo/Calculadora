package modelo;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Sazo
 */
public class Archivo {

    // Metodo para guardar historial
    public void Agregar(double num1, double num2, String signo, String resultado) {
        try {
            File f = new File("BitacoraCalculadora.txt");
            FileWriter fw;
            BufferedWriter bw;
            if (f.exists() && f.length() != 0) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write("Nueva Operacion \n" + num1 + signo + num2 + " = " + resultado);
            } else {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.write("Nueva Operacion \n" + num1 + signo + num2 + " = " + resultado);
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
    }
    
}
