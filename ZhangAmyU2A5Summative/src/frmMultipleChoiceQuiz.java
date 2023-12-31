/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.text.DecimalFormat; //This will allow us to do rounding

/**
 *
 * @author Amy Zhang
 * Date: August 4th, 2023
 * A multiple choice quiz about my computer science class using if else statements
 */
public class frmMultipleChoiceQuiz extends javax.swing.JFrame {
    //Declaring the decimal format to be 1 decimal places
    DecimalFormat df1 = new DecimalFormat("0.0");

    //Declaring and storing the correct answers for all five questions including uppercase and lowercase
    final String STRQ1ANSLOW = "a", STRQ1ANSUP = "A"; //Answer for question 1 is a or A
    final String STRQ2ANSLOW = "c", STRQ2ANSUP = "C"; //Answer for question 2 is c or C
    final String STRQ3ANSLOW = "c", STRQ3ANSUP = "C"; //Answer for question 3 is c or C
    final String STRQ4ANSLOW = "b", STRQ4ANSUP = "B"; //Answer for question 4 is b or B
    final String STRQ5ANSLOW = "a", STRQ5ANSUP = "A"; //Answer for question 5 is a or A
    
    //Declaring a variable to store the number of correctly answered questions
    int intTotalCorrect = 0;
    
