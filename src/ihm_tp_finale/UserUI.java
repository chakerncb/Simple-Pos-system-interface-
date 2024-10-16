package ihm_tp_finale;

import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class UserUI {

	
	public UserUI() {
		
		JFrame frame = new JFrame();
		
		frame.setTitle("POS system -by: chaker necibi-");
		frame.setBounds( 60, 60, 1163, 603);
	    frame.setResizable(true);
	    frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	     JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(10, 11, 1129, 544);
			frame.add(tabbedPane);
			
			
			
	//panel for the clients	
			
			JPanel orders_panel = new JPanel();
			orders_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
			tabbedPane.addTab("Orders", null, orders_panel, null);
			orders_panel.setLayout(null);
			
			
		//layered pane for the commands
			
			JLayeredPane commands_layer = new JLayeredPane();
			commands_layer.setBorder(new TitledBorder(null, "Commands:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(146, 146, 146)));
			commands_layer.setBounds(10, 11, 218, 516);
			orders_panel.add(commands_layer);
			
			
			
			JLabel Order_ID = new JLabel("Order ID:");
			Order_ID.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
			Order_ID.setBounds(10, 26, 74, 37);
			commands_layer.add(Order_ID);
			
			JTextField txtOrderId = new JTextField();
			txtOrderId.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
			txtOrderId.setBounds(39, 62, 139, 39);
			txtOrderId.setText("              Order ID");
			txtOrderId.setColumns(8);
			txtOrderId.setEditable(false);
			commands_layer.add(txtOrderId);
			
			//layered pane for the sub commands -buttons-
			
			JLayeredPane sub_commands_layer = new JLayeredPane();
			sub_commands_layer.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			sub_commands_layer.setBounds(10, 116, 198, 389);
			commands_layer.add(sub_commands_layer);
			
			
			
			JButton Save_btn = new JButton("Save");
			Save_btn.setBounds(10, 11, 178, 39);
			Save_btn.setBackground(new Color(0, 193, 0));
			sub_commands_layer.add(Save_btn);
			Save_btn.setFont(new Font("Dialog", Font.BOLD, 14));
			
			JButton Cancel_btn = new JButton("Cancel");
			Cancel_btn.setBackground(new Color(244, 181, 11));
			Cancel_btn.setBounds(10, 74, 178, 39);
			sub_commands_layer.add(Cancel_btn);
			Cancel_btn.setFont(new Font("Dialog", Font.BOLD, 14));
			
			JButton Edit_btn = new JButton("Edit");
			Edit_btn.setBackground(new Color(0, 128, 255));
			Edit_btn.setBounds(10, 133, 178, 39);
			sub_commands_layer.add(Edit_btn);
			Edit_btn.setFont(new Font("Dialog", Font.BOLD, 14));
			
			JButton table_rls_btn = new JButton("Realease Table");
			table_rls_btn.setBounds(10, 190, 178, 37);
			sub_commands_layer.add(table_rls_btn);
			table_rls_btn.setFont(new Font("Dialog", Font.BOLD, 14));
			
			JButton Refresh_btn = new JButton("Refresh");
			Refresh_btn.setFont(new Font("Dialog", Font.BOLD, 14));
			Refresh_btn.setBounds(10, 243, 178, 39);
			sub_commands_layer.add(Refresh_btn);
			
			
		//layered pane for the order informations

			
			JLayeredPane info_order_layer = new JLayeredPane();
			info_order_layer.setBorder(new TitledBorder(null, "Order informations:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(146, 146, 146)));
			info_order_layer.setBounds(239, 11, 278, 516);
			orders_panel.add(info_order_layer);
			
			
			
			JLabel ClientN_label = new JLabel("Client:");
			ClientN_label.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
			ClientN_label.setBounds(10, 25, 74, 37);
			info_order_layer.add(ClientN_label);
			
			JComboBox<String> Clients_list = new JComboBox<String>();
			Clients_list.addItem("Select a Client:");
			Clients_list.addItem("Ali");
			Clients_list.addItem("Ahmed");
			Clients_list.addItem("Mohamed");
			Clients_list.addItem("Sami");
			Clients_list.addItem("Khaled");
            Clients_list.setBounds(20, 73, 223, 37);
            info_order_layer.add(Clients_list);
			
			
			JLabel Aliments_label = new JLabel("Products:");
			Aliments_label.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
			Aliments_label.setBounds(10, 121, 74, 37);
			info_order_layer.add(Aliments_label);
            //medical Stock products 
			JComboBox<String> Aliments_list = new JComboBox<String>();
			Aliments_list.addItem("Select a Product:");
			Aliments_list.addItem("Clamoxyl 1g");
			Aliments_list.addItem("Doliprane 500mg");
			Aliments_list.addItem("Nifluril 250mg");
			Aliments_list.addItem("Dafalgan 1g");
	        Aliments_list.addItem("Advil 400mg");
	        Aliments_list.addItem("kytyl 500mg");
	        Aliments_list.addItem("Doliprane 1000mg");
			Aliments_list.setBounds(20, 169, 223, 37);
			info_order_layer.add(Aliments_list);
			
			
			
			JLabel Qnt_label = new JLabel("Quantity:");
			Qnt_label.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
			Qnt_label.setBounds(10, 225, 96, 37);
			info_order_layer.add(Qnt_label);
			
			JTextField txtQnt = new JTextField();
			txtQnt.setColumns(10);
			txtQnt.setBounds(20, 273, 223, 37);
			info_order_layer.add(txtQnt);
			
			JLayeredPane total_layer = new JLayeredPane();
			total_layer.setBorder(new TitledBorder(null, "Total:", TitledBorder.CENTER, TitledBorder.TOP, new Font("Tahoma", Font.BOLD, 16), new Color(1, 0, 0)));
			total_layer.setBounds(10, 335, 258, 184);
			info_order_layer.add(total_layer);
			
			JTextField txtTotal = new JTextField();
			txtTotal.setBounds(10, 35, 238, 130);
			txtTotal.setFont(new Font("Tahoma", Font.BOLD, 37));
			txtTotal.setText("0$");
			txtTotal.setEditable(false);
			total_layer.add(txtTotal);
			
		
			
			
		//layered pane for the order informations
			
			JLayeredPane Orders_list_layer = new JLayeredPane();
			Orders_list_layer.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			Orders_list_layer.setBounds(527, 11, 607, 516);
			orders_panel.add(Orders_list_layer);
			
			JLabel Orders_table_label = new JLabel("Todays Orders:");
			Orders_table_label.setFont(new Font("Tahoma", Font.BOLD, 12));
			Orders_table_label.setBounds(24, 11, 97, 14);
			Orders_list_layer.add(Orders_table_label);
			
			
			String[] columnNames_1 = {"Order ID", "Product", "Quantity", "Client", "Total Amount"};
			
			Object[][] data_1 = {{ "001", "Clamoxyl 1g", "2", "Ali", "20$"}, 
                    {"002", "Doliprane 500mg", "1", "Ahmed", "10$"}, 
                    {"003", "Nifluril 250mg", "1", "Mohamed", "30$"}, 
                    {"004", "Dafalgan 1g", "2", "Sami", "15$"}, 
                    {"005", "Advil 400mg", "1", "Khaled", "10$"}
					
			};
			
			
			
		      JTable Orders_info = new JTable(data_1, columnNames_1);
		      JScrollPane Orders_info_tb = new JScrollPane(Orders_info);
              Orders_info_tb.setBounds(10, 44, 545, 461);
		      Orders_info.setFillsViewportHeight(true);
		      Orders_list_layer.add(Orders_info_tb);
		      
		      JScrollBar Orders_info_scrollBar = new JScrollBar();
		      Orders_info_scrollBar.setBounds(565, 44, 32, 461);
		      Orders_list_layer.add(Orders_info_scrollBar);
		      
		      
			
			
			
	//panel for the amounts
			
			JPanel amounts_panel = new JPanel();
			tabbedPane.addTab("amounts", null, amounts_panel, null);
			amounts_panel.setLayout(null);
			
			
		//layered pane for the commands	
			

			
			JLayeredPane commands_layer_2 = new JLayeredPane();
			commands_layer_2.setBorder(new TitledBorder(null, "Commands:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(146, 146, 146)));
			commands_layer_2.setBounds(10, 11, 218, 516);
			amounts_panel.add(commands_layer_2);
			
			
			
			JLabel Search_field_label = new JLabel("Search:");
			Search_field_label.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
			Search_field_label.setBounds(10, 22, 74, 37);
			commands_layer_2.add(Search_field_label);
			
			JTextField Search_field = new JTextField();
			Search_field.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
			Search_field.setText("Search...");
			Search_field.setColumns(10);
			Search_field.setBounds(40, 59, 139, 39);
			commands_layer_2.add(Search_field);
			
			//layered pane for the sub commands -buttons-
			
			JLayeredPane sub_commands_layer_2 = new JLayeredPane();
			sub_commands_layer_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			sub_commands_layer_2.setBounds(10, 126, 198, 366);
			commands_layer_2.add(sub_commands_layer_2);
			
			
			
			JButton add_button = new JButton("Add");
			add_button.setBackground(new Color(54, 217, 6));
			add_button.setFont(new Font("Dialog", Font.BOLD, 14));
			add_button.setBounds(10, 11, 178, 39);
			sub_commands_layer_2.add(add_button);
			
			JButton Delete__button = new JButton("Delete");
			Delete__button.setBackground(new Color(255, 0, 0));
			Delete__button.setFont(new Font("Dialog", Font.BOLD, 14));
			Delete__button.setBounds(10, 135, 178, 39);
			sub_commands_layer_2.add(Delete__button);
			
			JButton Edit_button = new JButton("Edit");
			Edit_button.setBackground(new Color(0, 128, 255));
			Edit_button.setFont(new Font("Dialog", Font.BOLD, 14));
			Edit_button.setBounds(10, 72, 178, 39);
			sub_commands_layer_2.add(Edit_button);
			
			JButton Clear_button = new JButton("Clear All");
			Clear_button.setBackground(new Color(255, 255, 0));
			Clear_button.setFont(new Font("Dialog", Font.BOLD, 14));
			Clear_button.setBounds(10, 198, 178, 39);
			sub_commands_layer_2.add(Clear_button);
			
			JButton Print_button = new JButton("Print");
			Print_button.setFont(new Font("Dialog", Font.BOLD, 14));
			Print_button.setBounds(10, 259, 178, 39);
			sub_commands_layer_2.add(Print_button);
			
			JButton Refresh_button = new JButton("Refresh");
			Refresh_button.setFont(new Font("Dialog", Font.BOLD, 14));
			Refresh_button.setBounds(10, 316, 178, 39);
			sub_commands_layer_2.add(Refresh_button);
			
			
			//layered pane for the order informations
			
			
			JLayeredPane orders_list_layer = new JLayeredPane();
			orders_list_layer.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			orders_list_layer.setBounds(238, 11, 896, 516);
			amounts_panel.add(orders_list_layer);
			
			
			JLabel Orders_Table_label = new JLabel("list of Orders:");
			Orders_Table_label.setFont(new Font("Tahoma", Font.BOLD, 12));
			Orders_Table_label.setBounds(411, 11, 97, 14);
			orders_list_layer.add(Orders_Table_label);
			
			
			
			JLabel Search_label = new JLabel("Search for Order:");
			Search_label.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
			Search_label.setBounds(24, 46, 110, 37);
			orders_list_layer.add(Search_label);
			
			JTextField txtSearch = new JTextField();
			txtSearch.setBounds(165, 49, 608, 37);
			txtSearch.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
			txtSearch.setText("Search...");
			txtSearch.setColumns(10);
			orders_list_layer.add(txtSearch);
			
			JButton Search_btn = new JButton("GO");
			Search_btn.setBounds(783, 49, 58, 37);
			orders_list_layer.add(Search_btn);
			
			
			
			JScrollBar Orders_Table_scrollBar = new JScrollBar();
			Orders_Table_scrollBar.setBounds(851, 103, 35, 402);
			orders_list_layer.add(Orders_Table_scrollBar);
			
			
			String[] columnNames = {"Order ID","Date" , "Product", "Quantity", "Client", "Total Amount"};
			
			Object[][] data = {{ "001", "12/12/2020", "Clamoxyl 1g", "2", "Ali", "20$"}, 
                    {"002", "12/5/2020", "Doliprane 500mg", "1", "Ahmed", "10$"}, 
                    {"003", "14/8/2020", "Nifluril 250mg", "1", "Mohamed", "30$"}, 
                    {"004", "12/01/2020", "Dafalgan 1g", "2", "Sami", "15$"}, 
                    {"005", "13/01/2023", "Advil 400mg", "1", "Khaled", "10$"},
                    {"006", "16/01/2023", "Clamoxyl 1g", "2", "Ali", "20$"}, 
                    {"007", "12/07/2023", "Doliprane 500mg", "1", "Ahmed", "10$"}, 
                    {"008", "23/08/2023", "Nifluril 250mg", "1", "Mohamed", "30$"}, 
                    {"009", "11/09/2023", "Dafalgan 1g", "2", "Sami", "15$"}, 
                    {"010", "19/01/2024", "Advil 400mg", "1", "Khaled", "10$"},
                    {"011", "26/02/2024", "Clamoxyl 1g", "2", "Ali", "20$"}, 
                    {"012", "30/04/2024", "Doliprane 500mg", "1", "Ahmed", "10$"}, 
                    {"013", "19/04/2024", "Nifluril 250mg", "1", "Mohamed", "30"}
			};
			
			
			
		      JTable All_Orders_info = new JTable(data, columnNames);
		      JScrollPane All_Orders_info_scrollPane = new JScrollPane(All_Orders_info);
		      All_Orders_info_scrollPane.setBounds(10, 103, 831, 402);
		      All_Orders_info.setFillsViewportHeight(true);
		      orders_list_layer.add(All_Orders_info_scrollPane);      
		      orders_list_layer.setVisible(true); 
		      
		      
		    
		    
	//panel for add clients	    
			
			JPanel addClient_panel = new JPanel();
			tabbedPane.addTab("Add Client", null, addClient_panel, null);
			addClient_panel.setLayout(null);
			
			JLayeredPane new_client_layer = new JLayeredPane();
			new_client_layer.setBorder(new TitledBorder(null, "New Client info:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(146, 146, 146) ));
			new_client_layer.setBounds(10, 11, 404, 516);
			addClient_panel.add(new_client_layer);
			
		
			
			
	 		JLabel nameCL_label = new JLabel("Client name:");
	 		nameCL_label.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
	 		nameCL_label.setBounds(10, 24, 74, 37);
	 		new_client_layer.add(nameCL_label);
	 		
	 		JTextField txtCL_name = new JTextField();
	 		txtCL_name.setColumns(10);
	 		txtCL_name.setBounds(20, 72, 184, 37);
	 		new_client_layer.add(txtCL_name);
	 		
	 		
	 		
	 		JLabel adresse_CL_label = new JLabel("Client Adresse:");
	 		adresse_CL_label.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
	 		adresse_CL_label.setBounds(10, 116, 107, 37);
	 		new_client_layer.add(adresse_CL_label);
	 		
	 		JTextField TxtAdresse_CL = new JTextField();
	 		TxtAdresse_CL.setColumns(10);
	 		TxtAdresse_CL.setBounds(20, 162, 184, 37);
	 		new_client_layer.add(TxtAdresse_CL);
	 		
	 		
	 		
	 		
	 		JLabel Phone_CL_label = new JLabel("Phone Number:");
	 		Phone_CL_label.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
	 		Phone_CL_label.setBounds(10, 210, 96, 37);
	 		new_client_layer.add(Phone_CL_label);
	 		
	 		JTextField TxtPhone_CL = new JTextField();
	 		TxtPhone_CL.setColumns(10);
	 		TxtPhone_CL.setBounds(20, 258, 184, 37);
	 		new_client_layer.add(TxtPhone_CL);
	 		
			
			
			
			JLayeredPane cl_list_layer = new JLayeredPane();
			cl_list_layer.setBounds(10, 321, 384, 184);
			new_client_layer.add(cl_list_layer);
			cl_list_layer.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			
			JButton add_cl = new JButton("Add");
			add_cl.setFont(new Font("Dialog", Font.BOLD, 14));
			add_cl.setBackground(new Color(54, 217, 6));
			add_cl.setBounds(10, 24, 178, 39);
			cl_list_layer.add(add_cl);
			
			JButton Delete_cl = new JButton("Delete");
			Delete_cl.setFont(new Font("Dialog", Font.BOLD, 14));
			Delete_cl.setBackground(Color.RED);
			Delete_cl.setBounds(10, 124, 178, 39);
			cl_list_layer.add(Delete_cl);
			
			JButton Edit_cl = new JButton("Edit");
			Edit_cl.setFont(new Font("Dialog", Font.BOLD, 14));
			Edit_cl.setBackground(new Color(0, 128, 255));
			Edit_cl.setBounds(10, 74, 178, 39);
			cl_list_layer.add(Edit_cl);
			
			JButton Clear_All_cl = new JButton("Clear All");
			Clear_All_cl.setFont(new Font("Dialog", Font.BOLD, 14));
			Clear_All_cl.setBackground(Color.YELLOW);
			Clear_All_cl.setBounds(198, 24, 178, 39);
			cl_list_layer.add(Clear_All_cl);
			
			JButton Print_cl_table = new JButton("Print");
			Print_cl_table.setFont(new Font("Dialog", Font.BOLD, 14));
			Print_cl_table.setBounds(198, 74, 178, 39);
			cl_list_layer.add(Print_cl_table);
			
			JButton Refresh_cl_table = new JButton("Refresh");
			Refresh_cl_table.setFont(new Font("Dialog", Font.BOLD, 14));
			Refresh_cl_table.setBounds(198, 124, 178, 39);
			cl_list_layer.add(Refresh_cl_table);
			
			Icon icon = new ImageIcon("C:\\Users\\raouf\\Downloads\\icons8-add-100.png");
			JButton btnNewButton = new JButton(icon);
			btnNewButton.setBounds(230, 31, 164, 184);
			new_client_layer.add(btnNewButton);
			
			JLabel client_icon_Label = new JLabel("add icon");
	 		client_icon_Label.setBounds(288, 221, 49, 14);
	 		new_client_layer.add(client_icon_Label);
			
			
			
			
			JLayeredPane list_cl_layer = new JLayeredPane();
			list_cl_layer.setBorder(new LineBorder(new Color(173, 204, 211)));
			list_cl_layer.setBounds(424, 11, 710, 516);
			addClient_panel.add(list_cl_layer);
			
			JLabel list_cl_label = new JLabel("list of Clients:");
			list_cl_label.setFont(new Font("Tahoma", Font.BOLD, 12));
			list_cl_label.setBounds(290, 11, 97, 14);
			list_cl_layer.add(list_cl_label);
			
			JLabel Search_cl = new JLabel("Search for Client:");
			Search_cl.setFont(new Font("Dubai Medium", Font.PLAIN, 14));
			Search_cl.setBounds(33, 46, 110, 37);
			list_cl_layer.add(Search_cl);
			
			JTextField txtSearch_cl = new JTextField();
			txtSearch_cl.setBounds(153, 49, 483, 37);
			txtSearch_cl.setFont(new Font("Yu Gothic Light", Font.PLAIN, 11));
			txtSearch_cl.setText("Search...");
			txtSearch_cl.setColumns(10);
			list_cl_layer.add(txtSearch_cl);
			
		      JButton Search_cl_btn = new JButton("GO");
		      Search_cl_btn.setBounds(642, 49, 58, 37);
		      list_cl_layer.add(Search_cl_btn);
			
			
			
			
			
			
			String[] columnNames_2 = {"Client ID", "Client Name", "Adresse", "Phone Number" , "Total Orders"};
			
			Object[][] data_2 = {{"001", "Ali", "guelma", "12345678", "5"}, 
					{"002", "Ahmed", "annaba", "98765432", "3"}, 
					{"003", "Mohamed", "skikda", "45678912", "4"}, 
					{"004", "Sami", "gherdaia", "78912345", "2"}, 
					{"005", "Khaled", "telemsen", "32165498", "1"}
			};
			
			
		     
			 JTable Clients_info = new JTable(data_2, columnNames_2);
		      JScrollPane Clients_info_scrollPane = new JScrollPane(Clients_info);
		      Clients_info_scrollPane.setLocation(10, 104);
		      Clients_info_scrollPane.setSize(648, 401);
		      Clients_info.setFillsViewportHeight(true);
		      list_cl_layer.add(Clients_info_scrollPane);
		      
		      JScrollBar Clients_info_scrollBar = new JScrollBar();
		      Clients_info_scrollBar.setBounds(668, 104, 32, 401);
		      list_cl_layer.add(Clients_info_scrollBar);
		      

	} 

}
