/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LoginForm.java
 *
 * Created on 26 Mar 10, 19:30:48
 */

package pkl49.view;

import pkl49.component.Label;
import pkl49.component.PasswordField;
import pkl49.component.TextField;
import pkl49.control.Controller;
import pkl49.control.DataStatic;

/**
 *
 * @author Ken
 */
public class LoginForm extends usu.widget.Form {

    FormUtama formUtama;
    /** Creates new form LoginForm */
    public LoginForm() {
        initComponents();
        txtNim.setHorizontalAlignment(TextField.LEFT);
        labelPesan.setText("");
        DataStatic.setData();
        formUtama = new FormUtama();
    }

    public FormUtama getFormUtama() {
        return formUtama;
    }
    

    public Label getLabelPesan() {
        return labelPesan;
    }

    public TextField getTxtNim() {
        return txtNim;
    }

    public PasswordField getTxtPassword() {
        return txtPassword;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradient1 = new pkl49.component.PanelGradient();
        panelTransparan1 = new pkl49.component.PanelTransparan();
        loginButton = new pkl49.component.ButtonGloss();
        cancelButton = new pkl49.component.ButtonGloss();
        label1 = new pkl49.component.Label();
        label2 = new pkl49.component.Label();
        label3 = new pkl49.component.Label();
        txtPassword = new pkl49.component.PasswordField();
        txtNim = new pkl49.component.TextField();
        labelPesan = new pkl49.component.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAnimationHide(usu.widget.constan.Animation.HIDE_TO_BOTTOM);
        setAnimationShow(usu.widget.constan.Animation.SHOW_FROM_TOP);
        setUndecorated(true);

        panelGradient1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelGradient1.setFirstColor(new java.awt.Color(0, 51, 102));
        panelGradient1.setSecondColor(new java.awt.Color(51, 51, 255));

        panelTransparan1.setBorder(null);
        panelTransparan1.setAlpha(70);
        panelTransparan1.setRound(true);

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkl49/image/Login.png"))); // NOI18N
        label1.setFont(new java.awt.Font("Tahoma", 1, 13));

        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("NIM          :");
        label2.setFont(new java.awt.Font("Tahoma", 1, 13));

        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Password :");
        label3.setFont(new java.awt.Font("Tahoma", 1, 13));

        txtPassword.setSelectionColor(new java.awt.Color(102, 102, 255));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtNim.setCharType(1);
        txtNim.setContainedColor(new java.awt.Color(255, 255, 255));
        txtNim.setLength(7);
        txtNim.setSelectionColor(new java.awt.Color(102, 102, 255));
        txtNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNimActionPerformed(evt);
            }
        });

        labelPesan.setForeground(new java.awt.Color(255, 255, 255));
        labelPesan.setText("Pesan Kesalahan");
        labelPesan.setFont(new java.awt.Font("Tahoma", 1, 13));

        javax.swing.GroupLayout panelTransparan1Layout = new javax.swing.GroupLayout(panelTransparan1);
        panelTransparan1.setLayout(panelTransparan1Layout);
        panelTransparan1Layout.setHorizontalGroup(
            panelTransparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelTransparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTransparan1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelTransparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTransparan1Layout.createSequentialGroup()
                                .addGroup(panelTransparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelTransparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8))
                            .addComponent(labelPesan, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(panelTransparan1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelTransparan1Layout.setVerticalGroup(
            panelTransparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparan1Layout.createSequentialGroup()
                .addGroup(panelTransparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelTransparan1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panelTransparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelTransparan1Layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTransparan1Layout.createSequentialGroup()
                                .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)
                        .addComponent(labelPesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelTransparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelTransparan1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGradient1Layout = new javax.swing.GroupLayout(panelGradient1);
        panelGradient1.setLayout(panelGradient1Layout);
        panelGradient1Layout.setHorizontalGroup(
            panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTransparan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelGradient1Layout.setVerticalGroup(
            panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTransparan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panelGradient1, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-555)/2, (screenSize.height-304)/2, 555, 304);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        Controller.login(this);
}//GEN-LAST:event_loginButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        System.exit(0);
}//GEN-LAST:event_cancelButtonActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        loginButton.requestFocusInWindow();
}//GEN-LAST:event_txtPasswordActionPerformed

    private void txtNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNimActionPerformed
        txtPassword.requestFocusInWindow();
}//GEN-LAST:event_txtNimActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pkl49.component.ButtonGloss cancelButton;
    private pkl49.component.Label label1;
    private pkl49.component.Label label2;
    private pkl49.component.Label label3;
    private pkl49.component.Label labelPesan;
    private pkl49.component.ButtonGloss loginButton;
    private pkl49.component.PanelGradient panelGradient1;
    private pkl49.component.PanelTransparan panelTransparan1;
    private pkl49.component.TextField txtNim;
    private pkl49.component.PasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

}
