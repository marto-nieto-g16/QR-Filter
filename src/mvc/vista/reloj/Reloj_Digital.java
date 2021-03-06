/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.vista.reloj;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Hp
 */
public class Reloj_Digital extends javax.swing.JFrame implements Runnable {
    String hora, minutos, segundos, ampm;
    Calendar calendario;
    Thread h1;
    /**
     * Creates new form Reloj_Digital
     */
    public Reloj_Digital() {
        initComponents();
        h1 = new Thread(this);
        h1.start();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Reloj_Digital = new javax.swing.JPanel();
        lbReloj = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbReloj.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lbReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbReloj.setText("jLabel1");

        lbFecha.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        lbFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbFecha.setText("Fecha");

        javax.swing.GroupLayout Panel_Reloj_DigitalLayout = new javax.swing.GroupLayout(Panel_Reloj_Digital);
        Panel_Reloj_Digital.setLayout(Panel_Reloj_DigitalLayout);
        Panel_Reloj_DigitalLayout.setHorizontalGroup(
            Panel_Reloj_DigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Reloj_DigitalLayout.createSequentialGroup()
                .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbReloj, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_Reloj_DigitalLayout.setVerticalGroup(
            Panel_Reloj_DigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Reloj_DigitalLayout.createSequentialGroup()
                .addGroup(Panel_Reloj_DigitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbReloj)
                    .addComponent(lbFecha))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Reloj_Digital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Reloj_Digital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Panel_Reloj_Digital;
    public static javax.swing.JLabel lbFecha;
    public static javax.swing.JLabel lbReloj;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
       Thread ct = Thread.currentThread();
       while(ct == h1){
           Calcula();
           lbReloj.setText(hora+":"+minutos+":"+segundos+" "+ampm);
           try{
               Thread.sleep(1000);
           }catch(InterruptedException ex){}
       }
    }

    private void Calcula() {
     Calendar calendario = new GregorianCalendar();
     Date fecha_hora_actual = new Date();
     
     SimpleDateFormat fecha = new SimpleDateFormat("MMMMM dd yyyy");
     lbFecha.setText(fecha.format(fecha_hora_actual));
    
     calendario.setTime(fecha_hora_actual);
     ampm = calendario.get(Calendar.AM_PM) == Calendar.AM?"AM":"PM";
     
     if(ampm.equals("PM")){
         int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
         hora = h > 9?""+h:"0"+h;
     }else{
         hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+ calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
     }
     minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
     segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
}
