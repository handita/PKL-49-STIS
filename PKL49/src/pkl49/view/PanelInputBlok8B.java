/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelInputNKD.java
 *
 * Created on Feb 12, 2010, 5:24:07 AM
 */

package pkl49.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import pkl49.component.ButtonGloss;
import pkl49.component.TextField;

/**
 *
 * @author Ade KeciL
 */
public class PanelInputBlok8B extends javax.swing.JPanel implements KeyListener{

    /** Creates new form PanelInputNKD */
    public PanelInputBlok8B() {
        initComponents();
        setOpaque(false);
        txtJumlah.addKeyListener(this);
        addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                
            }

            public void mousePressed(MouseEvent e) {

            }

            public void mouseReleased(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {

            }

            public void mouseExited(MouseEvent e) {

            }
        });

    }

    public TextField getTxtJumlah() {
        return txtJumlah;
    }

    
    public ButtonGloss getBtnOK() {
        return btnOK;
    }

    public int getJumlah(){
        String jumlah = txtJumlah.getText();
        return Integer.parseInt(jumlah);
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
        kecamatan = new pkl49.component.PanelTransparan();
        txtJumlah = new pkl49.component.TextField();
        btnOK = new pkl49.component.ButtonGloss();
        label9 = new pkl49.component.Label();

        setLayout(new java.awt.GridBagLayout());

        panelGradient1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelGradient1.setAlpha(75);
        panelGradient1.setFirstColor(new java.awt.Color(0, 51, 255));
        panelGradient1.setSecondColor(new java.awt.Color(153, 255, 255));

        kecamatan.setBorder(null);

        txtJumlah.setColumns(3);
        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kecamatanLayout = new javax.swing.GroupLayout(kecamatan);
        kecamatan.setLayout(kecamatanLayout);
        kecamatanLayout.setHorizontalGroup(
            kecamatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kecamatanLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        kecamatanLayout.setVerticalGroup(
            kecamatanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kecamatanLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnOK.setText("OK"); // NOI18N

        label9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label9.setText("Masukkan banyaknya Blok 8B yang akan dientry"); // NOI18N
        label9.setFont(new java.awt.Font("Tahoma", 1, 14));

        javax.swing.GroupLayout panelGradient1Layout = new javax.swing.GroupLayout(panelGradient1);
        panelGradient1.setLayout(panelGradient1Layout);
        panelGradient1Layout.setHorizontalGroup(
            panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradient1Layout.createSequentialGroup()
                        .addGroup(panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kecamatan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradient1Layout.createSequentialGroup()
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))))
        );
        panelGradient1Layout.setVerticalGroup(
            panelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(kecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(panelGradient1, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        btnOK.requestFocusInWindow();
    }//GEN-LAST:event_txtJumlahActionPerformed

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g.create();
        int w = getWidth();
        int h = getHeight();
        gd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        gd.setColor(new Color(1f, 1f, 1f, 0.5f));
        gd.fillRect(0, 0, w, h);
        gd.dispose();
    }

    private void control(KeyEvent e){
        if(e.getComponent().equals(txtJumlah)){
            if(e.getKeyChar()>=txtJumlah.getMinDigit() && e.getKeyChar()<=txtJumlah.getMaxDigit() && txtJumlah.getText().length()==txtJumlah.getLength()){
                getBtnOK().requestFocusInWindow();
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pkl49.component.ButtonGloss btnOK;
    private pkl49.component.PanelTransparan kecamatan;
    private pkl49.component.Label label9;
    private pkl49.component.PanelGradient panelGradient1;
    private pkl49.component.TextField txtJumlah;
    // End of variables declaration//GEN-END:variables

    public void keyTyped(KeyEvent e) {
        
    }

    public void keyPressed(KeyEvent e) {
        
    }

    public void keyReleased(KeyEvent e) {
        control(e);
    }

}
