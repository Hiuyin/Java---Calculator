/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.calculadora;

import java.awt.ComponentOrientation;

/**
 *
 * @author F1401106
 */
public class CalculadoraUI extends javax.swing.JFrame {

    static String operator = "";
    static double result;
    static String firstNumber = "";
    static String lastNumber = "";
    static String labelText = "";
    public CalculadoraUI() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        msg_area = new javax.swing.JTextArea();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        button6 = new java.awt.Button();
        button7 = new java.awt.Button();
        button8 = new java.awt.Button();
        button9 = new java.awt.Button();
        button10 = new java.awt.Button();
        button11 = new java.awt.Button();
        button12 = new java.awt.Button();
        button13 = new java.awt.Button();
        button14 = new java.awt.Button();
        button15 = new java.awt.Button();
        button16 = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        msg_area1 = new javax.swing.JTextArea();

        msg_area.setColumns(20);
        msg_area.setRows(5);
        jScrollPane1.setViewportView(msg_area);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button1.setActionCommand("button2");
        button1.setLabel("2");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ctionPerformed(evt);
            }
        });

        button2.setActionCommand("button3");
        button2.setLabel("3");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ctionPerformed(evt);
            }
        });

        button3.setActionCommand("C");
        button3.setLabel("C");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear(evt);
            }
        });

        button4.setActionCommand("button6");
        button4.setLabel("6");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ctionPerformed(evt);
            }
        });

        button5.setActionCommand("button5");
        button5.setLabel("5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ctionPerformed(evt);
            }
        });

        button6.setActionCommand("button4");
        button6.setLabel("4");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ctionPerformed(evt);
            }
        });

        button7.setActionCommand("button9");
        button7.setLabel("9");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ctionPerformed(evt);
            }
        });

        button8.setActionCommand("button0");
        button8.setLabel("0");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ctionPerformed(evt);
            }
        });

        button9.setActionCommand("button7");
        button9.setLabel("7");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ctionPerformed(evt);
            }
        });

        button10.setActionCommand("button8");
        button10.setLabel("8");
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ctionPerformed(evt);
            }
        });

        button11.setActionCommand("multiply");
        button11.setLabel("*");
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiply(evt);
            }
        });

        button12.setActionCommand("sum");
        button12.setLabel("+");
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sum(evt);
            }
        });

        button13.setActionCommand("equal");
        button13.setLabel("=");
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igual(evt);
            }
        });

        button14.setActionCommand("minus");
        button14.setLabel("-");
        button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus(evt);
            }
        });

        button15.setActionCommand("divide");
        button15.setLabel("/");
        button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divide(evt);
            }
        });

        button16.setActionCommand("1");
        button16.setLabel("1");
        button16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button16ActionPerformed(evt);
            }
        });

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        msg_area1.setColumns(20);
        msg_area1.setRows(5);
        jScrollPane2.setViewportView(msg_area1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addComponent(button16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button12, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button11, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                    .addComponent(button14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(button13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(button9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(button10, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(button13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        button2.getAccessibleContext().setAccessibleName("button3");
        button4.getAccessibleContext().setAccessibleName("button6");
        button5.getAccessibleContext().setAccessibleName("button5");
        button6.getAccessibleContext().setAccessibleName("button4");
        button7.getAccessibleContext().setAccessibleName("button9");
        button8.getAccessibleContext().setAccessibleName("button0");
        button9.getAccessibleContext().setAccessibleName("button7");
        button10.getAccessibleContext().setAccessibleName("button8");
        button11.getAccessibleContext().setAccessibleName("multiply");
        button12.getAccessibleContext().setAccessibleName("sum");
        button13.getAccessibleContext().setAccessibleName("equal");
        button14.getAccessibleContext().setAccessibleName("minus");
        button15.getAccessibleContext().setAccessibleName("divide");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button16ActionPerformed
        resultExhibt("1");
        
    }//GEN-LAST:event_button16ActionPerformed

    private void button0ctionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ctionPerformed
       resultExhibt("0");
    }//GEN-LAST:event_button0ctionPerformed

    private void button9ctionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ctionPerformed
        resultExhibt("9");
    }//GEN-LAST:event_button9ctionPerformed

    private void button8ctionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ctionPerformed
        resultExhibt("8");
    }//GEN-LAST:event_button8ctionPerformed

    private void button7ctionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ctionPerformed
        resultExhibt("7");
    }//GEN-LAST:event_button7ctionPerformed

    private void button6ctionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ctionPerformed
        resultExhibt("6");
    }//GEN-LAST:event_button6ctionPerformed

    private void button5ctionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ctionPerformed
        resultExhibt("5");
    }//GEN-LAST:event_button5ctionPerformed

    private void button4ctionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ctionPerformed
        resultExhibt("4");
    }//GEN-LAST:event_button4ctionPerformed

    private void button3ctionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ctionPerformed
         resultExhibt("3");
    }//GEN-LAST:event_button3ctionPerformed

    private void button2ctionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ctionPerformed
        resultExhibt("2");// TODO add your handling code here:
    }//GEN-LAST:event_button2ctionPerformed

    private void sum(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sum
        setOperator("+");
    }//GEN-LAST:event_sum

    private void minus(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus
        setOperator("-");
    }//GEN-LAST:event_minus

    private void divide(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divide
        setOperator("/");
    }//GEN-LAST:event_divide

    private void multiply(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiply
        setOperator("*");
    }//GEN-LAST:event_multiply

    private void igual(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igual
        result();
    }//GEN-LAST:event_igual

    private void clear(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear
     clear();
    }//GEN-LAST:event_clear
                       
    private void result(){
        if(this.firstNumber!=""){
        double first,second,resultado=0;
        int res=0;
        first = Double.parseDouble(this.firstNumber);
        second = Double.parseDouble(this.lastNumber);
        switch(this.operator){
            case "+":
                res = (int) (first+second);
                this.labelText = String.valueOf(res);
                break;
            case "-":
                res = (int) (first-second);
                this.labelText = String.valueOf(res);
                break;
            case "*":
                res = (int) (first*second);
                this.labelText = String.valueOf(res);
                break;
            case "/":
                resultado = first/second;
                this.labelText = String.valueOf(resultado);
                break;
            default:
        }
        
        msg_area1.setText(null);
        msg_area1.append(this.labelText);
        this.firstNumber = this.operator = this.lastNumber = "";
        }
    }
    private boolean testOperator(){
        if(this.operator == null||this.operator==""){
        return false; 
        } else {
            return true;
        }
        
    }
    private void clear(){
        msg_area1.setText(null);
        this.firstNumber = this.operator = this.lastNumber = "";
    }
    private void resultExhibt(String input){
        System.out.println("fui chamado");
        if(!testOperator()){
        this.firstNumber += input;
        this.labelText = firstNumber;
        msg_area1.setText(null);
        msg_area1.append(this.labelText);    
        }else{
         this.lastNumber +=input;
         this.labelText = firstNumber+" "+this.operator+" "+this.lastNumber;
            msg_area1.setText(null);
            msg_area1.append(this.labelText);    
        }   
    }
    private void setOperator(String op){
        if(this.operator==null || this.operator==""){
        this.operator = op;
        this.labelText = firstNumber+" "+this.operator;
        msg_area1.setText(null);
        msg_area1.append(this.labelText);    
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
            java.util.logging.Logger.getLogger(CalculadoraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button10;
    private java.awt.Button button11;
    private java.awt.Button button12;
    private java.awt.Button button13;
    private java.awt.Button button14;
    private java.awt.Button button15;
    private java.awt.Button button16;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private java.awt.Button button9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTextArea msg_area;
    private static javax.swing.JTextArea msg_area1;
    // End of variables declaration//GEN-END:variables
}
