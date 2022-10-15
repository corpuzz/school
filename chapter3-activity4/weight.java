import javax.swing.JOptionPane;

public class weight {
    public static void main(String[] args) {
        double kg = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your weight(in kg): "));
        double lbs = kg * 2.2;

        JOptionPane.showMessageDialog(
            null, 
            "Weight in kilograms: " + String.format("%.2f", kg ) + "kg" +
            "\nWeight in pounds: " + String.format("%.2f", lbs ) + "lbs" ,
            "Weight",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
