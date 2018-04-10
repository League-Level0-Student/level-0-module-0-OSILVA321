import javax.swing.JOptionPane;
public class Greeter {
	public static void main(String[] args) {
		String ruler=JOptionPane.showInputDialog("Do know how to code?" );
		if(ruler.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Fantastic, you will rule the world!");
		
		}
		else{
			JOptionPane.showMessageDialog(null, "You should probably practice mopping floors.");	
			
		}
}
}