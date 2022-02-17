package menu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Kursi1 extends javax.swing.JFrame {
    
    File f = null;
    FileReader fr = null;
    BufferedReader br = null;
    
    FileWriter fw = null;
    BufferedWriter bw = null;
    
    public Kursi1() {
        initComponents();
        check();
    }
    
    void check(){
        try{
        f = new File("kursi1.txt");
        fr = new FileReader("kursi1.txt");
        br = new BufferedReader(fr);
        
        String aa = br.readLine();
        String[] arrk = aa.split("#");
        String[] cek = {"a1","a2","a3","a4","b1","b2","b3","b4","c1","c2","c3","c4"};
        boolean[] kon = new boolean[12];
        
            for (int i = 0; i < arrk.length; i++) {
                for (int j = 0; j < cek.length; j++) {
                    if(arrk[i].equals(cek[j])){
                        kon[j] = true ;
                    }
                }
            }
            if(kon[0]==true){
                bangkuA1.setEnabled(false);
            }if(kon[1]==true){
                bangkuA2.setEnabled(false);
            }if(kon[2]==true){
                bangkuA3.setEnabled(false);
            }if(kon[3]==true){
                bangkuA4.setEnabled(false);
            }if(kon[4]==true){
                bangkuB1.setEnabled(false);
            }if(kon[5]==true){
                bangkuB2.setEnabled(false);;
            }if(kon[6]==true){
                bangkuB3.setEnabled(false);
            }if(kon[7]==true){
                bangkuB4.setEnabled(false);
            }if(kon[8]==true){
                bangkuC1.setEnabled(false);
            }if(kon[9]==true){
                bangkuC2.setEnabled(false);
            }if(kon[10]==true){
                bangkuC3.setEnabled(false);
            }if(kon[11]==true){
                bangkuC4.setEnabled(false);
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Belum ada data kursi");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    void cetaktiket(String kur){
        try{
        File f = new File("DataBioskop.txt");
        FileReader fr = new FileReader("DataBioskop.txt");
        BufferedReader br = new BufferedReader(fr);
        
        File g = new File("tiketA.txt");
        
        StringBuilder all = new StringBuilder();
        String line;
        PrintWriter pw = new PrintWriter(new FileOutputStream(g,true));
        
        while((line = br.readLine())!= null){
            all.append(line + "@");
        }
        String kalimat = all.toString();
        String[] pisahkal = new String[4];
        pisahkal = kalimat.split("@");
        String[] tik1;
        while(pisahkal[0]!= null){
            tik1 = pisahkal[0].split("#");
            pw.append("Tiket "+"\n"+
                    "======================"+"\n"+
                    "Judul Film : "+ tik1[0]+"\n"+
                    "Waktu : "+ tik1[1]+"\n"+
                    "Studio : "+tik1[2]+"\n"+
                    "Kursi : "+kur+"\n"+
                    "Harga : Rp."+tik1[3]+"\n\n");
            pw.close();
            break;
        }
            
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bangkuA1 = new javax.swing.JButton();
        bangkuA2 = new javax.swing.JButton();
        bangkuA3 = new javax.swing.JButton();
        bangkuA4 = new javax.swing.JButton();
        bangkuB1 = new javax.swing.JButton();
        bangkuC1 = new javax.swing.JButton();
        bangkuB2 = new javax.swing.JButton();
        bangkuB3 = new javax.swing.JButton();
        bangkuB4 = new javax.swing.JButton();
        bangkuC2 = new javax.swing.JButton();
        bangkuC3 = new javax.swing.JButton();
        bangkuC4 = new javax.swing.JButton();
        btnclr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pilih Kursi Studio A");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Layar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        bangkuA1.setText("A1");
        bangkuA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuA1ActionPerformed(evt);
            }
        });

        bangkuA2.setText("A2");
        bangkuA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuA2ActionPerformed(evt);
            }
        });

        bangkuA3.setText("A3");
        bangkuA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuA3ActionPerformed(evt);
            }
        });

        bangkuA4.setText("A4");
        bangkuA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuA4ActionPerformed(evt);
            }
        });

        bangkuB1.setText("B1");
        bangkuB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuB1ActionPerformed(evt);
            }
        });

        bangkuC1.setText("C1");
        bangkuC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuC1ActionPerformed(evt);
            }
        });

        bangkuB2.setText("B2");
        bangkuB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuB2ActionPerformed(evt);
            }
        });

        bangkuB3.setText("B3");
        bangkuB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuB3ActionPerformed(evt);
            }
        });

        bangkuB4.setText("B4");
        bangkuB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuB4ActionPerformed(evt);
            }
        });

        bangkuC2.setText("C2");
        bangkuC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuC2ActionPerformed(evt);
            }
        });

        bangkuC3.setText("C3");
        bangkuC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuC3ActionPerformed(evt);
            }
        });

        bangkuC4.setText("C4");
        bangkuC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuC4ActionPerformed(evt);
            }
        });

        btnclr.setText("Clear");
        btnclr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(97, 97, 97))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bangkuB1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bangkuA1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bangkuC1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(bangkuB2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bangkuB3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(bangkuB4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(bangkuA2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(bangkuC2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(bangkuC3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bangkuC4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(bangkuA3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(bangkuA4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnclr)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bangkuA1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bangkuA2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bangkuA3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bangkuA4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bangkuB1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bangkuB2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bangkuB3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bangkuB4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bangkuC4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bangkuC3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bangkuC2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bangkuC1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnclr)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bangkuA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuA1ActionPerformed
       bangkuA1.setEnabled(false);
       String a = "a1";
       
       try{
           f = new File("kursi1.txt");
           PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
           fr = new FileReader("kursi1.txt");
           br = new BufferedReader(fr);
           pw.append("" + a + "#");
           pw.close();
           br.close();
           cetaktiket(a);
       }catch(Exception e){
           e.printStackTrace();
       }
       
    }//GEN-LAST:event_bangkuA1ActionPerformed

    private void bangkuA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuA2ActionPerformed
       bangkuA2.setEnabled(false);
       String a = "a2";
       
       try{
           f = new File("kursi1.txt");
           PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
           fr = new FileReader("kursi1.txt");
           br = new BufferedReader(fr);
           pw.append("" + a + "#");
           pw.close();
           br.close();
           cetaktiket(a);
       }catch(Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_bangkuA2ActionPerformed

    private void bangkuA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuA3ActionPerformed
        bangkuA3.setEnabled(false);
        String a = "a3";
        try{
           f = new File("kursi1.txt");
           PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
           fr = new FileReader("kursi1.txt");
           br = new BufferedReader(fr);
           pw.append("" + a + "#");
           pw.close();
           br.close();
            cetaktiket(a);
       }catch(Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_bangkuA3ActionPerformed

    private void bangkuA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuA4ActionPerformed
        bangkuA4.setEnabled(false);
        String a = "a4";
        try{
           f = new File("kursi1.txt");
           PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
           fr = new FileReader("kursi1.txt");
           br = new BufferedReader(fr);
           pw.append("" + a + "#");
           pw.close();
           br.close();
           cetaktiket(a);
       }catch(Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_bangkuA4ActionPerformed

    private void bangkuB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuB1ActionPerformed
        bangkuB1.setEnabled(false);
        String a = "b1";
        try{
           f = new File("kursi1.txt");
           PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
           fr = new FileReader("kursi1.txt");
           br = new BufferedReader(fr);
           pw.append("" + a + "#");
           pw.close();
           br.close();
           cetaktiket(a);
       }catch(Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_bangkuB1ActionPerformed

    private void bangkuB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuB2ActionPerformed
        bangkuB2.setEnabled(false);
        String a = "b2";
        try{
           f = new File("kursi1.txt");
           PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
           fr = new FileReader("kursi1.txt");
           br = new BufferedReader(fr);
           pw.append("" + a + "#");
           pw.close();
           br.close();
           cetaktiket(a);
       }catch(Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_bangkuB2ActionPerformed

    private void bangkuB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuB3ActionPerformed
        bangkuB3.setEnabled(false);
        String a = "b3";
        try{
           f = new File("kursi1.txt");
           PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
           fr = new FileReader("kursi1.txt");
           br = new BufferedReader(fr);
           pw.append("" + a + "#");
           pw.close();
           br.close();
           cetaktiket(a);
       }catch(Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_bangkuB3ActionPerformed

    private void bangkuB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuB4ActionPerformed
        bangkuB4.setEnabled(false);
        String a = "b4";
        try{
           f = new File("kursi1.txt");
           PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
           fr = new FileReader("kursi1.txt");
           br = new BufferedReader(fr);
           pw.append("" + a + "#");
           pw.close();
           br.close();
           cetaktiket(a);
       }catch(Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_bangkuB4ActionPerformed

    private void bangkuC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuC1ActionPerformed
        bangkuC1.setEnabled(false);
        String a = "c1";
        try{
           f = new File("kursi1.txt");
           PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
           fr = new FileReader("kursi1.txt");
           br = new BufferedReader(fr);
           pw.append("" + a + "#");
           pw.close();
           br.close();
           cetaktiket(a);
       }catch(Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_bangkuC1ActionPerformed

    private void bangkuC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuC2ActionPerformed
        bangkuC2.setEnabled(false);
        String a = "c2";
        try{
           f = new File("kursi1.txt");
           PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
           fr = new FileReader("kursi1.txt");
           br = new BufferedReader(fr);
           pw.append("" + a + "#");
           pw.close();
           br.close();
           cetaktiket(a);
       }catch(Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_bangkuC2ActionPerformed

    private void bangkuC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuC3ActionPerformed
        bangkuC3.setEnabled(false);
        String a = "c3";
        try{
           f = new File("kursi1.txt");
           PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
           fr = new FileReader("kursi1.txt");
           br = new BufferedReader(fr);
           pw.append("" + a + "#");
           pw.close();
           br.close();
           cetaktiket(a);
       }catch(Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_bangkuC3ActionPerformed

    private void bangkuC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuC4ActionPerformed
        bangkuC4.setEnabled(false);
        String a = "c4";
        try{
           f = new File("kursi1.txt");
           PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
           fr = new FileReader("kursi1.txt");
           br = new BufferedReader(fr);
           pw.append("" + a + "#");
           pw.close();
           br.close();
           cetaktiket(a);
       }catch(Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_bangkuC4ActionPerformed

    private void btnclrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclrActionPerformed
        
        try{
        JOptionPane.showMessageDialog(null, "Data Kursi Akan Dihapus");
        FileWriter fw = new FileWriter("kursi1.txt");
        PrintWriter pw =new PrintWriter(fw);
        FileWriter fw2 = new FileWriter("tiketA.txt");
        PrintWriter pw2 = new PrintWriter(fw2);
        
        pw2.append("");
        pw2.close();
        
        pw.append("");
        pw.close();
        
        bangkuA1.setEnabled(true);
        bangkuA2.setEnabled(true);
        bangkuA3.setEnabled(true);
        bangkuA4.setEnabled(true);
        bangkuB1.setEnabled(true);
        bangkuB2.setEnabled(true);
        bangkuB3.setEnabled(true);
        bangkuB4.setEnabled(true);
        bangkuC1.setEnabled(true);
        bangkuC2.setEnabled(true);
        bangkuC3.setEnabled(true);
        bangkuC4.setEnabled(true);
        
       }catch(Exception e){
           e.printStackTrace();
       }
        
    }//GEN-LAST:event_btnclrActionPerformed

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
            java.util.logging.Logger.getLogger(Kursi1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kursi1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kursi1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kursi1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kursi1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bangkuA1;
    private javax.swing.JButton bangkuA2;
    private javax.swing.JButton bangkuA3;
    private javax.swing.JButton bangkuA4;
    private javax.swing.JButton bangkuB1;
    private javax.swing.JButton bangkuB2;
    private javax.swing.JButton bangkuB3;
    private javax.swing.JButton bangkuB4;
    private javax.swing.JButton bangkuC1;
    private javax.swing.JButton bangkuC2;
    private javax.swing.JButton bangkuC3;
    private javax.swing.JButton bangkuC4;
    private javax.swing.JButton btnclr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
