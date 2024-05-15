package code;
import java.time.LocalTime;
import java.util.ResourceBundle.Control;

import javax.swing.JOptionPane;

public class app {
    static cls_personal[] personal = new cls_personal[1000];
    static cls_control[] control = new cls_control[5000];
    //Control de personal
    static int pos = 0;
    static boolean sw = false;
    //Control de ingresos
    static int posc = 0;
    static boolean sw
    public static void main(String[] args) {
        fnt_menu(true);
    }
    public static void fnt_menu(boolean sw){
        while (sw) {
            String opcion = JOptionPane.showInputDialog(null, "1.Registrar Persona \n 2.Registrar Ingreso \n 3.Consultar \n 4.Salir");
            if (opcion.equals("1")){
               fnt_RegPersonas;
            }
        
        }
    }
    private static void fnt_RegPersonas(){
        String id = JOptionPane.showInputDialog(null, "Ingrese el id");
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
        String contacto = JOptionPane.showInputDialog(null, "Ingrese el contacto");
        String correo = JOptionPane.showInputDialog(null, "Ingrese el coreo");
        cls_personal objregistro = new cls_personal(id, nombre, contacto, correo);
        personal[pos] = objregistro;
        pos++;
        JOptionPane.showMessageDialog(null, "Registro Exitoso");
        }
    private static void fnt_RegControl(){
        for (int i = 0; i < pos; i++){
            if (personal[i].getIdStr().equals(id)){
                sw = true;
                break;
            }
        }
        String id = JOptionPane.showInputDialog(null, "ID");
        Date currentDate = new Date();
        LocalTime horaActual = LocalTime.now();
        Control{posc} = new cls_control(id, ""+currentDate, ""+horaActual);
        JOptionPane.showMessageDialog(null, "Ingreso registrado con exito");

    }
    }
    
}
