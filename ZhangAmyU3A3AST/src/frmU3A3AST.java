/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Amy Zhang
 * Date: August 11th, 2023
 * An animal trivia game where the user answers questions correctly to deal damage to the monster
 */
public class frmU3A3AST extends javax.swing.JFrame {

    //Declaring a variable to store the amount of damage each question deals
    final int intHitDamage = 15;
    //Declaring a variable to store the amount of health the user has and the amount the monster has
    int intUserHealth = 50, intMonsterHealth = 100;

    //Delcaring and storing questions inside an array called strQuestionArr
    String [] strQuestionArr = {"What goes from z to a?\n\n* Enter a word in all lowercase *",
        "Are all worker ants female?\na) yes \tb) no\n\n* Enter in a lowercase letter *",
        "Are naked mole rats immune to cancer?\na) yes \tb) no\n\n* Enter in a lowercase letter *",
        "Predators have eyes at the front of the face while prey have it at the sides\na) true \tb) false\n\n* Enter in a lowercase letter *",
        "How may stomachs does a cow have?\n\n* Enter a positive integer *",
        "How many legs does a spider have?\n\n* Enter a positive integer *",
        "How many hearts does an octopus have?\n\n* Enter a positive integer *",
        "How fast can a chameleon's tongue travel?\na) 5.7mph \tb) 57 mph\tc)579 mph\td) 5795 mph\n\n* Enter a lowercase letter *",
        "How many times can a hummingbird flap its wings per second?\na) 20\tb) 40\tc) 80\td) 160\n\n* Enter a lowercase letter *",
        "What is the average dragonfly's kill rate?\na) 95%\tb) 85%\tc) 75%\td)50%\n\n* Enter a lowercase letter *"};
    //Declaring and storing the answers for the questions inside an array called strAnswerArr
    final String [] strAnswersArr = {"zebra", "a", "a", "a", "4", "8", "3", "d", "c", "a"};

    //Declaring an array to store the guesses from the user
    String [] strUserGuessesArr = new String[strQuestionArr.length];
    //Declaring an array to store the answers in the order of the user guesses
    String [] strOrderedAnswersArr = new String[strQuestionArr.length];

    //Declaring a variable to store the index of the current question and answer
    int intQuestionIndex = (int)(Math.random()*strQuestionArr.length);
    //Declaring a variable to store the number of questions user answered
    int intQuestionsDone = 0;

    /**
     * Creates new form frmU3A3AST
     */

