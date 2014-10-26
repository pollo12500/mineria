/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banquero;

import java.awt.Color;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author pollito
 */
public class ventana extends javax.swing.JFrame {

    /**
     * Creates new form ventana
     */
    public ventana() {
        initComponents();
    }
    
    public void banco(){
          // TODO add your handling code here:
       Integer a = 0;
       Integer b = 0;
       Integer c = 0;
        ArrayList p0 = new ArrayList();
        ArrayList p1 = new ArrayList();
        ArrayList p2 = new ArrayList();
        ArrayList p3 = new ArrayList();
        Thread hilo = new Thread();
        
        
        p0.add(Integer.parseInt(jTextField1.getText()));
        p0.add(Integer.parseInt(jTextField2.getText()));
        p0.add(Integer.parseInt(jTextField3.getText()));
        p0.add(Integer.parseInt(jTextField13.getText()));
        p0.add(Integer.parseInt(jTextField14.getText()));
        p0.add(Integer.parseInt(jTextField15.getText()));
        p0.add(false);

        
        p1.add(Integer.parseInt(jTextField4.getText()));
        p1.add(Integer.parseInt(jTextField5.getText()));
        p1.add(Integer.parseInt(jTextField6.getText()));
        p1.add(Integer.parseInt(jTextField16.getText()));
        p1.add(Integer.parseInt(jTextField17.getText()));
        p1.add(Integer.parseInt(jTextField18.getText()));
        p1.add(false);
        
        p2.add(Integer.parseInt(jTextField7.getText()));
        p2.add(Integer.parseInt(jTextField8.getText()));
        p2.add(Integer.parseInt(jTextField9.getText()));
        p2.add(Integer.parseInt(jTextField19.getText()));
        p2.add(Integer.parseInt(jTextField20.getText()));
        p2.add(Integer.parseInt(jTextField21.getText()));
        p2.add(false);
        
        p3.add(Integer.parseInt(jTextField10.getText()));
        p3.add(Integer.parseInt(jTextField11.getText()));
        p3.add(Integer.parseInt(jTextField12.getText()));
        p3.add(Integer.parseInt(jTextField22.getText()));
        p3.add(Integer.parseInt(jTextField23.getText()));
        p3.add(Integer.parseInt(jTextField24.getText()));
        p3.add(false);
        
        
        ArrayList disponibilidad = new ArrayList();
        disponibilidad.add(Integer.parseInt(jTextField25.getText()));
        disponibilidad.add(Integer.parseInt(jTextField26.getText()));
        disponibilidad.add(Integer.parseInt(jTextField27.getText()));

       

        for(int i = 1; i < 5; i++){
            
           /*try {
            hilo.sleep(100);
        } catch (Exception e) {
        }*/
          
            if(i==1 && ((boolean)p0.get(6)==false)){
                    a = (int)disponibilidad.get(0)+(int)p0.get(0);
                    b = (int)disponibilidad.get(1)+(int)p0.get(1);
                    c = (int)disponibilidad.get(2)+(int)p0.get(2);
                    if((a>=(int)p0.get(3))&&(b>=(int)p0.get(4))&&(c>=(int)p0.get(5))){
                        p0.set(6,true);
                    disponibilidad.set(0, a);
                    disponibilidad.set(1, b);
                    disponibilidad.set(2, c);
                    jTextField1.setBackground(Color.red);
                    jTextField2.setBackground(Color.red);
                    jTextField3.setBackground(Color.red);
           jTextField25.setText(""+a);
                     jTextField26.setText(""+b);
                      jTextField27.setText(""+c);
                      try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
        }
                    }
                }
                if(i==2&&((boolean)p1.get(6)==false)){
                    a = (int)disponibilidad.get(0)+(int)p1.get(0);
                    b = (int)disponibilidad.get(1)+(int)p1.get(1);
                    c = (int)disponibilidad.get(2)+(int)p1.get(2);
                    if((a>=(int)p1.get(3))&&(b>=(int)p1.get(4))&&(c>=(int)p1.get(5))){
                        p1.set(6,true);
                    disponibilidad.set(0, a);
                    disponibilidad.set(1, b);
                    disponibilidad.set(2, c);
                    jTextField4.setBackground(Color.red);
                    jTextField5.setBackground(Color.red);
                    jTextField6.setBackground(Color.red);
                    
                    jTextField25.setText(""+a);
                     jTextField26.setText(""+b);
                      jTextField27.setText(""+c);
                      try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
        }

                    }
                }
                if(i==3&&((boolean)p2.get(6)==false)){
                    a = (int)disponibilidad.get(0)+(int)p2.get(0);
                    b = (int)disponibilidad.get(1)+(int)p2.get(1);
                    c = (int)disponibilidad.get(2)+(int)p2.get(2);
                    if((a>=(int)p2.get(3))&&(b>=(int)p2.get(4))&&(c>=(int)p2.get(5))){
                        p2.set(6,true);
                    disponibilidad.set(0, a);
                    disponibilidad.set(1, b);
                    disponibilidad.set(2, c);
                    jTextField7.setBackground(Color.red);
                    jTextField8.setBackground(Color.red);
                    jTextField9.setBackground(Color.red);

                    jTextField25.setText(""+a);
                     jTextField26.setText(""+b);
                      jTextField27.setText(""+c);
                      try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
        }
                    }
                }
                if(i==4&&((boolean)p3.get(6)==false)){
                    a = (int)disponibilidad.get(0)+(int)p3.get(0);
                    b = (int)disponibilidad.get(1)+(int)p3.get(1);
                    c = (int)disponibilidad.get(2)+(int)p3.get(2);
                    if((a>=(int)p3.get(3))&&(b>=(int)p3.get(4))&&(c>=(int)p3.get(5))){
                        p3.set(6,true);
                    disponibilidad.set(0, a);
                    disponibilidad.set(1, b);
                    disponibilidad.set(2, c);
                    jTextField10.setBackground(Color.red);
                    jTextField11.setBackground(Color.red);
                    jTextField12.setBackground(Color.red);
                    
                    jTextField25.setText(""+a);
                     jTextField26.setText(""+b);
                      jTextField27.setText(""+c);
                      try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
        }
                    }
                    if(((boolean)p0.get(6)==true)&&((boolean)p1.get(6)==true)&&((boolean)p2.get(6)==true)&&((boolean)p3.get(6)==true)){
                        
                    }else{
                        i = 0;
                    }
                }
                
            
            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("INICIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("0");
        jTextField1.setName("A"); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("1");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setText("0");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setText("2");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setText("0");

        jTextField6.setText("0");

        jTextField7.setText("3");

        jTextField8.setText("0");

        jTextField9.setText("2");

        jTextField10.setText("2");

        jTextField11.setText("1");

        jTextField12.setText("1");

        label1.setText("P0");

        label2.setText("P1");

        label3.setText("P2");

        label4.setText("P3");

        jLabel1.setText("ASIGNACION");

        jLabel2.setText("MAX. NECESARIO");

        jLabel3.setText("A");

        jLabel4.setText("B");

        jLabel5.setText("C");

        jTextField13.setText("7");

        jTextField14.setText("5");

        jTextField15.setText("3");

        jTextField16.setText("3");

        jTextField17.setText("2");

        jTextField18.setText("2");

        jTextField19.setText("9");

        jTextField20.setText("0");

        jTextField21.setText("2");
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });

        jTextField22.setText("2");

        jTextField23.setText("2");

        jTextField24.setText("2");

        jLabel6.setText("A");

        jLabel7.setText("B");

        jLabel8.setText("C");

        jLabel9.setText("DISPONIBILIDAD");

        jLabel10.setText("A");

        jLabel11.setText("B");

        jLabel12.setText("C");

        jTextField25.setText("3");

        jTextField26.setText("3");

        jTextField27.setText("2");
        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jLabel4))
                                                    .addComponent(jTextField2))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(23, 23, 23)
                                                        .addComponent(jLabel5))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                                            .addComponent(jTextField6))))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField16, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                            .addComponent(jTextField19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField22))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                                        .addComponent(jTextField21, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel11)
                                        .addGap(89, 89, 89)
                                        .addComponent(jLabel12)))
                                .addGap(167, 167, 167))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4))
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );

        jTextField1.getAccessibleContext().setAccessibleName("marco");
        jTextField1.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            banco();
            
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          ventana v = new ventana();
                v.setVisible(true);
               // TODO add your handling code here:
     
           
       
                
       Integer a = 0;
       Integer b = 0;
       Integer c = 0;
        ArrayList p0 = new ArrayList();
        ArrayList p1 = new ArrayList();
        ArrayList p2 = new ArrayList();
        ArrayList p3 = new ArrayList();
        Thread hilo = new Thread();
        
        
        p0.add(Integer.parseInt(v.jTextField1.getText()));
        p0.add(Integer.parseInt(v.jTextField2.getText()));
        p0.add(Integer.parseInt(v.jTextField3.getText()));
        p0.add(Integer.parseInt(v.jTextField13.getText()));
        p0.add(Integer.parseInt(v.jTextField14.getText()));
        p0.add(Integer.parseInt(v.jTextField15.getText()));
        p0.add(false);

        
        p1.add(Integer.parseInt(v.jTextField4.getText()));
        p1.add(Integer.parseInt(v.jTextField5.getText()));
        p1.add(Integer.parseInt(v.jTextField6.getText()));
        p1.add(Integer.parseInt(v.jTextField16.getText()));
        p1.add(Integer.parseInt(v.jTextField17.getText()));
        p1.add(Integer.parseInt(v.jTextField18.getText()));
        p1.add(false);
        
        p2.add(Integer.parseInt(v.jTextField7.getText()));
        p2.add(Integer.parseInt(v.jTextField8.getText()));
        p2.add(Integer.parseInt(v.jTextField9.getText()));
        p2.add(Integer.parseInt(v.jTextField19.getText()));
        p2.add(Integer.parseInt(v.jTextField20.getText()));
        p2.add(Integer.parseInt(v.jTextField21.getText()));
        p2.add(false);
        
        p3.add(Integer.parseInt(v.jTextField10.getText()));
        p3.add(Integer.parseInt(v.jTextField11.getText()));
        p3.add(Integer.parseInt(v.jTextField12.getText()));
        p3.add(Integer.parseInt(v.jTextField22.getText()));
        p3.add(Integer.parseInt(v.jTextField23.getText()));
        p3.add(Integer.parseInt(v.jTextField24.getText()));
        p3.add(false);
        
        
        ArrayList disponibilidad = new ArrayList();
        disponibilidad.add(Integer.parseInt(v.jTextField25.getText()));
        disponibilidad.add(Integer.parseInt(v.jTextField26.getText()));
        disponibilidad.add(Integer.parseInt(v.jTextField27.getText()));

        
        
        for(int i = 1; i < 5; i++){
               try {
            Thread.sleep(1900);
        } catch (InterruptedException ex) {
            
        }
           /*try {
            hilo.sleep(100);
        } catch (Exception e) {
        }*/
          
            if(i==1 && ((boolean)p0.get(6)==false)){
                    a = (int)disponibilidad.get(0)+(int)p0.get(0);
                    b = (int)disponibilidad.get(1)+(int)p0.get(1);
                    c = (int)disponibilidad.get(2)+(int)p0.get(2);
                    if((a>=(int)p0.get(3))&&(b>=(int)p0.get(4))&&(c>=(int)p0.get(5))){
                        p0.set(6,true);
                    disponibilidad.set(0, a);
                    disponibilidad.set(1, b);
                    disponibilidad.set(2, c);
                    v.jTextField1.setBackground(Color.red);
                    v.jTextField2.setBackground(Color.red);
                    v.jTextField3.setBackground(Color.red);
           v.jTextField25.setText(""+a);
                     v.jTextField26.setText(""+b);
                      v.jTextField27.setText(""+c);
                   
                    }
                }
                if(i==2&&((boolean)p1.get(6)==false)){
                    a = (int)disponibilidad.get(0)+(int)p1.get(0);
                    b = (int)disponibilidad.get(1)+(int)p1.get(1);
                    c = (int)disponibilidad.get(2)+(int)p1.get(2);
                    if((a>=(int)p1.get(3))&&(b>=(int)p1.get(4))&&(c>=(int)p1.get(5))){
                        p1.set(6,true);
                    disponibilidad.set(0, a);
                    disponibilidad.set(1, b);
                    disponibilidad.set(2, c);
                    v.jTextField4.setBackground(Color.red);
                    v.jTextField5.setBackground(Color.red);
                    v.jTextField6.setBackground(Color.red);
                    
                    v.jTextField25.setText(""+a);
                     v.jTextField26.setText(""+b);
                      v.jTextField27.setText(""+c);
                   
                    }
                }
                if(i==3&&((boolean)p2.get(6)==false)){
                    a = (int)disponibilidad.get(0)+(int)p2.get(0);
                    b = (int)disponibilidad.get(1)+(int)p2.get(1);
                    c = (int)disponibilidad.get(2)+(int)p2.get(2);
                    if((a>=(int)p2.get(3))&&(b>=(int)p2.get(4))&&(c>=(int)p2.get(5))){
                        p2.set(6,true);
                    disponibilidad.set(0, a);
                    disponibilidad.set(1, b);
                    disponibilidad.set(2, c);
                    v.jTextField7.setBackground(Color.red);
                    v.jTextField8.setBackground(Color.red);
                    v.jTextField9.setBackground(Color.red);

                    v.jTextField25.setText(""+a);
                     v.jTextField26.setText(""+b);
                      v.jTextField27.setText(""+c);
                  
                    }
                }
                if(i==4&&((boolean)p3.get(6)==false)){
                    a = (int)disponibilidad.get(0)+(int)p3.get(0);
                    b = (int)disponibilidad.get(1)+(int)p3.get(1);
                    c = (int)disponibilidad.get(2)+(int)p3.get(2);
                    if((a>=(int)p3.get(3))&&(b>=(int)p3.get(4))&&(c>=(int)p3.get(5))){
                        p3.set(6,true);
                    disponibilidad.set(0, a);
                    disponibilidad.set(1, b);
                    disponibilidad.set(2, c);
                   v. jTextField10.setBackground(Color.red);
                   v. jTextField11.setBackground(Color.red);
                   v. jTextField12.setBackground(Color.red);
                    
                   v. jTextField25.setText(""+a);
                     v.jTextField26.setText(""+b);
                     v.jTextField27.setText(""+c);
                 
                    }
                    if(((boolean)p0.get(6)==true)&&((boolean)p1.get(6)==true)&&((boolean)p2.get(6)==true)&&((boolean)p3.get(6)==true)){
                        
                    }else{
                        i = 0;
                    }
                }
                
        
            
        }
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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              

                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    // End of variables declaration//GEN-END:variables
}
