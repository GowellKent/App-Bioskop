
package view;


import control.Conbios;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOError;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import menu.kasir;
import menu.login;
import model.Bioskop;

public class Opbios extends javax.swing.JFrame {
    
    boolean cekupdate = false;
    List<Bioskop> lb;
    Bioskop b;

    public Opbios() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initListener();
        this.setResizable(false);
        btncan.setVisible(false);
        try{
            load();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "");
        }
    }
    
    void load(){
        lb = new Conbios().getAll();
        String data[][] = new String[lb.size()][4];
        for (int i = 0; i < lb.size(); i++) {
            data[i][0] = lb.get(i).getFilm();
            data[i][1] = lb.get(i).getWaktu();
            data[i][2] = lb.get(i).getStudio()+"";
            data[i][3] = lb.get(i).getHarga() + "";
        }
        tabeldata.setModel(new DefaultTableModel(data,new String[]{"Film","Waktu","Studio","Harga"}));
    }

    void clear(){
        btndel.setVisible(true);
        btnins.setVisible(true);
        btncan.setVisible(false);
        tabeldata.setEnabled(true);
        txtfilm.setEnabled(true);
        txtfilm.setText("");
        txtwaktu.setText("");
        txtharga.setText("");
        btnA.setSelected(false);
        btnB.setSelected(false);
        btnC.setSelected(false);
        btnD.setSelected(false);
    }
    
    private void initListener() {
        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                doExit();
            }
        });
    }
    
    public void doExit(){
        int plh = JOptionPane.showConfirmDialog(this, "Apakah anda yakin akan menutup Aplikasi ?", "Tutup Aplikasi" ,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(plh == JOptionPane.YES_OPTION){
            new login().setVisible(true);
        }if(plh == JOptionPane.NO_OPTION){
            new Opbios().setVisible(true);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfilm = new javax.swing.JTextField();
        txtwaktu = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnA = new javax.swing.JRadioButton();
        btnB = new javax.swing.JRadioButton();
        btnC = new javax.swing.JRadioButton();
        btnD = new javax.swing.JRadioButton();
        btnins = new javax.swing.JButton();
        btnupd = new javax.swing.JButton();
        btncan = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Bungee Inline", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("operator");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Blockbuster", 0, 12)); // NOI18N
        jLabel2.setText("BIOSKOP");

        jLabel3.setFont(new java.awt.Font("Blockbuster", 0, 12)); // NOI18N
        jLabel3.setText("ELITE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel2)
                .addGap(57, 57, 57)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("JUDUL FILM");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("WAKTU");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("HARGA");

        txtfilm.setBackground(new java.awt.Color(255, 204, 51));
        txtfilm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtwaktu.setBackground(new java.awt.Color(255, 204, 51));
        txtwaktu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtharga.setBackground(new java.awt.Color(255, 204, 51));
        txtharga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 204, 51));

        buttonGroup1.add(btnA);
        btnA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnA.setText("STUDIO A");

        buttonGroup1.add(btnB);
        btnB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnB.setText("STUDIO B");

        buttonGroup1.add(btnC);
        btnC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnC.setText("STUDIO C");

        buttonGroup1.add(btnD);
        btnD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnD.setText("STUDIO D");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnA)
                        .addGap(18, 18, 18)
                        .addComponent(btnB)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnA)
                    .addComponent(btnB))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnC)
                    .addComponent(btnD))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnins.setBackground(new java.awt.Color(255, 102, 0));
        btnins.setFont(new java.awt.Font("Bell Gothic Std Black", 0, 18)); // NOI18N
        btnins.setForeground(new java.awt.Color(102, 0, 0));
        btnins.setText("INSERT");
        btnins.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsActionPerformed(evt);
            }
        });

        btnupd.setBackground(new java.awt.Color(255, 102, 0));
        btnupd.setFont(new java.awt.Font("Bell Gothic Std Black", 0, 18)); // NOI18N
        btnupd.setForeground(new java.awt.Color(102, 0, 0));
        btnupd.setText("UPDATE");
        btnupd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnupd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdActionPerformed(evt);
            }
        });

        btncan.setBackground(new java.awt.Color(255, 102, 0));
        btncan.setFont(new java.awt.Font("Bell Gothic Std Black", 0, 18)); // NOI18N
        btncan.setForeground(new java.awt.Color(102, 0, 0));
        btncan.setText("CANCEL");
        btncan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanActionPerformed(evt);
            }
        });

        btndel.setBackground(new java.awt.Color(255, 102, 0));
        btndel.setFont(new java.awt.Font("Bell Gothic Std Black", 0, 18)); // NOI18N
        btndel.setForeground(new java.awt.Color(102, 0, 0));
        btndel.setText("DELETE");
        btndel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        tabeldata.setBackground(new java.awt.Color(255, 204, 153));
        tabeldata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabeldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabeldata);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfilm)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtwaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnins, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnupd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(btndel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfilm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtwaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnupd)
                            .addComponent(btnins)
                            .addComponent(btndel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btncan)))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        try{
            int row = tabeldata.getSelectedRow();
            lb.remove(row);
            new Conbios().upBios(lb);
            load();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Pilih Data Dalam Tabel");
        }
    }//GEN-LAST:event_btndelActionPerformed

    private void btninsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsActionPerformed
        b = new Bioskop();
        b.setFilm(txtfilm.getText());
        b.setWaktu(txtwaktu.getText());
        try{
        b.setHarga(Integer.parseInt(txtharga.getText()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Masukkan Harga dengan Angka");
        }
        if(btnA.isSelected()){
            b.setStudio('A');
        }if(btnB.isSelected()){
            b.setStudio('B');
        }if(btnC.isSelected()){
            b.setStudio('C');
        }if(btnD.isSelected()){
            b.setStudio('D');
        }
        lb.add(b);
        new Conbios().upBios(lb);
        load();
    }//GEN-LAST:event_btninsActionPerformed

    private void btnupdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdActionPerformed
        try{
            int row = tabeldata.getSelectedRow();
            if(cekupdate){
                lb.get(row).setFilm(txtfilm.getText());
                lb.get(row).setWaktu(txtwaktu.getText());
                lb.get(row).setHarga(Integer.parseInt(txtharga.getText()));
                if(btnA.isSelected()){
                    lb.get(row).setStudio('A');
                }if(btnB.isSelected()){
                    lb.get(row).setStudio('B');
                }if(btnC.isSelected()){
                    lb.get(row).setStudio('C');
                }if(btnD.isSelected()){
                    lb.get(row).setStudio('D');
                }
                new Conbios().upBios(lb);
                load();
                clear();
                cekupdate = false ;
            }else{
                b = lb.get(row);
                txtfilm.setEnabled(true);
                tabeldata.setEnabled(false);
                btndel.setVisible(false);
                btnins.setVisible(false);
                btncan.setVisible(true);
                txtfilm.setText(b.getFilm());
                txtwaktu.setText(b.getWaktu());
                if(b.getStudio()=='A'){
                    btnA.setSelected(true);
                }else if(b.getStudio()=='B'){
                    btnB.setSelected(true);
                }else if(b.getStudio()=='C'){
                    btnC.setSelected(true);
                }else if(b.getStudio()=='D'){
                    btnD.setSelected(true);
                }
                cekupdate = true;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Pilih Data Dalam Tabel");
        }
    }//GEN-LAST:event_btnupdActionPerformed

    private void btncanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanActionPerformed
        clear();
        cekupdate = false;
    }//GEN-LAST:event_btncanActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opbios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnA;
    private javax.swing.JRadioButton btnB;
    private javax.swing.JRadioButton btnC;
    private javax.swing.JRadioButton btnD;
    private javax.swing.JButton btncan;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnins;
    private javax.swing.JButton btnupd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeldata;
    private javax.swing.JTextField txtfilm;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtwaktu;
    // End of variables declaration//GEN-END:variables
}
