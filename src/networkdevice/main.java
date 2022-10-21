/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkdevice;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public  class main extends JFrame{
	JPanel title,table_container,buttons_container,container,imageholder;
	JLabel available,brand,model,standard,power,material,color,price,qty,totalPrice,p_code,weight,desc,made_in;
	JTextField avlbl,brnd,mdl,stndrd,pwr,mtrl,clr,prc,qt_y,t_price,code,wght,made;
	JTextArea description;
	JButton register,edit,delete,reset;
	JScrollPane sp ;
	JTable table;
	JLabel tit;
	ImageIcon bg_image;
	JLabel bg_i;
	public main() {
		setLayout(null);
		
		title=new JPanel();
		title.setLayout(null);
		table_container=new JPanel();
		table_container.setLayout(null);
		buttons_container=new JPanel();
		buttons_container.setLayout(null);
		container=new JPanel();
		container.setLayout(null);
				
		tit=new JLabel("Network Device Store");
		tit.setBounds(10,10,300,30);
        tit.setFont(new Font("serif",Font.BOLD,24));
		
		title.setBounds(0,0,370,80); title.setBackground(Color.white);
		container.setBounds(5,85,360,630); container.setBackground(Color.cyan);
		table_container.setBounds(375,5,980,400); table_container.setBackground(Color.gray);
		buttons_container.setBounds(375,430,900,300); buttons_container.setBackground(Color.gray);
		
		register=new JButton("Register");
		edit=new JButton("Edit device details");
		delete=new JButton("Delete");
                reset=new JButton("Reset");
		
		register.setBounds(60,20,300,40);
		edit.setBounds(60,80,300,40);
		delete.setBounds(390,20,300,40);
                reset.setBounds(390, 80, 300, 40);
               
		
		available=new JLabel("Available:");      available.setBounds(10,20,120,30);
		brand=new JLabel("Brand:");              brand.setBounds(10,60,120,30);
		model=new JLabel("Model:");              model.setBounds(10,100,120,30);
		standard=new JLabel("Standard:");         standard.setBounds(10,140,120,30);
		power=new JLabel("Power:");              power.setBounds(10,180,120,30);
		material=new JLabel("Material:");        material.setBounds(10,220,120,30);
		weight=new JLabel("Weight:");            weight.setBounds(10,260,120,30);
		color=new JLabel("Color:");              color.setBounds(10,300,120,30);
		price=new JLabel("Price:");              price.setBounds(10,340,120,30);
		p_code=new JLabel("Product Code:");      p_code.setBounds(10,380,120,30);
		qty=new JLabel("Quantity:");             qty.setBounds(10,420,120,30);
		desc=new JLabel("Description:");        desc.setBounds(10,460,120,30);
		totalPrice=new JLabel("Total Price:");   totalPrice.setBounds(10,500,120,30);
		made_in=new JLabel("Made in:");      made_in.setBounds(10,540,120,30);
		
		avlbl=new JTextField();                  avlbl.setBounds(130,20,120,30);
		brnd=new JTextField();                   brnd.setBounds(130,60,120,30);
		mdl=new JTextField();                    mdl.setBounds(130,100,120,30);
		stndrd=new JTextField();                 stndrd.setBounds(130,140,120,30);
		pwr=new JTextField();                    pwr.setBounds(130,180,120,30);
		mtrl=new JTextField();                   mtrl.setBounds(130,220,120,30);
		wght=new JTextField();                   wght.setBounds(130,260,120,30);
		clr=new JTextField();                    clr.setBounds(130,300,120,30);
		prc=new JTextField();                    prc.setBounds(130,340,120,30);
		code=new JTextField();                   code.setBounds(130,380,120,30);
		qt_y=new JTextField();                   qt_y.setBounds(130,420,120,30);
		description=new JTextArea();             description.setBounds(130,460,120,30);
		t_price=new JTextField();                t_price.setBounds(130,500,120,30);
		made=new JTextField();                   made.setBounds(130,540,120,30);
		
		bg_i=new JLabel(bg_image);
		bg_i.setBounds(5, 5, 960, 400);
		bg_image=new ImageIcon("images/nd.jpg");	
		Image img=bg_image.getImage().getScaledInstance(bg_i.getWidth(), bg_i.getHeight(), Image.SCALE_SMOOTH);
		bg_image=new ImageIcon(img);
		bg_i.setIcon(bg_image);
		add(title);
		title.add(tit);
		add(container);
		container.add(available); container.add(brand); container.add(model); container.add(standard); container.add(power);
		container.add(material); container.add(weight); container.add(color); container.add(price); container.add(p_code);
		container.add(qty); container.add(desc); container.add(totalPrice);
		container.add(avlbl); container.add(brnd); container.add(mdl); container.add(stndrd); container.add(pwr);
		container.add(mtrl); container.add(wght); container.add(clr); container.add(prc); container.add(code);
		container.add(qt_y); container.add(description); container.add(t_price);
		container.add(made_in); container.add(made);
		add(buttons_container);
		add(table_container);
                table_container.add(bg_i);
		buttons_container.add(register); buttons_container.add(edit); buttons_container.add(delete);
              buttons_container.add(reset);
		
		register.addActionListener((ActionEvent ae) -> {

                    insertdevice(avlbl.getText(), brnd.getText(), mdl.getText(), stndrd.getText(), code.getText(), 
                            pwr.getText(), mtrl.getText(), wght.getText(), clr.getText(), made.getText(), description.getText(),
                            Integer.parseInt(qt_y.getText()), Double.parseDouble(prc.getText()),Double.parseDouble(t_price.getText()));
               JOptionPane.showMessageDialog(rootPane, "DEVICE SUCCESSFULY ADDED........");
                });
                edit.addActionListener((ActionEvent ae) -> {
                    update(avlbl.getText(), brnd.getText(), mdl.getText(), stndrd.getText(), code.getText(), pwr.getText(),
                            mtrl.getText(), wght.getText(), clr.getText(), made.getText(), description.getText(), Integer.parseInt(qt_y.getText()),Double.parseDouble(prc.getText()),  Double.parseDouble(t_price.getText()));
                JOptionPane.showMessageDialog(rootPane, "DEVICE SUCCESSFULY UPDATED........");
                
                });
                
                delete.addActionListener((ActionEvent ae) -> {
                    delete(code.getText());
                    JOptionPane.showMessageDialog(rootPane, "DEVICE SUCCESSFULY DEETED........");
                });
                
                
              
		reset.addActionListener((ActionEvent ae) -> {
                   avlbl.setText("");
                   brnd.setText("");
                   mdl.setText("");
                   stndrd.setText("");
                   code.setText("");
                   pwr.setText("");
                   mtrl.setText("");
                   wght.setText("");
                   clr.setText("");
                   made.setText("");
                   description.setText("");
                   qt_y.setText("");
                   prc.setText("");
                   t_price.setText("");         
                });
		setSize(1400,1000);
		setVisible(true);
                
	}

	public static void main(String[] args) {
		main m=new main();

	}

    

    private static void insertdevice(java.lang.String avaliable, java.lang.String brand, java.lang.String model, java.lang.String standard, java.lang.String productcode, java.lang.String power, java.lang.String material, java.lang.String weight, java.lang.String color, java.lang.String madein, java.lang.String description, int qty, double price, double totalprice) {
        newwebservice.Device_Service service = new newwebservice.Device_Service();
        newwebservice.Device port = service.getDevicePort();
        port.insertdevice(avaliable, brand, model, standard, productcode, power, material, weight, color, madein, description, qty, price, totalprice);
    }

    private static void update(java.lang.String available, java.lang.String brand, java.lang.String model, java.lang.String standard, java.lang.String productcode, java.lang.String power, java.lang.String material, java.lang.String weight, java.lang.String color, java.lang.String madein, java.lang.String description, int qty, double price, double totalprice) {
        newwebservice.Device_Service service = new newwebservice.Device_Service();
        newwebservice.Device port = service.getDevicePort();
        port.update(available, brand, model, standard, productcode, power, material, weight, color, madein, description, qty, price, totalprice);
    }

    private static void delete(java.lang.String productcode) {
        newwebservice.Device_Service service = new newwebservice.Device_Service();
        newwebservice.Device port = service.getDevicePort();
        port.delete(productcode);
    }

  

        
        
        
        
}
