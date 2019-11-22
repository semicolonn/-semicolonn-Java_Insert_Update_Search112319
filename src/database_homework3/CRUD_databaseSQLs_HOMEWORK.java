
package database_homework3;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class CRUD_databaseSQLs_HOMEWORK extends javax.swing.JFrame {


    public CRUD_databaseSQLs_HOMEWORK() throws ClassNotFoundException, SQLException {
        initComponents();
   
        //runMessage();
        
        
        
    }
  
    public void runMessage(){
    
        JOptionPane.showMessageDialog(this, "BAHER edrise ASSIGNMENT -3 JAVA AND DATABASE DML edrisebaher@gmail.com","App Developer Message" ,JOptionPane.INFORMATION_MESSAGE);

    }
              int a = 0;
              String b= "";
              String c= "";
              
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tileLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlabId = new javax.swing.JLabel();
        jlabId1 = new javax.swing.JLabel();
        jlabId2 = new javax.swing.JLabel();
        txtBoxId = new javax.swing.JTextField();
        txtBoxSrch = new javax.swing.JTextField();
        btnSrch = new javax.swing.JButton();
        crudBtn = new javax.swing.JButton();
        txtBoxname = new javax.swing.JTextField();
        txtBoxtel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DML assignment- BAHER EDRISE MU2019- bcs");
        setBackground(new java.awt.Color(0, 51, 51));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tileLabel.setBackground(new java.awt.Color(204, 255, 204));
        tileLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        tileLabel.setForeground(new java.awt.Color(255, 50, 201));
        tileLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tileLabel.setText("HOWEWORK ASSIGNMENT.3\" baherEdrise\" CRUD in JAVA");
        getContentPane().add(tileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 670, -1));

        jPanel1.setBackground(new java.awt.Color(255, 26, 227));

        jlabId.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jlabId.setForeground(new java.awt.Color(255, 255, 255));
        jlabId.setText("Name:");

        jlabId1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jlabId1.setForeground(new java.awt.Color(255, 255, 255));
        jlabId1.setText("ID:");

        jlabId2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jlabId2.setForeground(new java.awt.Color(255, 255, 255));
        jlabId2.setText("TEL#:");

        txtBoxId.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtBoxId.setForeground(new java.awt.Color(255, 0, 204));
        txtBoxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBoxIdActionPerformed(evt);
            }
        });
        txtBoxId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBoxIdKeyTyped(evt);
            }
        });

        txtBoxSrch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtBoxSrch.setForeground(new java.awt.Color(153, 153, 153));
        txtBoxSrch.setText("Search");
        txtBoxSrch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBoxSrchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBoxSrchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBoxSrchMouseExited(evt);
            }
        });

        btnSrch.setBackground(new java.awt.Color(255, 255, 51));
        btnSrch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSrch.setForeground(new java.awt.Color(227, 8, 235));
        btnSrch.setText("Search");
        btnSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSrchActionPerformed(evt);
            }
        });

        crudBtn.setBackground(new java.awt.Color(51, 255, 0));
        crudBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        crudBtn.setForeground(new java.awt.Color(227, 8, 235));
        crudBtn.setText("INSERT");
        crudBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudBtnActionPerformed(evt);
            }
        });

        txtBoxname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtBoxname.setForeground(new java.awt.Color(255, 0, 204));
        txtBoxname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBoxnameActionPerformed(evt);
            }
        });
        txtBoxname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBoxnameKeyTyped(evt);
            }
        });

        txtBoxtel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtBoxtel.setForeground(new java.awt.Color(255, 0, 204));
        txtBoxtel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBoxtelActionPerformed(evt);
            }
        });
        txtBoxtel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBoxtelKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(txtBoxSrch, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlabId1)
                            .addComponent(jlabId)
                            .addComponent(jlabId2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBoxId)
                            .addComponent(txtBoxname)
                            .addComponent(txtBoxtel)
                            .addComponent(crudBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSrch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBoxSrch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBoxId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabId1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBoxname, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlabId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBoxtel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabId2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crudBtn)
                .addGap(63, 63, 63))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSrchActionPerformed
  try{
        try {
            /*
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUD_databaseSQLs_HOMEWORK.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
            Connection cn=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=homework3","","" integratedSecurity=true);
            
            if(cn!=null){
            JOptionPane.showMessageDialog(this, "Connected!");
            }
            
            } catch (SQLException ex) {
            Logger.getLogger(CRUD_databaseSQLs_HOMEWORK.class.getName()).log(Level.SEVERE, null, ex);
            
            }*/
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
            /*
            if(conn !=null){ // check connection status
            JOptionPane.showMessageDialog(this, "Connected!");
            
            }*/
            Statement st=conn.createStatement();
            ResultSet rs= st.executeQuery("SELECT id, name, tel from users WHERE id='"+txtBoxSrch.getText()+"'");
            
              
            while(rs.next()){
            
            //int iduser= rs.getInt("id");
            //JOptionPane.showMessageDialog(this, iduser);
            txtBoxId.setText(String.valueOf(txtBoxSrch.getText()));
            txtBoxname.setText(rs.getString("name"));
            txtBoxtel.setText(rs.getString("tel"));
            }
            
                a = Integer.valueOf(txtBoxId.getText());
               b= txtBoxname.getText();
               c= txtBoxtel.getText();
              
                conn.close();
                
            
              
              
            if(!(txtBoxname.getText().equals("")) && !(txtBoxtel.getText().equals(""))){
            btnSrch.setBackground(Color.green);
            crudBtn.setText("UPDATE");
            
            }
            if(txtBoxname.getText().isEmpty() && txtBoxtel.getText().isEmpty()){
            crudBtn.setText("INSERT");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUD_databaseSQLs_HOMEWORK.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(this, ex.getMessage());
        
        } catch (SQLException ex) {
            Logger.getLogger(CRUD_databaseSQLs_HOMEWORK.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(this, ex.getMessage());
        }
  }
  catch(Exception ex){
  
      JOptionPane.showMessageDialog(this, "Please enter only ID number Or not not found!","ID input message",JOptionPane.WARNING_MESSAGE);
  }
     
    }//GEN-LAST:event_btnSrchActionPerformed

    private void txtBoxSrchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBoxSrchMouseEntered
        /*if(txtBoxSrch.getText().equals("Search")){
        txtBoxSrch.setText("");
        }*/
             if(txtBoxSrch.getText().equals("Search") || txtBoxSrch.getText().equals("")){
            txtBoxId.setText("");
            txtBoxname.setText("");
            txtBoxtel.setText("");

        }
    }//GEN-LAST:event_txtBoxSrchMouseEntered

    private void txtBoxSrchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBoxSrchMouseExited
        
        if(txtBoxSrch.getText().equals("")){
        txtBoxSrch.setText("Search");
        }
    }//GEN-LAST:event_txtBoxSrchMouseExited

    private void txtBoxSrchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBoxSrchMouseClicked
        if(txtBoxSrch.getText().equals("Search")){
        txtBoxSrch.setText("");
        }
    }//GEN-LAST:event_txtBoxSrchMouseClicked

    private void crudBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudBtnActionPerformed
   
          if(crudBtn.getText().equals("UPDATE")){
              
                
             
   
         if(txtBoxId.getText().equals(a) || txtBoxname.getText().equals(b) || txtBoxtel.getText().equals(c)){
         
         JOptionPane.showMessageDialog(this, "Sorry, No update same data already exists!");
             a=0;
             b="";
             c="";
             return;
   
             
         }        
         else if(!(txtBoxId.getText().equals(a)) || !(txtBoxname.getText().equals(b)) || !(txtBoxtel.getText().equals(c))){   
             
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CRUD_databaseSQLs_HOMEWORK.class.getName()).log(Level.SEVERE, null, ex);
       JOptionPane.showMessageDialog(this, ex.getMessage());
        }
            Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
        
       
            Statement st= connection.createStatement();
             String updateQuery= "UPDATE users SET id='"+txtBoxId.getText()+"',name='"+txtBoxname.getText()+"', tel='"+txtBoxtel.getText()+"' WHERE id='"+txtBoxSrch.getText()+"'";
 
             st.executeUpdate(updateQuery);
             JOptionPane.showMessageDialog(this, txtBoxname.getText()+ ", details updated successfully!");
                 connection.close();
             txtBoxId.setText("");
             txtBoxname.setText("");
             txtBoxtel.setText("");
             txtBoxSrch.setText("Search");
             crudBtn.setText("INSERT");
             btnSrch.setBackground(Color.yellow);
        
        } catch (SQLException ex) {
            Logger.getLogger(CRUD_databaseSQLs_HOMEWORK.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
              }
     
       
          }
          
          else if(crudBtn.getText().equals("INSERT")){
              
              
          if(txtBoxId.getText().equals("") || txtBoxname.getText().equals("") || txtBoxtel.getText().equals("")){
      
          JOptionPane.showMessageDialog(this, "Please fill all the fields.", "Message Insertion", JOptionPane.WARNING_MESSAGE);
          return;
      }
              
              try {
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
                  Statement st=connection.createStatement();
                  String insertQuery="INSERT INTO users (id,name,tel) VALUES('"+txtBoxId.getText()+"','"+txtBoxname.getText()+"','"+txtBoxtel.getText()+"')";
                  
                  st.execute(insertQuery);
                  
                  JOptionPane.showMessageDialog(this, "Inserted successfully!");
                  connection.close();
                  txtBoxId.setText("");
                  txtBoxname.setText("");
                  txtBoxtel.setText("");
                  btnSrch.setBackground(Color.yellow);
                  
              } catch (SQLException ex) {
                  Logger.getLogger(CRUD_databaseSQLs_HOMEWORK.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(this, ex.getMessage());
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(CRUD_databaseSQLs_HOMEWORK.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(this, ex.getMessage());
              
              }
              
          
          }

          
          
    }//GEN-LAST:event_crudBtnActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    }//GEN-LAST:event_formKeyPressed

    private void txtBoxIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBoxIdKeyTyped
        //a=Integer.valueOf(txtBoxId.getText());
    }//GEN-LAST:event_txtBoxIdKeyTyped

    private void txtBoxnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBoxnameKeyTyped
            //b=txtBoxname.getText();
    }//GEN-LAST:event_txtBoxnameKeyTyped

    private void txtBoxtelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBoxtelKeyTyped

           // c=txtBoxtel.getText();
    }//GEN-LAST:event_txtBoxtelKeyTyped

    private void txtBoxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBoxIdActionPerformed
        
              a=0;
             b="";
             c="";
    }//GEN-LAST:event_txtBoxIdActionPerformed

    private void txtBoxnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBoxnameActionPerformed
        
             a=0;
             b="";
             c="";
    }//GEN-LAST:event_txtBoxnameActionPerformed

    private void txtBoxtelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBoxtelActionPerformed
                a=0;
             b="";
             c="";    }//GEN-LAST:event_txtBoxtelActionPerformed

   
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
            java.util.logging.Logger.getLogger(CRUD_databaseSQLs_HOMEWORK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD_databaseSQLs_HOMEWORK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD_databaseSQLs_HOMEWORK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD_databaseSQLs_HOMEWORK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CRUD_databaseSQLs_HOMEWORK().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CRUD_databaseSQLs_HOMEWORK.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(CRUD_databaseSQLs_HOMEWORK.class.getName()).log(Level.SEVERE, null, ex);
                
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSrch;
    private javax.swing.JButton crudBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlabId;
    private javax.swing.JLabel jlabId1;
    private javax.swing.JLabel jlabId2;
    private javax.swing.JLabel tileLabel;
    private javax.swing.JTextField txtBoxId;
    private javax.swing.JTextField txtBoxSrch;
    private javax.swing.JTextField txtBoxname;
    private javax.swing.JTextField txtBoxtel;
    // End of variables declaration//GEN-END:variables
}
