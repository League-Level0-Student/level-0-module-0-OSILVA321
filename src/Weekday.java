import javax.swing.JOptionPane;
public class Weekday {
	public static void main(String[] args) {
		String ruler=JOptionPane.showInputDialog("Is it a weekday?" );
		
		
		if(ruler.equals("Yes")) {
			
		String Vac=JOptionPane.showInputDialog("Are you on vacation?" );
		
		if(Vac.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Okay you can sleep in.");
			
			
			{
				if(Vac.equals("No")) {
				JOptionPane.showMessageDialog(null, "You should probably wake up.");
			}
		
		  }
		}
		
	
		else{
			JOptionPane.showMessageDialog(null, "Okay you can sleep in.");	
			
		}
	
	
}
}
}