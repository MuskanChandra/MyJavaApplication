package Restuarent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;

public class RestaurentSystem {

	private JFrame frame;
	private JTextField txtNew;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurentSystem window = new RestaurentSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RestaurentSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1370, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 71, 614, 262);
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Burger");
		lblNewLabel_1.setBounds(26, 25, 209, 30);
		lblNewLabel_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		panel.add(lblNewLabel_1);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setBounds(26, 65, 230, 30);
		lblChickenBurgerMeal.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		panel.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setBounds(26, 106, 230, 30);
		lblCheeseBurger.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		panel.add(lblCheeseBurger);
		
		txtNew = new JTextField();
		txtNew.setBounds(370, 25, 209, 30);
		txtNew.setFont(new Font("Tennessee SF", Font.BOLD | Font.ITALIC, 24));
		panel.add(txtNew);
		txtNew.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(370, 65, 209, 30);
		textField.setFont(new Font("Tennessee SF", Font.BOLD | Font.ITALIC, 24));
		textField.setColumns(10);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(370, 106, 209, 30);
		textField_1.setFont(new Font("Tennessee SF", Font.BOLD | Font.ITALIC, 24));
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(370, 182, 209, 30);
		textField_3.setFont(new Font("Tennessee SF", Font.BOLD | Font.ITALIC, 24));
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		JLabel lblSoftDrinks = new JLabel("Drinks");
		lblSoftDrinks.setBounds(26, 147, 230, 30);
		lblSoftDrinks.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		panel.add(lblSoftDrinks);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Soft Drinks", "Slice", "CokaCola", "Pepsi", "Fenta", "Sprite", "Coffee", "Ice Coffee", "Orange", "Tea", "Lemon Tea", "Hot Water", "Milk Tea", "Milk Coffee", "Apple Juice", "Americano", "Capachino"}));
		comboBox.setBounds(26, 185, 230, 30);
		panel.add(comboBox);
		
		JLabel lblQuantity = new JLabel("Quantity :");
		lblQuantity.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		lblQuantity.setBounds(370, 147, 145, 30);
		panel.add(lblQuantity);
		
		JCheckBox chckbxTax = new JCheckBox("Tax");
		chckbxTax.setFont(new Font("Timpani-Bold", Font.PLAIN, 24));
		chckbxTax.setBounds(370, 219, 97, 23);
		panel.add(chckbxTax);
		
		JCheckBox chckbxHomeDelivery = new JCheckBox("Home Delivery");
		chckbxHomeDelivery.setFont(new Font("Timpani-Bold", Font.PLAIN, 24));
		chckbxHomeDelivery.setBounds(26, 222, 220, 33);
		panel.add(chckbxHomeDelivery);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(26, 147, 553, 7);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		panel_1.setBounds(20, 348, 614, 181);
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCostOfDeliver = new JLabel("Cost of Delivery");
		lblCostOfDeliver.setBounds(20, 92, 230, 30);
		lblCostOfDeliver.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		panel_1.add(lblCostOfDeliver);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setBounds(20, 51, 230, 30);
		lblCostOfMeal.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		panel_1.add(lblCostOfMeal);
		
		JLabel lblCostOfSoft = new JLabel("Cost of Soft Drinks");
		lblCostOfSoft.setBounds(20, 11, 209, 30);
		lblCostOfSoft.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 26));
		panel_1.add(lblCostOfSoft);
		
		JLabel lblCostOfSnakes = new JLabel("Cost of Snakes");
		lblCostOfSnakes.setBounds(20, 133, 230, 30);
		lblCostOfSnakes.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		panel_1.add(lblCostOfSnakes);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_6.setBounds(371, 11, 220, 30);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_7.setBounds(371, 51, 220, 30);
		panel_1.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_8.setBounds(371, 92, 220, 30);
		panel_1.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_9.setBounds(371, 133, 220, 30);
		panel_1.add(panel_9);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(20, 540, 1324, 110);
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(1012, 71, 332, 458);
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 28, 312, 419);
		panel_3.add(tabbedPane);
		
		JPanel panel_13 = new JPanel();
		panel_13.setToolTipText("");
		tabbedPane.addTab("Receipt", null, panel_13, null);
		panel_13.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setBounds(0, 0, 307, 391);
		panel_13.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_14 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_14, null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(644, 71, 358, 262);
		panel_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		frame.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(644, 348, 358, 181);
		panel_5.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_10.setBounds(222, 21, 115, 30);
		panel_5.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_11.setBounds(222, 76, 115, 30);
		panel_5.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_12.setBounds(222, 127, 115, 30);
		panel_5.add(panel_12);
		
		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		lblTotal.setBounds(21, 127, 162, 30);
		panel_5.add(lblTotal);
		
		JLabel lblSubTotal = new JLabel("Sub Total :");
		lblSubTotal.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		lblSubTotal.setBounds(21, 76, 162, 30);
		panel_5.add(lblSubTotal);
		
		JLabel lblTax = new JLabel("Tax :");
		lblTax.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 26));
		lblTax.setBounds(21, 21, 162, 30);
		panel_5.add(lblTax);
		
		JLabel lblNewLabel = new JLabel("Loan Management Systems");
		lblNewLabel.setBackground(new Color(0, 0, 128));
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 57));
		lblNewLabel.setBounds(320, 0, 739, 72);
		frame.getContentPane().add(lblNewLabel);
	}
}
