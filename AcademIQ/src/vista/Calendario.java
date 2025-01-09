/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista;

import java.awt.Color;

/**
 *
 * @author Alumno
 */
public class Calendario extends javax.swing.JDialog {

    /**
     * Creates new form Calendario
     */
    public Calendario(java.awt.Frame parent, boolean modal) {
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
        jLabel1 = new javax.swing.JLabel();
        btn_inicio = new vista.RoundButton();
        roundButton2 = new vista.RoundButton();
        roundButton3 = new vista.RoundButton();
        roundButton4 = new vista.RoundButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 98, 173));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 832));

        img_logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EtiquetaRiojaRecurso 3x1.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AcademIQ");

        btn_inicio.setBackground(new java.awt.Color(0, 98, 173));
        btn_inicio.setForeground(new java.awt.Color(255, 255, 255));
        btn_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home_blanco.png"))); // NOI18N
        btn_inicio.setText("  INICIO");
        btn_inicio.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_inicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_inicio.setRound(15);
        btn_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_inicioMouseEntered(evt);
            }
        });

        roundButton2.setBackground(new java.awt.Color(0, 98, 173));
        roundButton2.setForeground(new java.awt.Color(255, 255, 255));
        roundButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NotasIcono.png"))); // NOI18N
        roundButton2.setText("  NOTAS");
        roundButton2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        roundButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        roundButton2.setRound(15);

        roundButton3.setBackground(new java.awt.Color(0, 98, 173));
        roundButton3.setForeground(new java.awt.Color(255, 255, 255));
        roundButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AjustesIcono.png"))); // NOI18N
        roundButton3.setText("  AJUSTES");
        roundButton3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        roundButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        roundButton3.setRound(15);

        roundButton4.setForeground(new java.awt.Color(0, 98, 173));
        roundButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendario_color.png"))); // NOI18N
        roundButton4.setText("  CALENDARIO");
        roundButton4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        roundButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        roundButton4.setRound(15);
        roundButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton4ActionPerformed(evt);
            }
        });

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
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addComponent(btn_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(484, 484, 484))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 930, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roundButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundButton4ActionPerformed

    private void btn_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseEntered
        btn_inicio.setBackground(Color.WHITE);
        btn_inicio.setForeground(new Color(0, 98, 173));
    }//GEN-LAST:event_btn_inicioMouseEntered

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vista.RoundButton btn_inicio;
    private javax.swing.JLabel img_logo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private vista.RoundButton roundButton2;
    private vista.RoundButton roundButton3;
    private vista.RoundButton roundButton4;
    // End of variables declaration//GEN-END:variables
}
