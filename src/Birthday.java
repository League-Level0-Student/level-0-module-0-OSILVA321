import javax.swing.JOptionPane;

public class Birthday {
	public static void main(String[] args) {
		String height=JOptionPane.showInputDialog("How tall are you in inches?" );
	int height2 = Integer.parseInt(height);
	if(height2>60) {
	JOptionPane.showMessageDialog(null, "You can go ahead and ride the rollercoaster.");
		
	}
	else {
		JOptionPane.showMessageDialog(null, "Sorry you are too short to ride this roller coaster.");
		
	}
	
	
}
}
