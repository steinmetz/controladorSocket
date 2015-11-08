/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorsocket;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import controladorsocket.Message.Value;
import controladorsocket.socket.TCPClientSocket;
import controladorsocket.socket.UDPClientSocket;
import java.awt.Color;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author charles
 */
public class Menu extends javax.swing.JFrame {

    public boolean running = false; 

    public Menu() {
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

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        edtIPSensor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edtPortaSensor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edtIPAtuador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        edtPortaAtuador = new javax.swing.JTextField();
        radTCP = new javax.swing.JRadioButton();
        radUDP = new javax.swing.JRadioButton();
        btn = new javax.swing.JButton();
        txtTrasnmissoes = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        comboEixos = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        comboColor = new javax.swing.JComboBox();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("IP Sensor");

        edtIPSensor.setText("192.168.0.101");
        edtIPSensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtIPSensorActionPerformed(evt);
            }
        });

        jLabel3.setText("Porta");

        edtPortaSensor.setText("9000");

        jLabel4.setText("IP Atuador");

        edtIPAtuador.setText("192.168.0.103");

        jLabel5.setText("Porta");

        edtPortaAtuador.setText("9000");

        buttonGroup1.add(radTCP);
        radTCP.setSelected(true);
        radTCP.setText("TCP");

        buttonGroup1.add(radUDP);
        radUDP.setText("UDP");
        radUDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radUDPActionPerformed(evt);
            }
        });

        btn.setText("Start");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        txtTrasnmissoes.setText("0");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Eixo");

        comboEixos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Eixo X", "Eixo Y", "Eixo Z" }));
        comboEixos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboEixosItemStateChanged(evt);
            }
        });
        comboEixos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEixosActionPerformed(evt);
            }
        });

        jLabel7.setText("Cores");

        comboColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "R & G", "B & G" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radTCP)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTrasnmissoes)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radUDP)
                                .addGap(18, 18, 18)
                                .addComponent(btn, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(edtIPAtuador, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(edtIPSensor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edtPortaAtuador, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(edtPortaSensor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel6))
                                    .addComponent(comboEixos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(62, 62, 62)))
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtIPSensor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtPortaSensor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEixos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edtIPAtuador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edtPortaAtuador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radTCP)
                    .addComponent(radUDP)
                    .addComponent(btn))
                .addGap(18, 18, 18)
                .addComponent(txtTrasnmissoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radUDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radUDPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radUDPActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed

        if (btn.getText().equals("Start")) {
            txtTrasnmissoes.setText("0");
            running = true;
            Runnable run = null;
            if (radTCP.isSelected()) {
                run = new Runnable() {

                    @Override
                    public void run() {
                        startTCP();
                    }
                };

            } else {
                run = new Runnable() {

                    @Override
                    public void run() {
                        startUPD();
                    }
                };

            }

            new Thread(run).start();
            btn.setText("Stop");

        } else {
            running = false;
            btn.setText("Start");
        }


    }//GEN-LAST:event_btnActionPerformed
 


    private void edtIPSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtIPSensorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtIPSensorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        TCPClientSocket tcpSocketSensor = new TCPClientSocket("192.168.0.101", 9000);
        try {
            Message msg = new Message();
            msg.type = Message.REQUISICAO;
            Gson gson = new Gson();

            System.out.println(tcpSocketSensor.requestValue(gson.toJson(msg)));
        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboEixosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEixosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEixosActionPerformed

    private void comboEixosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboEixosItemStateChanged

      


    }//GEN-LAST:event_comboEixosItemStateChanged

    public void startTCP() {
        TCPClientSocket tcpSocketSensor = new TCPClientSocket(edtIPSensor.getText(), Integer.parseInt(edtPortaSensor.getText()));
        TCPClientSocket tcpSocketAtuador = new TCPClientSocket(edtIPAtuador.getText(), Integer.parseInt(edtPortaAtuador.getText()));
        Gson gson = new Gson();

        int eixoIndex = comboEixos.getSelectedIndex();
        Message confMsg = new Message();
        confMsg.type = Message.CONTROLE;
        confMsg.value = eixoIndex;
        try {
            String sensorVal = tcpSocketSensor.requestValue(gson.toJson(confMsg));
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String text = "";
            int erros = 0;
            long start, end;
            int cor = 0;
            while (running) {
                start = System.nanoTime();
                Message msg = new Message();

                if (eixoIndex != comboEixos.getSelectedIndex()) {
                    eixoIndex = comboEixos.getSelectedIndex();
                    msg.type = Message.CONTROLE;
                    msg.value = eixoIndex;
                } else {
                    msg.type = Message.REQUISICAO;
                } 
                String sensorVal = tcpSocketSensor.requestValue(gson.toJson(msg));

                if (sensorVal != null && sensorVal.trim().length() > 0) {
                    try {
                        java.lang.reflect.Type listType = new TypeToken<Message<Value>>() {
                    }.getType();
                        Message<Value> message = gson.fromJson(sensorVal,listType);
                        cor = getColor(message.value);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    tcpSocketAtuador.requestValue(String.valueOf(cor));

                    end = System.nanoTime();

                    text += end - start + "\r\n";
                } else {
                    erros++;
                } 
                int cont = (Integer.parseInt(txtTrasnmissoes.getText()));
                cont++;
                txtTrasnmissoes.setText(cont + "");
            }
            save(text + "\r\n\r\n" + erros, "tcp.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public int getColor(Value valor) {
        int maxSensorValue = 360;
        int v = (int) valor.value;
        if (valor.eixoIndex > 0) {
            v += 90;
            maxSensorValue = 180;
        }else{
            maxSensorValue = 360;
        }
        
        System.out.println("V:" + v + "  Max:" + maxSensorValue+"  E:"+valor.eixoIndex);
        if (comboColor.getSelectedIndex() == 0) {
            return getTrafficlightColorRG(maxSensorValue, v);
        } else {
            return getTrafficlightColorBG(maxSensorValue, v);
        }
    }

    public int getTrafficlightColorRG(int maxSensorValue, int n) {

        int r = (255 * n) / maxSensorValue;
        int g = (255 * (maxSensorValue - n)) / maxSensorValue;
        int b = 0;
        return new Color(r, g, b).getRGB();
    }

    public int getTrafficlightColorBG(int maxSensorValue, int n) {
        int r = 0;
        int g = (255 * (maxSensorValue - n)) / maxSensorValue;
        int b = (255 * n) / maxSensorValue;
        return new Color(r, g, b).getRGB();
    }

    public void startUPD() {
        UDPClientSocket udpSocketSensor = new UDPClientSocket(edtIPSensor.getText(), Integer.parseInt(edtPortaSensor.getText()));
        UDPClientSocket udpSocketAtuador = new UDPClientSocket(edtIPAtuador.getText(), Integer.parseInt(edtPortaAtuador.getText()));
        try {
            String text = "";
            int erros = 0;
            long start, end;
            while (running) {
                start = System.nanoTime();
                String sensorVal = udpSocketSensor.requestValue("0");
                if (sensorVal != null && sensorVal.trim().length() > 0) {
                    udpSocketAtuador.requestValue(sensorVal);
                    end = System.nanoTime();
                    text += end - start + "\r\n";
                } else {
                    erros++;
                }
                int cont = (Integer.parseInt(txtTrasnmissoes.getText()));
                cont++;
                txtTrasnmissoes.setText(cont + "");
            }
            save(text + "\r\n\r\n" + erros, "upd.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(String text, String filename) {
        PrintWriter writer;
        String path = "/home/charles/Dropbox/SCA/";
        try {
            writer = new PrintWriter(path + filename, "UTF-8");
            writer.println(text);
            writer.close();
        } catch (Exception ex) {
            Logger.getLogger(TCPClientSocket.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboColor;
    private javax.swing.JComboBox comboEixos;
    private javax.swing.JTextField edtIPAtuador;
    private javax.swing.JTextField edtIPSensor;
    private javax.swing.JTextField edtPortaAtuador;
    private javax.swing.JTextField edtPortaSensor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton radTCP;
    private javax.swing.JRadioButton radUDP;
    private javax.swing.JLabel txtTrasnmissoes;
    // End of variables declaration//GEN-END:variables
}
