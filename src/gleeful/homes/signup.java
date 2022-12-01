package gleeful.homes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.regex.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane.*;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Urvashi
 */
public class signup extends javax.swing.JFrame {
/*
    
     * Creates new form signup
     */
    
    public signup() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        flatno = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        nlab = new javax.swing.JLabel();
        elab = new javax.swing.JLabel();
        plab = new javax.swing.JLabel();
        passlab = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel2.setText("NEW REGISTRATION");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 450, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        jLabel4.setText("PHONE NUMBER");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        jLabel5.setText("FLAT NO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, -1));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        jLabel6.setText("GENDER");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 110, -1));

        name.setBackground(new java.awt.Color(0, 0, 0));
        name.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(240, 240, 240));
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 286, -1));

        phone.setBackground(new java.awt.Color(0, 0, 0));
        phone.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        phone.setForeground(new java.awt.Color(240, 240, 240));
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneKeyReleased(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 286, -1));

        flatno.setBackground(new java.awt.Color(0, 0, 0));
        flatno.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        flatno.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(flatno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 286, -1));

        jComboBox1.setBackground(new java.awt.Color(240, 240, 240));
        jComboBox1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        jComboBox1.setOpaque(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 120, 30));

        jButton1.setBackground(new java.awt.Color(51, 153, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTER");
        jButton1.setToolTipText("");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 190, 50));

        jButton2.setBackground(new java.awt.Color(161, 17, 17));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("RESET");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 190, 50));

        jLabel9.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        jLabel10.setText("PASSWORD");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        jLabel1.setText("E-MAIL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        email.setBackground(new java.awt.Color(0, 0, 0));
        email.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(240, 240, 240));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 280, -1));

        password.setBackground(new java.awt.Color(0, 0, 0));
        password.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(240, 240, 240));
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 280, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        nlab.setBackground(new java.awt.Color(255, 255, 255));
        nlab.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        nlab.setForeground(new java.awt.Color(255, 255, 116));
        getContentPane().add(nlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 200, 30));

        elab.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        elab.setForeground(new java.awt.Color(255, 255, 116));
        getContentPane().add(elab, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 210, 20));

        plab.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        plab.setForeground(new java.awt.Color(255, 255, 116));
        getContentPane().add(plab, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 200, 20));

        passlab.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        passlab.setForeground(new java.awt.Color(255, 255, 116));
        passlab.setToolTipText("");
        getContentPane().add(passlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 220, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 10, 60, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/032_Trudotoren_opening.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(766, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    int fno=Integer.parseInt(flatno.getText());
    String user=name.getText();
    String phno=phone.getText();
    String gen = (String)jComboBox1.getSelectedItem();
     String mail=email.getText();
    String pass=new String(password.getPassword());
     
     try {
  // TODO add your handling code here:
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gleefulhomes?useSSL=false","root","system");
     Statement st = con.createStatement();
     String sql = "insert into resident  values('"+fno+"','"+user+"','"+phno+"','"+gen+"','"+pass+"','"+mail+"') ";
     st.executeUpdate(sql);
     JOptionPane.showMessageDialog(null,"SUCCESSFULY REGISTERED!!");
     setVisible(false);
     new signup().setVisible(true);
     //ResultSet rs = st.executeQuery(sql);
     

     /*while (rs.next()){
         
          String id= String.valueOf(rs.getInt("notice_id"));
          String date= rs.getString("date");
          String info= rs.getString("info");

           String tbdata[] = {id,date,info};
             //DefaultTableModel tb1Model =(DefaultTableModel)jTable1.getModel();
           //tb1Model.addRow(tbdata);
} */         

  con.close();
    }                                        
     
  catch(Exception e){

           System.out.println(e);
}


       
            






      



// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 

    
jComboBox1.setSelectedIndex(0);
//jComboBox2.setSelectedIndex(0);
//jComboBox3.setSelectedIndex(0);
//jComboBox4.setSelectedIndex(0);
 name.setText("");
 phone.setText("");
 flatno.setText("");
 email.setText("");
password.setText("");
nlab.setText("");
elab.setText("");
plab.setText("");
passlab.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
      // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed


// TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyPressed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
String PATTERN="^[a-zA-Z]{5,30}$";
Pattern patt=Pattern.compile(PATTERN);
Matcher match=patt.matcher(name.getText());
if(!match.matches()){
    nlab.setText("NAMING IS INCORRECT!");
}
else{
    nlab.setText(null);
    
}

        

// TODO add your handling code here:
    }//GEN-LAST:event_nameKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
String PATTERN="^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";  
Pattern patt=Pattern.compile(PATTERN);
Matcher match=patt.matcher(email.getText());
if(!match.matches()){
    elab.setText("ENTER A CORRECT EMAIL!");
}
else{
    elab.setText(null);
    
}
        
// TODO add your handling code here:
    }//GEN-LAST:event_emailKeyReleased

    private void phoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyReleased
String PATTERN="^[0-9]{0,10}$";
Pattern patt=Pattern.compile(PATTERN);
Matcher match=patt.matcher(phone.getText());
if(!match.matches()){
    plab.setText("NUMBER IS INCORRECT!");
}
else{
    plab.setText(null);
    
}    
        
// TODO add your handling code here:
    }//GEN-LAST:event_phoneKeyReleased

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
String PATTERN="^[a-zA-Z0-9]{0,30}[,][@][.][a-zA-Z0-9]{0,10}$";
Pattern patt=Pattern.compile(PATTERN);
Matcher match=patt.matcher(password.getText());
if(!match.matches()){
    passlab.setText("GIVE A STRONG PASSWORD!");
    
}
  else
    passlab.setText(null);

        
// TODO add your handling code here:
    }//GEN-LAST:event_passwordKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
 mainscreen jf = new mainscreen();
jf.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel elab;
    private javax.swing.JTextField email;
    private javax.swing.JTextField flatno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nlab;
    private javax.swing.JLabel passlab;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel plab;
    // End of variables declaration//GEN-END:variables
}
