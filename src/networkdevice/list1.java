/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkdevice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abdi
 */
public class list1 extends java.awt.Frame {

    /**
     * Creates new form list
     */
    public list1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JTable();
        Retrive = new javax.swing.JButton();
        search = new javax.swing.JTextField();

        setSize(new java.awt.Dimension(500, 750));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        list1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "avaliable", "brand", "model", "standard", "productcode", "power", "material", "weight", "color", "madein", "description", "qty", "price", "totalprice"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(list1);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 840, 430);

        Retrive.setBackground(new java.awt.Color(51, 255, 51));
        Retrive.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Retrive.setText("Search");
        Retrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetriveActionPerformed(evt);
            }
        });
        add(Retrive);
        Retrive.setBounds(700, 10, 120, 30);

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        add(search);
        search.setBounds(559, 10, 110, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void RetriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetriveActionPerformed
      
                java.util.List list=retrive(search.getText());
                DefaultTableModel tm=(DefaultTableModel)list1.getModel();
                Object[] row=new Object[14];
                for(int i=0;i<list.size();i++){
                  row[i]=list.get(i);
                
                }
                tm.addRow(row);
                 
                             
            
                
                
                
                
          
        
    }//GEN-LAST:event_RetriveActionPerformed
  private static java.util.List<java.lang.Object> retrive(java.lang.String productcode) {
        newwebservice.Device_Service service = new newwebservice.Device_Service();
        newwebservice.Device port = service.getDevicePort();
        return port.retrive(productcode);
    }
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new list1().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Retrive;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable list1;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}