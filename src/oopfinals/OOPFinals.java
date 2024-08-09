
package oopfinals;

public class OOPFinals {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Welcome welcome = new Welcome();
                welcome.setVisible(true);
            }
        });
    }
}
