/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Amy Zhang
 * Date: August 14th, 2023
 * A software that preforms 8 different methods on strings in a GUI
 */
public class frmSuperSringMethod extends javax.swing.JFrame {

    /**
     * Creates new form frmSuperSringMethod
     */
    public frmSuperSringMethod() {
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

        jLabel1 = new javax.swing.JLabel();
        lblMethod1Instruction = new javax.swing.JLabel();
        lblMethod2Instruction = new javax.swing.JLabel();
        lblMethod3Instruction = new javax.swing.JLabel();
        lblMethod8Instruction = new javax.swing.JLabel();
        btnMethod1 = new javax.swing.JButton();
        txtMethod1 = new javax.swing.JTextField();
        lblMethod1Output = new javax.swing.JLabel();
        txtMethod2Type = new javax.swing.JTextField();
        btnMethod2 = new javax.swing.JButton();
        lblMethod2Output = new javax.swing.JLabel();
        txtMethod3 = new javax.swing.JTextField();
        btnMethod3 = new javax.swing.JButton();
        lblMethod3Output = new javax.swing.JLabel();
        txtMethod8String1 = new javax.swing.JTextField();
        btnMethod8 = new javax.swing.JButton();
        lblMethod8Output = new javax.swing.JLabel();
        txtMethod5 = new javax.swing.JTextField();
        btnMethod5 = new javax.swing.JButton();
        lblMethod5Output = new javax.swing.JLabel();
        txtMethod6String = new javax.swing.JTextField();
        btnMethod6 = new javax.swing.JButton();
        lblMethod6Output = new javax.swing.JLabel();
        lblMethod4Instruction = new javax.swing.JLabel();
        lblMethod5Instruction = new javax.swing.JLabel();
        lblMethod6Instruction = new javax.swing.JLabel();
        btnMethod4 = new javax.swing.JButton();
        txtMethod4 = new javax.swing.JTextField();
        lblMethod4Output = new javax.swing.JLabel();
        txtMethod7 = new javax.swing.JTextField();
        btnMethod7 = new javax.swing.JButton();
        lblMethod7Output = new javax.swing.JLabel();
        lblMethod7Instruction = new javax.swing.JLabel();
        txtMethod2String1 = new javax.swing.JTextField();
        txtMethod2String2 = new javax.swing.JTextField();
        txtMethod6Letter = new javax.swing.JTextField();
        txtMethod8String2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel1.setText("SUPER STRING SOFTWARE");

        lblMethod1Instruction.setText("Enter a string. The program will output the number of vowels excluding \"y\"");

        lblMethod2Instruction.setText("Enter a type prefix and two strings. The program will output the string as a variable name in camel case.");

        lblMethod3Instruction.setText("Enter a string. The program will check how many times \"amy\" (lowercase or uppercase) is repeated in it.");

        lblMethod8Instruction.setText("Enter two strings. The program will alternate the letters of the two strings and output the new string.");

        btnMethod1.setText("number of vowels");
        btnMethod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMethod1ActionPerformed(evt);
            }
        });

        lblMethod1Output.setText("Output");

        txtMethod2Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMethod2TypeActionPerformed(evt);
            }
        });

        btnMethod2.setText("camelCase");
        btnMethod2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMethod2ActionPerformed(evt);
            }
        });

        lblMethod2Output.setText("Output:");

        btnMethod3.setText("number of \"amy\"");
        btnMethod3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMethod3ActionPerformed(evt);
            }
        });

        lblMethod3Output.setText("Output:");

        btnMethod8.setText("combine");
        btnMethod8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMethod8ActionPerformed(evt);
            }
        });

        lblMethod8Output.setText("Output");

        btnMethod5.setText("swap letters");
        btnMethod5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMethod5ActionPerformed(evt);
            }
        });

        lblMethod5Output.setText("Output:");

        btnMethod6.setText("replace vowels");
        btnMethod6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMethod6ActionPerformed(evt);
            }
        });

        lblMethod6Output.setText("Output:");

        lblMethod4Instruction.setText("Enter a string. The program will output the string with alternating uppercase and lowercase letters");

        lblMethod5Instruction.setText("Enter a string. The program will output the string with the first letter and last letter swapped.");

        lblMethod6Instruction.setText("Enter a string and a letter. The program will output the string with all its vowels replaced by that letter.");

        btnMethod4.setText("alternate cases");
        btnMethod4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMethod4ActionPerformed(evt);
            }
        });

        lblMethod4Output.setText("Output:");

        btnMethod7.setText("most common vowel(s)");
        btnMethod7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMethod7ActionPerformed(evt);
            }
        });

        lblMethod7Output.setText("Output:");

        lblMethod7Instruction.setText("Enter a string. The program will output the vowels(s) that appear(s) the most separated by a space.");

        txtMethod2String2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMethod2String2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMethod2Instruction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblMethod3Instruction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMethod4Instruction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMethod5Instruction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMethod6Instruction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblMethod1Instruction, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblMethod7Instruction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMethod8Instruction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtMethod1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMethod1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtMethod3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMethod3))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtMethod5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMethod5))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtMethod8String1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMethod8String2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMethod8))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtMethod7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMethod7))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtMethod4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMethod4))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtMethod6String, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(txtMethod6Letter, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(btnMethod6)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMethod2Type, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMethod2String1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMethod2String2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMethod2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblMethod1Output, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMethod3Output, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMethod2Output, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMethod4Output, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblMethod5Output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMethod7Output, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(lblMethod6Output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMethod8Output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(lblMethod1Instruction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMethod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMethod1Output)
                    .addComponent(btnMethod1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(lblMethod2Instruction, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMethod2Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMethod2)
                    .addComponent(lblMethod2Output)
                    .addComponent(txtMethod2String1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMethod2String2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(lblMethod3Instruction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMethod3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMethod3Output)
                    .addComponent(btnMethod3))
                .addGap(30, 30, 30)
                .addComponent(lblMethod4Instruction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMethod4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMethod4Output)
                    .addComponent(btnMethod4))
                .addGap(30, 30, 30)
                .addComponent(lblMethod5Instruction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMethod5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMethod5Output)
                    .addComponent(btnMethod5))
                .addGap(30, 30, 30)
                .addComponent(lblMethod6Instruction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMethod6String, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMethod6Output, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMethod6)
                    .addComponent(txtMethod6Letter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(lblMethod7Instruction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMethod7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMethod7Output)
                    .addComponent(btnMethod7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblMethod8Instruction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMethod8String1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMethod8Output)
                    .addComponent(btnMethod8)
                    .addComponent(txtMethod8String2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMethod2TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMethod2TypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMethod2TypeActionPerformed

    private void btnMethod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMethod1ActionPerformed
        //Reading the text in the textbook and storing it in a string
        String strInput = txtMethod1.getText();
        //Declaring a variable to keep track of the number of vowels in the word
        int intTotalVowels = 0;
        //Declaring a variable to store the vowels to look for in both uppercase and lowercase
        String strVowels = "aeiouAEIOU";
        
        //A loop that runs through each letter in strInput
        for(int i = 0; i < strInput.length(); i++)
        {
            //For each letter in substring, it checks if it is part of strVowels
            //If it is part of strVowels, it will returns its index, else it returns -1
            if (strVowels.indexOf(strInput.substring(i, i+1)) != -1)
            {
                //If the letter is a part of strVowels (is a vowel) it adds one to the total number of vowels
                intTotalVowels ++;
            }
        }
        
        //Displays the number of vowels in the word in the label lblMethod1Output
        lblMethod1Output.setText("Output: " + String.valueOf(intTotalVowels));
    }//GEN-LAST:event_btnMethod1ActionPerformed

    private void btnMethod2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMethod2ActionPerformed
        //Reading the type from the user in the textbook and storing it in a string
        String strType = txtMethod2Type.getText();
        //Reading the first string from the user in the textbook and storing it in a string
        String strString1 = txtMethod2String1.getText();
        //Reading the second string from the user in the textbook and storing it in a string        
        String strString2 = txtMethod2String2.getText();
        
        //Declaring a variable to store the concatentation of the type and two strings with
        //the type in all lowercase, the first letter of the two strings uppercase and everything else in lowercase
        String strVariable = strType.toLowerCase() 
                + strString1.substring(0, 1).toUpperCase() + strString1.substring(1).toLowerCase() 
                + strString2.substring(0, 1).toUpperCase() + strString2.substring(1).toLowerCase();
        
        //Displaying the concatentated string strVariable in the label lblMethod2Output
        lblMethod2Output.setText("Output: " + strVariable);
    }//GEN-LAST:event_btnMethod2ActionPerformed

    private void txtMethod2String2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMethod2String2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMethod2String2ActionPerformed

    private void btnMethod3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMethod3ActionPerformed
        //Declaring a variable to keep track of the number of "amy"s in the string
        int intAmyCounter = 0;
        //Reading and storing the text in the textbook in a string variable and changing it to all lowercase
        String strString = txtMethod3.getText().toLowerCase();
        
        //Looping through the number of letters in strInput without the last 2
        for (int i = 0; i < strString.length() - 2; i++)
        {
            //Checking if 3 consecutive letters strInput spells "amy"
            if (strString.substring(i, i + 3).equals("amy"))
            {
                //Adds one to the counter if there is an "amy" in the word
                intAmyCounter ++;
            }
        }
        
        //Displays the final count for the number of "amy"s in the label lblMethod3Output
        lblMethod3Output.setText("Output: " + String.valueOf(intAmyCounter));
    }//GEN-LAST:event_btnMethod3ActionPerformed

    private void btnMethod5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMethod5ActionPerformed
        //Reading and storing the text from the textbox in a string variable
        String strInput = txtMethod5.getText();
        
        //Declaring a variable and storing the last letter of the string
        String strLastLetter = strInput.substring(strInput.length() - 1, strInput.length());
        //Declaring a variable and storing the first letter of the string
        String strFirstLetter = strInput.substring(0, 1);
        
        //Displaying the text with the first and last letters swapped in the label lblMethod5Output
        lblMethod5Output.setText("Output: " + strLastLetter + strInput.substring(1,strInput.length() - 1) + strFirstLetter);
    }//GEN-LAST:event_btnMethod5ActionPerformed

    private void btnMethod4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMethod4ActionPerformed
        //Reading an storing the text from the textbox in a string variable
        String strInput = txtMethod4.getText();
        //Declaring a string to store each letter after given the appropriate case
        String strOutput = "";
        
        //Loops through each letter in the string
        for(int i = 0; i < strInput.length(); i++)
        {
            //Checks if the index of the letter is even
            if(i%2 == 0)
            {
                //Changes the letter to lowercase and adds it to the strOutput
                strOutput += strInput.substring(i, i+1).toLowerCase();
            }
            //if the index of the letter is odd
            else
            {             
                //Changes the letter to uppercase and adds it to the strOutput
                strOutput += strInput.substring(i, i+1).toUpperCase();
            }
        }
        
        //Displays the strOutput with alternating cases in the label lblMethod4Output
        lblMethod4Output.setText("Output: " + strOutput);
    }//GEN-LAST:event_btnMethod4ActionPerformed

    private void btnMethod6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMethod6ActionPerformed
        //Declaring a variable to keep track of the number of vowels in the word
        int intTotalVowels = 0;
        //Declaring a variable to store the vowels to look for in both uppercase and lowercase
        String strVowels = "aeiouAEIOU";

        //Reading the text from textbox and storing it in a variable
        String strInput = txtMethod6String.getText();
        //Reading the letter from the textbox and storing it in a variable
        String strLetterReplace = txtMethod6Letter.getText();
        
        //Declaring a string variable to store the final output string
        String strOutput = "";
        
        //Loops through each letter in strInput
        for (int i = 0; i < strInput.length(); i++)
        {
            //Checks if the letter is a vowel (has a index number in the strVowel other than -1)
            if (strVowels.indexOf(strInput.substring(i, i + 1)) != -1)
            {
                //adds the replacement letter to strOutput
                strOutput += strLetterReplace;
            }
            //If the letter is not a vowel (returns negative one)
            else
            {
                //adds the letter to strOutput
                strOutput += strInput.substring(i, i + 1);
            }
        }
        //Displays the strOutput in the label lblMethod6Output
        lblMethod6Output.setText("Output: " + strOutput);
    }//GEN-LAST:event_btnMethod6ActionPerformed

    private void btnMethod7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMethod7ActionPerformed
        //Reading the text in textbox and storing it in a variable in all lowercase
        String strInput = txtMethod7.getText().toLowerCase();
        
        //Declaring a variable and storing the lower case variables inside
        String strVowels = "aeiou";
        //Declaring a array to keep track of the number of times a vowel appear in strInput
        int [] intVowelCountArr = new int[5];        
        //Declaring a variable to keep track of the largest number of times a vowel appears
        int intMaxVowelCount = 0;
        
        //Declaring a variable to store the final letters to output
        String strOutput = "";
        
        //Loops through each letter in strInput
        for (int i = 0; i <  strInput.length(); i++) 
        {
            //Checks if the letter is a vowel or has an index other than -1
            if (strVowels.indexOf(strInput.substring(i, i + 1)) != -1)
            {
                //adds one to the index in intVowelCountArr that corresponds with its position in "aeiou"
                intVowelCountArr[strVowels.indexOf(strInput.substring(i, i + 1))]++;
            }
        }
        
        //Loops through each element in intVowelCountArr
        for (int i = 0; i < intVowelCountArr.length; i++)
        {
            //Find the maxium number between the previous max and the next element
            intMaxVowelCount = Math.max(intMaxVowelCount, intVowelCountArr[i]);
        }
        
        //Loops through each element in intVowelArr
        for (int i = 0; i < intVowelCountArr.length; i++)
        {
            //checks if the element has the maxium number
            if (intVowelCountArr[i] == intMaxVowelCount)
            {
                //If true, it is added to the strOuput
                strOutput += strVowels.charAt(i) + " ";
            }
        }
        
        //Displays strOutput in the label lblMethod7Output        
        lblMethod7Output.setText("Output: " + strOutput);
    }//GEN-LAST:event_btnMethod7ActionPerformed

    private void btnMethod8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMethod8ActionPerformed
        //Reading text in texbox and storing it in a variable
        String strString1 = txtMethod8String1.getText();
        //Reading text in texbox and storing it in a variable
        String strString2 = txtMethod8String2.getText();
        
        //Declaring a string to store the output string
        String strOutput = "";
        
        //loops through the letters in for the string with the minimum length
        for (int i = 0; i < Math.min(strString1.length(), strString2.length()); i++)
        {
            //Adds the next letter from strString1 and a letter from strString2 to strOutput
            strOutput += strString1.substring(i, i + 1) + strString2.substring(i, i + 1);
        }
        
        //Adds the rest of the string for strString1 that was not alternated with strString2 in the loop
        strOutput += strString1.substring(Math.min(strString1.length(), strString2.length()));
        //Adds the rest of the string for strString2 that was not alternated with strString1 in the loop
        strOutput += strString2.substring(Math.min(strString1.length(), strString2.length()));

        //Displays strOutput in the label lblMethod8Output
        lblMethod8Output.setText("Output: " + strOutput);
    }//GEN-LAST:event_btnMethod8ActionPerformed

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
            java.util.logging.Logger.getLogger(frmSuperSringMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSuperSringMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSuperSringMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSuperSringMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSuperSringMethod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMethod1;
    private javax.swing.JButton btnMethod2;
    private javax.swing.JButton btnMethod3;
    private javax.swing.JButton btnMethod4;
    private javax.swing.JButton btnMethod5;
    private javax.swing.JButton btnMethod6;
    private javax.swing.JButton btnMethod7;
    private javax.swing.JButton btnMethod8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMethod1Instruction;
    private javax.swing.JLabel lblMethod1Output;
    private javax.swing.JLabel lblMethod2Instruction;
    private javax.swing.JLabel lblMethod2Output;
    private javax.swing.JLabel lblMethod3Instruction;
    private javax.swing.JLabel lblMethod3Output;
    private javax.swing.JLabel lblMethod4Instruction;
    private javax.swing.JLabel lblMethod4Output;
    private javax.swing.JLabel lblMethod5Instruction;
    private javax.swing.JLabel lblMethod5Output;
    private javax.swing.JLabel lblMethod6Instruction;
    private javax.swing.JLabel lblMethod6Output;
    private javax.swing.JLabel lblMethod7Instruction;
    private javax.swing.JLabel lblMethod7Output;
    private javax.swing.JLabel lblMethod8Instruction;
    private javax.swing.JLabel lblMethod8Output;
    private javax.swing.JTextField txtMethod1;
    private javax.swing.JTextField txtMethod2String1;
    private javax.swing.JTextField txtMethod2String2;
    private javax.swing.JTextField txtMethod2Type;
    private javax.swing.JTextField txtMethod3;
    private javax.swing.JTextField txtMethod4;
    private javax.swing.JTextField txtMethod5;
    private javax.swing.JTextField txtMethod6Letter;
    private javax.swing.JTextField txtMethod6String;
    private javax.swing.JTextField txtMethod7;
    private javax.swing.JTextField txtMethod8String1;
    private javax.swing.JTextField txtMethod8String2;
    // End of variables declaration//GEN-END:variables
}
