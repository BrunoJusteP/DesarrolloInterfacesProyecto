/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Alumno
 */
public class Calendario extends javax.swing.JDialog {

    /**
     * Creates new form Calendario
     */
    public Calendario(java.awt.Dialog parent, boolean modal) {
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
        btn_notas = new vista.RoundButton();
        btn_ajustes = new vista.RoundButton();
        btn_calendario = new vista.RoundButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1280, 832));
        setMinimumSize(new java.awt.Dimension(1280, 832));
        setPreferredSize(new java.awt.Dimension(1280, 832));
        setResizable(false);
        getContentPane().setLayout(null);

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
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_inicioMouseExited(evt);
            }
        });

        btn_notas.setBackground(new java.awt.Color(0, 98, 173));
        btn_notas.setForeground(new java.awt.Color(255, 255, 255));
        btn_notas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NotasIcono.png"))); // NOI18N
        btn_notas.setText("  NOTAS");
        btn_notas.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_notas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_notas.setRound(15);
        btn_notas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_notasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_notasMouseExited(evt);
            }
        });

        btn_ajustes.setBackground(new java.awt.Color(0, 98, 173));
        btn_ajustes.setForeground(new java.awt.Color(255, 255, 255));
        btn_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AjustesIcono.png"))); // NOI18N
        btn_ajustes.setText("  AJUSTES");
        btn_ajustes.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_ajustes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_ajustes.setRound(15);
        btn_ajustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ajustesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ajustesMouseExited(evt);
            }
        });

        btn_calendario.setForeground(new java.awt.Color(0, 98, 173));
        btn_calendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendario_color.png"))); // NOI18N
        btn_calendario.setText("  CALENDARIO");
        btn_calendario.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_calendario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_calendario.setRound(15);
        btn_calendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_calendarioMouseEntered(evt);
            }
        });
        btn_calendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calendarioActionPerformed(evt);
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
                    .addComponent(btn_notas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ajustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_calendario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(btn_calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_notas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ajustes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(484, 484, 484))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 350, 832);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calendarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_calendarioActionPerformed

    private void btn_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseEntered
        btn_inicio.setBackground(Color.WHITE);
        btn_inicio.setForeground(new Color(0, 98, 173));
        btn_inicio.setIcon(new ImageIcon(getClass().getResource("/imagenes/HomeIcono.png")));
    }//GEN-LAST:event_btn_inicioMouseEntered

    private void btn_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseExited
        btn_inicio.setBackground(new Color(0, 98, 173));
        btn_inicio.setForeground(Color.WHITE);
        btn_inicio.setIcon(new ImageIcon(getClass().getResource("/imagenes/home_blanco.png")));
    }//GEN-LAST:event_btn_inicioMouseExited

    private void btn_calendarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_calendarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_calendarioMouseEntered

    private void btn_notasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_notasMouseEntered
        btn_notas.setBackground(Color.WHITE);
        btn_notas.setForeground(new Color(0, 98, 173));
        btn_notas.setIcon(new ImageIcon(getClass().getResource("/imagenes/notas_color.png")));
    }//GEN-LAST:event_btn_notasMouseEntered

    private void btn_notasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_notasMouseExited
        btn_notas.setBackground(new Color(0, 98, 173));
        btn_notas.setForeground(Color.WHITE);
        btn_notas.setIcon(new ImageIcon(getClass().getResource("/imagenes/NotasIcono.png")));
    }//GEN-LAST:event_btn_notasMouseExited

    private void btn_ajustesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ajustesMouseEntered
        btn_ajustes.setBackground(Color.WHITE);
        btn_ajustes.setForeground(new Color(0, 98, 173));
        btn_ajustes.setIcon(new ImageIcon(getClass().getResource("/imagenes/ajustes_color.png")));
    }//GEN-LAST:event_btn_ajustesMouseEntered

    private void btn_ajustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ajustesMouseExited
        btn_ajustes.setBackground(new Color(0, 98, 173));
        btn_ajustes.setForeground(Color.WHITE);
        btn_ajustes.setIcon(new ImageIcon(getClass().getResource("/imagenes/AjustesIcono.png")));
    }//GEN-LAST:event_btn_ajustesMouseExited

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vista.RoundButton btn_ajustes;
    private vista.RoundButton btn_calendario;
    private vista.RoundButton btn_inicio;
    private vista.RoundButton btn_notas;
    private javax.swing.JLabel img_logo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
