package telas;

import erros.A1;
import static java.lang.Thread.sleep;

public class Tela3 extends javax.swing.JFrame {
    
    public Tela3() {
        initComponents();
       
    }

  public void relogio(){
       
       int tempo = 0;
       
       Thread relogio=new Thread()
               {
               public void run()
               {
                   try {
                       for(;;){
                                                    
                            sleep(1000);
                            System.out.println("O tempo é "+tempo);
                            
                       }
                   } catch (InterruptedException ex) {
                      
                   }
               
               }
               };
       
       relogio.start();

   
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jnotebook = new javax.swing.JButton();
        jlaptop = new javax.swing.JButton();
        jcomputer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Test English");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("What is this?");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/notebook.jpg"))); // NOI18N

        jnotebook.setText("Notebook");
        jnotebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnotebookActionPerformed(evt);
            }
        });
        jnotebook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jnotebookKeyReleased(evt);
            }
        });

        jlaptop.setText("Laptop");
        jlaptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlaptopActionPerformed(evt);
            }
        });

        jcomputer.setText(" Portable Computer");
        jcomputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomputerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jcomputer)
                        .addGap(18, 18, 18)
                        .addComponent(jnotebook)
                        .addGap(24, 24, 24)
                        .addComponent(jlaptop))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel1)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlaptop)
                            .addComponent(jcomputer)
                            .addComponent(jnotebook))))
                .addContainerGap(228, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void jnotebookKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jnotebookKeyReleased
    
    
   
    }//GEN-LAST:event_jnotebookKeyReleased

    private void jnotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnotebookActionPerformed
    A1 erro1 = new A1();
    erro1.setVisible(true);
    dispose();
        
    }//GEN-LAST:event_jnotebookActionPerformed

    private void jlaptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlaptopActionPerformed
       Tela4 t4 = new Tela4();
       t4.setVisible(true);
       dispose();
    }//GEN-LAST:event_jlaptopActionPerformed

    private void jcomputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomputerActionPerformed
    A1 erro1 = new A1();
    erro1.setVisible(true);
    dispose();
    }//GEN-LAST:event_jcomputerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jcomputer;
    private javax.swing.JButton jlaptop;
    private javax.swing.JButton jnotebook;
    // End of variables declaration//GEN-END:variables
}
