/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author YACIN
 */
public class Home_page extends javax.swing.JFrame {
    
    String file_name = "";
    float[][] inputMat;
    
    /**
     * Creates new form predictionDesLiens
     */
    public Home_page() {
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        m5 = new javax.swing.JRadioButton();
        m10 = new javax.swing.JRadioButton();
        lens = new javax.swing.JRadioButton();
        displayPath = new javax.swing.JTextField();
        m20 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tab4 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tab2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Jeux de données", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 3, 14))); // NOI18N

        buttonGroup1.add(m5);
        m5.setText("Matrice 5x5");
        m5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(m10);
        m10.setText("Matrice 10x10");
        m10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m10ActionPerformed(evt);
            }
        });

        buttonGroup1.add(lens);
        lens.setText("MovieLens");
        lens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lensActionPerformed(evt);
            }
        });

        buttonGroup1.add(m20);
        m20.setText("Matrix 20x20");
        m20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m20ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 5, 248));
        jButton4.setText("database");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayPath)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m5)
                    .addComponent(m10)
                    .addComponent(lens)
                    .addComponent(m20)
                    .addComponent(jButton4))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m5)
                .addGap(26, 26, 26)
                .addComponent(m10)
                .addGap(28, 28, 28)
                .addComponent(m20)
                .addGap(18, 18, 18)
                .addComponent(lens, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayPath, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 290, 380));
        jPanel1.getAccessibleContext().setAccessibleName("Data set");

        jButton2.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 1, 251));
        jButton2.setText("MAE GRAPH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 130, 30));

        jButton3.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 3, 253));
        jButton3.setText("Prediction");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 110, 30));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tab3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tab3);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 150, 170));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tab1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 220, 170));

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tab4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tab4);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 220, 170));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tab2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tab2);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 260, 170));

        jButton5.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 1, 255));
        jButton5.setText("Retour");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 120, 30));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("similarité");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 40, 60, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/a.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
                
         

        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  
        // TODO code application logic here
      
        
        float[][] predictedMat = Utils.fillMatrix(inputMat);  

        float[] averageRate = new float[inputMat.length];
        int c;
        for (int i = 0 ; i<inputMat.length;i++){
            c = 0;  
            for ( int j = 0 ; j<inputMat[0].length;j++){

            // System.out.println("sim ["+i+"]="+cos(inputMat,j,i));
           // System.out.println("prediction ["+i+"]="+predict(inputMat,j,i));

            if(predictedMat[i][j]==-1)
               Utils. predict(predictedMat,i,j);

            if(inputMat[i][j] != -1) 
                averageRate[i] += inputMat[i][j];
                c++;
            }

                averageRate[i]/= c;
        } 
        DefaultTableModel dtm = new DefaultTableModel();
    dtm.addColumn("user");
         dtm.addColumn("item");
         dtm.addColumn("predicte");
          
           
        for (int i = 0; i < predictedMat.length; i++) {
            for (int j = 0; j < predictedMat.length; j++) {
              Object[] rowData = new String[]{i+"",j+"",(predictedMat[i][j]+0)+""};
               dtm.addRow(rowData);
            }
        }
          tab2.setModel(dtm);
           DefaultTableModel dtm2 = new DefaultTableModel();
           
    dtm2.addColumn("averageRate");
         
          
           
   
            for (int j = 0; j < averageRate.length; j++) {
              Object[] rowData = new String[]{"Average User{"+j+"} =" +averageRate[j]};
               dtm2.addRow(rowData);
            }
        
          tab3.setModel(dtm2);
 
 
             
    }//GEN-LAST:event_jButton3ActionPerformed

    private void lensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lensActionPerformed
        JFileChooser jf=new JFileChooser();
        int egy =jf.showOpenDialog(this);
        if (egy==javax.swing.JFileChooser.APPROVE_OPTION){ 
             java.io.File file =jf.getSelectedFile();
             file_name = file.toString( );
             displayPath.setText(file_name);}
        double [][] m=new double[901][1683];
           // Matrices.file = file_name;
            m = dataset.readCSV(file_name);
            DefaultTableModel dtm = new DefaultTableModel();
    dtm.addColumn("user");
         dtm.addColumn("item");
         dtm.addColumn("raiting");
          
           
        for (int i = 0; i < 901; i++) {
            for (int j = 0; j < 1683; j++) {
                
                
               Object[] rowData = new String[]{i+"",j+"",(m[i][j]+0)+""};
               dtm.addRow(rowData);
               
                
            }
        }
          tab1.setModel(dtm);
            
            
            
            
            
        
    }//GEN-LAST:event_lensActionPerformed

    private void m5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m5ActionPerformed
     DefaultTableModel dtm = new DefaultTableModel();
     

    dtm.addColumn("user");
         dtm.addColumn("item");
         dtm.addColumn("raiting");
         float [][] matrix5=Matrices.matrix5;
         inputMat=matrix5;
              DefaultTableModel modelj = new DefaultTableModel();
              for(int cc=0;cc<inputMat.length;cc++)
                  modelj.addColumn("c"+cc);
              
             
         double[][] f=Utils.similarité(inputMat);
         for(int k=0;k<inputMat.length; k++){
                           Object[] rowData = new String[inputMat.length];

             
          for(int l=0;l<inputMat.length;l++){
              rowData[l]=f[k][l]+"";
             
         }
               modelj.addRow(rowData);

          
         }
             
     tab4.setModel(modelj);
         
     
          
           
        for (int i = 0; i < matrix5.length; i++) {
            for (int j = 0; j < matrix5.length; j++) {
                
                
               Object[] rowData = new String[]{i+"",j+"",(matrix5[i][j]+0)+""};
               dtm.addRow(rowData);
               
                
            }
        }
          tab1.setModel(dtm);
        // TODO add your handling code here:
    }//GEN-LAST:event_m5ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
