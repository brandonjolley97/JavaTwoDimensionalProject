package morning.view;

import javax.swing.*;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

import morning.controller.TwoDController;

public class TwoDPanel extends JPanel
{
	private TwoDController baseController;
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField columnField;
	private JLabel currentAlienPodLabel;
	private JTextField editField;
	private JButton changeButton;
	private JButton displayButton;
	
	private JTable alienPodTable;
	
	public TwoDPanel(TwoDController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		rowField = new JTextField(5);
		columnField = new JTextField(20);
		editField = new JTextField(10);
		currentAlienPodLabel = new JLabel("the current alien pod");
		changeButton = new JButton("Change the indicated alien pod");
		displayButton = new JButton("Display the indicated alien pod");
		
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupTable()
	{
		String [] columnHeaders = {"Column 0", "Column 1", "Column 2"};
		DefaultTableModel tableModel = new DefaultTableModel(baseController.getMyAlienPod(), columnHeaders);
		alienTable = new JTable(tableModel); 
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(currentAlienPodLabel);
		this.add(rowField);
		this.add(columnField);
		this.add(editField);
		this.add(changeButton);
		this.add(displayButton);
	}
	
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		
	}
}
