package Restuarent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.security.auth.Subject; 
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class RestaurentSystem {

	private JFrame frame;
	private JTextField btnChickenBurger;
	private JTextField btnChickenBurgerMeal;
	private JTextField btnCheeseBurger;
	private JTextField Quantity;
	private JTextField Receipt;
	private JTextField Currency;

	
	double[] i = new double[5];
	
	double India = 1.6;
	double USA = 105;
	double Canada = 70;
	double Australia = 50.50;
	double China = 45.75;
	double Russia = 20.50;
	double Bhutan = 0.5;
	double Pakistan = 1.02;
	 // protected JLabel jBtnConvert;

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
		panel.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		panel.setBounds(20, 71, 614, 262);
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel ChBurger = new JLabel("Chicken Burger");
		ChBurger.setBounds(26, 25, 209, 30);
		ChBurger.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		panel.add(ChBurger);
		
		JLabel ChBurgerMeal = new JLabel("Chicken Burger Meal");
		ChBurgerMeal.setBounds(26, 65, 230, 30);
		ChBurgerMeal.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		panel.add(ChBurgerMeal);
		
		JLabel CheeseBurger = new JLabel("Cheese Burger");
		CheeseBurger.setBounds(26, 106, 230, 30);
		CheeseBurger.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		panel.add(CheeseBurger);
		
		btnChickenBurger = new JTextField();
		btnChickenBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		btnChickenBurger.setBounds(370, 25, 209, 30);
		btnChickenBurger.setFont(new Font("Tennessee SF", Font.BOLD | Font.ITALIC, 24));
		panel.add(btnChickenBurger);
		btnChickenBurger.setColumns(10);
		
		btnChickenBurgerMeal = new JTextField();
		btnChickenBurgerMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		btnChickenBurgerMeal.setBounds(370, 65, 209, 30);
		btnChickenBurgerMeal.setFont(new Font("Tennessee SF", Font.BOLD | Font.ITALIC, 24));
		btnChickenBurgerMeal.setColumns(10);
		panel.add(btnChickenBurgerMeal);
		
		btnCheeseBurger = new JTextField();
		btnCheeseBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		btnCheeseBurger.setBounds(370, 106, 209, 30);
		btnCheeseBurger.setFont(new Font("Tennessee SF", Font.BOLD | Font.ITALIC, 24));
		btnCheeseBurger.setColumns(10);
		panel.add(btnCheeseBurger);
		
		Quantity = new JTextField();
		Quantity.setHorizontalAlignment(SwingConstants.RIGHT);
		Quantity.setBounds(370, 182, 209, 30);
		Quantity.setFont(new Font("Tennessee SF", Font.BOLD | Font.ITALIC, 24));
		Quantity.setColumns(10);
		panel.add(Quantity);
		
		JLabel SoftDrinksItems = new JLabel("Drinks");
		SoftDrinksItems.setBounds(26, 147, 230, 30);
		SoftDrinksItems.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		panel.add(SoftDrinksItems);
		
		JComboBox SelectSoftDrinks = new JComboBox();
		SelectSoftDrinks.setFont(new Font("Tahoma", Font.BOLD, 15));
		SelectSoftDrinks.setModel(new DefaultComboBoxModel(new String[] {"Select Soft Drinks", "Slice", "CokaCola", "Pepsi", "Fenta", "Sprite", "Coffee", "Ice_Coffee", "Orange", "Tea", "Lemon_Tea", "Hot_Water", "Milk_Tea", "Milk_Coffee", "Apple_Juice", "Americano", "Capachino"}));
		SelectSoftDrinks.setBounds(26, 185, 230, 30);
		panel.add(SelectSoftDrinks);
		
		JLabel Qty = new JLabel("Quantity :");
		Qty.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		Qty.setBounds(370, 147, 145, 30);
		panel.add(Qty);
		
		JCheckBox TaxBox = new JCheckBox("Tax");
		TaxBox.setFont(new Font("Timpani-Bold", Font.PLAIN, 24));
		TaxBox.setBounds(370, 219, 97, 23);
		panel.add(TaxBox);
		
		JCheckBox HomeDelivery = new JCheckBox("Home Delivery");
		HomeDelivery.setFont(new Font("Timpani-Bold", Font.PLAIN, 24));
		HomeDelivery.setBounds(26, 222, 220, 33);
		panel.add(HomeDelivery);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(36, 142, 553, 7);
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
		
		JLabel CostOfDelivery = new JLabel("Cost of Delivery :");
		CostOfDelivery.setBounds(20, 116, 230, 30);
		CostOfDelivery.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		panel_1.add(CostOfDelivery);
		
		JLabel CostOfMeal = new JLabel("Cost of Meal :");
		CostOfMeal.setBounds(20, 62, 230, 30);
		CostOfMeal.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		panel_1.add(CostOfMeal);
		
		JLabel CostOfDrinks = new JLabel("Cost of Soft Drinks :");
		CostOfDrinks.setBounds(20, 11, 209, 30);
		CostOfDrinks.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 26));
		panel_1.add(CostOfDrinks);
		
		JLabel DrinksPrice = new JLabel("");
		DrinksPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		DrinksPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		DrinksPrice.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		DrinksPrice.setBounds(371, 11, 220, 38);
		panel_1.add(DrinksPrice);
		
		JLabel MealPrice = new JLabel("");
		MealPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		MealPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		MealPrice.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		MealPrice.setBounds(371, 62, 220, 38);
		panel_1.add(MealPrice);
		
		JLabel DeliveryPrice = new JLabel("");
		DeliveryPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		DeliveryPrice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		DeliveryPrice.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		DeliveryPrice.setBounds(371, 111, 220, 38);
		panel_1.add(DeliveryPrice);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(20, 540, 1324, 110);
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton jBtnTotal = new JButton("Total");
		
		jBtnTotal.setFont(new Font("Theory of Cremation", Font.BOLD, 16));
		jBtnTotal.setBounds(408, 34, 101, 31);
		panel_2.add(jBtnTotal);
		
		JButton jBtnReceipt = new JButton("Receipt");
		jBtnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				/*	  double Qty = Double.parseDouble(btnCheeseBurger.getText());
				double Qty1 = Double.parseDouble(btnChickenBurger.getText());
				double Qty2 = Double.parseDouble(btnChickenBurgerMeal.getText());
				
				  Receipt.append("\h\nHotel Management System:\n\n" + "Chicken Burger:\h\h"
				+ Qty + "\nChicken Burger Meal:\t\t" + 
					Qty1 + "\nCheese Burger:\h\h" +
				Qty2 + "\n\nThank you very much for Your Visiting in Our Hotel");  */
			}
		});
		
		jBtnReceipt.setFont(new Font("Theory of Cremation", Font.BOLD, 14));
		jBtnReceipt.setBounds(554, 34, 114, 31);
		panel_2.add(jBtnReceipt);
		
		JButton jBtnReset = new JButton("Reset");
		
		jBtnReset.setFont(new Font("Theory of Cremation", Font.BOLD, 16));
		jBtnReset.setBounds(710, 34, 101, 31);
		panel_2.add(jBtnReset);
		
		JButton jBtnExit = new JButton("Exit");
		jBtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(0);
			}
		});
		jBtnExit.setFont(new Font("Theory of Cremation", Font.BOLD, 16));
		jBtnExit.setBounds(850, 34, 89, 31);
		panel_2.add(jBtnExit);
		
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
		
		Receipt = new JTextField();
		Receipt.setBounds(0, 0, 307, 391);
		panel_13.add(Receipt);
		Receipt.setColumns(10);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(238, 232, 170));
		tabbedPane.addTab("Calculator", null, panel_14, null);
		panel_14.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(644, 71, 358, 262);
		panel_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JComboBox SelectCountry = new JComboBox();
		SelectCountry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		SelectCountry.setBounds(64, 11, 230, 30);
		SelectCountry.setModel(new DefaultComboBoxModel(new String[] {"Choose One....", "India", "USA", "Canada", "Australia", "China", "Russia", "Bhutan", "Pakistan"}));
		SelectCountry.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_4.add(SelectCountry);
		
		Currency = new JTextField();
		Currency.setHorizontalAlignment(SwingConstants.CENTER);
		Currency.setBounds(42, 64, 278, 55);
		Currency.setFont(new Font("Tennessee SF", Font.BOLD | Font.ITALIC, 24));
		Currency.setColumns(10);
		panel_4.add(Currency);
		
		JButton jBtnConvert = new JButton("Convert");
		
		jBtnConvert.setBounds(31, 206, 119, 31);
		jBtnConvert.setFont(new Font("Theory of Cremation", Font.BOLD, 16));
		panel_4.add(jBtnConvert);
		
		JButton jBtnClose = new JButton("Close");
		
		jBtnClose.setBounds(194, 206, 112, 31);
		jBtnClose.setFont(new Font("Theory of Cremation", Font.BOLD, 16));
		panel_4.add(jBtnClose);
		
		JLabel ConvertCurrency = new JLabel("");
		ConvertCurrency.setHorizontalAlignment(SwingConstants.CENTER);
		ConvertCurrency.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ConvertCurrency.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		ConvertCurrency.setBounds(51, 142, 269, 39);
		panel_4.add(ConvertCurrency);
		
		JPanel panel_5 = new JPanel();
		panel_5.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		panel_5.setBounds(644, 348, 358, 181);
		panel_5.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel Total = new JLabel("Total :");
		Total.setBounds(21, 127, 162, 30);
		Total.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		panel_5.add(Total);
		
		JLabel SubTotal = new JLabel("Sub Total :");
		SubTotal.setBounds(21, 76, 162, 30);
		SubTotal.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 28));
		panel_5.add(SubTotal);
		
		JLabel tax = new JLabel("Tax :");
		tax.setBounds(21, 21, 162, 30);
		tax.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 26));
		panel_5.add(tax);
		
		JLabel textTax = new JLabel("");
		textTax.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		textTax.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		textTax.setHorizontalAlignment(SwingConstants.RIGHT);
		textTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textTax.setBounds(193, 21, 144, 30);
		panel_5.add(textTax);
		
		JLabel textSubTotal = new JLabel("");
		textSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		textSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textSubTotal.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		textSubTotal.setBounds(193, 76, 144, 30);
		panel_5.add(textSubTotal);
		
		JLabel textTotal = new JLabel("");
		textTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		textTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textTotal.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		textTotal.setBounds(193, 127, 144, 30);
		panel_5.add(textTotal);
		
		JLabel lblNewLabel = new JLabel("Hotel Management Systems");
		lblNewLabel.setBackground(new Color(0, 0, 128));
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 57));
		lblNewLabel.setBounds(320, 0, 739, 72);
		
		
		jBtnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
			/*	if(btnChickenBurger.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "btnChickenBurger.getText() is empty");
					return;
				}  */
				
				double ChickenBurger = Double.parseDouble(btnChickenBurger.getText());
				double ichickenBurger = 150.75;
				double Burger;
				
				Burger = (ChickenBurger * ichickenBurger);
				String pMeal = String.format("Rs. %.2f", Burger);
				MealPrice.setText(pMeal);
				
				
				/*  if(btnChickenBurgerMeal.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "btnChickenBurgermeal.getText() is empty");
					return;
				}    */
				
				double ChBurgerMeal = Double.parseDouble(btnChickenBurgerMeal.getText());
				double ichBurgerMeal = 300.35;
				double BurgerMeal;
				
				BurgerMeal = (ChBurgerMeal * ichBurgerMeal);
				String MPrice = String.format("Rs. %.2f", BurgerMeal + Burger);
				MealPrice.setText(MPrice);
				
				double CheeBurger = Double.parseDouble(btnCheeseBurger.getText());
				double ChBurgerPrice = 250.50;
				double CheeseBurger;
				
				CheeseBurger = (CheeBurger * ChBurgerPrice);
				String cheese = String.format("Rs. %.2f", BurgerMeal + Burger + CheeseBurger);
				MealPrice.setText(cheese);
				
				
				// ---------------------------------------Home Delivery-------------------------------------
				int iDelivery = 20;
				if(HomeDelivery.isSelected())
				{
					String PriceDelivery = String.format("Rs. %.2f", iDelivery);
					DeliveryPrice.setText(PriceDelivery);
				}
				else
				{
					DeliveryPrice.setText("0");
				}
				
				
		//---------------------------------------Soft Drinks-----------------------------------------------------
				
				double Drinks = Double.parseDouble(Quantity.getText());
				double Slice = 40.50 * Drinks;
				double Cokacola = 40.50 * Drinks;
				double Pepsi = 40.50 * Drinks;
				double Fenta = 40.50 * Drinks;
				double Sprite = 40.50 * Drinks;
				double Coffee = 50.25 * Drinks;
				double Ice_Coffee = 150.30 * Drinks;
				double Orange = 150.50 * Drinks;
				double Tea = 20.60 * Drinks;
				double Lemon_Tea = 30.10 * Drinks;
				double Hot_Water = 5.75 * Drinks;
				double Milk_Tea = 40.50 * Drinks;
				double Milk_Coffee = 100.80 * Drinks;
				double Apple_Juice = 80.40 * Drinks;
				double Americano = 220.00 * Drinks;
				double Capachino = 210.20 * Drinks;
				
				if(SelectSoftDrinks.getSelectedItem().equals("Slice"))
				{
					String SSlice = String.format("%.2f", Slice);
					DrinksPrice.setText(SSlice);
				}
				
				if(SelectSoftDrinks.getSelectedItem().equals("Cokacola"))
				{
					String SCokacola = String.format("%.2f", Cokacola);
					DrinksPrice.setText(SCokacola);
				}
				
				if(SelectSoftDrinks.getSelectedItem().equals("Pepsi"))
				{
					String SPepsi = String.format("%.2f", Pepsi);
					DrinksPrice.setText(SPepsi);
				}
				
				if(SelectSoftDrinks.getSelectedItem().equals("Fenta"))
				{
					String SFenta = String.format("%.2f", Fenta);
					DrinksPrice.setText(SFenta);
				}
				
				if(SelectSoftDrinks.getSelectedItem().equals("Sprite"))
				{
					String SSprite = String.format("%.2f", Sprite);
					DrinksPrice.setText(SSprite);
				}
				
				if(SelectSoftDrinks.getSelectedItem().equals("Coffee"))
				{
					String SCoffee = String.format("%.2f", Coffee);
					DrinksPrice.setText(SCoffee);
				}
				
				if(SelectSoftDrinks.getSelectedItem().equals("Ice Coffee"))
				{
					String SIce_Coffee = String.format("%.2f", Ice_Coffee);
					DrinksPrice.setText(SIce_Coffee);
				}
				
				if(SelectSoftDrinks.getSelectedItem().equals("Orange"))
				{
					String SOrange = String.format("%.2f", Orange);
					DrinksPrice.setText(SOrange);
				}
				
				if(SelectSoftDrinks.getSelectedItem().equals("Tea"))
				{
					String STea = String.format("%.2f", Tea);
					DrinksPrice.setText(STea);
				}
				
				if(SelectSoftDrinks.getSelectedItem().equals("Lemon Tea"))
				{
					String SLemon_Tea = String.format("%.2f", Lemon_Tea);
					DrinksPrice.setText(SLemon_Tea);
				}
				
				if(SelectSoftDrinks.getSelectedItem().equals("Hot Water"))
				{
					String SHot_Water = String.format("%.2f", Hot_Water);
					DrinksPrice.setText(SHot_Water);
				}
				
				if(SelectSoftDrinks.getSelectedItem().equals("Milk Tea"))
				{
					String SMilk_Tea = String.format("%.2f", Milk_Tea);
					DrinksPrice.setText(SMilk_Tea);
				}
				
				if(SelectSoftDrinks.getSelectedItem().equals("Milk Coffee"))
				{
					String SMilk_Coffee = String.format("%.2f", Milk_Coffee);
					DrinksPrice.setText(SMilk_Coffee);
				}
				
				if(SelectSoftDrinks.getSelectedItem().equals("Apple Juice"))
				{
					String SApple_Juice = String.format("%.2f", Apple_Juice);
					DrinksPrice.setText(SApple_Juice);
				}
				
				if(SelectSoftDrinks.getSelectedItem().equals("Americano"))
				{
					String SAmericano = String.format("%.2f", Americano);
					DrinksPrice.setText(SAmericano);
				}
				
				if(SelectSoftDrinks.getSelectedItem().equals("Capachino"))
				{
					String SCapachino = String.format("%.2f", Capachino);
					DrinksPrice.setText(SCapachino);
				}
				
				if(SelectSoftDrinks.getSelectedItem().equals("Select Soft Drinks"))
				{
					DrinksPrice.setText("0");
				}
				
				
				
		//------------------------------------------------Tax Rate------------------------------------------------------
				
				double cTotal = Double.parseDouble(DeliveryPrice.getText());
				double cTotal1 = Double.parseDouble(DrinksPrice.getText());
				double cTotal2 = Double.parseDouble(MealPrice.getText());
				double AllTotal = (cTotal + cTotal1 + cTotal2) /100;
				
				if(TaxBox.isSelected())
				{
					String iTotal = String.format("Rs. %.2f", AllTotal);
					textTax.setText(iTotal);
				}
				

		
		//------------------------------------------------Total------------------------------------------------------
		
			double cTotal4 = Double.parseDouble(textTax.getText());
			
			double subTotal = (cTotal + cTotal1 + cTotal2);
			String isubTotal = String.format("Rs. %.2f", subTotal);
			textSubTotal.setText(isubTotal);
			
			double Total = (cTotal + cTotal1 + cTotal2 + cTotal4);
			String iTotal = String.format("Rs. %.2f", Total);
			textTotal.setText(iTotal);
			
			String iTax = String.format("Rs. %.2f", cTotal4);
			textTax.setText(iTax);
			
			
			}
		});
		
		jBtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				DeliveryPrice.setText(null);
				MealPrice.setText(null);
				DrinksPrice.setText(null);
				btnChickenBurger.setText(null);
				btnCheeseBurger.setText(null);
				btnChickenBurgerMeal.setText(null);
				Quantity.setText(null);
				Currency.setText(null);
				textTax.setText(null);
				textSubTotal.setText(null);
				textTotal.setText(null);
				ConvertCurrency.setText(null);
				SelectCountry.setSelectedItem("Choose One....");
				SelectSoftDrinks.setSelectedItem("Select Soft Drinks");
			
		
			}
		});
		
		jBtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
					
				double Nepali_Rupees = Double.parseDouble(Currency.getText());
				if(SelectCountry.getSelectedItem().equals("USA"))
					{
						String Convert1 = String.format("$ %.2f", Nepali_Rupees * USA);
						ConvertCurrency.setText(Convert1);
					}
				
				if(SelectCountry.getSelectedItem().equals("India"))
					{
						String Convert2 = String.format("Ic: %.2f", Nepali_Rupees *India);
						ConvertCurrency.setText(Convert2);
					}
			
				if(SelectCountry.getSelectedItem().equals("Canada"))
					{
						String Convert3 = String.format("Ca$ %.2f", Nepali_Rupees * Canada);
						ConvertCurrency.setText(Convert3);
					}
				
				if(SelectCountry.getSelectedItem().equals("Australia"))
					{
						String Convert4 = String.format("A$ %.2f", Nepali_Rupees * Australia);
						ConvertCurrency.setText(Convert4);
					}
				
				if(SelectCountry.getSelectedItem().equals("Pakistan"))
					{
						String Convert5 = String.format("P$ %.2f", Nepali_Rupees * Pakistan);
						ConvertCurrency.setText(Convert5);
					}
				
				if(SelectCountry.getSelectedItem().equals("Bhutan"))
					{
						String Convert6 = String.format("B$ %.2f", Nepali_Rupees * Bhutan);
						ConvertCurrency.setText(Convert6);
					}
				
				if(SelectCountry.getSelectedItem().equals("China"))
					{
						String Convert7 = String.format("C$ %.2f", Nepali_Rupees * China);
						ConvertCurrency.setText(Convert7);
					}
				
				if(SelectCountry.getSelectedItem().equals("Russia"))
					{
						String Convert8 = String.format("R$ %.2f", Nepali_Rupees * Russia);
						ConvertCurrency.setText(Convert8);
					}
		
			}
		});
		
		// ------------------------------------------Close--------------------------------------
		jBtnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				Currency.setText(null);
				ConvertCurrency.setText(null);
				SelectCountry.setSelectedItem("Choose One....");
				
			}
		});
		
		frame.getContentPane().add(lblNewLabel);
	}
}
