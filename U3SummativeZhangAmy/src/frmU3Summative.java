/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.text.DecimalFormat; //This will allow us to do rounding
 
/**
 *
 * @author Amy Zhang
 * Date: August 16th, 2023
 * A GUI that calculates some nutrients and the price of breakfast for a week
 */
public class frmU3Summative extends javax.swing.JFrame {
    
    //Declaring an array to store the homemade options for user to pick from
    final String [] STRHOMEMADEITEMSARR = {"Fried Eggs", "Fruit bowl", "Avocado Toast"};
    //Declaring an array to store the store bought options for user to pick from
    final String [] STRSTOREBOUGHTITEMSARR = {"Cereal", "Pancakes", "Grilled Cheese Sandwich"};

    //Declaring an array to store the prices of the homemade options
    final double [] DBLHOMEMADEPRICES = {0.32, 3.20, 6.78};
    //Declaring an array to store the prices of the store bought options
    final double [] DBLSTOREBOUGHTPRICES = {0.75, 1.83, 0.99};

    //Declaring an array to store the amount of fibers in the homemade options
    final double [] DBLHOMEMADEFIBERGRAMS = {0, 2.4, 5.4};
    //Declaring an array to store the amount of proteins in the homemade options
    final double [] DBLHOMEMADEPROTEINGRAMS = {6.3, 1, 3.8};    
    //Declaring an array to store the amount of calories in the homemade options
    final double [] DBLHOMEMADECALORIE = {90, 76, 189};
    
    //Declaring an array to store the amount of fibers in the store bought options
    final double [] DBLSTOREBOUGHTFIBERGRAMS = {2.6, 0, 1.4};
    //Declaring an array to store the amount of proteins in the store bought options
    final double [] DBLSTOREBOUGHTPROTEINGRAMS = {3.4, 2.6, 12};
    //Declaring an array to store the amount of calories in the store bought options
    final double [] DBLSTOREBOUGHTCALORIES = {105, 91, 366};

    //Declaring the style (0 = store bought, 1 = homemade)
    int intStyle = 0;
    
    //Declaring an array to store the quantity of each options the user buys
    int[] intItemQuantityArr = {0, 0, 0};
    //Declaring an integer variable to keep track of the day
    int intDay = 0;
    
    //Declaring an array to store the cost of each item taking in consideration the quantity
    double[] dblDailyCostTotalArr = {0, 0, 0};
    //Decalring an array to store the amount of nutrients (fiber, protein, and calories) in each item
    double[] dblDailyNutritionTotalArr = {0, 0, 0};    
    
    //Declaring a variable to store the total cost of buying breakfast for the whole week
    double dblCostTotal = 0;
    //Declaring an array to keep track of the total amount of nutrients (fiber, protein, and calories) intake during the week
    double [] dblNutritionTotalArr = new double[3];
    
    /**
     * 
     * @param intQuantityArr is an array with positive integers > 0 (the quantity of each item purchased)
     * @param dblPrices is a positive float > 0 (the price of each item)
     * @return an array with the prices of the items taking into account their quantities
     */
    public static double[] getOptionPrices(int [] intQuantityArr, double [] dblPrices){
        //Declaring an array to store the prices of the items taking into account their quantities
        double[] dblTotalArr = new double[3];
        
        //Looping through each item the user had purchased
        for(int i = 0; i < intQuantityArr.length; i++)
        {
            //Calculating the total price of the item(s) purchased and adding each item to its own index
            dblTotalArr[i] += intQuantityArr[i] * dblPrices[i];
        }
        //Returning the array with the total costs of each item
        return dblTotalArr;
    }
    
