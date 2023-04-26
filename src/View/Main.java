package View;

import Controller.Rec;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int N = 13;
		while (N < 0 || N > 12) {
			N = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero do fatorial"));
		}
		Rec R = new Rec();
		System.out.println(R.FatR(N));
		
	}
}
