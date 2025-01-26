/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.ImageIcon;


/**
 *
 * @author Alumno
 */
public class AccesoADatos extends javax.swing.JDialog {

    /**
     * Creates new form AccesoADatos
     */
    public AccesoADatos(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Clase - Acceso A Datos");
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/iconoAcademiq.png"));
        setIconImage(icon.getImage());
        
        btn_tema2.setEnabled(false);
        btn_tema3.setEnabled(false);
        btn_tema4.setEnabled(false);
        
        btn_tema1.addActionListener(e -> {
            chooseAndDownloadFile("https://drive.google.com/uc?export=download&id=1Vmr0SEsMenTJ1uKDHXgqTfCYDlIQOAkU", btn_tema2, "Tema1.pdf");
        });
        btn_tema2.addActionListener(e -> {
            chooseAndDownloadFile("https://drive.google.com/uc?export=download&id=11rkmYfUgD3aWJXwhezJ3sRKcIIOjtXDi", btn_tema3, "Tema2.pdf");
        });
        btn_tema3.addActionListener(e -> {
            chooseAndDownloadFile("https://drive.google.com/uc?export=download&id=1YSPFfdAHzbGOl3IVoW8eqAjvU9xfVe5E", btn_tema4, "Tema3.pdf");
        });
        btn_tema4.addActionListener(e -> {
            chooseAndDownloadFile("https://drive.google.com/uc?export=download&id=1XaRAV-1K1T0Xe1y_WQRMI2p_4YdE1-in", null, "Tema4.pdf");
        });
    }

    private void chooseAndDownloadFile(String fileURL, javax.swing.JButton nextButton, String defaultFileName) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccione dónde guardar el archivo");
        fileChooser.setApproveButtonText("Guardar");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // Obtener el directorio seleccionado y añadir el nombre del archivo
            String saveDirectory = fileChooser.getSelectedFile().getAbsolutePath();
            String saveFilePath = saveDirectory + "/" + defaultFileName;
            boolean success = downloadFile(fileURL, saveFilePath);

