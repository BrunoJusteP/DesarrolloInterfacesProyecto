/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista;

/**
 *
 * @author Alumno
 */
public class InicioApp extends javax.swing.JDialog {

    /**
     * Creates new form InicioApp
     */
    public InicioApp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        img_logo1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_inicio = new javax.swing.JButton();
        btn_inicio1 = new javax.swing.JButton();
        btn_inicio2 = new javax.swing.JButton();
        btn_inicio3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        roundButton1 = new vista.RoundButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 98, 173));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 832));

        img_logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EtiquetaRiojaRecurso 3x1.png"))); // NOI18N

        btn_inicio.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_inicio.setForeground(new java.awt.Color(0, 98, 173));
        btn_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HomeIcono.png"))); // NOI18N
        btn_inicio.setText("  INICIO");
        btn_inicio.setBorderPainted(false);
        btn_inicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });

        btn_inicio1.setBackground(new java.awt.Color(0, 98, 173));
        btn_inicio1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_inicio1.setForeground(new java.awt.Color(255, 255, 255));
        btn_inicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AjustesIcono.png"))); // NOI18N
        btn_inicio1.setText("  AJUSTES");
        btn_inicio1.setBorderPainted(false);
        btn_inicio1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_inicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicio1ActionPerformed(evt);
            }
        });

        btn_inicio2.setBackground(new java.awt.Color(0, 98, 173));
        btn_inicio2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_inicio2.setForeground(new java.awt.Color(255, 255, 255));
        btn_inicio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CalendarioIcono.png"))); // NOI18N
        btn_inicio2.setText("  CALENDARIO");
        btn_inicio2.setBorderPainted(false);
        btn_inicio2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_inicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicio2ActionPerformed(evt);
            }
        });

        btn_inicio3.setBackground(new java.awt.Color(0, 98, 173));
        btn_inicio3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_inicio3.setForeground(new java.awt.Color(255, 255, 255));
        btn_inicio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NotasIcono.png"))); // NOI18N
        btn_inicio3.setText("  NOTAS");
        btn_inicio3.setBorderPainted(false);
        btn_inicio3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_inicio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicio3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AcademIQ");

        roundButton1.setForeground(new java.awt.Color(0, 98, 173));
        roundButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HomeIcono.png"))); // NOI18N
        roundButton1.setText("  INICIO");
        roundButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        roundButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(img_logo1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addComponent(btn_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_inicio1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(btn_inicio2, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(btn_inicio3, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(roundButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img_logo1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_inicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_inicio3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_inicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(434, 434, 434))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 843, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_inicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicio1ActionPerformed

    private void btn_inicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicio2ActionPerformed

    private void btn_inicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicio3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_inicio1;
    private javax.swing.JButton btn_inicio2;
    private javax.swing.JButton btn_inicio3;
    private javax.swing.JLabel img_logo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private vista.RoundButton roundButton1;
    // End of variables declaration//GEN-END:variables
}
