/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionestp6u1.vistas;

import coleccionestp6u1.entidades.Directorio;
import coleccionestp6u1.entidades.Cliente;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Ezequiel Coronel
 */
public class ViewBorrarCliente extends javax.swing.JInternalFrame {

    private Directorio directorioClientes;

    /**
     * Creates new form ViewBorrarCliente
     */
    public ViewBorrarCliente(Directorio directorio) {
        initComponents();
        this.directorioClientes = directorio;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jtfDni = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfCiudad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jbBorrar = new javax.swing.JButton();

        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("DNI:");

        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("TELEFONO:");

        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("APELLIDO:");

        jLabel4.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4.setText("NOMBRE:");

        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setText("CIUDAD:");

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jtfTelefono.setEditable(false);

        jtfApellido.setEditable(false);

        jtfNombre.setEditable(false);

        jtfCiudad.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 255));
        jLabel6.setText("Borrar Clientes");

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jbBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBorrar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        try {
            Long dni = Long.parseLong(jtfDni.getText());

            TreeMap<Long, Cliente> clienteBorrado = directorioClientes.borrarCliente(dni);

            //Se usa clienteBorrado.Firstkey() para devolver la primera y (en este caso particular) unica clave guardada que hace referencia al
            //cliente eliminado.
            if (clienteBorrado.size() == 1) {
                jtfTelefono.setText(String.valueOf(clienteBorrado.firstKey()));
                jtfApellido.setText(((Cliente) clienteBorrado.get(clienteBorrado.firstKey())).getApellidoCliente());
                jtfNombre.setText(((Cliente) clienteBorrado.get(clienteBorrado.firstKey())).getNombreCliente());
                jtfCiudad.setText(((Cliente) clienteBorrado.get(clienteBorrado.firstKey())).getCiudadCliente());
                JOptionPane.showMessageDialog(this, "El cliente ha sido borrado");
                
                jtfDni.setText("");
                jtfTelefono.setText("");
                jtfApellido.setText("");
                jtfNombre.setText("");
                jtfCiudad.setText("");
            }else{
                JOptionPane.showMessageDialog(this, "El cliente no existe");
                jtfDni.requestFocus();
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Dni ingresado no valido, intente de nuevo");
            jtfDni.requestFocus();
        }
    }//GEN-LAST:event_jbBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfCiudad;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables
}
