package pqws;

/**
 *
 * @author ANABEl RODRIGUEZ
 */
public class Clientews extends javax.swing.JFrame {

    private Object servicios;

  
    public Clientews() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtNum1 = new javax.swing.JTextField();
        TxtNum2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LblRespuesta = new javax.swing.JLabel();
        jButton1Sumar = new javax.swing.JButton();
        jButton2Restar = new javax.swing.JButton();
        jButton3Multiplicar = new javax.swing.JButton();
        jButton4Dividir = new javax.swing.JButton();
        jButton5Raiz = new javax.swing.JButton();
        jButton6Logaritmo = new javax.swing.JButton();
        jButton7Potencia = new javax.swing.JButton();
        jButton8Porcentaje = new javax.swing.JButton();
        jButton9Hipotenusa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        TxtNum1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TxtNum1.setText("Num1");

        TxtNum2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TxtNum2.setText("Num2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("OPERACIONES MATEMÁTICAS");

        LblRespuesta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblRespuesta.setText("RESPUESTA: ");

        jButton1Sumar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1Sumar.setText("Sumar");
        jButton1Sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SumarActionPerformed(evt);
            }
        });

        jButton2Restar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2Restar.setText("Restar");
        jButton2Restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2RestarActionPerformed(evt);
            }
        });

        jButton3Multiplicar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3Multiplicar.setText("Multiplicar");
        jButton3Multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3MultiplicarActionPerformed(evt);
            }
        });

        jButton4Dividir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4Dividir.setText("Dividir");
        jButton4Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4DividirActionPerformed(evt);
            }
        });

        jButton5Raiz.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5Raiz.setText("Raiz");
        jButton5Raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5RaizActionPerformed(evt);
            }
        });

        jButton6Logaritmo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6Logaritmo.setText("Log(10)");
        jButton6Logaritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6LogaritmoActionPerformed(evt);
            }
        });

        jButton7Potencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7Potencia.setText("Potencia");
        jButton7Potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7PotenciaActionPerformed(evt);
            }
        });

        jButton8Porcentaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8Porcentaje.setText("Porcentaje");
        jButton8Porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8PorcentajeActionPerformed(evt);
            }
        });

        jButton9Hipotenusa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9Hipotenusa.setText("Hipotenusa");
        jButton9Hipotenusa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9HipotenusaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("OPERACIONES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtNum1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                    .addComponent(TxtNum2))
                                .addGap(18, 18, 18)
                                .addComponent(LblRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1Sumar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jButton5Raiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2Restar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6Logaritmo, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton7Potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton3Multiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4Dividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8Porcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                            .addComponent(jButton9Hipotenusa, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(TxtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(LblRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Sumar)
                    .addComponent(jButton2Restar)
                    .addComponent(jButton3Multiplicar)
                    .addComponent(jButton4Dividir))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5Raiz)
                    .addComponent(jButton6Logaritmo)
                    .addComponent(jButton7Potencia)
                    .addComponent(jButton8Porcentaje))
                .addGap(18, 18, 18)
                .addComponent(jButton9Hipotenusa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1SumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SumarActionPerformed
        int num1 = Integer.parseInt(TxtNum1.getText());
        int num2 = Integer.parseInt(TxtNum2.getText());
        Servicios_Service servicio = new Servicios_Service();
        Servicio port = servicio.getServicioPort();
        int resultado = port.Sumar(num1,num2);
        LblResultado.setText("Resultado: " + resultado);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1SumarActionPerformed

    private void jButton2RestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2RestarActionPerformed
        int num1 = Integer.parseInt(TxtNum1.getText());
        int num2 = Integer.parseInt(TxtNum2.getText());
        Servicios_Service servicio = new Servicios_Service();
        Servicio port = servicio.getServicioPort();
        int resultado = port.Restar(num1,num2);
        LblResultado.setText("Resultado: " + resultado);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2RestarActionPerformed

    private void jButton3MultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3MultiplicarActionPerformed
        int num1 = Integer.parseInt(TxtNum1.getText());
        int num2 = Integer.parseInt(TxtNum2.getText());
        Servicios_Service servicio = new Servicios_Service();
        Servicio port = servicio.getServicioPort();
        int resultado = port.Multiplicar(num1,num2);
        LblResultado.setText("Resultado: " + resultado);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MultiplicarActionPerformed

    private void jButton4DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4DividirActionPerformed
        int num1 = Integer.parseInt(TxtNum1.getText());
        int num2 = Integer.parseInt(TxtNum2.getText());
        Servicios_Service servicio = new Servicios_Service();
        Servicio port = servicio.getServicioPort();
        String resultado = port.Dividir(num1, num2).toString();
        LblResultado.setText("Resultado: " + resultado);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4DividirActionPerformed

    private void jButton5RaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5RaizActionPerformed
        double num1 = Double.parseDouble(TxtNum1.getText());
        Servicios_Service servicio = new Servicios_Service();
        Servicio port = servicio.getServicioPort();
        String resultado = port.Raiz(num1).toString();
        LblResultado.setText("La raíz cuadrada de" +" " + num1 + " " +  "es" + " " + resultado);// TODO add your handling code here:
    }//GEN-LAST:event_jButton5RaizActionPerformed

    private void jButton6LogaritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6LogaritmoActionPerformed
     double num1 = Double.parseDouble(TxtNum1.getText());
     Servicios_Service servicio = new Servicios_Service();
     Servicio port = servicio.getServicioPort();
     String resultado = port.logaritmo(num1).toString();
     LblResultado.setText("El logaritmo de" + " " + num1 + " " + "es" + " " +  resultado);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton6LogaritmoActionPerformed

    private void jButton7PotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7PotenciaActionPerformed
        int num1 = Integer.parseInt(TxtNum1.getText());
        int num2 = Integer.parseInt(TxtNum2.getText());
        Servicios_Service servicio = new Servicios_Service();
        Servicio port = servicio.getServicioPort();
        String resultado = port.Potencia(num1, num2).toString();
        LblResultado.setText("Resultado: " + resultado);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton7PotenciaActionPerformed

    private void jButton8PorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8PorcentajeActionPerformed
        int num1 = Integer.parseInt(TxtNum1.getText());
        int num2 = Integer.parseInt(TxtNum2.getText());
        Servicios_Service servicio = new Servicios_Service();
        Servicio port = servicio.getServicioPort();
        String resultado = port.Porcentaje(num1, num2).toString();
        LblResultado.setText("Resultado: " + resultado);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton8PorcentajeActionPerformed

    private void jButton9HipotenusaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9HipotenusaActionPerformed
         int num1 = Integer.parseInt(TxtNum1.getText());
        int num2 = Integer.parseInt(TxtNum2.getText());
        Servicios_Service servicio = new Servicios_Service();
        Servicio port = servicio.getServicioPort();
        String resultado = port.Hipotenusa(num1, num2).toString();
        LblResultado.setText("Resultado: " + resultado);// TODO add your handling code here:
    }//GEN-LAST:event_jButton9HipotenusaActionPerformed

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
            java.util.logging.Logger.getLogger(Clientews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Clientews().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblRespuesta;
    private javax.swing.JTextField TxtNum1;
    private javax.swing.JTextField TxtNum2;
    private javax.swing.JButton jButton1Sumar;
    private javax.swing.JButton jButton2Restar;
    private javax.swing.JButton jButton3Multiplicar;
    private javax.swing.JButton jButton4Dividir;
    private javax.swing.JButton jButton5Raiz;
    private javax.swing.JButton jButton6Logaritmo;
    private javax.swing.JButton jButton7Potencia;
    private javax.swing.JButton jButton8Porcentaje;
    private javax.swing.JButton jButton9Hipotenusa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
