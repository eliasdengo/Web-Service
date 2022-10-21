/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkdevice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abdi
 */
public class list extends java.awt.Frame {

    /**
     * Creates new form list
     */
    public list() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Retrive = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(1400, 1000));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        jPanel1.setLayout(null);

        Retrive.setBackground(new java.awt.Color(51, 255, 51));
        Retrive.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Retrive.setText("Retrive");
        Retrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetriveActionPerformed(evt);
            }
        });
        jPanel1.add(Retrive);
        Retrive.setBounds(60, 60, 120, 30);

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 110, 1100, 420);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1190, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void RetriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetriveActionPerformed
        Connection con=Conn.getConnection();
        String sql="select * from device";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
         DefaultTableModel tm=(DefaultTableModel)table.getModel();
        tm.setRowCount(0);
        while(rs.next()){
            tm.addRow(new String[]{rs.getString("avaliable"),rs.getString("brand"),rs.getString("model"),rs.getString("standard"),rs.getString("productcode"),rs.getString("power"),rs.getString("material"),rs.getString("weight"),rs.getString("color")
            ,rs.getString("mdein"),rs.getString("desription"),rs.getString("qty"),rs.getString("price"),rs.getString("totalprice")});
        }
        } catch (SQLException ex) {
            Logger.getLogger(list.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_RetriveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new list().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Retrive;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}