
package jogodavelha;


public class Jogo extends javax.swing.JFrame {
    public boolean joga=true;
    public boolean jogb=true;
    public int contpos=0;
    public int k=0, i=0;
    int op;
    public String linha1,linha2,linha3,coluna1,coluna2,coluna3, diagonal1,diagonal2;
    
    String [] []  pstvetor=new String [3] [3];
    

    
    public Jogo() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botao1 = new javax.swing.JButton();
        botaorein = new javax.swing.JButton();
        Botao2 = new javax.swing.JButton();
        Botao3 = new javax.swing.JButton();
        Botao4 = new javax.swing.JButton();
        Botao5 = new javax.swing.JButton();
        Botao6 = new javax.swing.JButton();
        Botao7 = new javax.swing.JButton();
        Botao8 = new javax.swing.JButton();
        Botao9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtvisor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Botao1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        Botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao1ActionPerformed(evt);
            }
        });

        botaorein.setText("REINICIAR ");
        botaorein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoreinActionPerformed(evt);
            }
        });

        Botao2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        Botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao2ActionPerformed(evt);
            }
        });

        Botao3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        Botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao3ActionPerformed(evt);
            }
        });

        Botao4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        Botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao4ActionPerformed(evt);
            }
        });

        Botao5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        Botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao5ActionPerformed(evt);
            }
        });

        Botao6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        Botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao6ActionPerformed(evt);
            }
        });

        Botao7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        Botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao7ActionPerformed(evt);
            }
        });

        Botao8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        Botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao8ActionPerformed(evt);
            }
        });

        Botao9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        Botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Jogo da Velha ");

        txtvisor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(botaorein, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtvisor, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtvisor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(botaorein, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void verificaJogadordaVez(){
     if(joga&&jogb){
         this.op=1;
         joga=false;
         jogb=true;
         txtvisor.setText("Vez do jogador O");
         
      }else if (joga&&jogb==false){
         this.op=1;
         joga=false;
         jogb=true;
         txtvisor.setText("Vez do jogador O");
     }else{
         this.op=2;
         joga=true;
         jogb=false;
         txtvisor.setText("Vez do jogador X");
          
      }
 }
 public void Desativar(){
     Botao1.setEnabled(false);
     Botao2.setEnabled(false);
     Botao3.setEnabled(false);
     Botao4.setEnabled(false);
     Botao5.setEnabled(false);
     Botao6.setEnabled(false);
     Botao7.setEnabled(false);
     Botao8.setEnabled(false);
     Botao9.setEnabled(false);
     
 }
 public void Vcapos(){
     contpos=0;
     for(i=0;i<3;i++){
         for(k=0;k<3;k++){
             if(pstvetor[i][k]=="X"|pstvetor[i][k]=="O"){
              contpos+=1;   
             }
         }
     }
 }
  
 public void Vvencedor(){
     linha1=pstvetor[0][0]+pstvetor[0][1]+pstvetor[0][2];
     linha2=pstvetor[1][0]+pstvetor[1][1]+pstvetor[1][2];
     linha3=pstvetor[2][0]+pstvetor[2][1]+pstvetor[2][2];
     
     coluna1=pstvetor[0][0]+pstvetor[1][0]+pstvetor[2][0];
     coluna2=pstvetor[0][1]+pstvetor[1][1]+pstvetor[2][1];
     coluna3=pstvetor[0][2]+pstvetor[1][2]+pstvetor[2][2];
     
     diagonal1=pstvetor[0][0]+pstvetor[1][1]+pstvetor[2][2];
     diagonal2=pstvetor[0][2]+pstvetor[1][1]+pstvetor[2][0];
     
     if(linha1.equals("XXX")|linha2.equals("XXX")|linha3.equals("XXX")|coluna1.equals("XXX")|coluna2.equals("XXX")|coluna3.equals("XXX")|diagonal1.equals("XXX")|diagonal2.equals("XXX")){
         txtvisor.setText("O vencedor é o jogador X");
         Desativar();
     }
     else if(linha1.equals("OOO")|linha2.equals("OOO")|linha3.equals("OOO")|coluna1.equals("OOO")|coluna2.equals("OOO")|coluna3.equals("OOO")|diagonal1.equals("OOO")|diagonal2.equals("OOO")){
         txtvisor.setText("O vencedor é o jogador O");
         Desativar();
     }else if(contpos==9){
         txtvisor.setText("Deu Velha!!!!");
     }
 }
 
    private void botaoreinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoreinActionPerformed
        Botao1.setText("");
        Botao1.setEnabled(true);
        Botao2.setText("");
        Botao2.setEnabled(true);
        Botao3.setText("");
        Botao3.setEnabled(true);
        Botao4.setText("");
        Botao4.setEnabled(true);
        Botao5.setText("");
        Botao5.setEnabled(true);
        Botao6.setText("");
        Botao6.setEnabled(true);
        Botao7.setText("");
        Botao7.setEnabled(true);
        Botao8.setText("");
        Botao8.setEnabled(true);
        Botao9.setText("");
        Botao9.setEnabled(true);
        Limpaposições();
        txtvisor.setText("");
    }//GEN-LAST:event_botaoreinActionPerformed
public void Limpaposições(){
     for(i=0;i<3;i++){
         for(k=0;k<3;k++){
             pstvetor[i] [k]="";
         }
        }
    
        
}
    private void Botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao1ActionPerformed
        verificaJogadordaVez();
        if(op==1){
           Botao1.setText("X");  
           pstvetor[0] [0] ="X";
        }else{
            Botao1.setText("O");  
           pstvetor[0] [0] ="O";
        }
       Botao1.setEnabled(false);
        Vvencedor();
        Vcapos();
    }//GEN-LAST:event_Botao1ActionPerformed

    private void Botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao2ActionPerformed
        verificaJogadordaVez();
        if(op==1){
           Botao2.setText("X");  
           pstvetor[2] [2] ="X";
        }else{
            Botao2.setText("O");  
           pstvetor[2] [2] ="O";
        }
       Botao2.setEnabled(false);
         Vcapos();
         Vvencedor();
    }//GEN-LAST:event_Botao2ActionPerformed

    private void Botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao3ActionPerformed
         verificaJogadordaVez();
        if(op==1){
           Botao3.setText("X");  
           pstvetor[1] [2] ="X";
        }else{
            Botao3.setText("O");  
           pstvetor[1] [2] ="O";
        }
       Botao3.setEnabled(false);
         Vcapos();
         Vvencedor();
    }//GEN-LAST:event_Botao3ActionPerformed

    private void Botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao4ActionPerformed
        verificaJogadordaVez();
        if(op==1){
           Botao4.setText("X");  
           pstvetor[2] [1] ="X";
        }else{
            Botao4.setText("O");  
           pstvetor[2] [1] ="O";
        }
       Botao4.setEnabled(false);
        Vcapos();
        Vvencedor();
    }//GEN-LAST:event_Botao4ActionPerformed

    private void Botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao5ActionPerformed
        verificaJogadordaVez();
        if(op==1){
           Botao5.setText("X");  
           pstvetor[1] [1] ="X";
        }else{
            Botao5.setText("O");  
           pstvetor[1] [1] ="O";
        }
       Botao5.setEnabled(false);
       Vcapos(); 
       Vvencedor();
        
    }//GEN-LAST:event_Botao5ActionPerformed

    private void Botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao6ActionPerformed
        verificaJogadordaVez();
        if(op==1){
           Botao6.setText("X");  
           pstvetor[0] [2] ="X";
        }else{
            Botao6.setText("O");  
           pstvetor[0] [2] ="O";
        }
       Botao6.setEnabled(false);
      Vcapos(); 
      Vvencedor();   
    }//GEN-LAST:event_Botao6ActionPerformed

    private void Botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao7ActionPerformed
        verificaJogadordaVez();
        if(op==1){
           Botao7.setText("X");  
           pstvetor[2] [0] ="X";
        }else{
            Botao7.setText("O");  
           pstvetor[2] [0] ="O";
        }
       Botao7.setEnabled(false);
        Vcapos(); 
        Vvencedor();   
    }//GEN-LAST:event_Botao7ActionPerformed

    private void Botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao8ActionPerformed
        verificaJogadordaVez();
        if(op==1){
           Botao8.setText("X");  
           pstvetor[1] [0] ="X";
        }else{
            Botao8.setText("O");  
           pstvetor[1] [0] ="O";
        }
       Botao8.setEnabled(false);
        Vcapos();
        Vvencedor();
    }//GEN-LAST:event_Botao8ActionPerformed

    private void Botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao9ActionPerformed
        verificaJogadordaVez();
        if(op==1){
           Botao9.setText("X");  
           pstvetor[0] [1] ="X";
        }else{
            Botao9.setText("O");  
           pstvetor[0] [1] ="O";
        }
       Botao9.setEnabled(false);
        Vcapos(); 
        Vvencedor();
    }//GEN-LAST:event_Botao9ActionPerformed

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao1;
    private javax.swing.JButton Botao2;
    private javax.swing.JButton Botao3;
    private javax.swing.JButton Botao4;
    private javax.swing.JButton Botao5;
    private javax.swing.JButton Botao6;
    private javax.swing.JButton Botao7;
    private javax.swing.JButton Botao8;
    private javax.swing.JButton Botao9;
    private javax.swing.JButton botaorein;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtvisor;
    // End of variables declaration//GEN-END:variables
}
