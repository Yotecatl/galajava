
/**
 *
 * @author jorge
 * curso y asesorias de programación
 */
public class main {
    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioFrame().setVisible(true);
            }
        });
    }
}