    /**
     * 
     * @param intQuantityArr is an array with positive integers > 0 (the quantity of each item purchased)
     * @param dblFiberGrams is an array with positive floats > 0 (the amount of fiber in each item)
     * @param dblProteinGrams is an array with positive floats > 0 (the amount of protein in each item)
     * @param dblCalorie is an array with positive floats > 0 (the amount of calorie in each item)
     * @return an array with the total amount of nutrients in the breakfast
     */
    public static double[] getOptionNutrition(int [] intQuantityArr, double [] dblFiberGrams, double [] dblProteinGrams, double [] dblCalorie){
        //Declaring an array to keep track of the total amount of nutrients in the breakfast
        double[] dblTotalArr = new double[3];

        //Looping through each item the user had purchased 
        for(int i = 0; i < intQuantityArr.length; i++)
        {
            //Calculating the total fibers for all item(s) purchased and adding it to the first index
            dblTotalArr[0] += intQuantityArr[i] * dblFiberGrams[i];
        }

        //Looping through each item the user had purchased         
        for(int i = 0; i < intQuantityArr.length; i++)
        {
            //Calculating the total Protein for all item(s) purchased and adding it to the second index
            dblTotalArr[1] += intQuantityArr[i] * dblProteinGrams[i];
        }
        
        //Looping through each item the user had purchased             
        for(int i = 0; i < intQuantityArr.length; i++)
        {
            //Calculating the total Calories for all item(s) purchased and adding it to the third index            
            dblTotalArr[2] += intQuantityArr[i] * dblCalorie[i];
        }        
        //Returning the array with the totals of each nutrient(fiber, protein, calorie)
        return dblTotalArr;
    }
    
    /**
     * 
     * @param intDay is an integer (the day of the week)
     * @param intStyle is a integer (0 = store bought, 1 = homemade)
     * @param intQuantityArr is an array with positive integers > 0 (the quantity of each item purchased)
     * @param dblDailyCostTotalArr is an array with positive floats > 0 (the cost of each item tallied up)
     * @param dblDailyNutritionTotalArr is an array with positive floats > 0 (the amount of nutrients in the items)
     * @param strHomemadeOptionsArr is an array with strings (names of homemade items)
     * @param strStoreBoughtOptionsArr is an array with strings (names of store bought items)
     * @return a string that is a formatted report for days 1-7
     */
    public static String printDailyReport(int intDay,int intStyle,int [] intQuantityArr, double [] dblDailyCostTotalArr, double []dblDailyNutritionTotalArr, String [] strHomemadeOptionsArr, String [] strStoreBoughtOptionsArr){
        //Declaring the decimal format to two decimal places
        DecimalFormat df2 = new DecimalFormat("0.00");
        //Declaring a string to store style of the breakfast
        String strStyle = "";
        //Declaring an array to keep track of the options of food the user choose
        String [] strOptionsArr;
        
        //Checks if the style is store bought
        if (intStyle == 0)
        {
            //stores "Store bought" as the style
            strStyle = "Store Bought";
            //Stores the options as store bought
            strOptionsArr = strStoreBoughtOptionsArr;
        }
        else//If the style is storebought (intStyle == 1)
        {
            //stores "Store bought" as the style            
            strStyle = "Homemade";
            //Stores the options as homamde
            strOptionsArr = strHomemadeOptionsArr;
        }
        
        //Returns a properly formated report about the quantity, prices of each item, total cost, and total nutrients
        return "Day " + intDay
                + "\n-------------------------------------------------------"
                + "\nStyle: " + strStyle
                + "\n-------------------------------------------------------"
                + "\n" + strOptionsArr[0] + ": " + intQuantityArr[0] + "\t\tcost: $" + df2.format(dblDailyCostTotalArr[0])
                + "\n" + strOptionsArr[1] + ": " + intQuantityArr[1] + "\t\tcost: $" + df2.format(dblDailyCostTotalArr[1])
                + "\n" + strOptionsArr[2] + ": " + intQuantityArr[2] + "\tcost: $" + df2.format(dblDailyCostTotalArr[2])
                + "\n-------------------------------------------------------"
                + "\nTotal cost:"
                + "\n$" + df2.format(dblDailyCostTotalArr[0] + dblDailyCostTotalArr[1]+ dblDailyCostTotalArr[2])
                + "\n-------------------"
                + "\nFiber (g): " + df2.format(dblDailyNutritionTotalArr[0])
                + "\nProtein (g): " + df2.format(dblDailyNutritionTotalArr[1])
                + "\nCalories:" + df2.format(dblDailyNutritionTotalArr[2]);
    }
    
