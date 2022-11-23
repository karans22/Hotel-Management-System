
import java.sql.*;
import javax.swing.JOptionPane;
public class RoomMang extends javax.swing.JFrame {

    Connection con;
    Statement smt,smt1;
    ResultSet rs,rs1,rs2;
    String rno,rtype,rbed;
    int rrate;
    public RoomMang() {
        initComponents();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
            String query = "SELECT * FROM roomdetail ORDER BY room_no;";
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
    //FETCH THE VALUES FROM DATABASE TO TEXT FIELDS AND TEXT AREA
    public final void displayRecord(){
        try
        {
            jTextField1.setText(rs.getString(1));
            jTextField2.setText(rs.getString(2));
            jTextField3.setText(Integer.toString(rs.getInt(3)));
            jTextField4.setText(rs.getString(4));
            
        }
        catch(Exception ec)
        {}
    }
    //GET THE VALUES FROM TEXT FIELDS AND AREA
    public void fetchFromTextF(){
        rno=jTextField1.getText();
        rtype=jTextField2.getText();
        rrate=Integer.parseInt(jTextField3.getText());
        rbed=jTextField4.getText();
    }
    //DISABLE TEXT FIELDS AND AREA
    public void disableTextF(){
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
    }
    //CLEAR TEXT FIELDS AND AREA
    public void clearTextF(){
        try
        {
            jTextField1.setText(null);
            jTextField2.setText(null);
            jTextField3.setText(null);
            jTextField4.setText(null);
        }
        catch(Exception ec)
        {}
    }
    //ENABLE TEXT FIELDS AND AREA
    public void enableTextF(){
        jTextField1.setEditable(true);
        jTextField2.setEditable(true);
        jTextField3.setEditable(true);
        jTextField4.setEditable(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(250, 60, 0, 0));
        setResizable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Hotel Reservation System "), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        jPanel1.setBackground(new java.awt.Color(241, 241, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Room No.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 254, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("<html>Room Type (AC/NON AC)</html>");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 286, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Room Rate");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 318, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("<html>Bed Type (Single/Double)</html>");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 350, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 251, 117, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 283, 117, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("First <<");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 267, 100, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("Next >");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 91, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("Last >>");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 90, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Previous <");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 100, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 315, 117, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 347, 117, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 326, 100, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 91, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 267, 77, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 296, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 325, 77, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tgbh-launch-quad-1024x768.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 21, -1, -1));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("CLOSE");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 436, 132, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bi7.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 490));

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

        setSize(new java.awt.Dimension(767, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //MOVE ON FIRST ROOM
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
    //MOVE ON NEXT ROOM
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
    //MOVE ON LAST ROOM
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
    //MOVE ON PREVIOUS ROOM
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
    //ADD NEW ROOM
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            clearTextF();
            enableTextF();
            String query = "SELECT * FROM roomdetail where room_no like '" + jTextField1.getText() + "';";
            smt = con.createStatement();
            rs1 = smt.executeQuery(query);
            if (!rs1.next()) {
                try {
                    if (evt.getActionCommand().equals("Save")) {
                        fetchFromTextF();
                        int code = JOptionPane.showConfirmDialog(this, "Information of Room No." + rno + " will be added in database.", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        if (code == JOptionPane.YES_OPTION) {
                            String insertquery = "insert into roomdetail(room_no,room_type,room_rate,room_bed)values('" + jTextField1.getText() + "','" + jTextField2.getText() + "'," + jTextField3.getText() + ",'" + jTextField4.getText() + "');";
                            smt = con.createStatement();
                            int success = smt.executeUpdate(insertquery);
                            if (success > 0) {
                                JOptionPane.showMessageDialog(this, "Record Saved");
                                jButton1.setText("New");
                            } else {
                                JOptionPane.showMessageDialog(this, "Problem in Saving. Retry");
                            }
                        } else {
                        }
                    } else if (evt.getActionCommand().equals("New")) {
                        clearTextF();
                        jButton1.setText("Save");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Room No. already used, Give another Room No.");
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    //EDIT AND UPDATE EXISTING ROOM
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        enableTextF();
        jTextField1.setEnabled(false);
        try {
            if (evt.getActionCommand().equals("Update")) {
                fetchFromTextF();
                int code = JOptionPane.showConfirmDialog(this, "Information of Room No." + rno + " will change in database.", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if (code == JOptionPane.YES_OPTION) {
                    String updatequery = "update roomdetail set room_no = '" + rno + "',room_type='" + rtype + "',room_rate=" + rrate + ",room_bed='" + rbed + "';";
                    smt = con.createStatement();
                    int success = smt.executeUpdate(updatequery);
                    if (success > 0) {
                        JOptionPane.showMessageDialog(this, "Record Modified");
                        jButton1.setText("Edit");
                    } else {
                        JOptionPane.showMessageDialog(this, "Problem in mofifying. Retry");
                    }
                } else {
                }
            } else if (evt.getActionCommand().equals("Edit")) {
                JOptionPane.showMessageDialog(this, "You are about to change the existing information of current selected room");
                jButton2.setText("Update");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    //DELETE EXISTING ROOM
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (evt.getActionCommand().equals("Confirm")) {
                fetchFromTextF();
                int code = JOptionPane.showConfirmDialog(this, "Room No" + rno + " will be deleted from database.", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if (code == JOptionPane.YES_OPTION) {
                    String updatequery = "DELETE from roomdetail where room_no like '" + rno + "';";
                    smt = con.createStatement();
                    int success = smt.executeUpdate(updatequery);
                    if (success > 0) {
                        JOptionPane.showMessageDialog(this, "Record Deleted");
                        jButton1.setText("Delete");
                    } else {
                        JOptionPane.showMessageDialog(this, "Problem in deletion. Retry");
                    }
                } else {
                }
            } else if (evt.getActionCommand().equals("Delete")) {
                JOptionPane.showMessageDialog(this, "Your confirmation will delete the record of current selected room");
                jButton2.setText("Confirm");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    //SEARCH ROOM NO
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        disableTextF();
        String srno=jTextField5.getText();
        if(rno.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter Room No. you want to search");
        }
        else if(!rno.equals(""))
        {
            try{
               String query = "SELECT * FROM roomdetail where room_no LIKE '"+srno+"';";
               smt=con.createStatement();
               rs=smt.executeQuery(query);
               rs.next();
               displayRecord();
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
