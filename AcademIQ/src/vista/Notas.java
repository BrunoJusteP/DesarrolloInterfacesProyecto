/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista;

import com.formdev.flatlaf.FlatClientProperties;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alumno
 */
public class Notas extends javax.swing.JDialog {

    /**
     * Creates new form Notas
     */
    public Notas(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        estiloTabla(jTable1);
        cargarDatos(jTable1);
    }
    
    private void cargarDatos(JTable tabla){
        // Obtén el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();

        // Limpiar cualquier fila existente
        model.setRowCount(0);

        // Agregar la fila con los nombres de los trimestres

        // Agregar las notas (puedes personalizar los valores según tus necesidades)
        model.addRow(new Object[]{"1º", 8.5, 7.0, 9.0, 6.5, 8.0, 7.5});
        model.addRow(new Object[]{"2º", 7.5, 8.0, 7.8, 7.0, 9.0, 8.2});
        model.addRow(new Object[]{"3º", 9.0, 6.5, 8.5, 7.8, 7.2, 8.0});
        // Calcular la media de cada columna
        int numRows = model.getRowCount(); // Número de filas
        int numCols = model.getColumnCount(); // Número de columnas
        Object[] finalRow = new Object[numCols];
        finalRow[0] = "Final"; // Título de la fila final

        for (int col = 1; col < numCols; col++) { // Comenzar desde la columna 1 (omitimos la columna "1º", "2º", etc.)
            double suma = 0;
            int count = 0; // Contador de valores válidos

            for (int row = 0; row < numRows; row++) {
                Object value = model.getValueAt(row, col);
                if (value instanceof Number) { // Verificar que es un número
                    suma += ((Number) value).doubleValue();
                    count++;
                }
            }

            // Calcular la media y asignar a la fila final
            finalRow[col] = count > 0 ? Math.round((suma / count) * 100.0) / 100.0 : null; // Redondear a 2 decimales
        }

        // Añadir la fila final al modelo
        model.addRow(finalRow);

    }

    private void estiloTabla(JTable tabla){
        // Estilo general del encabezado
        tabla.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
            + "background: #0062AD;" // Color de fondo del encabezado
            + "foreground: #FFFFFF;" // Color del texto del encabezado
            + "font: bold $h3.font;" // Fuente en negrita y tamaño adaptable
            + "border: empty;" // Sin bordes alrededor del encabezado
        );

        // Estilo general de las celdas de la tabla
        tabla.putClientProperty(FlatClientProperties.STYLE, ""
            + "alternateRowColor: #F7F9FC;" // Color alternativo para las filas
            + "rowHeight: 40;" // Altura de cada fila
            + "font: $h4.font;" // Fuente general para las celdas
            + "selectionBackground: #0B84FF;" // Color de fondo al seleccionar
            + "selectionForeground: #FFFFFF;" // Color del texto al seleccionar
            + "gridColor: #D1D9E0;" // Color de las líneas entre celdas
        );

        // Habilitar sombreado para un aspecto más atractivo
        tabla.putClientProperty(FlatClientProperties.COMPONENT_ROUND_RECT, true);

        // Otras configuraciones visuales (opcional)
        tabla.setShowGrid(true); // Mostrar las líneas de la cuadrícula
        tabla.setRowHeight(40); // Aumentar la altura de las filas para mejor visibilidad
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
        img_logo1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btn_inicio = new swing.RoundButton();
        btn_notas = new swing.RoundButton();
        btn_ajustes = new swing.RoundButton();
        btn_calendario = new swing.RoundButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_perfil = new swing.RoundButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Notas - AcademIQ");
        setMinimumSize(new java.awt.Dimension(1280, 832));
        getContentPane().setLayout(null);

        menu_lateral.setBackground(new java.awt.Color(0, 98, 173));
        menu_lateral.setPreferredSize(new java.awt.Dimension(350, 832));

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
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });

        btn_notas.setForeground(new java.awt.Color(0, 98, 173));
        btn_notas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/notas_color.png"))); // NOI18N
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
        btn_calendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calendarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_lateralLayout = new javax.swing.GroupLayout(menu_lateral);
        menu_lateral.setLayout(menu_lateralLayout);
        menu_lateralLayout.setHorizontalGroup(
            menu_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_lateralLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(menu_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(menu_lateralLayout.createSequentialGroup()
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
        menu_lateralLayout.setVerticalGroup(
            menu_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_lateralLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(menu_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        getContentPane().add(menu_lateral);
        menu_lateral.setBounds(0, 0, 350, 832);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Notas");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(400, 50, 120, 72);

        btn_atras.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_atras.setBorderPainted(false);
        btn_atras.setContentAreaFilled(false);
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        jPanel2.add(btn_atras);
        btn_atras.setBounds(40, 70, 50, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Trimestre", "AADD", "PSP", "SGE", "EIE", "DI", "PPMM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(32, 130, 870, 640);

        btn_perfil.setBackground(new java.awt.Color(0, 98, 173));
        btn_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        btn_perfil.setRound(110);
        btn_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perfilActionPerformed(evt);
            }
        });
        jPanel2.add(btn_perfil);
        btn_perfil.setBounds(810, 30, 80, 80);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(350, 0, 930, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_notasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_notasMouseEntered

    }//GEN-LAST:event_btn_notasMouseEntered

    private void btn_notasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_notasMouseExited

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

    private void btn_calendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calendarioActionPerformed
        this.dispose();
        Calendario calendario = new Calendario(this, true);
        calendario.setVisible(true);
    }//GEN-LAST:event_btn_calendarioActionPerformed

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
        this.dispose();
        InicioApp inicio = new InicioApp(null, true);
        inicio.setVisible(true);
    }//GEN-LAST:event_btn_inicioActionPerformed

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

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        this.dispose(); // Cierra la ventana actual
        InicioApp inicioApp = new InicioApp(null, true); // Crea una nueva instancia de InicioApp
        inicioApp.setVisible(true); // Muestra la ventana de inicio
    }//GEN-LAST:event_btn_atrasActionPerformed

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
    private javax.swing.JLabel img_logo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel menu_lateral;
    // End of variables declaration//GEN-END:variables
}