            if (success && nextButton != null) {
                nextButton.setEnabled(true); // Desbloquear el siguiente botón
                nextButton.setBackground(new Color(0,98,173));
            }
        } else {
            JOptionPane.showMessageDialog(this, "Operación cancelada.");
        }
    }

    private boolean downloadFile(String fileURL, String saveFilePath) {
        try {
            URL url = new URL(fileURL);
            HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
            int responseCode = httpConnection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                InputStream inputStream = httpConnection.getInputStream();
                FileOutputStream outputStream = new FileOutputStream(saveFilePath);

                byte[] buffer = new byte[4096];
                int bytesRead;

                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

                outputStream.close();
                inputStream.close();

                JOptionPane.showMessageDialog(this, "Archivo descargado con éxito: " + saveFilePath);
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Error al descargar el archivo: Código " + responseCode);
            }

            httpConnection.disconnect();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrió un error: " + ex.getMessage());
        }
        return false;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_lateral = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_tema1 = new swing.RoundButton();
        btn_tema2 = new swing.RoundButton();
        btn_tema3 = new swing.RoundButton();
        btn_tema4 = new swing.RoundButton();
        btn_atras = new javax.swing.JButton();
        btn_perfil = new swing.RoundButton();
        jPanel1 = new javax.swing.JPanel();
        img_logo1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btn_inicio = new swing.RoundButton();
        btn_notas = new swing.RoundButton();
        btn_ajustes = new swing.RoundButton();
        btn_calendario = new swing.RoundButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acceso a Datos");
        setPreferredSize(new java.awt.Dimension(1280, 832));
        setResizable(false);
        getContentPane().setLayout(null);

        menu_lateral.setBackground(new java.awt.Color(255, 255, 255));
        menu_lateral.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Acceso A Datos");
        menu_lateral.add(jLabel2);
        jLabel2.setBounds(110, 50, 622, 72);

        btn_tema1.setBackground(new java.awt.Color(0, 98, 173));
        btn_tema1.setForeground(new java.awt.Color(255, 255, 255));
        btn_tema1.setText("Tema 1: Fundamentos de la programacion");
        btn_tema1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_tema1.setRound(15);
        menu_lateral.add(btn_tema1);
        btn_tema1.setBounds(30, 140, 870, 80);

        btn_tema2.setBackground(new java.awt.Color(113, 172, 218));
        btn_tema2.setForeground(new java.awt.Color(255, 255, 255));
        btn_tema2.setText("Tema 2: Manejo de Ficheros");
        btn_tema2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_tema2.setRound(15);
        btn_tema2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tema2ActionPerformed(evt);
            }
        });
        menu_lateral.add(btn_tema2);
        btn_tema2.setBounds(30, 220, 870, 80);

        btn_tema3.setBackground(new java.awt.Color(113, 172, 218));
        btn_tema3.setForeground(new java.awt.Color(255, 255, 255));
        btn_tema3.setText("Tema 3: Conectores a Sistemas Gestores de Bases de datos");
        btn_tema3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_tema3.setRound(15);
        menu_lateral.add(btn_tema3);
        btn_tema3.setBounds(30, 300, 870, 80);

        btn_tema4.setBackground(new java.awt.Color(113, 172, 218));
        btn_tema4.setForeground(new java.awt.Color(255, 255, 255));
        btn_tema4.setText("Tema 4: Generacion de servicios de acceso a datos");
        btn_tema4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_tema4.setRound(15);
        menu_lateral.add(btn_tema4);
        btn_tema4.setBounds(30, 380, 870, 80);

        btn_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha_atras.png"))); // NOI18N
        btn_atras.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_atras.setBorderPainted(false);
        btn_atras.setContentAreaFilled(false);
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        menu_lateral.add(btn_atras);
        btn_atras.setBounds(40, 70, 50, 40);

        btn_perfil.setBackground(new java.awt.Color(0, 98, 173));
        btn_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        btn_perfil.setRound(110);
        btn_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perfilActionPerformed(evt);
            }
        });
        menu_lateral.add(btn_perfil);
        btn_perfil.setBounds(810, 30, 80, 80);

        getContentPane().add(menu_lateral);
        menu_lateral.setBounds(350, 0, 930, 830);

        jPanel1.setBackground(new java.awt.Color(0, 98, 173));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 832));

        img_logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EtiquetaRiojaRecurso 3x1.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AcademIQ");

        btn_inicio.setForeground(new java.awt.Color(0, 98, 173));
        btn_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HomeIcono.png"))); // NOI18N
        btn_inicio.setText("  INICIO");
        btn_inicio.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_inicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_inicio.setRound(15);

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
        btn_ajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ajustesActionPerformed(evt);
            }
        });

        btn_calendario.setBackground(new java.awt.Color(0, 98, 173));
        btn_calendario.setForeground(new java.awt.Color(255, 255, 255));
        btn_calendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CalendarioIcono.png"))); // NOI18N
        btn_calendario.setText("  CALENDARIO");
        btn_calendario.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_calendario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_calendario.setRound(15);
        btn_calendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_calendarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_calendarioMouseExited(evt);
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
                .addGap(481, 481, 481))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 350, 832);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tema2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tema2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_tema2ActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        this.dispose(); // Cierra la ventana actual
        InicioApp inicioApp = new InicioApp(null, true); // Crea una nueva instancia de InicioApp
        inicioApp.setVisible(true); // Muestra la ventana de inicio
    }//GEN-LAST:event_btn_atrasActionPerformed

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

    private void btn_calendarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_calendarioMouseEntered
        btn_calendario.setBackground(Color.WHITE);
        btn_calendario.setForeground(new Color(0, 98, 173));
        btn_calendario.setIcon(new ImageIcon(getClass().getResource("/imagenes/calendario_color.png")));

    }//GEN-LAST:event_btn_calendarioMouseEntered

    private void btn_calendarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_calendarioMouseExited
        btn_calendario.setBackground(new Color(0, 98, 173));
        btn_calendario.setForeground(Color.WHITE);
        btn_calendario.setIcon(new ImageIcon(getClass().getResource("/imagenes/CalendarioIcono.png")));
    }//GEN-LAST:event_btn_calendarioMouseExited

    private void btn_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perfilActionPerformed
        this.dispose();
        Ajustes ventanaAjustes = new Ajustes(this, true);
        ventanaAjustes.setVisible(true);
    }//GEN-LAST:event_btn_perfilActionPerformed

    private void btn_ajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ajustesActionPerformed
        this.dispose();
        Ajustes ventanaAjustes = new Ajustes(this, true);
        ventanaAjustes.setVisible(true);
    }//GEN-LAST:event_btn_ajustesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.RoundButton btn_ajustes;
    private javax.swing.JButton btn_atras;
    private swing.RoundButton btn_calendario;
    private swing.RoundButton btn_inicio;
    private swing.RoundButton btn_notas;
    private swing.RoundButton btn_perfil;
    private swing.RoundButton btn_tema1;
    private swing.RoundButton btn_tema2;
    private swing.RoundButton btn_tema3;
    private swing.RoundButton btn_tema4;
    private javax.swing.JLabel img_logo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menu_lateral;
    // End of variables declaration//GEN-END:variables
}