    /**
     * 
     * @param dblNutritionTotalArr is an array with positive floats > 0 (the amount of nutrients intake during the week)
     * @param dblDailyNutritionTotalArr is an array with positive floats > 0 (the amount of nutrients in the items)
     * @return an array with the current day's nutrients added to the total
     */
    public static double[] addNutritionToTotal(double[] dblNutritionTotalArr, double[] dblDailyNutritionTotalArr){
        //Loops through each item the user purchased
        for (int i = 0; i < dblDailyNutritionTotalArr.length; i++)
        {
            //Adds the nutrient of the item(s) purchased to the total in the Array
            dblNutritionTotalArr[i] += dblDailyNutritionTotalArr[i];
        }
        //Returns the array with the new values added
        return dblDailyNutritionTotalArr;

    }
    
    /**
     * 
     * @param dblPriceTotal is an array with positive floats > 0 (the cost for breakfast during the week)
     * @param dblDailyCostTotalArr is an array with positive floats > 0 (the price of the items purchased)
     * @return an float with the current day's cost added
     */
    public static double addPriceToTotal(double dblPriceTotal, double[] dblDailyCostTotalArr){
        //Loops through each item the user purchased
        for (int i = 0; i < dblDailyCostTotalArr.length; i++)
        {
            //Adds the cost of the item(s) purchased to the previous total
            dblPriceTotal += dblDailyCostTotalArr[i];
        }
        //Returns the new total cost for breakfast
        return dblPriceTotal;
    }
    
    /**
     * 
     * @param dblTotalPrice is a positive float > 0 (the total cost of breakfast for the week)
     * @param dblNutritionTotalArr is an array with positive floats > 0 (total nutrients for the week)
     * @return a string that is a formatted report for the end of the week 
     */
    public static String printFinalReport(double dblTotalPrice, double[] dblNutritionTotalArr){
        //Declaring the decimal format to be two decimal places
        DecimalFormat df2 = new DecimalFormat("0.00");
        //Declaring 3 strings to store the result of whether of not the recommended goals were reached
        String strFiberReached, strProteinReached, strCaloriesReached;
        
        //Checks if the total fiber recieved is higher or equal to the recommended for breakfast
        if (dblNutritionTotalArr[0] >= 70)
        {
            //Stores the string as successful
            strFiberReached = "reached";
        }
        else//If the target was not reached
        {
            //Stores the string as unsuccessful
            strFiberReached = "did not reach";            
        }
        
        //Checks if the total protein recieved is higher or equal to the recommended for breakfast        
        if (dblNutritionTotalArr[1] >= 140)
        {
            //Stores the string as successful
            strProteinReached = "reached";
        }
        else//If the target was not reached
        {
            //Stores the string as unsuccessful
            strProteinReached = "did not reach";
        }
        //Checks if the total calories recieved is higher or equal to the recommended for breakfast        
        if (dblNutritionTotalArr[2] >= 2800)
        {
            //Stores the string as successful in both targets
            strCaloriesReached = "reached both the men and";
        }
        else if (dblNutritionTotalArr[2] >= 2100)
        {
            //Stores the string as successful in only on targert
            strCaloriesReached = "reached";
        }
        else//If the target was not reached
        {
            //Stores the string as unsuccessful in both targets
            strCaloriesReached = "did not reached the men nor";
        }

        //Returns a properly formated report about the total, average cost, total nutrients, and if they met the target        
        return "End of Week Report"
                + "\n-------------------------------------------------------"
                + "\nTotal cost: $"+ df2.format(dblTotalPrice)
                + "\nAverage cost per day: " +df2.format(dblTotalPrice/7)
                + "\n-------------------"
                + "\nTotal Fiber: " + df2.format(dblNutritionTotalArr[0]) + " grams"
                + "\nYour fiber intake " +strFiberReached 
                +" \nthe recommended target for breakfast"
                + "\n--------"
                + "\nTotal Protein (g): " + df2.format(dblNutritionTotalArr[1]) + " grams"
                + "\nYour protein intake " +strProteinReached 
                +" \nthe recommended target for breakfast"
                + "\n--------"                
                + "\nTotal Calories: " + df2.format(dblNutritionTotalArr[2]) + " grams"
                + "\nYour calorie intake " +strCaloriesReached
                + "\nwomen's the recommended target for breakfast";

    }
    
