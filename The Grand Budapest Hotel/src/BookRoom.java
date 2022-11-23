
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import java.text.DateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class BookRoom extends javax.swing.JFrame {
    Connection con;
    Statement smt1,smt2,smt3;
    ResultSet rs;
    DateFormat formatter;
String roomno,bed,roomt,rate,strdtver1,strdtver2;
String cname,cadd,ccity,cstat,ccoun,cph,cproof,cno;
String cadult,cchild,cmars,cidno,cnation,cpur,cbill;
String diffd;
int amt,bookid;
String dt1,dt2;
    /** Creates new form BookRoom */
    public BookRoom(Object o1,Object o2,Object o3,Object o4,Date o5,Date o6,String diff) {
        initComponents();
        try{
            
            SimpleDateFormat sdf= new SimpleDateFormat("dd-MMM-yyyy");
            SimpleDateFormat sdf1= new SimpleDateFormat("yyyy-MM-dd");
            roomno=o1.toString();
            bed=o2.toString();
            roomt=o3.toString();
            rate=o4.toString();
            strdtver1=(String) sdf.format(o5.getTime());
            strdtver2=(String) sdf.format(o6.getTime());
            Calendar c1=Calendar.getInstance();
            c1.setTime(o5);
            dt1=(String) sdf1.format(c1.getTime());
            Calendar c2=Calendar.getInstance();
            c2.setTime(o6);
            dt2=(String) sdf1.format(c2.getTime());
            Class .forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
            smt1=con.createStatement();
            diffd=diff;
        } 
        catch(Exception ex)
        {
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(250, 60, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 490));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Hotel Reservation System "), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(241, 241, 255));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 204, 0));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Address");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Customer Name");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 170, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("City");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("State");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 170, -1));
        jPanel5.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 170, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Country");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel5.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 170, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Phone");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        jPanel5.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 170, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Nationality");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));
        jPanel5.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 140, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Purpose");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));
        jPanel5.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 140, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("ID Proof");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));
        jPanel5.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 140, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Customer Id");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanel5.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 170, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("No of Adult");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));
        jPanel5.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 140, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("No of Minor");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));
        jPanel5.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 140, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("Marital Status");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        jPanel5.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 170, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 0));
        jLabel30.setText("Bill (tax 12%)");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 90, -1));

        jTextField15.setEnabled(false);
        jPanel5.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 140, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Book Room");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 160, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("No of days");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jTextField13.setEnabled(false);
        jPanel5.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 140, -1));

        jButton3.setBackground(new java.awt.Color(255, 204, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 80, 30));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 610, 280));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Room No.");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Room No.");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Room Type");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("Room Type");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Bed Type");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setText("Bed Type");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 100, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Tariff");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("Tariff");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 90, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Check In");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 60, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("Check In");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 110, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Check Out");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 70, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 0));
        jLabel14.setText("Check Out");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tgbh-launch-quad-1024x768.jpg"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 160));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bi7.jpg"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        setSize(new java.awt.Dimension(763, 529));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       try{

        String bidsql="select book_id from bookingtable;";
        smt3=con.createStatement();
        rs=smt3.executeQuery(bidsql);
        int row=0;
        int bid=0;
        while(rs.next()){
        
        bid=rs.getInt(1);
     
        row++;
        }
        
       
        if(row==0)
        {
            bid++;
        }
        else
        {
            rs.last();
            bid=rs.getInt(1);
     
            bid=bid+1;
     
        }
        bookid=bid;
        jLabel3.setText(roomno);
        jLabel6.setText(bed);        
        jLabel8.setText(roomt);
        jLabel10.setText(rate);
        jLabel12.setText(strdtver1);
        jLabel14.setText(strdtver2);
        
        jTextField13.setText(diffd+" day(s)");
        int r=Integer.parseInt(rate);
        int day=Integer.parseInt(diffd);
        int tax=(r*day)*12/100;
        amt=(r*day)+tax;
        jTextField15.setText(Integer.toString(amt)+".00");
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
       }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            cno=jTextField10.getText();
            cname=jTextField1.getText();
            cadd=jTextField2.getText();
            ccity=jTextField3.getText();
            cstat=jTextField4.getText();
            ccoun=jTextField5.getText();
            cph=jTextField6.getText();
            cmars=jTextField14.getText();
            cnation=jTextField9.getText();
            cproof=jTextField7.getText();
            cadult=jTextField11.getText();
            cchild=jTextField12.getText();


     
            cpur=jTextField8.getText();
            int code=JOptionPane.showConfirmDialog(this,"Room No. " + roomno + " is booked for " + cname + ""
                    + "!","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
                if(code==JOptionPane.YES_NO_OPTION)
                {
                 String insqlcust="insert into custdetail (Cust_no,Cust_name,Cust_add,Cust_city,Cust_state,Cust_country,Cust_ph,Cust_proof,Cust_mar_stat,Cust_nation,Cust_adult,Cust_child,Cust_purpos,book_id,cust_bill) "
                         + "values ('" + cno + "','" + cname + "','" + cadd + "','" + ccity + "','" + cstat + "','" + ccoun + "','" + cph + "','" + cproof
                         + "','" + cmars + "','" + cnation + "','" + cadult + "','" + cchild + "','" + cpur + "'," + bookid
                         + ",'" + amt + "');";
                 smt1=con.createStatement();
                 int ins=smt1.executeUpdate(insqlcust);
                 String insqlbook="insert into bookingtable (book_id,room_no,date_fro,date_to,no_of_day) values( '"
                         + bookid + "','" + roomno + "','" + dt1 + "','" + dt2 + "','" + diffd + "');";
                 smt2=con.createStatement();
                 int ins1=smt1.executeUpdate(insqlbook);
                 JOptionPane.showMessageDialog( this,"Room Booked...!");
                }
            else
            {
                
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  dispose();
}//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new BookRoom().setVisible(true);
            }
        });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
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
