

import java.sql.*;
import javax.swing.JOptionPane;
public class CustomerMang extends javax.swing.JFrame {

    Connection con;
    Statement smt,smt1;
    ResultSet rs,rs1,rs2;
String Cust_no,Cust_name,Cust_add,Cust_city,Cust_state,Cust_country,Cust_ph,Cust_proof,Cust_mar_stat,Cust_nation,Cust_adult,Cust_child,Cust_purpos,book_id,Cust_bill;
    
    public CustomerMang() {
        initComponents();
        disableTextF();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
            String query = "SELECT * FROM custdetail ORDER BY Cust_No;";
            smt=con.createStatement();
            rs=smt.executeQuery(query);
            rs.next();
            displayRecord();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField13 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(250, 50, 0, 0));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Hotel Reservation System "), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        jPanel1.setBackground(new java.awt.Color(241, 241, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tgbh-launch-quad-1024x768.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Visitor Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 211, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Visitor Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 237, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Visitor City");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 263, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Visitor State");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 289, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Visitor Country");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 315, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Visitor Phone");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 341, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Visitor ID Proof");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 367, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Visitor Marital Status");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("Visitor Nationality");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("No. of Adult(s) with visitor");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("No. of Child(ren) with visitor");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("Purpose of visit");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 202, -1, -1));

        jTextField12.setBackground(new java.awt.Color(250, 250, 255));
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 199, 143, -1));

        jTextField11.setBackground(new java.awt.Color(250, 250, 255));
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 447, 201, -1));

        jTextField10.setBackground(new java.awt.Color(250, 250, 255));
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 421, 201, -1));

        jTextField9.setBackground(new java.awt.Color(250, 250, 255));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 173, 143, -1));

        jTextField1.setBackground(new java.awt.Color(250, 250, 255));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 208, 201, -1));

        jTextField2.setBackground(new java.awt.Color(250, 250, 255));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 234, 201, -1));

        jTextField3.setBackground(new java.awt.Color(250, 250, 255));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 260, 201, -1));

        jTextField4.setBackground(new java.awt.Color(250, 250, 255));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 286, 201, -1));

        jTextField5.setBackground(new java.awt.Color(250, 250, 255));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 312, 201, -1));

        jTextField6.setBackground(new java.awt.Color(250, 250, 255));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 338, 201, -1));

        jTextField7.setBackground(new java.awt.Color(250, 250, 255));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 364, 201, -1));

        jTextField8.setBackground(new java.awt.Color(250, 250, 255));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 200, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setText("Booking ID");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 228, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setText("Bill Amount");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 261, -1, -1));

        jTextField16.setBackground(new java.awt.Color(250, 250, 255));
        jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 255, 143, -1));

        jTextField15.setBackground(new java.awt.Color(250, 250, 255));
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 225, 143, -1));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton5.setText("First <<");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 322, 104, -1));

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton7.setText("Next >");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 104, -1));

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton6.setText("Previous <");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 102, -1));

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton8.setText("Last >>");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 322, 102, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel19.setText("By Name");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 379, -1, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel20.setText("By Id");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 399, -1, -1));
        jPanel1.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 376, 187, -1));
        jPanel1.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 396, 187, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Search Visitor");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 356, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 92, 20));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("CLOSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 438, 93, -1));

        jTextField13.setBackground(new java.awt.Color(250, 250, 255));
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 177, 201, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Visitor ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 180, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bi7.jpg"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        jLabel18.setText("Visitor State");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 289, -1, -1));

        jLabel21.setText("Visitor Address");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 237, -1, -1));

        jLabel22.setText("Visitor Name");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 211, -1, -1));

        jLabel23.setText("Visitor City");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 263, -1, -1));

        jLabel24.setText("Visitor Country");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 315, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        setSize(new java.awt.Dimension(763, 534));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            rs.last();
            if (rs.isLast()) {
                rs.last();
            }
            displayRecord();
        } catch (Exception ex) {
        }
}//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            rs.previous();
            if (rs.isFirst()) {
                rs.first();
            }
            displayRecord();
        } catch (Exception ex) {
        }
}//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            rs.next();
            if (rs.isLast()) {
                rs.last();
            }
            displayRecord();
        } catch (Exception ex) {
        }
}//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            rs.first();
            if (rs.isFirst()) {
                rs.first();
            }
            displayRecord();
        } catch (Exception ex) {
        }
}//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField15ActionPerformed
 public final void displayRecord(){
        try
        {
           jTextField13.setText(Integer.toString(rs.getInt(1)));
            jTextField1.setText(rs.getString(2));
            jTextField2.setText(rs.getString(3));
            jTextField3.setText(rs.getString(4));
            jTextField4.setText(rs.getString(5));
            jTextField5.setText(rs.getString(6));
            jTextField6.setText(rs.getString(7));
            jTextField7.setText(rs.getString(8));
            jTextField8.setText(rs.getString(9));
            jTextField9.setText(rs.getString(10));
            jTextField10.setText(rs.getString(11));
            jTextField11.setText(rs.getString(12));
            jTextField12.setText(rs.getString(13));
            jTextField15.setText(rs.getString(14));
            jTextField16.setText(rs.getString(15));
        }
        catch(Exception ec)
        {}
    }
    
    //DISABLE TEXT FIELDS AND AREA
    private void disableTextF(){
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);
        jTextField10.setEditable(false);
        jTextField11.setEditable(false);
        jTextField12.setEditable(false);
        jTextField13.setEditable(false);
        jTextField15.setEditable(false);
        jTextField16.setEditable(false);
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CustomerMang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
