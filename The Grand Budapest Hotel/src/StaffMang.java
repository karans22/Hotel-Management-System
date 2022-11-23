

import java.sql.*;
import javax.swing.JOptionPane;

public class StaffMang extends javax.swing.JFrame {

    Connection con;
    Statement smt,smt1;
    ResultSet rs,rs1,rs2;
    String sid,spass,sfname,slname,sdesig,sadd,snum;
    /*CONSTRUCTOR OF CLASS WHERE DATABASE CONNECTION IS MADE AND 
    OBJECT OF RESULTSET AND STATEMENT IS CREATED*/
    public StaffMang() {
        initComponents();
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
            String query = "SELECT * FROM login ORDER BY userid;";
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(100, 50, 0, 0));
        setResizable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Hotel Reservation System"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(241, 241, 255));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tgbh-launch-quad-1024x768.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 0, 626, -1));

        jPanel1.setBackground(new java.awt.Color(241, 241, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 75, 91, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 76, 91, 29));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 116, 91, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 116, 91, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Enter User ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 14, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Enter Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 41, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Re Enter Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 68, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Enter First Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 122, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Enter Last Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 152, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Enter Contact No.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 183, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Enter Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 207, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("First <<");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 13, 91, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Previous <");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 13, -1, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("Next >");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 42, 91, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("Last >>");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 42, 91, -1));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 11, 194, -1));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 38, 194, -1));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 65, 194, -1));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 92, 194, -1));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 119, 194, -1));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 149, 194, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 207, 194, 98));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Enter Designation");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 95, -1, -1));

        jTextField7.setEditable(false);
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 181, 194, -1));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 213, 123, -1));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 239, 123, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Search Specific Staff by ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 188, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("User ID");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 216, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText(" Name");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 242, -1, -1));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("Close");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 277, 73, -1));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setText("Search");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 277, 76, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 168, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bi7.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 490));

        bindingGroup.bind();

        setSize(new java.awt.Dimension(764, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //FETCH THE VALUES FROM DATABASE TO TEXT FIELDS AND TEXT AREA
    public final void displayRecord(){
        try
        {
            jTextField1.setText(rs.getString(1));
            jTextField2.setText(rs.getString(2));
            jTextField4.setText(rs.getString(3));
            jTextField5.setText(rs.getString(4));
            jTextField6.setText(rs.getString(5));
            jTextField7.setText(rs.getString(6));
            jTextArea1.setText(rs.getString(7));
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
        jTextField5.setEditable(true);
        jTextField6.setEditable(true);
        jTextField7.setEditable(true);
        jTextArea1.setEditable(true);
    }
    //DISABLE TEXT FIELDS AND AREA
    public void disableTextF(){
        
    }
    //CLEAR TEXT FIELDS AND AREA
    public void clearTextF(){
        try
        {
            jTextField1.setText(null);
            jTextField2.setText(null);
            jTextField4.setText(null);
            jTextField5.setText(null);
            jTextField6.setText(null);
            jTextField7.setText(null);
            jTextArea1.setText(null);
        }
        catch(Exception ec)
        {}
    }
    //GET THE VALUES FROM TEXT FIELDS AND AREA
    public void fetchFromTextF(){
        sid=jTextField1.getText();
        spass=jTextField2.getText();
        sdesig=jTextField4.getText();
        sfname=jTextField5.getText();
        slname=jTextField6.getText();
        snum=jTextField7.getText();
        sadd=jTextArea1.getText();
    }
    //EDIT STAFF RECORD
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        enableTextF();
        jTextField1.setEnabled(false);
        jTextField2.setText(spass);
        try{
            if(evt.getActionCommand().equals("Update"))
            {
                fetchFromTextF();    
                int code=JOptionPane.showConfirmDialog(this,"Information of " + sfname + " will change in database.","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
                if(code==JOptionPane.YES_OPTION)
                {
                    String updatequery="update login set userid = '"+sid+"',password='"+spass+"',Staffdesig='"+sdesig+"',StaffFName='"+sfname+"',StaffLName='"+slname+"',StaffAdd='"+sadd+"',StaffContactNo='"+snum+"' where userid like '"+sid+"';";
                    smt=con.createStatement();
                    int success=smt.executeUpdate(updatequery);
                    if(success>0)
                    {
                        JOptionPane.showMessageDialog(this, "Record Modified");
                        jButton1.setText("Edit");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Problem in mofifying. Retry");
                    }
                }
                else
                {  }
            }
            else if(evt.getActionCommand().equals("Edit"))
            {
                JOptionPane.showMessageDialog(this, "You are about to change the existing information of current selected staff");
                jButton2.setText("Update");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    //SEARCH STAFF RECORD
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       disableTextF();
       String seaID=jTextField8.getText();
       String seaFN=jTextField9.getText();
       String seaLN=jTextField9.getText();
        if(seaID.equals("")&&seaFN.equals("")&&seaLN.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Select at least 1 option for search");
        }
        else
        {
            if((!seaID.equals("")) && (!seaFN.equals("")) && (!seaLN.equals("")))
            {
                try{
                    String query = "SELECT * FROM login where userid LIKE '"+seaID+"' AND StaffFName LIKE '"+seaFN+"' AND StaffLName LIKE '"+seaLN+"';";
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
            else if((!seaID.equals("")) && (!seaFN.equals("")) && seaLN.equals(""))
            {
                try{
                    String query = "SELECT * FROM login where userid LIKE '"+seaID+"' AND StaffFName LIKE '"+seaFN+"';";
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
            else if((!seaID.equals("")) && seaFN.equals("") && (!seaLN.equals("")))
            {
                try{
                    String query = "SELECT * FROM login where userid LIKE '"+seaID+"' AND StaffLName LIKE '"+seaLN+"';";
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
            else if(seaID.equals("") && (!seaFN.equals("")) && (!seaLN.equals("")))
            {
                try{
                    String query = "SELECT * FROM login where StaffFName LIKE '"+seaFN+"' AND StaffLName LIKE '"+seaLN+"';";
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
            else if((!seaID.equals("")) && seaFN.equals("") && seaLN.equals(""))
            {
                try{
                    String query = "SELECT * FROM login where userid LIKE '"+seaID+"';";
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
            else if(seaID.equals("") && (!seaFN.equals("")) && seaLN.equals(""))
            {
                try{
                    String query = "SELECT * FROM login where StaffFName LIKE '"+seaFN+"';";
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
            else if(seaID.equals("") && seaFN.equals("") && (!seaLN.equals("")))
            {
                try{
                    String query = "SELECT * FROM login where StaffLName LIKE '"+seaLN+"';";
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
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    //MOVE ON LAST RECORD
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try
        {
            rs.last();
            if(rs.isLast())
            rs.last();
            displayRecord();
        }
        catch(Exception ex) {}
    }//GEN-LAST:event_jButton8ActionPerformed
    //MOVE ON PREVIOUS RECORD
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try
        {
            rs.previous();
            if(rs.isFirst())
                rs.first();
            displayRecord();
        }
        catch(Exception ex) {}
    }//GEN-LAST:event_jButton6ActionPerformed
    //MOVE ON FIRST RECORD
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try
        {
            rs.first();
            if(rs.isFirst())
            rs.first();
            displayRecord();
        }
        catch(Exception ex) {}
    }//GEN-LAST:event_jButton5ActionPerformed
    //MOVE ON NEXT RECORD
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try
        {
            rs.next();
            if(rs.isLast())
                rs.last();
            displayRecord();
        }
        catch(Exception ex) {}
    }//GEN-LAST:event_jButton7ActionPerformed
    //TOOL TIPS SETTING
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTextField1.setToolTipText("This is an Unique ID");
        jTextField3.setToolTipText("Re Enter the same Password");
        jButton4.setToolTipText("First select the option for searching");
        jTextField8.setToolTipText("User ID is case sensitive");
        jTextField9.setToolTipText("First Name is case sensitive");
        jTextField9.setToolTipText("Last Name is case sensitive");
        jButton3.setToolTipText("Current Selected Staff Record will be DELETED");
        jButton9.setToolTipText("Close Window");
    }//GEN-LAST:event_formWindowOpened
    //ADD RECORD OF STAFF
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            clearTextF();
            enableTextF();
            String query = "SELECT * FROM login where userid like '"+jTextField1.getText()+"';";
            smt=con.createStatement();
            rs1=smt.executeQuery(query);
            if(!rs1.next()){
                try{
                    if(evt.getActionCommand().equals("Save"))
                    {
                        fetchFromTextF();    
                        int code=JOptionPane.showConfirmDialog(this,"Information of " + sfname + " will be added in database.","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
                        if(code==JOptionPane.YES_OPTION)
                        {
                            String insertquery="insert into login(userid,password,Staffdesig,StaffFName,StaffLName,StaffAdd,StaffContactNo)values('"+sid+"','"+spass+"','"+sdesig+"','"+sfname+"','"+slname+"','"+sadd+"','"+snum+"');";
                            smt=con.createStatement();
                            int success=smt.executeUpdate(insertquery);
                            if(success>0)
                            {
                                JOptionPane.showMessageDialog(this, "Record Saved");
                                jButton1.setText("New");
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(this, "Problem in Saving. Retry");
                            }
                        }
                        else
                        {  }
                    }
                    else if(evt.getActionCommand().equals("New"))
                    {
                        clearTextF();
                        jButton1.setText("Save");
                    }
                    }
                    catch(Exception ex)
                    {
                        ex.printStackTrace();
                    }
                }
            else
            JOptionPane.showMessageDialog(this,"User ID already taken, Give another User ID");
        }
        catch(Exception ex)
        {   }   
    }//GEN-LAST:event_jButton1ActionPerformed
    //DELETE RECORD OF STAFF
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField3.setText(spass);
        try{
            if(evt.getActionCommand().equals("Confirm"))
            {
                fetchFromTextF();    
                int code=JOptionPane.showConfirmDialog(this,"Information of " + sfname + " will be deleted from database.","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
                if(code==JOptionPane.YES_OPTION)
                {
                    String updatequery="DELETE from login where userid like '"+sid+"';";
                    smt=con.createStatement();
                    int success=smt.executeUpdate(updatequery);
                    if(success>0)
                    {
                        JOptionPane.showMessageDialog(this, "Record Deleted");
                        jButton1.setText("Delete");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Problem in deletion. Retry");
                    }
                }
                else
                {  }
            }
            else if(evt.getActionCommand().equals("Delete"))
            {
                JOptionPane.showMessageDialog(this, "Your confirmation will delete the record of current selected staff");
                jButton2.setText("Confirm");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    //CLOSE BUTTON
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
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
