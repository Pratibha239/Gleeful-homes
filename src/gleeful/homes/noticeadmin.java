/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gleeful.homes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author SP CHAUDHARY
 */
public class noticeadmin extends javax.swing.JFrame {

    /**
     * Creates new form noticeadmin
     */
    public noticeadmin() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-noticeboard-96.png"))); // NOI18N
        jLabel1.setText("DIGITAL NOTICEBOARD");
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentShown(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 630, 76));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOTICE ID", "DATE", "DESCRIPTION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 500, 470));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-pin-pad-48.png"))); // NOI18N
        jLabel2.setText("WRITE A NOTICE.?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 230, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("NOTICE ID:-");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 100, 40));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("DATE:-");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 70, 30));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("INFORMATION:-");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, -1, 40));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 180, 40));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 180, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 190, -1));

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-50.png"))); // NOI18N
        jButton1.setText("ADD NOTICE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close-30.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 520, 490));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/177-1771564_gradient-soft-color.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 640));

        setSize(new java.awt.Dimension(957, 679));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentShown
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jLabel1ComponentShown

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        admin_interface jfrm1= new admin_interface();
        //jfrm1.setSize(827, 646); 
        jfrm1.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
       try {
  // TODO add your handling code here:
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gleefulhomes?useSSL=false","root","system");
     Statement st = con.createStatement();
     String sql = "select * from notice";
     ResultSet rs = st.executeQuery(sql);

     while (rs.next()){
         
          String id= String.valueOf(rs.getInt("notice_id"));
          String date= rs.getString("date");
          String info= rs.getString("info");

           String tbdata[] = {id,date,info};
             DefaultTableModel tb1Model =(DefaultTableModel)jTable1.getModel();
           tb1Model.addRow(tbdata);
}          

  con.close();
    }                                        
     
  catch(Exception e){

           System.out.println(e);
}

    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
  int nid=Integer.parseInt(jTextField1.getText());
  String d=jTextField2.getText();
  String inf=jTextArea1.getText();
 try {
  // TODO add your handling code here:
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gleefulhomes?useSSL=false","root","system");
     Statement st = con.createStatement();
     String sql = "insert into notice  values('"+nid+"','"+d+"','"+inf+"') ";
     st.executeUpdate(sql);
     JOptionPane.showMessageDialog(null,"SUCCESSFULY ADDED A NOTICE!!");
     jTextField1.setText("");
     jTextField2.setText("");
     jTextArea1.setText("");
     String id= Integer.toString(nid);
     String data[]={id,d,inf};
     DefaultTableModel tb1Model =(DefaultTableModel)jTable1.getModel();
     tb1Model.addRow(data);
  con.close();
    }                                        
     
  catch(Exception e){

           System.out.println(e);
}
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(noticeadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(noticeadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(noticeadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(noticeadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new noticeadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
