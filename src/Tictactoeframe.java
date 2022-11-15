
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ELCOT
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
public class Tictactoeframe extends javax.swing.JFrame {

    /**
     * Creates new form Tictactoeframe
     */
    private  String turn="X";
    private  int xCount=0;
    private  int oCount=0;
    private  int occupied=0;
    private  boolean active=true;
    
    private void disableButtons(){
        active=false;
        return;
    }
    
    private void throwAlreadyExists(){
        javax.swing.JFrame errorBox=new javax.swing.JFrame("Exit");
        JOptionPane.showMessageDialog(errorBox, "This place already holds a value!", 
                "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    private void checkDraw(){
        if(occupied==9)
        {
            if(!checkWin("O") && !checkWin("X")){
                JFrame oWin=new JFrame("GAME OVER!");
                JOptionPane.showMessageDialog(oWin, "The Match is a draw!", 
                "Game Over!", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
    
    private void enableButtons(){
        active=true;
        return;
    }
    
    private boolean checkWin(String a)
    {
        if(btn11.getText().equalsIgnoreCase(a) && 
           btn12.getText().equalsIgnoreCase(a) &&
           btn13.getText().equalsIgnoreCase(a) ){
            btn11.setBackground(Color.green);
            btn12.setBackground(Color.green);
            btn13.setBackground(Color.green);
            
            disableButtons();
            return true;
        }
        
        if(btn21.getText().equalsIgnoreCase(a) && 
           btn22.getText().equalsIgnoreCase(a) &&
           btn23.getText().equalsIgnoreCase(a) ){
            btn21.setBackground(Color.green);
            btn22.setBackground(Color.green);
            btn23.setBackground(Color.green);
            disableButtons();
            return true;
        }
        
        if(btn31.getText().equalsIgnoreCase(a) && 
           btn32.getText().equalsIgnoreCase(a) &&
           btn33.getText().equalsIgnoreCase(a) ){
            btn31.setBackground(Color.green);
            btn32.setBackground(Color.green);
            btn33.setBackground(Color.green);
            disableButtons();
            return true;
        }
        
        if(btn11.getText().equalsIgnoreCase(a) && 
           btn21.getText().equalsIgnoreCase(a) &&
           btn31.getText().equalsIgnoreCase(a) ){
            btn11.setBackground(Color.green);
            btn21.setBackground(Color.green);
            btn31.setBackground(Color.green);
            disableButtons();
            return true;
        }
        
        if(btn12.getText().equalsIgnoreCase(a) && 
           btn22.getText().equalsIgnoreCase(a) &&
           btn32.getText().equalsIgnoreCase(a) ){
            btn12.setBackground(Color.green);
            btn32.setBackground(Color.green);
            btn22.setBackground(Color.green);
            disableButtons();
            return true;
        }
        
        if(btn13.getText().equalsIgnoreCase(a) && 
           btn23.getText().equalsIgnoreCase(a) &&
           btn33.getText().equalsIgnoreCase(a) ){
            btn13.setBackground(Color.green);
            btn23.setBackground(Color.green);
            btn33.setBackground(Color.green);
            disableButtons();
            return true;
        }
        
        if(btn11.getText().equalsIgnoreCase(a) && 
           btn22.getText().equalsIgnoreCase(a) &&
           btn33.getText().equalsIgnoreCase(a) ){
            btn11.setBackground(Color.green);
            btn22.setBackground(Color.green);
            btn33.setBackground(Color.green);
            disableButtons();
            return true;
        }
        
        
        if(btn13.getText().equalsIgnoreCase(a) && 
           btn22.getText().equalsIgnoreCase(a) &&
           btn31.getText().equalsIgnoreCase(a) ){
            btn13.setBackground(Color.green);
            btn31.setBackground(Color.green);
            btn22.setBackground(Color.green);
            disableButtons();
            return true;
        }
        return false;
          
    }
    
    private void changeTurn(){
        if(turn.equalsIgnoreCase("X")){
            turn="O";
            displayTurn.setText(turn);
        }
        else
        {
            turn="X";
            displayTurn.setText(turn);
        }
    }
    
    private void xTurn(JButton btn){
        btn.setForeground(Color.red);
        btn.setFont(new Font("Copperplate Gothic Light",Font.PLAIN, 20));
        btn.setText(turn);
        if(checkWin("X"))
        {
            xCount++;
            scoreO.setText(Integer.toString(oCount));
            scoreX.setText(Integer.toString(xCount));
            JFrame xWin=new JFrame("GAME OVER!");
            JOptionPane.showMessageDialog(xWin, "Player 1 has won the match!", 
                "Game Over!", JOptionPane.PLAIN_MESSAGE);
            
        }
        changeTurn();
    }
    
    private void oTurn(JButton btn){
        btn.setForeground(Color.blue);
        btn.setFont(new Font("Copperplate Gothic Light",Font.PLAIN, 20));
        btn.setText(turn);
        if(checkWin("O")){
            oCount++;
            scoreO.setText(Integer.toString(oCount));
            scoreX.setText(Integer.toString(xCount));
            JFrame oWin=new JFrame("GAME OVER!");
            JOptionPane.showMessageDialog(oWin, "Player 2 has won the match!", 
                "Game Over!", JOptionPane.PLAIN_MESSAGE);
        }
        changeTurn();
    }
    public Tictactoeframe() {
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
        jPanel2 = new javax.swing.JPanel();
        btn11 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        scoreX = new javax.swing.JLabel();
        scoreO = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        displayTurn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("TIC TAC TOE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });

        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });

        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });

        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(51, 255, 0));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "score", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("player (X)");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("PLAYER2 (O)");

        scoreX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        scoreX.setText("-----------");

        scoreO.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        scoreO.setText("-----------");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scoreX))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scoreO)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(scoreX))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(scoreO))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        exit.setBackground(new java.awt.Color(255, 0, 0));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Turn");

        displayTurn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        displayTurn.setText("X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(displayTurn, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayTurn))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
         javax.swing.JFrame frame=new javax.swing.JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", 
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // TODO add your handling code here:
         if(!active)
        {
            return;
        }
        if(btn21.getText().equalsIgnoreCase("X") || btn21.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(btn21);
            }
            else
            {
                oTurn(btn21);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_btn21ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
         javax.swing.JFrame frame=new javax.swing.JFrame("Reset");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to reset?", 
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            btn11.setText("");
            btn12.setText("");
            btn13.setText("");
            btn21.setText("");
            btn22.setText("");
            btn23.setText("");
            btn31.setText("");
            btn32.setText("");
            btn33.setText("");
            
            btn11.setBackground(Color.WHITE);
            btn12.setBackground(Color.WHITE);
            btn13.setBackground(Color.WHITE);
            btn21.setBackground(Color.WHITE);
            btn22.setBackground(Color.WHITE);
            btn23.setBackground(Color.WHITE);
            btn31.setBackground(Color.WHITE);
            btn32.setBackground(Color.WHITE);
            btn33.setBackground(Color.WHITE);
            
            enableButtons();
            occupied=0;
            JFrame tmp=new JFrame("choice");
                if(JOptionPane.showConfirmDialog(tmp, "Set first turn for Player 1?", 
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                    turn="X";
                }
                else
                {
                    turn="O";
                }
                displayTurn.setText(turn);
        }
    }//GEN-LAST:event_resetActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
          if(!active)
        {
            return;
        }
        if(btn11.getText().equalsIgnoreCase("X") || btn11.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(btn11);
            }
            else
            {
                oTurn(btn11);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        // TODO add your handling code here:
          if(!active)
        {
            return;
        }
        if(btn32.getText().equalsIgnoreCase("X") || btn32.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(btn32);
            }
            else
            {
                oTurn(btn32);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        // TODO add your handling code here:
         if(!active)
        {
            return;
        }
        if(btn13.getText().equalsIgnoreCase("X") || btn13.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(btn13);
            }
            else
            {
                oTurn(btn13);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
         if(!active)
        {
            return;
        }
        if(btn12.getText().equalsIgnoreCase("X") || btn12.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(btn12);
            }
            else
            {
                oTurn(btn12);
            }
            occupied++;
            checkDraw();
            
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        // TODO add your handling code here:
         if(!active)
        {
            return;
        }
        if(btn23.getText().equalsIgnoreCase("X") || btn23.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(btn23);
            }
            else
            {
                oTurn(btn23);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        // TODO add your handling code here:
         if(!active)
        {
            return;
        }
        if(btn31.getText().equalsIgnoreCase("X") || btn31.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(btn31);
            }
            else
            {
                oTurn(btn31);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        // TODO add your handling code here:
         if(!active)
        {
            return;
        }
        if(btn22.getText().equalsIgnoreCase("X") || btn22.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(btn22);
            }
            else
            {
                oTurn(btn22);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        // TODO add your handling code here:
         if(!active)
        {
            return;
        }
        if(btn33.getText().equalsIgnoreCase("X") || btn33.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(btn33);
            }
            else
            {
                oTurn(btn33);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_btn33ActionPerformed

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
            java.util.logging.Logger.getLogger(Tictactoeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tictactoeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tictactoeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tictactoeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
        
            new Tictactoeframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JLabel displayTurn;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton reset;
    private javax.swing.JLabel scoreO;
    private javax.swing.JLabel scoreX;
    // End of variables declaration//GEN-END:variables
}
