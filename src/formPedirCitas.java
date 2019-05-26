
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josem
 */
public class formPedirCitas extends javax.swing.JFrame {
    ArrayList<registros> arrayMisRegistros;
    ArrayList<String> arrayHorasCogidas;
    
    // CREAMOS EL OBJETO DE LA CLASE registros
    registros classRegistro;
    
    /**
     * Creates new form formPedirCitas
     */
    public formPedirCitas() {
        initComponents();
        arrayMisRegistros = new ArrayList();
        
        // INICIALIZAMOS EL DÍA CON LAS HORAS DE CITAS
        for (int i = 10; i < 20; i++) {
            if (i != 14 && i != 15) {
                jlistHoras.addItem(String.valueOf(i));
            }
        }
        
        // PONEMOS EL FOCO EN EL NOMBRE
        textoNombre.requestFocus();
    }
    
    public formPedirCitas(ArrayList<String> arrayHorasCogidas) {
        initComponents();
        arrayMisRegistros = new ArrayList();
        this.arrayHorasCogidas = arrayHorasCogidas;
        
        // INICIALIZAMOS EL DÍA CON LAS HORAS DE CITAS
        for (int i = 10; i < 20; i++) {
            if (i != 14 && i != 15) {
                if (!this.arrayHorasCogidas.contains(String.valueOf(i))){
                    jlistHoras.addItem(String.valueOf(i));
                }
            }
        }
        
        // PONEMOS EL FOCO EN EL NOMBRE
        textoNombre.requestFocus();
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
        jlistHoras = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textoTelefono = new javax.swing.JTextField();
        botonCogerCita = new javax.swing.JButton();

        setTitle("Pedir citas");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PEDIR CITA");

        jlistHoras.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Hora");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Teléfono");

        botonCogerCita.setText("COGER CITA");
        botonCogerCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCogerCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlistHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addComponent(textoNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textoTelefono)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCogerCita, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(textoNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlistHoras, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(textoTelefono))
                .addGap(18, 18, 18)
                .addComponent(botonCogerCita, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCogerCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCogerCitaActionPerformed
        if (textoNombre.getText().equals("") || textoTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ERROR. RELLENE TODOS LOS CAMPOS");
        } else {
            if (jlistHoras.getSize().getWidth() > 0) {
                String horaSeleccionada = "";
                int indiceSeleccionado = 0;
                String nombreCliente = "";
                String telefonoCliente = "";
                arrayMisRegistros = new ArrayList();


                // COGEMOS LOS DATOS DEL FORMULARIO DE PEDIR CITAS
                try {
                    horaSeleccionada = jlistHoras.getSelectedItem().toString();
                    nombreCliente = textoNombre.getText();
                    telefonoCliente = textoTelefono.getText();
                    indiceSeleccionado = jlistHoras.getSelectedIndex();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

                classRegistro = new registros(horaSeleccionada, nombreCliente, telefonoCliente);
                arrayMisRegistros.add(classRegistro);

                int tamArrayRegistros = arrayMisRegistros.size();
                for (int i = 0; i < tamArrayRegistros; i++) {
                    JOptionPane.showMessageDialog(null, arrayMisRegistros.get(i).getNombre_cliente());
                }
                jlistHoras.removeItemAt(indiceSeleccionado);
                jlistHoras.updateUI();
            } else {
                JOptionPane.showMessageDialog(null, "SE ACABARON LAS CITAS POR HOY, GRACIAS...");
            }
        }
    }//GEN-LAST:event_botonCogerCitaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        formInicio formularioInicio = new formInicio(arrayMisRegistros, arrayHorasCogidas);
        formularioInicio.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(formPedirCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPedirCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPedirCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPedirCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPedirCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCogerCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> jlistHoras;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoTelefono;
    // End of variables declaration//GEN-END:variables
}
