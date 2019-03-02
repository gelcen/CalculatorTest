/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainJFrame;


import Calculator.Calculator;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author Gelcen
 */
public class MainJFrame extends javax.swing.JFrame {

    //Количество открывающих скобок
    private int openingBracketsCount;
    
    //Колечтво закрывающих скобок
    private int closingBracketsCount;
    
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
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

        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnMinus = new javax.swing.JButton();
        jBtnMultiply = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtnDivide = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtnEqual = new javax.swing.JButton();
        jBtnBackspace = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtnClear = new javax.swing.JButton();
        jBtnOpeningBracket = new javax.swing.JButton();
        jBtnClosingBracket = new javax.swing.JButton();
        jBtnPlus = new javax.swing.JButton();
        jBtnDot1 = new javax.swing.JButton();
        jtxtField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Calculator");
        setLocation(new java.awt.Point(500, 350));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn7.setText("7");
        jBtn7.setToolTipText("");
        jBtn7.setName(""); // NOI18N

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn8.setText("8");
        jBtn8.setToolTipText("");

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn9.setText("9");
        jBtn9.setToolTipText("");

        jBtnMinus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnMinus.setText("-");
        jBtnMinus.setToolTipText("");

        jBtnMultiply.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnMultiply.setText("*");
        jBtnMultiply.setToolTipText("");

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn4.setText("4");
        jBtn4.setToolTipText("");

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn5.setText("5");
        jBtn5.setToolTipText("");

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn6.setText("6");
        jBtn6.setToolTipText("");

        jBtnDivide.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnDivide.setText("/");
        jBtnDivide.setToolTipText("");

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn1.setText("1");
        jBtn1.setToolTipText("");

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn2.setText("2");
        jBtn2.setToolTipText("");

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn3.setText("3");
        jBtn3.setToolTipText("");