    public frmU3A3AST() {
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

        lblTitle = new javax.swing.JLabel();
        lblInstruction2 = new javax.swing.JLabel();
        lblMonsterImage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        txtInput = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        lblMonsterHealth = new javax.swing.JLabel();
        lblUserHealth = new javax.swing.JLabel();
        lblAnswer = new javax.swing.JLabel();
        lblInstruction3 = new javax.swing.JLabel();
        lblInstruction1 = new javax.swing.JLabel();
        lblQuestion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Garamond", 0, 36)); // NOI18N
        lblTitle.setText("Welcome to Animal Trivia Arena");

        lblInstruction2.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        lblInstruction2.setText("Read the question, type your answer in the small textbox and click NEXT");

        lblMonsterImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawingOfMonsterVsPlayerArena.png"))); // NOI18N
        lblMonsterImage.setText("Image");

        txtOutput.setColumns(20);
        txtOutput.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        txtOutput.setRows(5);
        txtOutput.setText("To begin, click the START button below\n\nThere will be a variety of trival questions: some difficult, some easy\nI wish you the best of luck battling the monster!");
        jScrollPane1.setViewportView(txtOutput);

        txtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        btnNext.setText("START");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblMonsterHealth.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblMonsterHealth.setForeground(new java.awt.Color(51, 153, 0));
        lblMonsterHealth.setText("Monster's Health: 100");

        lblUserHealth.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblUserHealth.setForeground(new java.awt.Color(204, 0, 51));
        lblUserHealth.setText("Your Health: 50");

        lblAnswer.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        lblAnswer.setText("       ");

        lblInstruction3.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        lblInstruction3.setText("But be careful! If you get the question wrong, the monster will attack you");

        lblInstruction1.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        lblInstruction1.setText("Your goal is to defeat the monster by answering as many questions correctly as possible");

        lblQuestion.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        lblQuestion.setText("          ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblTitle))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMonsterImage, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMonsterHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(lblUserHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(204, 204, 204)
                                        .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(lblInstruction1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lblAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNext))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstruction2)
                            .addComponent(lblInstruction3))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lblInstruction1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruction2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruction3)
                .addGap(18, 18, 18)
                .addComponent(lblMonsterImage)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonsterHealth)
                    .addComponent(lblUserHealth))
                .addGap(18, 18, 18)
                .addComponent(lblQuestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext)
                    .addComponent(lblAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        //Reading the text on btnNext and assigning it the variable strButtonStage
        String strButtonStage = btnNext.getText();

        //Checking directly if strButtonStage is "START", "ENTER", "CONTINUE", or "END"
        switch(strButtonStage)
        {
            //Runs the first time the button is pressed
            case "START":
                //Displays a question in strQuestionArr at the index of intQuestionIndex
                txtOutput.setText(strQuestionArr[intQuestionIndex]);
                //Modifiess the question in array strQuestionArr to "DONE"
                strQuestionArr[intQuestionIndex] = "DONE";

                //Displays "Question:" in the lblQuestion label
                lblQuestion.setText("Question:");
                //Displays "Answer:" in the lblAnswer label
                lblAnswer.setText("Answer:");
                //Changes the btnNext button text to ENTER
                btnNext.setText("ENTER");
                break;//Avoids fall-through

            //Runs when Button is "ENTER" (checks answer, displays correct answer, updates health)
            case "ENTER":
                //Stores user's guess in the array strUserGuessesArr
                strUserGuessesArr[intQuestionsDone] = txtInput.getText();
                //Stores actual answer in the array strOrderedAnswersArr
                strOrderedAnswersArr[intQuestionsDone] = strAnswersArr[intQuestionIndex];
                //Adds 1 to the number of questions answered
                intQuestionsDone++;

                //Checks if user's guess in txtInput matches the correct answer in strAnswersArr
                if(txtInput.getText().equals(strAnswersArr[intQuestionIndex]))
                {
                    //Subtracts intHitDamage from total intMonsterHealth
                    intMonsterHealth -= intHitDamage;
                    //Checks if monster health is less than zero and changes it to zero
                    if(intMonsterHealth < 0) intMonsterHealth = 0;
                    //Displays the updated monster health in lblMonsterHealth
                    lblMonsterHealth.setText("Monster Health: " + intMonsterHealth);

                    //Displays a correct message and the correct answer in txtOutput
                    txtOutput.setText("CORRECT, the answer is: \"" + strAnswersArr[intQuestionIndex] + "\"\n"
                            + "The Monster lost " + intHitDamage + " from from their health");
                }
                else//If user's guess didn't match the answer stored (got the question wrong)
                {
                    //Subtracts intHitDamage from intUserHealth
                    intUserHealth -= intHitDamage;
                    //Checks if user's health is less than zero and changes it to zero
                    if(intUserHealth < 0) intUserHealth = 0;
                    //Displays the updated user's health in lblUserHealth
                    lblUserHealth.setText("Your Health: " + intUserHealth);

                    //Displays a incorrect message and the correct answer in txtOutput
                    txtOutput.setText("INCORRECT, the correct answer is: \"" + strAnswersArr[intQuestionIndex] + "\"\n"
                            + "You lost " + intHitDamage + " from your health");
                }

                //Displays a blank string in txtInput to clear the box for the text question
                txtInput.setText("");

                //Checks if User health or Monster health is 0
                if (intMonsterHealth == 0 || intUserHealth == 0)
                {
                    //Displays btnNext text as END
                    btnNext.setText("END");
                }
                //If User health and Monster health is above 0
                else
                {
                    //Displays btnNext text as CONTINUE
                    btnNext.setText("CONTINUE");
                }
                break;//Avoids fall-through

            //Runs when Button is "CONTINUE" (creates random new question, displays question)
            case "CONTINUE":                
                //Runs through once to pick a random int before checking
                do
                {
                    //intQuestionIndex initialize as a random integer between 0 and number of total questions
                    intQuestionIndex = (int)(Math.random()*strQuestionArr.length);
                //Continues running until the question is not "DONE"
                }while(strQuestionArr[intQuestionIndex].equals("DONE")); 

                //Displaying the choosen question in txtOutput
                txtOutput.setText(strQuestionArr[intQuestionIndex]);
                //Modifying the current question in arr to store DONE
                strQuestionArr[intQuestionIndex] = "DONE";

                //Changes the button text to ENTER
                btnNext.setText("ENTER");
                break;//Avoids fall-through

            //Runs when Button is "END" (make labels invisible, check who won, display message with user's and correct answers)
            case "END":
                //Displays an empty string in lblQuestion (turns invisible)
                lblQuestion.setText("");
                //Displays an empty string in lblAnswer (turns invisible)
                lblAnswer.setText("");

                //Declaring a temporary string to store a sentence of user's guesses
                String strTempGuess = "Your Answers:      " + strUserGuessesArr[0];
                //Loop over number of questions done (intQuestionsDone)
                for(int i = 1; i < intQuestionsDone; i++){
                    //Concatenate next string in strUserGuessesArr
                    strTempGuess += ", " + strUserGuessesArr[i];
                }
                //Declaring a temporary string to store a sentence of the correct answers
                String strTempAnswer = "Correct Answers: " + strOrderedAnswersArr[0];
                //Loop over number of questions done (intQuestionsDone)
                for(int i = 1; i < intQuestionsDone; i++){
                    //Concatenate next string in strOrderedAnswersArr
                    strTempAnswer += ", " + strOrderedAnswersArr[i];
                }

                //Checks whose health is at zero and displays an appropriate message
                if (intMonsterHealth == 0)//if user won, monster's health is at 0
                {
                    //Displays a congradulations message in txtOutput
                    txtOutput.setText("WELL DONE! You have defeated the monster and can advance on.\n"
                            + "However, no other monster seems to have the courage to battle you after watching your match\n"
                            + "~~~~~~Thank you for playing and hope you enjoyed!~~~~~~\n"
                            + strTempGuess + "\n" + strTempAnswer);//includes the user's guess and correct answers
                }
                else//if user has lost, user's health is at 0
                {
                    //Displays a good try message in txtOutput
                    txtOutput.setText("GOOD TRY! You were defeated by the monster and was quickly rushed to the hospital.\n"
                            + "Fortunatly, you escaped without injuries, but you now have to battle in the arena a different day\n"
                            + "~~~~~~Thank you for playing and hope you can win next time!~~~~~~\n"
                            + strTempGuess + "\n" + strTempAnswer);//includes the user's guess and correct answers
                }

        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputActionPerformed

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
            java.util.logging.Logger.getLogger(frmU3A3AST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmU3A3AST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmU3A3AST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmU3A3AST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmU3A3AST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnswer;
    private javax.swing.JLabel lblInstruction1;
    private javax.swing.JLabel lblInstruction2;
    private javax.swing.JLabel lblInstruction3;
    private javax.swing.JLabel lblMonsterHealth;
    private javax.swing.JLabel lblMonsterImage;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserHealth;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}