    /**
     * Creates new form frmMultipleChoiceQuiz
     */
    public frmMultipleChoiceQuiz() {
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
        jTable1 = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        lblInstruction1 = new javax.swing.JLabel();
        lblQ1 = new javax.swing.JLabel();
        lblQ1Choices = new javax.swing.JLabel();
        txtQ1Answer = new javax.swing.JTextField();
        lblQ1Feedback = new javax.swing.JLabel();
        lblQ2 = new javax.swing.JLabel();
        lblQ2Choices = new javax.swing.JLabel();
        txtQ2Answer = new javax.swing.JTextField();
        lblQ2Feedback = new javax.swing.JLabel();
        lblInstruction2 = new javax.swing.JLabel();
        btnQ1Check = new javax.swing.JButton();
        btnQ2Check = new javax.swing.JButton();
        btnQ3Check = new javax.swing.JButton();
        lblQ3 = new javax.swing.JLabel();
        lblQ3Choices = new javax.swing.JLabel();
        txtQ3Answer = new javax.swing.JTextField();
        lblQ3Feedback = new javax.swing.JLabel();
        lblQ4 = new javax.swing.JLabel();
        lblQ4Choices = new javax.swing.JLabel();
        lblQ4Feedback = new javax.swing.JLabel();
        txtQ4Answer = new javax.swing.JTextField();
        btnQ4Check = new javax.swing.JButton();
        lblQ5 = new javax.swing.JLabel();
        lblQ5Choices = new javax.swing.JLabel();
        lblQ5Feedback = new javax.swing.JLabel();
        txtQ5Answer = new javax.swing.JTextField();
        btnQ5Check = new javax.swing.JButton();
        lblTotalCorrect = new javax.swing.JLabel();
        lblTotalIncorrect = new javax.swing.JLabel();
        lblPercentCorrect = new javax.swing.JLabel();
        btnStatistics = new javax.swing.JButton();
        lblScore = new javax.swing.JLabel();
        lblInstruction3 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblTitle.setText("Welcome to Amy's Multiple Choice Quiz!");

        lblInstruction1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblInstruction1.setText("Please type the letter corresponding to your answer in the text box on the right");

        lblQ1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblQ1.setText("Q1: Which of the following follow Mr. Jeg's version of the camel case naming convention?");

        lblQ1Choices.setText("a) intFinalMark  b) intfinalmark  c) finalMark  d) FinalMark");

        txtQ1Answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQ1AnswerActionPerformed(evt);
            }
        });

        lblQ1Feedback.setText("Feedback:                                    ");

        lblQ2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblQ2.setText("Q2: In a flow chart, what shape is used to show input?");

        lblQ2Choices.setText("a) Oval  b) Rectangle  c) Parallelogram  d) Diamond");

        txtQ2Answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQ2AnswerActionPerformed(evt);
            }
        });

        lblQ2Feedback.setText("Feedback:");

        lblInstruction2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblInstruction2.setText("Then, press the \"CHECK\" Button to check your answer");

        btnQ1Check.setText("CHECK");
        btnQ1Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ1CheckActionPerformed(evt);
            }
        });

        btnQ2Check.setText("CHECK");
        btnQ2Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ2CheckActionPerformed(evt);
            }
        });

        btnQ3Check.setText("CHECK");
        btnQ3Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ3CheckActionPerformed(evt);
            }
        });

        lblQ3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblQ3.setText("Q3: Which of the following is NOT a valid variable type?");

        lblQ3Choices.setText("a) String  b) Boolean  c) Box  d) Double");

        txtQ3Answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQ3AnswerActionPerformed(evt);
            }
        });

        lblQ3Feedback.setText("Feedback:");

        lblQ4.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblQ4.setText("Q4: \"HTF\" was encrypted using the Caesar cipher with a shift of 7, what is the original text?");

        lblQ4Choices.setText("a) ICS  b) AMY  c) CPU  d) PIN");

        lblQ4Feedback.setText("Feedback:");

        txtQ4Answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQ4AnswerActionPerformed(evt);
            }
        });

        btnQ4Check.setText("CHECK");
        btnQ4Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ4CheckActionPerformed(evt);
            }
        });

        lblQ5.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblQ5.setText("Q5: Which of the following is a peripheral device?");

        lblQ5Choices.setText("a) Scanner  b) NetBeans  c) ALU  d) RAM");

        lblQ5Feedback.setText("Feedback:");

        txtQ5Answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQ5AnswerActionPerformed(evt);
            }
        });

        btnQ5Check.setText("CHECK");
        btnQ5Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ5CheckActionPerformed(evt);
            }
        });

        lblTotalCorrect.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblTotalCorrect.setText("Total Correct: ");

        lblTotalIncorrect.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblTotalIncorrect.setText("Total Incorrect:");

        lblPercentCorrect.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblPercentCorrect.setText("Percentage Correct:");

        btnStatistics.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        btnStatistics.setText("View My Statistics");
        btnStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatisticsActionPerformed(evt);
            }
        });

        lblScore.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblScore.setText("Score: 0");

        lblInstruction3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblInstruction3.setText("Finally, press \"View My Statistics\" when you're done!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblQ3Choices, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQ1Choices, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQ2Choices, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblQ1Feedback, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(lblQ2Feedback, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblQ3Feedback, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblQ4Choices, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQ5Choices, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblQ4Feedback, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(lblQ5Feedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblQ3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtQ3Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblQ4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtQ4Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblQ2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtQ2Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(lblInstruction1))
                                            .addComponent(lblQ1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE))
                                        .addGap(30, 30, 30)
                                        .addComponent(txtQ1Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQ4Check)
                            .addComponent(btnQ3Check)
                            .addComponent(btnQ1Check)
                            .addComponent(btnQ2Check)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQ5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtQ5Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnQ5Check)))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblInstruction2)
                        .addGap(265, 265, 265))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTitle)
                                .addGap(222, 222, 222))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTotalCorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(lblTotalIncorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(lblPercentCorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(btnStatistics)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblInstruction3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruction1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInstruction2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInstruction3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQ1)
                            .addComponent(txtQ1Answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQ1Check))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQ1Choices)
                            .addComponent(lblQ1Feedback))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQ2)
                            .addComponent(txtQ2Answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQ2Check))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQ2Choices)
                            .addComponent(lblQ2Feedback))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQ3)
                            .addComponent(txtQ3Answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQ3Check))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQ3Choices)
                            .addComponent(lblQ3Feedback))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQ4)
                            .addComponent(btnQ4Check)
                            .addComponent(txtQ4Answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQ4Choices)
                            .addComponent(lblQ4Feedback))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQ5)
                            .addComponent(btnQ5Check)
                            .addComponent(txtQ5Answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQ5Choices)
                            .addComponent(lblQ5Feedback))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btnStatistics)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblScore)
                        .addGap(59, 59, 59)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalCorrect, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTotalIncorrect)
                        .addComponent(lblPercentCorrect)))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQ1AnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQ1AnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQ1AnswerActionPerformed

    private void txtQ2AnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQ2AnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQ2AnswerActionPerformed

    private void btnQ1CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ1CheckActionPerformed
        //Reading and storing user's answer for question 1 from textbox
        String strQ1Answer = txtQ1Answer.getText();
        
        //Checking if user's answer is the same as variables stored
        if(strQ1Answer.equals(STRQ1ANSLOW)||strQ1Answer.equals(STRQ1ANSUP))
        {
            //Displaying a correct message in feedback label
            lblQ1Feedback.setText("Correct!");
            //Adding one to the total correctly answered questions counter
            intTotalCorrect = intTotalCorrect + 1;
            //Displaying or updating the total correctly answered questions in the score label
            lblScore.setText("Score: "+ intTotalCorrect);
            
        }
        //Runs if the user's answer was incorrect
        else 
        {
            //Displaying the correct answers in feedback label
            lblQ1Feedback.setText("Incorrect, the correct answer is "+ STRQ1ANSLOW + " or " + STRQ1ANSUP);
        }
    }//GEN-LAST:event_btnQ1CheckActionPerformed

    private void btnQ2CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ2CheckActionPerformed
        //Reading and storing user's answer for question 2 from textbox
        String strQ2Answer = txtQ2Answer.getText();
        
        //Checking if user's answer is the same as variables stored
        if(strQ2Answer.equals(STRQ2ANSLOW)||strQ2Answer.equals(STRQ2ANSUP))
        {
            //Displaying a correct message in feedback label            
            lblQ2Feedback.setText("Correct!");
            //Adding one to the total correctly answered questions counter            
            intTotalCorrect = intTotalCorrect + 1;
            //Displaying or updating the total correctly answered questions in the score label
            lblScore.setText("Score: "+ intTotalCorrect);
            
        }
        //Runs if the user's answer was incorrect        
        else
        {
            //Displaying the correct answers in feedback label            
            lblQ2Feedback.setText("Incorrect, the correct answer is "+ STRQ2ANSLOW + " or " + STRQ2ANSUP);
        }
    }//GEN-LAST:event_btnQ2CheckActionPerformed

    private void btnQ3CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ3CheckActionPerformed
        //Reading and storing user's answer for question 3 from textbox
        String strQ3Answer = txtQ3Answer.getText();
        
        //Checking if user's answer is the same as variables stored
        if(strQ3Answer.equals(STRQ3ANSLOW)||strQ3Answer.equals(STRQ3ANSUP))
        {
            //Displaying a correct message in feedback label                        
            lblQ3Feedback.setText("Correct!");
            //Adding one to the total correctly answered questions counter                        
            intTotalCorrect = intTotalCorrect + 1;
            //Displaying or updating the total correctly answered questions in the score label
            lblScore.setText("Score: "+ intTotalCorrect);
            
        }
        //Runs if the user's answer was incorrect                
        else
        {
            //Displaying the correct answer in feedback label                        
            lblQ3Feedback.setText("Incorrect, the correct answer is "+ STRQ3ANSLOW + " or " + STRQ3ANSUP);
        }
    }//GEN-LAST:event_btnQ3CheckActionPerformed

    private void txtQ3AnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQ3AnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQ3AnswerActionPerformed

    private void txtQ4AnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQ4AnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQ4AnswerActionPerformed

    private void btnQ4CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ4CheckActionPerformed
        //Reading and storing user's answer for question 4 from textbox
        String strQ4Answer = txtQ4Answer.getText();
        
        //Checking if user's answer is the same as variables stored
        if(strQ4Answer.equals(STRQ4ANSLOW)||strQ4Answer.equals(STRQ4ANSUP))
        {
            //Displaying a correct message in feedback label                        
            lblQ4Feedback.setText("Correct!");
            //Adding one to the total correctly answered questions counter                        
            intTotalCorrect = intTotalCorrect + 1;
            //Displaying or updating the total correctly answered questions in the score label
            lblScore.setText("Score: "+ intTotalCorrect);
            
        }
        //Runs if the user's answer was incorrect                
        else
        {
            //Displaying the correct answer in feedback label                        
            lblQ4Feedback.setText("Incorrect, the correct answer is "+ STRQ4ANSLOW + " or " + STRQ4ANSUP);
        }
    }//GEN-LAST:event_btnQ4CheckActionPerformed

    private void txtQ5AnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQ5AnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQ5AnswerActionPerformed

    private void btnQ5CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ5CheckActionPerformed
        //Reading and storing user's answer for question 5 from textbox
        String strQ5Answer = txtQ5Answer.getText();
        
        //Checking if user's answer is the same as variables stored
        if(strQ5Answer.equals(STRQ5ANSLOW)||strQ5Answer.equals(STRQ5ANSUP))
        {
            //Displaying a correct message in feedback label                        
            lblQ5Feedback.setText("Correct!");
            //Adding one to the total correctly answered questions counter                        
            intTotalCorrect = intTotalCorrect + 1;
            //Displaying or updating the total correctly answered questions in the score label
            lblScore.setText("Score: "+ intTotalCorrect);
            
        }
        //Runs if the user's answer was incorrect                
        else
        {
            //Displaying the correct answer in feedback label                        
            lblQ5Feedback.setText("Incorrect, the correct answer is "+ STRQ5ANSLOW + " or " + STRQ5ANSUP);
        }
    }//GEN-LAST:event_btnQ5CheckActionPerformed

    private void btnStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatisticsActionPerformed
        
        //Displays the total number of correctly answered questions in the lblTotalCorrect label
        lblTotalCorrect.setText("Total Correct: " + intTotalCorrect);
        //Calculates the total number of incorrectly answered questions by subtracting the total of correct answers from five
        //Displays total number of incorrectly answered questions in the lblTotalIncorrect label
        lblTotalIncorrect.setText("Total Incorrect: " + (5 - intTotalCorrect));
        
        //Calculates the percentage of correctly answered questions by dividing it by 5 and multiplying by 100
        double dblPercentCorrect = ((double)intTotalCorrect/ 5.00) * 100;
        //Displays the percentage of correctly answered questions rounded to 1 decimal place in lblPercentCorrect label
        lblPercentCorrect.setText("Percentage Correct: " + df1.format(dblPercentCorrect) + "%");
    }//GEN-LAST:event_btnStatisticsActionPerformed

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
            java.util.logging.Logger.getLogger(frmMultipleChoiceQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMultipleChoiceQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMultipleChoiceQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMultipleChoiceQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMultipleChoiceQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQ1Check;
    private javax.swing.JButton btnQ2Check;
    private javax.swing.JButton btnQ3Check;
    private javax.swing.JButton btnQ4Check;
    private javax.swing.JButton btnQ5Check;
    private javax.swing.JButton btnStatistics;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblInstruction1;
    private javax.swing.JLabel lblInstruction2;
    private javax.swing.JLabel lblInstruction3;
    private javax.swing.JLabel lblPercentCorrect;
    private javax.swing.JLabel lblQ1;
    private javax.swing.JLabel lblQ1Choices;
    private javax.swing.JLabel lblQ1Feedback;
    private javax.swing.JLabel lblQ2;
    private javax.swing.JLabel lblQ2Choices;
    private javax.swing.JLabel lblQ2Feedback;
    private javax.swing.JLabel lblQ3;
    private javax.swing.JLabel lblQ3Choices;
    private javax.swing.JLabel lblQ3Feedback;
    private javax.swing.JLabel lblQ4;
    private javax.swing.JLabel lblQ4Choices;
    private javax.swing.JLabel lblQ4Feedback;
    private javax.swing.JLabel lblQ5;
    private javax.swing.JLabel lblQ5Choices;
    private javax.swing.JLabel lblQ5Feedback;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotalCorrect;
    private javax.swing.JLabel lblTotalIncorrect;
    private javax.swing.JTextField txtQ1Answer;
    private javax.swing.JTextField txtQ2Answer;
    private javax.swing.JTextField txtQ3Answer;
    private javax.swing.JTextField txtQ4Answer;
    private javax.swing.JTextField txtQ5Answer;
    // End of variables declaration//GEN-END:variables
}
