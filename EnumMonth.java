import javax.swing.JOptionPane;

public class EnumMonth{
public enum Month {Janurary, Feburary, March, April, May, June, July, August,
			September, October, November, December}
public static void main (String [] args){ 

	Month[] choices = {Month.Janurary, Month.Feburary, Month.March, Month.April, 
		Month.May, Month.June, Month.July, Month.August, Month.September, 
		Month.October, Month.November, Month.December};

	Month input = (Month) JOptionPane.showInputDialog(null, "What month is it?",
					"Month", JOptionPane.INFORMATION_MESSAGE, 
					 null, choices, choices [0]);

	while (input != null) {
		switch (input){
			case December:
			case Janurary:
			case Feburary:
				JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
				break;

			case March:
			case April:
			case May:
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				break;

			case June:
			case July:
			case August:
				JOptionPane.showMessageDialog(null, "It's summer time!");
				break;

			case September:
			case October:
			case November:
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
				break;
				}

	input = (Month) JOptionPane.showInputDialog(null, "What month is it?",
					"Month", JOptionPane.INFORMATION_MESSAGE, 
					null, choices, choices [0]);

}
}

	
}