welcome m =new welcome();
      m.setVisible(true);
       m.setTitle("Menu");
      m.setLocation(350,100);
       
       dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void m10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m10ActionPerformed
DefaultTableModel dtm = new DefaultTableModel();
    dtm.addColumn("user");
         dtm.addColumn("item");
         dtm.addColumn("raiting");
         float [][] matrix10=Matrices.matrix10;
         inputMat=matrix10;
         DefaultTableModel modelj = new DefaultTableModel();
              for(int cc=0;cc<inputMat.length;cc++)
                  modelj.addColumn("c"+cc);
              
             
         double[][] f=Utils.similarité(inputMat);
         for(int k=0;k<inputMat.length; k++){
                           Object[] rowData = new String[inputMat.length];

             
          for(int l=0;l<inputMat.length;l++){
              rowData[l]=f[k][l]+"";
             
         }
               modelj.addRow(rowData);

          
         }
             
     tab4.setModel(modelj);
          
           
        for (int i = 0; i < matrix10.length; i++) {
            for (int j = 0; j < matrix10.length; j++) {
                
                
               Object[] rowData = new String[]{i+"",j+"",(matrix10[i][j]+0)+""};
               dtm.addRow(rowData);
               
                
            }
        }
          tab1.setModel(dtm);        // TODO add your handling code here:
    }//GEN-LAST:event_m10ActionPerformed

    private void m20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m20ActionPerformed
       DefaultTableModel dtm = new DefaultTableModel();
    dtm.addColumn("user");
         dtm.addColumn("item");
         dtm.addColumn("raiting");
         float [][] matrix20=Matrices.matrix20;
         inputMat=matrix20;
          DefaultTableModel modelj = new DefaultTableModel();
              for(int cc=0;cc<inputMat.length;cc++)
                  modelj.addColumn("c"+cc);
              
             
         double[][] f=Utils.similarité(inputMat);
         for(int k=0;k<inputMat.length; k++){
                           Object[] rowData = new String[inputMat.length];

             
          for(int l=0;l<inputMat.length;l++){
              rowData[l]=f[k][l]+"";
             
         }
               modelj.addRow(rowData);

          
         }
             
     tab4.setModel(modelj);
           
        for (int i = 0; i < matrix20.length; i++) {
            for (int j = 0; j < matrix20.length; j++) {
                
                
               Object[] rowData = new String[]{i+"",j+"",(matrix20[i][j]+0)+""};
               dtm.addRow(rowData);
               
                
            }
        }
          tab1.setModel(dtm);
        // TODO add your handling code here:
    }//GEN-LAST:event_m20ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField displayPath;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton lens;
    private javax.swing.JRadioButton m10;
    private javax.swing.JRadioButton m20;
    private javax.swing.JRadioButton m5;
    private javax.swing.JTable tab1;
    private javax.swing.JTable tab2;
    private javax.swing.JTable tab3;
    private javax.swing.JTable tab4;
    // End of variables declaration//GEN-END:variables
}
