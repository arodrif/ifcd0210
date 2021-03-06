package pqws;
import pqws.Servicio;
import pqws.Servicio_Service;

public class NewCliente extends javax.swing.JFrame {

    /**
     * Creates new form NewCliente
     */
    public NewCliente() {
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
        jLabel1 = new javax.swing.JLabel();
        TxtNum1 = new javax.swing.JTextField();
        TxtNum2 = new javax.swing.JTextField();
        LblResultado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1Sumar = new javax.swing.JButton();
        jButton2Restar = new javax.swing.JButton();
        jButton3Multiplicar = new javax.swing.JButton();
        jButton4Dividir = new javax.swing.JButton();
        jButton5Raiz = new javax.swing.JButton();
        jButton6Logaritmo = new javax.swing.JButton();
        jButton7Potencia = new javax.swing.JButton();
        jButton8Porcentaje = new javax.swing.JButton();
        jButton9Hipotenusa = new javax.swing.JButton();
        jButton10Seno = new javax.swing.JButton();
        jButton11Coseno = new javax.swing.JButton();
        jButton12Tangente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("OPERACIONES MATEMATICAS");

        TxtNum1.setBackground(new java.awt.Color(102, 255, 255));
        TxtNum1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TxtNum1.setText("Num1");

        TxtNum2.setBackground(new java.awt.Color(102, 255, 255));
        TxtNum2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TxtNum2.setText("Num2");

        LblResultado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LblResultado.setText("Resultado:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Operaciones");

        jButton1Sumar.setBackground(new java.awt.Color(0, 102, 102));
        jButton1Sumar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1Sumar.setText("Sumar");
        jButton1Sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SumarActionPerformed(evt);
            }
        });

        jButton2Restar.setBackground(new java.awt.Color(0, 102, 102));
        jButton2Restar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2Restar.setText("Restar");
        jButton2Restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2RestarActionPerformed(evt);
            }
        });

        jButton3Multiplicar.setBackground(new java.awt.Color(0, 102, 102));
        jButton3Multiplicar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3Multiplicar.setText("Multiplicar");
        jButton3Multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3MultiplicarActionPerformed(evt);
            }
        });

        jButton4Dividir.setBackground(new java.awt.Color(0, 102, 102));
        jButton4Dividir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4Dividir.setText("Dividir");
        jButton4Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4DividirActionPerformed(evt);
            }
        });

        jButton5Raiz.setBackground(new java.awt.Color(0, 102, 102));
        jButton5Raiz.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5Raiz.setText("Raiz");
        jButton5Raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5RaizActionPerformed(evt);
            }
        });

        jButton6Logaritmo.setBackground(new java.awt.Color(0, 102, 102));
        jButton6Logaritmo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6Logaritmo.setText("Log(10)");
        jButton6Logaritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6LogaritmoActionPerformed(evt);
            }
        });

        jButton7Potencia.setBackground(new java.awt.Color(0, 102, 102));
        jButton7Potencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7Potencia.setText("Potencia");
        jButton7Potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7PotenciaActionPerformed(evt);
            }
        });

        jButton8Porcentaje.setBackground(new java.awt.Color(0, 102, 102));
        jButton8Porcentaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8Porcentaje.setText("%");
        jButton8Porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8PorcentajeActionPerformed(evt);
            }
        });

        jButton9Hipotenusa.setBackground(new java.awt.Color(0, 102, 102));
        jButton9Hipotenusa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9Hipotenusa.setText("Hiputenusa");
        jButton9Hipotenusa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9HipotenusaActionPerformed(evt);
            }
        });

        jButton10Seno.setBackground(new java.awt.Color(0, 102, 102));
        jButton10Seno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10Seno.setText("Seno");
        jButton10Seno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10SenoActionPerformed(evt);
            }
        });

        jButton11Coseno.setBackground(new java.awt.Color(0, 102, 102));
        jButton11Coseno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11Coseno.setText("Coseno");
        jButton11Coseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11CosenoActionPerformed(evt);
            }
        });

        jButton12Tangente.setBackground(new java.awt.Color(0, 102, 102));
        jButton12Tangente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12Tangente.setText("Tangente");
        jButton12Tangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12TangenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtNum1)
                                    .addComponent(TxtNum2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1))))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton9Hipotenusa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1Sumar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5Raiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton10Seno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6Logaritmo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2Restar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton11Coseno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3Multiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7Potencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8Porcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4Dividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton12Tangente, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(LblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(TxtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Sumar)
                    .addComponent(jButton2Restar)
                    .addComponent(jButton3Multiplicar)
                    .addComponent(jButton4Dividir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5Raiz)
                    .addComponent(jButton6Logaritmo)
                    .addComponent(jButton7Potencia)
                    .addComponent(jButton8Porcentaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9Hipotenusa)
                    .addComponent(jButton10Seno)
                    .addComponent(jButton11Coseno)
                    .addComponent(jButton12Tangente)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1SumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SumarActionPerformed
        // TODO add your handling code here:
        int Num1=Integer.parseInt(TxtNum1.getText());
        int Num2=Integer.parseInt(TxtNum2.getText());
        Servicio_Service servicio =new Servicio_Service();
        Servicio port = servicio.getServicioPort();
        String resultado = port.sumar(Num1, Num2).toString();
        LblResultado.setText("Resultado: " +resultado);
        
    }//GEN-LAST:event_jButton1SumarActionPerformed

    private void jButton6LogaritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6LogaritmoActionPerformed
        // TODO add your handling code here:
     double Num1 = Double.parseDouble(TxtNum1.getText());
     Servicio_Service servicio = new Servicio_Service();
     Servicio port = servicio.getServicioPort();
     String resultado = port.logaritmo(Num1).toString();
     LblResultado.setText("El logaritmo de" + " " + Num1 + " " + "es" + " " +  resultado);
    }//GEN-LAST:event_jButton6LogaritmoActionPerformed

    private void jButton7PotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7PotenciaActionPerformed
        // TODO add your handling code here:
        int Num1=Integer.parseInt(TxtNum1.getText());
        int Num2=Integer.parseInt(TxtNum2.getText());
        Servicio_Service servicio =new Servicio_Service();
        Servicio port = servicio.getServicioPort();
        String resultado = port.potencia(Num1, Num2).toString();
        LblResultado.setText("Resultado: " +resultado);
    }//GEN-LAST:event_jButton7PotenciaActionPerformed

    private void jButton8PorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8PorcentajeActionPerformed
        // TODO add your handling code here:
        Double Num1=Double.parseDouble(TxtNum1.getText());
        Double Num2=Double.parseDouble(TxtNum2.getText());
        Servicio_Service servicio =new Servicio_Service();
        Servicio port = servicio.getServicioPort();
        String resultado = port.porcentaje(Num1, Num2).toString();
        LblResultado.setText("Resultado: " +resultado);
    }//GEN-LAST:event_jButton8PorcentajeActionPerformed

    private void jButton10SenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10SenoActionPerformed
        // TODO add your handling code here:
           double Num1 = Double.parseDouble(TxtNum1.getText());
      Servicio_Service servicio = new Servicio_Service();
     Servicio port = servicio.getServicioPort();
     String resultado = port.seno(Num1).toString();
      LblResultado.setText("El Seno de" + " " + Num1 + " " + "es" + " " +  resultado + " " + "radianes");
    }//GEN-LAST:event_jButton10SenoActionPerformed

    private void jButton2RestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2RestarActionPerformed
        // TODO add your handling code here:
        int Num1=Integer.parseInt(TxtNum1.getText());
        int Num2=Integer.parseInt(TxtNum2.getText());
        Servicio_Service servicio =new Servicio_Service();
        Servicio port = servicio.getServicioPort();
        String resultado = port.restar(Num1, Num2).toString();
        LblResultado.setText("Resultado: " +resultado);
    }//GEN-LAST:event_jButton2RestarActionPerformed

    private void jButton3MultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3MultiplicarActionPerformed
        // TODO add your handling code here:
        int Num1=Integer.parseInt(TxtNum1.getText());
        int Num2=Integer.parseInt(TxtNum2.getText());
        Servicio_Service servicio =new Servicio_Service();
        Servicio port = servicio.getServicioPort();
        String resultado = port.multiplicar(Num1, Num2).toString();
        LblResultado.setText("Resultado: " +resultado);
    }//GEN-LAST:event_jButton3MultiplicarActionPerformed

    private void jButton4DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4DividirActionPerformed
        // TODO add your handling code here:
         int Num1=Integer.parseInt(TxtNum1.getText());
        int Num2=Integer.parseInt(TxtNum2.getText());
        Servicio_Service servicio =new Servicio_Service();
        Servicio port = servicio.getServicioPort();
        String resultado = port.dividir(Num1, Num2).toString();
        LblResultado.setText("Resultado: " +resultado);
    }//GEN-LAST:event_jButton4DividirActionPerformed

    private void jButton5RaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5RaizActionPerformed
        // TODO add your handling code here:
        double Num1 = Double.parseDouble(TxtNum1.getText());
        Servicio_Service servicio = new Servicio_Service();
        Servicio port = servicio.getServicioPort();
        String resultado = port.raiz(Num1).toString();
        LblResultado.setText("La raíz cuadrada de" +" " + Num1 + " " +  "es" + " " + resultado);
    }//GEN-LAST:event_jButton5RaizActionPerformed

    private void jButton9HipotenusaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9HipotenusaActionPerformed
        // TODO add your handling code here:
        Double Num1=Double.parseDouble(TxtNum1.getText());
        Double Num2=Double.parseDouble(TxtNum2.getText());
        Servicio_Service servicio =new Servicio_Service();
        Servicio port = servicio.getServicioPort();
        String resultado = port.hipotenusa(Num1, Num2).toString();
        LblResultado.setText("Resultado: " +resultado);
    }//GEN-LAST:event_jButton9HipotenusaActionPerformed

    private void jButton11CosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11CosenoActionPerformed
        // TODO add your handling code here:
          double Num1 = Double.parseDouble(TxtNum1.getText());
          Servicio_Service servicio = new Servicio_Service();
          Servicio port = servicio.getServicioPort();
          String resultado = port.coseno(Num1).toString();
          LblResultado.setText("El Coseno de" + " " + Num1 + " " + "es" + " " +  resultado + " " + "radianes");
    }//GEN-LAST:event_jButton11CosenoActionPerformed

    private void jButton12TangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12TangenteActionPerformed
        // TODO add your handling code here:
         double Num1 = Double.parseDouble(TxtNum1.getText());
          Servicio_Service servicio = new Servicio_Service();
     Servicio port = servicio.getServicioPort();
     String resultado = port.tangente(Num1).toString();
     LblResultado.setText("La Tangente de" + " " + Num1 + " " + "es" + " " +  resultado + " " + "radianes");
    }//GEN-LAST:event_jButton12TangenteActionPerformed

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
            java.util.logging.Logger.getLogger(NewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblResultado;
    private javax.swing.JTextField TxtNum1;
    private javax.swing.JTextField TxtNum2;
    private javax.swing.JButton jButton10Seno;
    private javax.swing.JButton jButton11Coseno;
    private javax.swing.JButton jButton12Tangente;
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
