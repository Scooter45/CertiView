package proyecto_consultas;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Scooter
 */
public class inicio_de_sesion extends javax.swing.JFrame {
    
    public inicio_de_sesion() {
        initComponents();
    }

private void validarCredenciales() {
        String usuario = C_Usuario.getText();
        String contraseña = new String(C_Contraseña.getPassword());

        // Verificar credenciales
        if (usuario.equals("admin") && contraseña.equals("admin123")) {
            abrirVentanaAdministrador();
        } else if (usuario.equals("user") && contraseña.equals("user123")) {
            abrirVentanaUsuarioNormal();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
        }
    }

private void abrirVentanaAdministrador() {
        new VentanaAdministrador().setVisible(true);
        this.dispose(); // Cierra la ventana de inicio de sesión
    }

private void abrirVentanaUsuarioNormal() {
        new VentanaUsuario().setVisible(true);
        this.dispose(); // Cierra la ventana de inicio de sesión
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        PanelDeIngreso = new javax.swing.JPanel();
        B_Ingresar = new javax.swing.JButton();
        C_Usuario = new javax.swing.JTextField();
        T_Usuario = new javax.swing.JLabel();
        T_Contraseña = new javax.swing.JLabel();
        C_Contraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setForeground(new java.awt.Color(0, 153, 153));

        Fondo.setBackground(new java.awt.Color(255, 255, 204));
        Fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        Fondo.setForeground(new java.awt.Color(0, 153, 153));
        Fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PanelDeIngreso.setBackground(new java.awt.Color(255, 255, 153));

        B_Ingresar.setText("Iniciar Sesión");
        B_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_IngresarActionPerformed(evt);
            }
        });

        C_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_UsuarioActionPerformed(evt);
            }
        });

        T_Usuario.setText("Nombre de usuario");

        T_Contraseña.setText("Contraseña");

        C_Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_ContraseñaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDeIngresoLayout = new javax.swing.GroupLayout(PanelDeIngreso);
        PanelDeIngreso.setLayout(PanelDeIngresoLayout);
        PanelDeIngresoLayout.setHorizontalGroup(
            PanelDeIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeIngresoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelDeIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDeIngresoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(B_Ingresar)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        PanelDeIngresoLayout.setVerticalGroup(
            PanelDeIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeIngresoLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(T_Usuario)
                .addGap(8, 8, 8)
                .addComponent(C_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(T_Contraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(B_Ingresar)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(PanelDeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(PanelDeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C_ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_ContraseñaActionPerformed

    private void C_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_UsuarioActionPerformed
    String usuario = C_Usuario.getText();
    String contraseña = new String(C_Contraseña.getPassword());

    }//GEN-LAST:event_C_UsuarioActionPerformed

    private void B_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_IngresarActionPerformed

    String usuario = C_Usuario.getText();
    String contraseña = new String(C_Contraseña.getPassword());

    // Verificar credenciales
    if (usuario.equals("admin") && contraseña.equals("admin123")) {
        abrirVentanaAdministrador();
    } else if (usuario.equals("user") && contraseña.equals("user123")) {
        abrirVentanaUsuarioNormal();
    } else {
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
    }

    }//GEN-LAST:event_B_IngresarActionPerformed

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
            java.util.logging.Logger.getLogger(inicio_de_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio_de_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio_de_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio_de_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio_de_sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Ingresar;
    private javax.swing.JPasswordField C_Contraseña;
    private javax.swing.JTextField C_Usuario;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel PanelDeIngreso;
    private javax.swing.JLabel T_Contraseña;
    private javax.swing.JLabel T_Usuario;
    // End of variables declaration//GEN-END:variables
}
