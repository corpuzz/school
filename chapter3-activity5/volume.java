import javax.swing.JOptionPane;
public class volume {
    public static void main(String[] args) {
        double mass = Double.parseDouble(JOptionPane.showInputDialog(
            null, 
            "Enter the mass (in grams): "
        ));
        double density = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Enter the density: "
        ));

        double volume = mass / density;

        JOptionPane.showMessageDialog(
            null, 
            "Volume: " + String.format("%.2f", volume) + " g/cm³", 
            "Volume", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}