        jBtnEqual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnEqual.setText("=");
        jBtnEqual.setToolTipText("");
        jBtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEqualActionPerformed(evt);
            }
        });

        jBtnBackspace.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnBackspace.setText("<-");
        jBtnBackspace.setToolTipText("");
        jBtnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackspaceActionPerformed(evt);
            }
        });

        jBtn0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn0.setText("0");
        jBtn0.setToolTipText("");

        jBtnClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnClear.setText("C");
        jBtnClear.setToolTipText("");
        jBtnClear.setName(""); // NOI18N
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });

        jBtnOpeningBracket.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnOpeningBracket.setText("(");
        jBtnOpeningBracket.setToolTipText("");
        jBtnOpeningBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOpeningBracketActionPerformed(evt);
            }
        });

        jBtnClosingBracket.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnClosingBracket.setText(")");
        jBtnClosingBracket.setToolTipText("");
        jBtnClosingBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClosingBracketActionPerformed(evt);
            }
        });

        jBtnPlus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnPlus.setText("+");
        jBtnPlus.setToolTipText("");

        jBtnDot1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnDot1.setText(".");
        jBtnDot1.setToolTipText("");
        jBtnDot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDot1ActionPerformed(evt);
            }
        });

        jtxtField.setEditable(false);
        jtxtField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtField)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtnDot1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBtnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnOpeningBracket, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnClosingBracket, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnOpeningBracket, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnClosingBracket, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnDot1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        this.setSize(268, 410);
        
        openingBracketsCount = 0;        
        closingBracketsCount = 0;
        
        Action numberAction = new AbstractAction()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (CheckForNumber())
                {
                    JButton jbtn = (JButton)e.getSource();
                    String expression = jtxtField.getText() + jbtn.getText();
                    jtxtField.setText(expression);
                }
            }
        };
        
        Action operationAction = new AbstractAction()
        {
            @Override 
            public void actionPerformed(ActionEvent e)
            {
                JButton jbtn = (JButton) e.getSource();
                char operation = jbtn.getText().toCharArray()[0];
                if (CheckForOperations(operation))
                {
                    String expression = jtxtField.getText() + jbtn.getText();
                    jtxtField.setText(expression);
                }
            }
        };
        
        jBtn7.addActionListener(numberAction);
        jBtn8.addActionListener(numberAction);
        jBtn9.addActionListener(numberAction);
        jBtn6.addActionListener(numberAction);
        jBtn5.addActionListener(numberAction);
        jBtn4.addActionListener(numberAction);
        jBtn3.addActionListener(numberAction);
        jBtn2.addActionListener(numberAction);
        jBtn1.addActionListener(numberAction);
        jBtn0.addActionListener(numberAction);                
        
        jBtnPlus.addActionListener(operationAction);
        jBtnMinus.addActionListener(operationAction);
        jBtnMultiply.addActionListener(operationAction);
        jBtnDivide.addActionListener(operationAction);
        
    }//GEN-LAST:event_formWindowActivated
    
    
    private void jBtnDot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDot1ActionPerformed
        if (checkForDot())
        {
            String expression = jtxtField.getText() + jBtnDot1.getText();
            jtxtField.setText(expression);
        }        
    }//GEN-LAST:event_jBtnDot1ActionPerformed
    
    //Проверка возможности размещения точки
    private boolean checkForDot()
    {
        int len = jtxtField.getText().length();
        boolean hasDot = false;
        if (len > 0)
        {
            char lastChar = jtxtField.getText().charAt(len-1);
            if (Character.isDigit(lastChar))
            {
                for (int i = len-1; i > 0; i--)
                {
                    if (IsOperation(jtxtField.getText().charAt(i)))
                    {
                        return true;
                    }
                    else if (jtxtField.getText().charAt(i) == '.')
                    {
                        hasDot = true;
                        break;
                    }
                }
                return !hasDot;
            }
        }
        return false;
    }
    
    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
        jtxtField.setText("");
        openingBracketsCount = 0;        
        closingBracketsCount = 0;
    }//GEN-LAST:event_jBtnClearActionPerformed

    private void jBtnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackspaceActionPerformed

        int len = jtxtField.getText().length();
        if (len > 0)
        {
            StringBuilder sb = new StringBuilder(jtxtField.getText());
            char lastChar = jtxtField.getText().charAt(len-1);
            if (lastChar == '(')
            {
                openingBracketsCount--;
            }
            if (lastChar == ')')
            {
                closingBracketsCount--;
            }
            sb.deleteCharAt(jtxtField.getText().length()-1);
            jtxtField.setText(sb.toString());
        }
    }//GEN-LAST:event_jBtnBackspaceActionPerformed

    private void jBtnOpeningBracketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOpeningBracketActionPerformed
        
        if (checkForOpeningBracket())
        {
            String expression = jtxtField.getText() + jBtnOpeningBracket.getText();
            jtxtField.setText(expression);
            openingBracketsCount++;
        }        
    }//GEN-LAST:event_jBtnOpeningBracketActionPerformed
    
    private boolean checkForOpeningBracket()
    {
        int len = jtxtField.getText().length();
        if (len == 0)
        {
            return true;
        }
        else 
        {
            char lastChar = jtxtField.getText().charAt(len - 1);
            if (IsOperation(lastChar) || lastChar =='(')
            {
                return true;
            }
        }                
        return false;
    }
    
    private void jBtnClosingBracketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClosingBracketActionPerformed
        if (checkForClosingBracket())
        {
            String expression = jtxtField.getText() + jBtnClosingBracket.getText();
            jtxtField.setText(expression);
            closingBracketsCount++;
        }        
    }//GEN-LAST:event_jBtnClosingBracketActionPerformed
    
    //Вычисление результата
    private void jBtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEqualActionPerformed
        if (closingBracketsCount < openingBracketsCount)
        {
            int difference = openingBracketsCount - closingBracketsCount;
            String expression = jtxtField.getText();
            for (int i =0; i < difference; i++)
            {
                expression += ')';
            }
            jtxtField.setText(expression);
        }
        String s =jtxtField.getText()+'\n';
        jtxtField.setText(s);
        Calculator calculator = new Calculator();
        System.out.println(jtxtField.getText());
        calculator.setExpression(jtxtField.getText());
        double result = calculator.Calculate();
        jtxtField.setText(Double.toString(result));
        
    }//GEN-LAST:event_jBtnEqualActionPerformed

    private boolean checkForClosingBracket()
    {
        int len = jtxtField.getText().length();
        if (len > 0)
        {
            char lastChar = jtxtField.getText().charAt(len - 1);
            if (Character.isDigit(lastChar)
                    || lastChar == ')')
            {
                if (closingBracketsCount < openingBracketsCount )
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    //Проверка возможности расположения операций
    private boolean CheckForOperations(char operation)
    {
        int len = jtxtField.getText().length();
        if (operation == '-')
        {
            if (len == 0)
            {
                return true;                
            }
            else if (len >0)
            {
                char lastChar = jtxtField.getText().charAt(len - 1);
                if (Character.isDigit(lastChar)
                        || lastChar == ')'
                        || !IsOperation(lastChar)
                        || lastChar == '(') 
                {                    
                    return lastChar != '.';
                }
            }            
        }
        else 
        {
            if (len > 0) 
            {
                char lastChar = jtxtField.getText().charAt(len - 1);
                if (Character.isDigit(lastChar)
                        || lastChar == ')'
                        || !IsOperation(lastChar)) 
                {
                    if (lastChar == '(') 
                    {
                        return false;
                    }
                    return lastChar != '.';
                }
            }
        }
        return false;
    }
        
    //Проверяем, можно ли вводить число
    private boolean CheckForNumber()
    {
        int len = jtxtField.getText().length();
        if (len == 0) 
        {
            return true;
        }
        char lastChar = jtxtField.getText().charAt(len-1);
        if (Character.isDigit(lastChar) ||
            lastChar == '.'             ||
            lastChar == '('             ||
            IsOperation(lastChar))
        {
            return true;
        }
        return false;
    }
    
    private boolean IsOperation(char operation)
    {
        switch (operation)
        {
            case '+':
                return true;
            case '-':
                return true;
            case '*':
                return true;
            case '/':
                return true;
        }
        return false;
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnBackspace;
    private javax.swing.JButton jBtnClear;
    private javax.swing.JButton jBtnClosingBracket;
    private javax.swing.JButton jBtnDivide;
    private javax.swing.JButton jBtnDot1;
    private javax.swing.JButton jBtnEqual;
    private javax.swing.JButton jBtnMinus;
    private javax.swing.JButton jBtnMultiply;
    private javax.swing.JButton jBtnOpeningBracket;
    private javax.swing.JButton jBtnPlus;
    private javax.swing.JTextField jtxtField;
    // End of variables declaration//GEN-END:variables
}