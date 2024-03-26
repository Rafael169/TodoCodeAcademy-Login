
package com.mycompany.loginjpa.igu;

import com.mycompany.loginjpa.logica.Controladora;
import javax.swing.JOptionPane;


public class PLogin extends javax.swing.JFrame {

    Controladora control;

    
    public PLogin() {
        initComponents();
        control = new Controladora();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bgraun = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        lblIcono = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextArea();
        txtUsuario = new javax.swing.JTextField();
        txtContracenia = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Bgraun.setBackground(new java.awt.Color(255, 255, 255));
        Bgraun.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Roboto Medium", 3, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("LOGIN JPA");
        Bgraun.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 290, -1));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\ralej\\Documents\\NetBeansProjects\\LoginJPA\\src\\main\\java\\com\\mycompany\\loginjpa\\igu\\logo.png")); // NOI18N
        Bgraun.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 290, -1));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\ralej\\Documents\\NetBeansProjects\\LoginJPA\\src\\main\\java\\com\\mycompany\\loginjpa\\igu\\boton.png")); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        Bgraun.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        lblCity.setIcon(new javax.swing.ImageIcon("C:\\Users\\ralej\\Documents\\NetBeansProjects\\LoginJPA\\src\\main\\java\\com\\mycompany\\loginjpa\\igu\\city.png")); // NOI18N
        Bgraun.add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 290, 490));

        lblIcono.setFont(new java.awt.Font("Roboto Light", 3, 18)); // NOI18N
        lblIcono.setForeground(new java.awt.Color(0, 0, 0));
        lblIcono.setIcon(new javax.swing.ImageIcon("C:\\Users\\ralej\\Documents\\NetBeansProjects\\LoginJPA\\src\\main\\java\\com\\mycompany\\loginjpa\\igu\\favicon.png")); // NOI18N
        lblIcono.setText("LOGO");
        Bgraun.add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(0, 134, 190));
        btnIngresar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 0, 0));
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        Bgraun.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 110, 30));

        btnLimpiar.setBackground(new java.awt.Color(0, 134, 190));
        btnLimpiar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        Bgraun.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 110, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        Bgraun.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 250, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        Bgraun.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 250, 10));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("USUARIO");
        Bgraun.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        txtMensaje.setBackground(new java.awt.Color(255, 255, 255));
        txtMensaje.setColumns(20);
        txtMensaje.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        txtMensaje.setForeground(new java.awt.Color(0, 0, 0));
        txtMensaje.setRows(5);
        jScrollPane1.setViewportView(txtMensaje);

        Bgraun.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 250, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        Bgraun.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 250, 30));

        txtContracenia.setBackground(new java.awt.Color(255, 255, 255));
        txtContracenia.setBorder(null);
        Bgraun.add(txtContracenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 250, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CONTRACEÑA");
        Bgraun.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bgraun, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bgraun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtUsuario.setText("");
        txtContracenia.setText("");
        txtMensaje.setText("");
        JOptionPane.showMessageDialog(null, "Limpieza Exitosa");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:

        String usuario = txtUsuario.getText();
        String contracenia = txtContracenia.getText();
        String mensaje = control.validarUsuario(usuario, contracenia);
        txtMensaje.setText(mensaje);
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bgraun;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPasswordField txtContracenia;
    private javax.swing.JTextArea txtMensaje;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
