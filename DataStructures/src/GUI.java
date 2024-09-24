import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class GUI extends JFrame {
	

private JTextField input = new JTextField("input name");
private JButton addButton = new JButton("Add");
private JList list = new JList();
private JButton shuffleButton = new JButton("Shuffle");
private JPanel panel = new JPanel();
private DefaultListModel<String> model = new DefaultListModel<>();
private JScrollPane scrollPane;


public GUI() {
	
	list.setModel(model);
	scrollPane = new JScrollPane(list);
	
	panel.add(input);
	panel.add(addButton);
	panel.add(scrollPane);
	panel.add(shuffleButton);
	
	
	addButton.addActionListener(new ActionListener() {

		
		public void actionPerformed(ActionEvent e) {
			model.addElement(input.getText()); 
			
		}
	});
	
	shuffleButton.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			ArrayList<String> nameList = Collections.list(model.elements());
			
			Collections.shuffle(nameList);
			
			model.clear();
			
			for(String name: nameList)
				model.addElement(name);
		}
		
		
	});
	
	this.setContentPane(panel);
	
    this.setVisible(true);
    this.setSize(300, 300);
    this.setTitle("Collections test");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}




}