    /**
     * Creates new form frmU3Summative
     */
    public frmU3Summative() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReport = new javax.swing.JTextArea();
        lblReport = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtOption1 = new javax.swing.JTextField();
        btnOption3 = new javax.swing.JButton();
        btnStoreBought = new javax.swing.JButton();
        btnOption1 = new javax.swing.JButton();
        btnOption2 = new javax.swing.JButton();
        txtOption3 = new javax.swing.JTextField();
        txtOption2 = new javax.swing.JTextField();
        lblPrice1 = new javax.swing.JLabel();
        lblPrice2 = new javax.swing.JLabel();
        lblPrice3 = new javax.swing.JLabel();
        btnSkip = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblDay = new javax.swing.JLabel();
        btnHomemade = new javax.swing.JButton();
        lblStyle = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblOptions = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel1.setText("PLAN YOUR BREAKFASTS");

        txtReport.setEditable(false);
        txtReport.setColumns(20);
        txtReport.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        txtReport.setLineWrap(true);
        txtReport.setRows(5);
        txtReport.setText("Day -\n-------------------------------------------------------\nStyle:  \n-------------------------------------------------------\nOption 1: 0\t\tprice: $-.--\nOption 2: 0\t\tprice: $-.--\nOption 3: 0\t\tprice: $-.--\n-------------------------------------------------------\nTotal price:\n$-.--\n------------------- \nFiber:\nProtein:\nCalories:");
        jScrollPane1.setViewportView(txtReport);

        lblReport.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        lblReport.setText("~~~~~REPORT~~~~~");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        jLabel3.setText("Enter your breakfast choice for each day of a week and view the cost and nutrition associated with it");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        jLabel4.setText("Pick a homemade or store bought meal, the quantity of each item, and then press enter to view the report for the day");

        txtOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOption1ActionPerformed(evt);
            }
        });

        btnOption3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        btnOption3.setText("Grilled Cheese Sandwich");
        btnOption3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOption3ActionPerformed(evt);
            }
        });

        btnStoreBought.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnStoreBought.setForeground(new java.awt.Color(203, 164, 11));
        btnStoreBought.setText("STORE BOUGHT");
        btnStoreBought.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoreBoughtActionPerformed(evt);
            }
        });

        btnOption1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        btnOption1.setText("Cereal");

        btnOption2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        btnOption2.setText("Pancake");

        lblPrice1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lblPrice1.setText("$-.--");

        lblPrice2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lblPrice2.setText("$-.--");

        lblPrice3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        lblPrice3.setText("$-.--");

        btnSkip.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnSkip.setForeground(new java.awt.Color(204, 0, 0));
        btnSkip.setText("Skip");
        btnSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkipActionPerformed(evt);
            }
        });

        btnEnter.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnEnter.setText("ENTER");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        lblDay.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        lblDay.setText("DAY 1 BREAKFAST:");

        btnHomemade.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnHomemade.setForeground(new java.awt.Color(51, 153, 0));
        btnHomemade.setText("HOMEMADE");
        btnHomemade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomemadeActionPerformed(evt);
            }
        });

        lblStyle.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        lblStyle.setText("or");

        lblQuantity.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 10)); // NOI18N
        lblQuantity.setText("Quantity");

        lblOptions.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 10)); // NOI18N
        lblOptions.setText("Options");

        lblPrice.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 10)); // NOI18N
        lblPrice.setText("Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSkip)
                        .addGap(40, 40, 40)
                        .addComponent(btnEnter))
                    .addComponent(lblDay)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblPrice3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPrice2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPrice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOption2)
                            .addComponent(btnOption1)
                            .addComponent(btnOption3)
                            .addComponent(lblOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtOption2)
                                .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtOption1))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStoreBought)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblStyle)
                        .addGap(11, 11, 11)
                        .addComponent(btnHomemade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblReport)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(41, 41, 41))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDay, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnStoreBought)
                            .addComponent(btnHomemade)
                            .addComponent(lblStyle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuantity)
                            .addComponent(lblOptions)
                            .addComponent(lblPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOption1)
                                .addGap(18, 18, 18)
                                .addComponent(btnOption2)
                                .addGap(18, 18, 18)
                                .addComponent(btnOption3))
                            .addComponent(lblPrice1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtOption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrice2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrice3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEnter)
                            .addComponent(btnSkip))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addComponent(lblReport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStoreBoughtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoreBoughtActionPerformed
        //Modifies the style to 0 = Storebought
        intStyle = 0;
        //Changes the buttons to the appropriate names for store bought items
        btnOption1.setText(STRSTOREBOUGHTITEMSARR[0]);//Button 1 to item 1
        btnOption2.setText(STRSTOREBOUGHTITEMSARR[1]);//Button 2 to item 2
        btnOption3.setText(STRSTOREBOUGHTITEMSARR[2]);//Button 3 to item 3
        
        //Changes the price to the appropriate prices for store bought items
        lblPrice1.setText(String.valueOf(DBLSTOREBOUGHTPRICES[0]));//price 1 to label 1
        lblPrice2.setText(String.valueOf(DBLSTOREBOUGHTPRICES[1]));//price 2 to label 2
        lblPrice3.setText(String.valueOf(DBLSTOREBOUGHTPRICES[2]));//price 3 to label 3
    }//GEN-LAST:event_btnStoreBoughtActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        //Checks if the day is 1-7
        if (intDay < 7)
        {
            //adds 1 to the day (moving time forward by 1)
            intDay ++;

            //Reads the quantity of each item from the corresponding textbox and stores it in an array
            intItemQuantityArr[0] = Integer.parseInt(txtOption1.getText());//index 0 to txtOption1
            intItemQuantityArr[1] = Integer.parseInt(txtOption2.getText());//index 1 to txtOption2
            intItemQuantityArr[2] = Integer.parseInt(txtOption3.getText());//index 2 to txtOption3
            
            //Checks if the style is store bought (gives different arguements)
            if(intStyle == 0)
            {
                //Call method to give the total cost of that day's breakfast using (DBLSTOREBOUGHTPRICES)
                dblDailyCostTotalArr = getOptionPrices(intItemQuantityArr, DBLSTOREBOUGHTPRICES);
                //Call method to give total nutrients of that day's breakfast using (DBLSTOREBOUGHTFIBERGRAMS, DBLSTOREBOUGHTPROTEINGRAMS, DBLSTOREBOUGHTCALORIES)
                dblDailyNutritionTotalArr = getOptionNutrition(intItemQuantityArr, DBLSTOREBOUGHTFIBERGRAMS, DBLSTOREBOUGHTPROTEINGRAMS, DBLSTOREBOUGHTCALORIES);
            }
            else//if the style is homemade (intStyle == 1)
            {
                //Call method to give the total cost of that day's breakfast using (DBLHOMEMADEPRICES)
                dblDailyCostTotalArr = getOptionPrices(intItemQuantityArr, DBLHOMEMADEPRICES);
                //Call method to give total nutrients of that day's breakfast using (DBLHOMEMADEFIBERGRAMS, DBLHOMEMADEPROTEINGRAMS, DBLHOMEMADECALORIE)       
                dblDailyNutritionTotalArr = getOptionNutrition(intItemQuantityArr, DBLHOMEMADEFIBERGRAMS, DBLHOMEMADEPROTEINGRAMS, DBLHOMEMADECALORIE);
            }
            
            //Call method to display daily report
            txtReport.setText(printDailyReport(intDay, intStyle, intItemQuantityArr, dblDailyCostTotalArr, dblDailyNutritionTotalArr, STRHOMEMADEITEMSARR, STRSTOREBOUGHTITEMSARR));
            //Call method to add the day's cost to total
            dblCostTotal = addPriceToTotal(dblCostTotal, dblDailyCostTotalArr);
            //Call method to add the day's nutrients to the total
            dblNutritionTotalArr = addNutritionToTotal(dblNutritionTotalArr, dblDailyNutritionTotalArr);
        }
        else//If it is the 8th day
        {
            //Call method to display final report
            txtReport.setText(printFinalReport(dblCostTotal, dblNutritionTotalArr));
        }
        
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnOption3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOption3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOption3ActionPerformed

    private void txtOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOption1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOption1ActionPerformed

    private void btnHomemadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomemadeActionPerformed
        //Modifies the style to 1 = Homemade
        intStyle = 1;
        //Changes the buttons to the appropriate names for homemade items        
        btnOption1.setText(STRHOMEMADEITEMSARR[0]);//Button 1 to item 1
        btnOption2.setText(STRHOMEMADEITEMSARR[1]);//Button 2 to item 2
        btnOption3.setText(STRHOMEMADEITEMSARR[2]);//Button 3 to item 3

        //Changes the price to the appropriate prices for homemade items        
        lblPrice1.setText(String.valueOf(DBLHOMEMADEPRICES[0]));//price 1 to label 1
        lblPrice2.setText(String.valueOf(DBLHOMEMADEPRICES[1]));//price 2 to label 2
        lblPrice3.setText(String.valueOf(DBLHOMEMADEPRICES[2]));//price 3 to label 3
    }//GEN-LAST:event_btnHomemadeActionPerformed

    private void btnSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkipActionPerformed
        //Checks if the day is 1-7        
        if(intDay < 7)
        {      
            //adds 1 to the day (moving time forward by 1)
            intDay++;
            
            //Loops through each index in the daily cost array            
            for(int i = 0; i < dblDailyCostTotalArr.length; i++)
            {
                //Sets each item to zero
                dblDailyCostTotalArr[i] = 0;
            }

            //Loops through each index in the daily nutrition array
            for(int i = 0; i < dblDailyNutritionTotalArr.length; i++)
            {
                //Sets each item to zero
                dblDailyNutritionTotalArr[i] = 0;
            }
            //Call method to display daily report
            txtReport.setText(printDailyReport(intDay, intStyle, intItemQuantityArr, dblDailyCostTotalArr, dblDailyNutritionTotalArr, STRHOMEMADEITEMSARR, STRSTOREBOUGHTITEMSARR));
        }
        else//If it is the 8th day
        {
            //Call method to display final report            
            txtReport.setText(printFinalReport(dblCostTotal, dblNutritionTotalArr));
        }
    }//GEN-LAST:event_btnSkipActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmU3Summative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmU3Summative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmU3Summative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmU3Summative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmU3Summative().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnHomemade;
    private javax.swing.JButton btnOption1;
    private javax.swing.JButton btnOption2;
    private javax.swing.JButton btnOption3;
    private javax.swing.JButton btnSkip;
    private javax.swing.JButton btnStoreBought;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblOptions;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblPrice1;
    private javax.swing.JLabel lblPrice2;
    private javax.swing.JLabel lblPrice3;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblReport;
    private javax.swing.JLabel lblStyle;
    private javax.swing.JTextField txtOption1;
    private javax.swing.JTextField txtOption2;
    private javax.swing.JTextField txtOption3;
    private javax.swing.JTextArea txtReport;
    // End of variables declaration//GEN-END:variables
}
