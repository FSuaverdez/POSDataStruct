
import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.*;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Cashier extends javax.swing.JFrame {

    public Cashier() {
        initComponents();
        this.setLocationRelativeTo(null);
        burgerScrollPane.setVisible(false);
        friesScrollPane.setVisible(false);
        riceMealsScrollPane.setVisible(false);
        drinksScrollPane.setVisible(false);
        burgerScrollPane.getVerticalScrollBar().setUnitIncrement(20);
        friesScrollPane.getVerticalScrollBar().setUnitIncrement(20);
        riceMealsScrollPane.getVerticalScrollBar().setUnitIncrement(20);
        drinksScrollPane.getVerticalScrollBar().setUnitIncrement(20);
        receiptArea.setText(receipt);
        
        
        list.insert("B01", "Classic Burger", 100001, 50.00);
        list.insert("B02", "Cheese Burger", 100002, 60.00);
        list.insert("B03", "Double Patty Burger", 100003, 120.00);
        list.insert("B04", "Triple Patty Burger", 100004, 180.00);
        list.insert("B05", "Chicken Burger", 100005, 50.00);
        list.insert("B06", "Veggie Burger", 100006, 50.00);
        list.insert("B07", "Egg n' Bacon Burger", 100007, 60.00);
        list.insert("B08", "Supreme Burger", 100008, 60.00);
        list.insert("F01", "Classic Fries", 200001, 30.00);
        list.insert("F02", "Chunky Fries", 200002, 40.00);
        list.insert("F03", "ShoeString Fries", 200003, 40.00);
        list.insert("F04", "Sweet Potato Fries", 200004, 40.00);
        list.insert("RC01", "Burger Steak", 300001, 50.00);
        list.insert("RC02", "2pc Burger Steak", 300002, 80.00);
        list.insert("CRC01", "BurgSteak Combo Meal", 300003, 100.00);
        list.insert("CRC02", "2pc BurgSteak Combo Meal", 300004, 160.00);
        list.insert("D1", "Regular Coke", 400001, 20.00);
        list.insert("D2", "Large Coke", 400002, 70.00);
        list.insert("D3", "Regular Iced Tea", 400003, 40.00);
        list.insert("D4", "Large Iced Tea", 400004, 70.00);
        list.insert("D5", "Bottomless Iced Tea", 400005, 70.00);

    }
    boolean order = false;
    double discount;
    boolean pending = false;
    boolean disc = false;
    LinkedList list = new LinkedList();
    double totalPrice = 0;
    double totalChange = 0;
    double classicBurgerPrice = 0;
    double chickenBurgerPrice = 0;
    double cheeseBurgerPrice = 0;
    double veggieBurgerPrice = 0;
    double doublePattyBurgerPrice = 0;
    double eggBaconBurgerPrice = 0;
    double triplePattyBurgerPrice = 0;
    double supremeBurgerPrice = 0;
    double classicFriesPrice = 0;
    double chunkyFriesPrice = 0;
    double shoestringFriesPrice = 0;
    double sweetpotatoFriesPrice = 0;
    double burgerSteakPrice = 0;
    double burgerSteak2Price = 0;
    double burgSteakCMPrice = 0;
    double burgSteak2CMPrice = 0;
    double regularCokePrice = 0;
    double largeCokePrice = 0;
    double regularIcedTeaPrice = 0;
    double largeIcedTeaPrice = 0;
    double bottomlessIcedTeaPrice = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        logOutButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receiptArea = new javax.swing.JTextArea();
        burgerScrollPane = new javax.swing.JScrollPane();
        burgersPane = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cheeseBurgerSpinner = new javax.swing.JSpinner();
        classicBurgerSpinner = new javax.swing.JSpinner();
        doublePattyBurgerSpinner = new javax.swing.JSpinner();
        triplePattyBurgerSpinner = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        veggieBurgerSpinner = new javax.swing.JSpinner();
        chickenBurgerSpinner = new javax.swing.JSpinner();
        eggBaconBurgerSpinner = new javax.swing.JSpinner();
        supremeBurgerSpinner = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        asfasf = new javax.swing.JLabel();
        afafasfasfa = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        friesScrollPane = new javax.swing.JScrollPane();
        friesPane = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        classicFriesSpinner = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        chunkyFriesSpinner = new javax.swing.JSpinner();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        shoeStringSpinner = new javax.swing.JSpinner();
        sweetPotatoSpinner = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        riceMealsScrollPane = new javax.swing.JScrollPane();
        riceMeals = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        burgerSteakSpinner2 = new javax.swing.JSpinner();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        burgSteakCMSpinner2 = new javax.swing.JSpinner();
        jPanel9 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        burgerSteakSpinner = new javax.swing.JSpinner();
        jPanel10 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        burgSteakCMSpinner = new javax.swing.JSpinner();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        drinksScrollPane = new javax.swing.JScrollPane();
        drinksPane = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        regularCokeSpinner = new javax.swing.JSpinner();
        jPanel19 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        largeCokeSpinner = new javax.swing.JSpinner();
        jPanel20 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        regularIcedTeaSpinner = new javax.swing.JSpinner();
        jPanel22 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        largeIcedTeaSpinner = new javax.swing.JSpinner();
        jPanel23 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        bottomlessIcedTeaSpinner = new javax.swing.JSpinner();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        totalPriceField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ammountPaid = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        changeTextField = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        discountComboBox = new javax.swing.JComboBox<>();
        manualOrderIDCode = new javax.swing.JTextField();
        manualOrderSpinner = new javax.swing.JSpinner();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        cancelOrderIDCode = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SUABURGERS POSSYSTEM");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.setMaximumSize(new java.awt.Dimension(218, 83));
        jPanel4.setName(""); // NOI18N
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BURGERS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 190, -1));

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel14.setMaximumSize(new java.awt.Dimension(218, 83));
        jPanel14.setName(""); // NOI18N
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel14MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FRIES");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 190, -1));

        jPanel15.setBackground(new java.awt.Color(0, 0, 0));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.setMaximumSize(new java.awt.Dimension(218, 83));
        jPanel15.setName(""); // NOI18N
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel15MousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RICE MEALS");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 190, -1));

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel16.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel16.setMaximumSize(new java.awt.Dimension(218, 83));
        jPanel16.setName(""); // NOI18N
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel16MousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DRINKS");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 190, -1));

        logOutButton.setBackground(new java.awt.Color(0, 0, 0));
        logOutButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        logOutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutButton.setMaximumSize(new java.awt.Dimension(218, 83));
        logOutButton.setName(""); // NOI18N
        logOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutButtonMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LOGOUT");

        javax.swing.GroupLayout logOutButtonLayout = new javax.swing.GroupLayout(logOutButton);
        logOutButton.setLayout(logOutButtonLayout);
        logOutButtonLayout.setHorizontalGroup(
            logOutButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOutButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logOutButtonLayout.setVerticalGroup(
            logOutButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logOutButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel1.add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 90, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        receiptArea.setColumns(20);
        receiptArea.setRows(5);
        jScrollPane1.setViewportView(receiptArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 380, 340, 270));

        burgerScrollPane.setBackground(new java.awt.Color(0, 0, 0));
        burgerScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 5));
        burgerScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        burgerScrollPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        burgerScrollPane.setPreferredSize(new java.awt.Dimension(670, 513));

        burgersPane.setMaximumSize(new java.awt.Dimension(670, 680));
        burgersPane.setMinimumSize(new java.awt.Dimension(670, 680));
        burgersPane.setPreferredSize(new java.awt.Dimension(670, 900));
        burgersPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        jLabel7.setText("BURGERS");
        burgersPane.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        cheeseBurgerSpinner.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        cheeseBurgerSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        cheeseBurgerSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cheeseBurgerSpinnerStateChanged(evt);
            }
        });
        burgersPane.add(cheeseBurgerSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 60, -1));

        classicBurgerSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        classicBurgerSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                classicBurgerSpinnerStateChanged(evt);
            }
        });
        burgersPane.add(classicBurgerSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 60, -1));

        doublePattyBurgerSpinner.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        doublePattyBurgerSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        doublePattyBurgerSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                doublePattyBurgerSpinnerStateChanged(evt);
            }
        });
        burgersPane.add(doublePattyBurgerSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 660, 60, -1));

        triplePattyBurgerSpinner.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        triplePattyBurgerSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        triplePattyBurgerSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                triplePattyBurgerSpinnerStateChanged(evt);
            }
        });
        burgersPane.add(triplePattyBurgerSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 870, 60, -1));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel6.setText("Classic Burger");
        burgersPane.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel11.setText("Cheese Burger");
        burgersPane.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel12.setText("Double Patty Burger");
        burgersPane.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, -1, -1));

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel13.setText("Triple Patty Burger");
        burgersPane.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 840, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        burgersPane.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        burgersPane.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, -1));

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        burgersPane.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        burgersPane.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 720, -1, -1));

        veggieBurgerSpinner.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        veggieBurgerSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        veggieBurgerSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                veggieBurgerSpinnerStateChanged(evt);
            }
        });
        burgersPane.add(veggieBurgerSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 60, -1));

        chickenBurgerSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        chickenBurgerSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chickenBurgerSpinnerStateChanged(evt);
            }
        });
        burgersPane.add(chickenBurgerSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 60, -1));

        eggBaconBurgerSpinner.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        eggBaconBurgerSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        eggBaconBurgerSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                eggBaconBurgerSpinnerStateChanged(evt);
            }
        });
        burgersPane.add(eggBaconBurgerSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 660, 60, -1));

        supremeBurgerSpinner.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        supremeBurgerSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        supremeBurgerSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                supremeBurgerSpinnerStateChanged(evt);
            }
        });
        burgersPane.add(supremeBurgerSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 870, 60, -1));

        jLabel18.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel18.setText("Chicken Burger");
        burgersPane.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        jLabel19.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel19.setText("Veggie Burger");
        burgersPane.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        asfasf.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        asfasf.setText("Egg n’ Bacon Burger");
        burgersPane.add(asfasf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, -1, -1));

        afafasfasfa.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        afafasfasfa.setText("Supreme Burger");
        burgersPane.add(afafasfasfa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 840, -1, -1));

        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        burgersPane.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        burgersPane.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, -1, -1));

        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        burgersPane.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        burgersPane.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 720, -1, -1));

        jLabel39.setText("100002");
        burgersPane.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        jLabel41.setText("100005");
        burgersPane.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        jLabel42.setText("100006");
        burgersPane.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        jLabel43.setText("100007");
        burgersPane.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        jLabel44.setText("100008");
        burgersPane.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 700, -1, -1));

        jLabel45.setText("100004");
        burgersPane.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 700, -1, -1));

        jLabel46.setText("100003");
        burgersPane.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));

        jLabel40.setText("100001");
        burgersPane.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        burgerScrollPane.setViewportView(burgersPane);

        jPanel1.add(burgerScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 670, 513));

        friesScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 5));
        friesScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        friesScrollPane.setPreferredSize(new java.awt.Dimension(670, 513));

        friesPane.setMaximumSize(new java.awt.Dimension(670, 513));
        friesPane.setMinimumSize(new java.awt.Dimension(670, 513));
        friesPane.setPreferredSize(new java.awt.Dimension(670, 513));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        jLabel8.setText("FRIES");

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel17.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel17.setText("Classic Fries");

        classicFriesSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        classicFriesSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                classicFriesSpinnerStateChanged(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel20.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel20.setText("Chunky Fries");

        chunkyFriesSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        chunkyFriesSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chunkyFriesSpinnerStateChanged(evt);
            }
        });

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel21.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel21.setText("ShoeString Fries");

        shoeStringSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        shoeStringSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                shoeStringSpinnerStateChanged(evt);
            }
        });

        sweetPotatoSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        sweetPotatoSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sweetPotatoSpinnerStateChanged(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel22.setText("Sweet Potato Fries");

        jLabel47.setText("200001");

        jLabel48.setText("100001");

        jLabel49.setText("200002");

        jLabel50.setText("200004");

        javax.swing.GroupLayout friesPaneLayout = new javax.swing.GroupLayout(friesPane);
        friesPane.setLayout(friesPaneLayout);
        friesPaneLayout.setHorizontalGroup(
            friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(friesPaneLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(friesPaneLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel20)
                        .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(friesPaneLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(chunkyFriesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(friesPaneLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17)))
                    .addGroup(friesPaneLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(classicFriesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(173, 173, 173)
                .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(friesPaneLayout.createSequentialGroup()
                            .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(friesPaneLayout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, friesPaneLayout.createSequentialGroup()
                                .addComponent(sweetPotatoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, friesPaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, friesPaneLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, friesPaneLayout.createSequentialGroup()
                                .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel50)
                                    .addComponent(shoeStringSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)))))
                .addGap(117, 117, 117))
            .addGroup(friesPaneLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(friesPaneLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addGap(175, 175, 175))
        );
        friesPaneLayout.setVerticalGroup(
            friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(friesPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(friesPaneLayout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shoeStringSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sweetPotatoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(friesPaneLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classicFriesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chunkyFriesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        friesScrollPane.setViewportView(friesPane);

        jPanel1.add(friesScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 670, 513));

        riceMealsScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 5));
        riceMealsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        riceMealsScrollPane.setPreferredSize(new java.awt.Dimension(670, 513));

        riceMeals.setMaximumSize(new java.awt.Dimension(670, 513));
        riceMeals.setMinimumSize(new java.awt.Dimension(670, 513));
        riceMeals.setPreferredSize(new java.awt.Dimension(670, 513));
        riceMeals.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        jLabel9.setText("RICE MEALS");
        riceMeals.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        riceMeals.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        jLabel24.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel24.setText("Burger Steak");
        riceMeals.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        burgerSteakSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        burgerSteakSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                burgerSteakSpinner2StateChanged(evt);
            }
        });
        riceMeals.add(burgerSteakSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 60, -1));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        riceMeals.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        jLabel25.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel25.setText("BurgSteak Combo Meal");
        riceMeals.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        burgSteakCMSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        burgSteakCMSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                burgSteakCMSpinner2StateChanged(evt);
            }
        });
        riceMeals.add(burgSteakCMSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 60, -1));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        riceMeals.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jLabel26.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel26.setText("2pc BurgSteak Combo Meal");
        riceMeals.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, -1, -1));

        burgerSteakSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        burgerSteakSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                burgerSteakSpinnerStateChanged(evt);
            }
        });
        riceMeals.add(burgerSteakSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 60, -1));

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        riceMeals.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel27.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel27.setText("2pc Burger Steak");
        riceMeals.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        burgSteakCMSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        burgSteakCMSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                burgSteakCMSpinnerStateChanged(evt);
            }
        });
        riceMeals.add(burgSteakCMSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 60, -1));

        jLabel51.setText("300002");
        riceMeals.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLabel52.setText("300003");
        riceMeals.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        jLabel53.setText("300001");
        riceMeals.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel54.setText("300003");
        riceMeals.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        riceMealsScrollPane.setViewportView(riceMeals);

        jPanel1.add(riceMealsScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 670, 513));

        drinksScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 5));
        drinksScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        drinksScrollPane.setPreferredSize(new java.awt.Dimension(670, 513));

        drinksPane.setMaximumSize(new java.awt.Dimension(670, 710));
        drinksPane.setMinimumSize(new java.awt.Dimension(670, 710));
        drinksPane.setPreferredSize(new java.awt.Dimension(670, 710));
        drinksPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel10.setText("DRINKS");
        drinksPane.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 13, -1, -1));

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        drinksPane.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel28.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel28.setText("Regular Coke");
        drinksPane.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        regularCokeSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        regularCokeSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                regularCokeSpinnerStateChanged(evt);
            }
        });
        drinksPane.add(regularCokeSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 60, -1));

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        drinksPane.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        jLabel29.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel29.setText("Large Coke");
        drinksPane.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));

        largeCokeSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        largeCokeSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                largeCokeSpinnerStateChanged(evt);
            }
        });
        drinksPane.add(largeCokeSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 60, -1));

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        drinksPane.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        jLabel30.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel30.setText("Regular Iced Tea");
        drinksPane.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        regularIcedTeaSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        regularIcedTeaSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                regularIcedTeaSpinnerStateChanged(evt);
            }
        });
        drinksPane.add(regularIcedTeaSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 60, -1));

        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        drinksPane.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        jLabel31.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel31.setText("Large Iced Tea");
        drinksPane.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, -1));

        largeIcedTeaSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        largeIcedTeaSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                largeIcedTeaSpinnerStateChanged(evt);
            }
        });
        drinksPane.add(largeIcedTeaSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 60, -1));

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        drinksPane.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        jLabel32.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel32.setText("Bottomless Iced Tea");
        drinksPane.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, -1, -1));

        bottomlessIcedTeaSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        bottomlessIcedTeaSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bottomlessIcedTeaSpinnerStateChanged(evt);
            }
        });
        drinksPane.add(bottomlessIcedTeaSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, 60, -1));

        jLabel55.setText("400001");
        drinksPane.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jLabel56.setText("400002");
        drinksPane.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel57.setText("400003");
        drinksPane.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        jLabel58.setText("400004");
        drinksPane.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        jLabel59.setText("400005");
        drinksPane.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, -1, -1));

        drinksScrollPane.setViewportView(drinksPane);

        jPanel1.add(drinksScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 670, 513));

        jButton1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton1.setText("VOID ALL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 80, 110, 40));

        totalPriceField.setEditable(false);
        totalPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceFieldActionPerformed(evt);
            }
        });
        jPanel1.add(totalPriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 220, 100, -1));

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("DISCOUNT:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 150, -1, -1));

        ammountPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ammountPaidActionPerformed(evt);
            }
        });
        jPanel1.add(ammountPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, 100, -1));

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("AMOUNT PAID");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 260, -1, 20));

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CHANGE:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 320, -1, -1));

        changeTextField.setEditable(false);
        changeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(changeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 340, 100, -1));

        calculateButton.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        calculateButton.setText("CALCULATE");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });
        calculateButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calculateButtonKeyPressed(evt);
            }
        });
        jPanel1.add(calculateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, 110, 50));

        jButton4.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jButton4.setText("PAY");
        jButton4.setPreferredSize(new java.awt.Dimension(107, 23));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 310, 70, 40));

        jButton2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 670, -1, -1));

        jLabel23.setFont(new java.awt.Font("Bahnschrift", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("TOTAL PRICE:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 200, -1, -1));

        discountComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Senior Citizen", "PWD" }));
        discountComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                discountComboBoxItemStateChanged(evt);
            }
        });
        jPanel1.add(discountComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 170, 100, -1));

        manualOrderIDCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                manualOrderIDCodeKeyPressed(evt);
            }
        });
        jPanel1.add(manualOrderIDCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 100, 30));

        manualOrderSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(manualOrderSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 50, 30));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("MANUAL ORDER");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("QTY:");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("ITEM CODE:");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jButton3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton3.setText("CANCEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 80, 100, 40));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("CANCEL ORDER");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("ITEM CODE:");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, -1, -1));

        cancelOrderIDCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderIDCodeActionPerformed(evt);
            }
        });
        jPanel1.add(cancelOrderIDCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 100, 30));

        jButton5.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton5.setText("ADD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 90, 40));

        jButton6.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jButton6.setText("PRINT RECEIPT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 670, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseClicked

        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutButtonMouseClicked

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:
        burgerScrollPane.setVisible(false);
        friesScrollPane.setVisible(false);
        riceMealsScrollPane.setVisible(false);
        drinksScrollPane.setVisible(false);
        burgerScrollPane.setVisible(true);

    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MousePressed
        // TODO add your handling code here:
        burgerScrollPane.setVisible(false);
        friesScrollPane.setVisible(false);
        riceMealsScrollPane.setVisible(false);
        drinksScrollPane.setVisible(false);
        friesScrollPane.setVisible(true);
    }//GEN-LAST:event_jPanel14MousePressed

    private void jPanel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MousePressed
        // TODO add your handling code here:
        burgerScrollPane.setVisible(false);
        friesScrollPane.setVisible(false);
        riceMealsScrollPane.setVisible(false);
        drinksScrollPane.setVisible(false);
        riceMealsScrollPane.setVisible(true);
    }//GEN-LAST:event_jPanel15MousePressed

    private void jPanel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MousePressed
        // TODO add your handling code here:
        burgerScrollPane.setVisible(false);
        friesScrollPane.setVisible(false);
        riceMealsScrollPane.setVisible(false);
        drinksScrollPane.setVisible(false);
        drinksScrollPane.setVisible(true);
    }//GEN-LAST:event_jPanel16MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane jop = new JOptionPane();
        jop.setMessageType(JOptionPane.PLAIN_MESSAGE);

        JDialog dialog = jop.createDialog(null, "Insert Flash Drive");

        dialog.setSize(400, 150);
        dialog.setLocationRelativeTo(null);
        // Set a 2 second timer
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I"};
                    File[] drives = new File[letters.length];
                    boolean[] isDrive = new boolean[letters.length];
                    String text = "";
                    boolean stop = false;
                    int j = 15;
                    jop.setMessage("Insert Flash Drive that contains void key.\nExiting in " + j + " seconds.");
                    // init the file objects and the initial drive state
                    for (int i = 0; i < letters.length; ++i) {
                        drives[i] = new File(letters[i] + ":/");

                        isDrive[i] = drives[i].canRead();
                    }

                    // loop indefinitely
                    while (!stop) {

                        // check each drive 
                        for (int i = 0; i < letters.length; ++i) {
                            boolean pluggedIn = drives[i].canRead();

                            // if the state has changed output a message
                            if (pluggedIn != isDrive[i]) {
                                if (pluggedIn) {

                                    FileReader file = new FileReader(letters[i] + ":/suaburgers.txt");
                                    BufferedReader reader = new BufferedReader(file);
                                    String line = reader.readLine();
                                    while (line != null) {
                                        text += line;
                                        line = reader.readLine();
                                    }
                                    String password = "ourburgeristhebest";
                                    if (text.equals(password)) {
                                        jop.setMessage("Void Complete");
                                        pending = false;
                                        totalPrice = 0;
                                        receiptArea.setText(receipt);
                                        reader.close();
                                        stop = true;
                                    }

                                } else {
                                    text = "";
                                }
                                isDrive[i] = pluggedIn;
                            }
                        }

                        // wait before looping
                        try {
                            Thread.sleep(1000);
                            j--;
                            jop.setMessage("Insert Flash Drive that contains void key.\nExiting in " + j + " seconds.");
                        } catch (InterruptedException e) {
                            /* do nothing */ }
                        if (j == 0) {
                            stop = true;
                        }
                    }

                } catch (Exception e) {
                }
                dialog.dispose();
            }

        }).start();

        dialog.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_jButton1KeyPressed

    private void classicBurgerSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_classicBurgerSpinnerStateChanged
        // TODO add your handling code here:

        int qty = 0;
        classicBurgerPrice = list.search("B01");
        qty = (int) classicBurgerSpinner.getValue();
        classicBurgerPrice = classicBurgerPrice * qty;


    }//GEN-LAST:event_classicBurgerSpinnerStateChanged

    private void totalPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPriceFieldActionPerformed

    private void ammountPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ammountPaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ammountPaidActionPerformed

    private void changeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_changeTextFieldActionPerformed
    String receipt = "***************************************************************"
            + "\n                           SUABURGERS"
            + "\n***************************************************************\n";

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // TODO add your handling code here:
        changeTextField.setText("");
        if (pending == false || ((pending == true) && totalPrice == 0)) {
            pending = true;
            
            String classicBurgerReceipt;
            String chickenBurgerReceipt;
            String cheeseBurgerReceipt;
            String veggieBurgerReceipt;
            String doublePattyBurgerReceipt;
            String triplePattyBurgerReceipt;
            String eggBaconBurgerReceipt;
            String supremeBurgerReceipt;
            String classicFriesReceipt;
            String chunkyFriesReceipt;
            String shoestringFriesReceipt;
            String sweetpotatoFriesReceipt;
            String burgSteakReceipt;
            String burgSteak2Receipt;
            String burgSteakCMReceipt;
            String burgSteakCM2Receipt;
            String regularCokeReceipt;
            String largeCokeReceipt;
            String regularIcedTeaReceipt;
            String largeIcedTeaReceipt;
            String bottomlessIcedTeaReceipt;
            totalPrice = totalPrice+classicBurgerPrice + chickenBurgerPrice + cheeseBurgerPrice + veggieBurgerPrice + doublePattyBurgerPrice + triplePattyBurgerPrice + eggBaconBurgerPrice + supremeBurgerPrice;
            totalPrice = totalPrice + classicFriesPrice + chunkyFriesPrice + shoestringFriesPrice + sweetpotatoFriesPrice;
            totalPrice = totalPrice + burgerSteakPrice + burgerSteak2Price + burgSteakCMPrice + burgSteak2CMPrice;
            totalPrice = totalPrice + regularCokePrice + largeCokePrice + regularIcedTeaPrice + largeIcedTeaPrice + bottomlessIcedTeaPrice;
            //receiptArea.setText("**************************************************\n");
            //receiptArea.setText(receiptArea.getText() + "*                          SUABURGERS                          *\n");
            //receiptArea.setText(receiptArea.getText() + "**************************************************\n");
            if (classicBurgerPrice > 0) {
                classicBurgerReceipt = "\nClassic Burger\t\t\t" + classicBurgerPrice;
                receiptArea.setText(receiptArea.getText() + classicBurgerReceipt);

            }

            if (chickenBurgerPrice > 0) {
                chickenBurgerReceipt = "\nChicken Brgr\t\t\t" + chickenBurgerPrice;
                receiptArea.setText(receiptArea.getText() + chickenBurgerReceipt);

            }

            if (cheeseBurgerPrice > 0) {
                cheeseBurgerReceipt = "\nCheese Brgr\t\t\t" + cheeseBurgerPrice;
                receiptArea.setText(receiptArea.getText() + cheeseBurgerReceipt);

            }

            if (veggieBurgerPrice > 0) {
                veggieBurgerReceipt = "\nVeggie Burger\t\t\t" + veggieBurgerPrice;
                receiptArea.setText(receiptArea.getText() + veggieBurgerReceipt);

            }

            if (doublePattyBurgerPrice > 0) {
                doublePattyBurgerReceipt = "\nDouble Patty Burger\t\t" + doublePattyBurgerPrice;
                receiptArea.setText(receiptArea.getText() + doublePattyBurgerReceipt);

            }

            if (triplePattyBurgerPrice > 0) {
                triplePattyBurgerReceipt = "\nTriple Patty Burger\t\t" + triplePattyBurgerPrice;
                receiptArea.setText(receiptArea.getText() + triplePattyBurgerReceipt);

            }

            if (eggBaconBurgerPrice > 0) {
                eggBaconBurgerReceipt = "\nEgg Bacon Burger\t\t" + eggBaconBurgerPrice;
                receiptArea.setText(receiptArea.getText() + eggBaconBurgerReceipt);

            }

            if (supremeBurgerPrice > 0) {
                supremeBurgerReceipt = "\nSupreme Burger\t\t" + supremeBurgerPrice;
                receiptArea.setText(receiptArea.getText() + supremeBurgerReceipt);

            }

            if (classicFriesPrice > 0) {
                classicFriesReceipt = "\nClassic Fries\t\t\t" + classicFriesPrice;
                receiptArea.setText(receiptArea.getText() + classicFriesReceipt);

            }

            if (chunkyFriesPrice > 0) {
                chunkyFriesReceipt = "\nChunky Fries\t\t\t" + chunkyFriesPrice;
                receiptArea.setText(receiptArea.getText() + chunkyFriesReceipt);

            }

            if (shoestringFriesPrice > 0) {
                shoestringFriesReceipt = "\nShoeString Fries\t\t" + shoestringFriesPrice;
                receiptArea.setText(receiptArea.getText() + shoestringFriesReceipt);

            }

            if (sweetpotatoFriesPrice > 0) {
                sweetpotatoFriesReceipt = "\nSweet Potato Fries\t\t" + sweetpotatoFriesPrice;
                receiptArea.setText(receiptArea.getText() + sweetpotatoFriesReceipt);

            }

            if (burgerSteakPrice > 0) {
                burgSteakReceipt = "\nBurger Steak\t\t\t" + burgerSteakPrice;
                receiptArea.setText(receiptArea.getText() + burgSteakReceipt);

            }

            if (burgerSteak2Price > 0) {
                burgSteak2Receipt = "\n2 pcs. Burger Steak\t\t" + burgerSteak2Price;
                receiptArea.setText(receiptArea.getText() + burgSteak2Receipt);

            }

            if (burgSteakCMPrice > 0) {
                burgSteakCMReceipt = "\nBurger Steak Combo Meal\t\t" + burgSteakCMPrice;
                receiptArea.setText(receiptArea.getText() + burgSteakCMReceipt);

            }

            if (burgSteak2CMPrice > 0) {
                burgSteakCM2Receipt = "\n2pc BurgSteak Combo Meal\t\t" + burgSteak2CMPrice;
                receiptArea.setText(receiptArea.getText() + burgSteakCM2Receipt);

            }

            if (regularCokePrice > 0) {
                regularCokeReceipt = "\nRegular Coke\t\t\t" + regularCokePrice;
                receiptArea.setText(receiptArea.getText() + regularCokeReceipt);

            }
            if (largeCokePrice > 0) {
                largeCokeReceipt = "\nLarge Coke\t\t\t" + largeCokePrice;
                receiptArea.setText(receiptArea.getText() + largeCokeReceipt);

            }
            if (regularIcedTeaPrice > 0) {
                regularIcedTeaReceipt = "\nRegular Iced Tea\t\t" + regularIcedTeaPrice;
                receiptArea.setText(receiptArea.getText() + regularIcedTeaReceipt);

            }
            if (largeIcedTeaPrice > 0) {
                largeIcedTeaReceipt = "\nLarge IcdTea\t\t\t" + largeIcedTeaPrice;
                receiptArea.setText(receiptArea.getText() + largeIcedTeaReceipt);

            }

            if (bottomlessIcedTeaPrice > 0) {
                bottomlessIcedTeaReceipt = "\nBottomless Iced Tea\t\t" + bottomlessIcedTeaPrice;
                receiptArea.setText(receiptArea.getText() + bottomlessIcedTeaReceipt);

            }
            
            if (discountComboBox.getSelectedIndex() == 1 || discountComboBox.getSelectedIndex() == 2) {
                String totalPriceFieldText = Double.toString(discount);
                totalPriceField.setText(totalPriceFieldText);
            } else {
                String totalPriceFieldText = Double.toString(totalPrice);
                totalPriceField.setText(totalPriceFieldText);
            }



        } else {
            if (totalPrice > 0) {
                JOptionPane.showMessageDialog(null, "There is a pending Order!");
            } else {
                pending = false;
            }

        }


    }//GEN-LAST:event_calculateButtonActionPerformed

    private void calculateButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calculateButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_calculateButtonKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        double pay = 0;
        if (pending) {
            pay = Double.parseDouble(ammountPaid.getText());
        }

        if (totalPrice > pay && disc!= true) {
            JOptionPane.showMessageDialog(null, "ERROR: Ammount Paid is less than Total Price\nPlease Try again with the right ammount.");
        } else {
            pending = false;
            order = false;
            if (discountComboBox.getSelectedIndex() == 1 || discountComboBox.getSelectedIndex() == 2) {
                totalPrice=discount;
                String totalPriceReceipt = "\n\nTotal Amount (20%)Discount\t\t" + discount;
                receiptArea.setText(receiptArea.getText() + totalPriceReceipt);
                String totalPriceFieldText = Double.toString(totalPrice);
                totalPriceField.setText(totalPriceFieldText);
                
            } else {
                String totalPriceReceipt = "\n\nTotal Amount\t\t\t" + totalPrice;
                receiptArea.setText(receiptArea.getText() + totalPriceReceipt);
                String totalPriceFieldText = Double.toString(totalPrice);
                totalPriceField.setText(totalPriceFieldText);
            }
            discountComboBox.setSelectedIndex(0);

                totalChange = Double.parseDouble(ammountPaid.getText()) - totalPrice;
            
            
            String ammoundPaidReceipt = "\nAmmount Paid\t\t\t" + Double.parseDouble(ammountPaid.getText());
            String totalChangeReceipt = "\nChange\t\t\t" + totalChange;
            receiptArea.setText(receiptArea.getText() + ammoundPaidReceipt);
            receiptArea.setText(receiptArea.getText() + totalChangeReceipt);
            String totalChangeText = Double.toString(totalChange);
            disc=false;
            changeTextField.setText(totalChangeText);
            totalPriceField.setText("");
            classicBurgerSpinner.setValue(0);
            bottomlessIcedTeaSpinner.setValue(0);
            largeIcedTeaSpinner.setValue(0);
            regularIcedTeaSpinner.setValue(0);
            largeCokeSpinner.setValue(0);
            regularCokeSpinner.setValue(0);
            burgSteakCMSpinner2.setValue(0);
            burgSteakCMSpinner.setValue(0);
            burgerSteakSpinner2.setValue(0);
            sweetPotatoSpinner.setValue(0);
            shoeStringSpinner.setValue(0);
            chunkyFriesSpinner.setValue(0);
            classicFriesSpinner.setValue(0);
            supremeBurgerSpinner.setValue(0);
            eggBaconBurgerSpinner.setValue(0);
            triplePattyBurgerSpinner.setValue(0);
            doublePattyBurgerSpinner.setValue(0);
            veggieBurgerSpinner.setValue(0);
            cheeseBurgerSpinner.setValue(0);
            burgerSteakSpinner.setValue(0);
            chickenBurgerSpinner.setValue(0);
            totalPrice=0;
            ammountPaid.setText("");
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4KeyPressed

    private void cheeseBurgerSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cheeseBurgerSpinnerStateChanged
        // TODO add your handling code here:

        int qty;
        cheeseBurgerPrice = list.search("B02");
        qty = (int) cheeseBurgerSpinner.getValue();
        cheeseBurgerPrice = cheeseBurgerPrice * qty;


    }//GEN-LAST:event_cheeseBurgerSpinnerStateChanged

    private void chickenBurgerSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chickenBurgerSpinnerStateChanged
        // TODO add your handling code here:

        int qty;
        chickenBurgerPrice = list.search("B05");
        qty = (int) chickenBurgerSpinner.getValue();
        chickenBurgerPrice = chickenBurgerPrice * qty;


    }//GEN-LAST:event_chickenBurgerSpinnerStateChanged

    private void veggieBurgerSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_veggieBurgerSpinnerStateChanged
        // TODO add your handling code here:
        int qty;
        veggieBurgerPrice = list.search("B06");
        qty = (int) veggieBurgerSpinner.getValue();
        veggieBurgerPrice = veggieBurgerPrice * qty;
    }//GEN-LAST:event_veggieBurgerSpinnerStateChanged

    private void doublePattyBurgerSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_doublePattyBurgerSpinnerStateChanged
        // TODO add your handling code here:
        int qty;
        doublePattyBurgerPrice = list.search("B03");
        qty = (int) doublePattyBurgerSpinner.getValue();
        doublePattyBurgerPrice = doublePattyBurgerPrice * qty;
    }//GEN-LAST:event_doublePattyBurgerSpinnerStateChanged

    private void eggBaconBurgerSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_eggBaconBurgerSpinnerStateChanged
        // TODO add your handling code here:
        int qty;
        eggBaconBurgerPrice = list.search("B07");
        qty = (int) eggBaconBurgerSpinner.getValue();
        eggBaconBurgerPrice = eggBaconBurgerPrice * qty;
    }//GEN-LAST:event_eggBaconBurgerSpinnerStateChanged

    private void triplePattyBurgerSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_triplePattyBurgerSpinnerStateChanged
        // TODO add your handling code here:
        int qty;
        triplePattyBurgerPrice = list.search("B04");
        qty = (int) triplePattyBurgerSpinner.getValue();
        triplePattyBurgerPrice = triplePattyBurgerPrice * qty;
    }//GEN-LAST:event_triplePattyBurgerSpinnerStateChanged

    private void supremeBurgerSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_supremeBurgerSpinnerStateChanged
        // TODO add your handling code here:
        int qty;
        supremeBurgerPrice = list.search("B08");
        qty = (int) supremeBurgerSpinner.getValue();
        supremeBurgerPrice = supremeBurgerPrice * qty;
    }//GEN-LAST:event_supremeBurgerSpinnerStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(pending==true || order == true){
            JOptionPane.showMessageDialog(null,"ERROR: Cannot clear if there are pending orders.");
        }else{
            receiptArea.setText(receipt);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void classicFriesSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_classicFriesSpinnerStateChanged
        // TODO add your handling code here:
        int qty;
        classicFriesPrice = list.search("F01");
        qty = (int) classicFriesSpinner.getValue();
        classicFriesPrice = classicFriesPrice * qty;
    }//GEN-LAST:event_classicFriesSpinnerStateChanged

    private void chunkyFriesSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chunkyFriesSpinnerStateChanged
        // TODO add your handling code here:
        int qty;
        chunkyFriesPrice = list.search("F02");
        qty = (int) chunkyFriesSpinner.getValue();
        chunkyFriesPrice = chunkyFriesPrice * qty;
    }//GEN-LAST:event_chunkyFriesSpinnerStateChanged

    private void shoeStringSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_shoeStringSpinnerStateChanged
        // TODO add your handling code here:
        int qty;
        shoestringFriesPrice = list.search("F03");
        qty = (int) shoeStringSpinner.getValue();
        shoestringFriesPrice = shoestringFriesPrice * qty;
    }//GEN-LAST:event_shoeStringSpinnerStateChanged

    private void sweetPotatoSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sweetPotatoSpinnerStateChanged
        // TODO add your handling code here:
        int qty;
        sweetpotatoFriesPrice = list.search("F04");
        qty = (int) sweetPotatoSpinner.getValue();
        sweetpotatoFriesPrice = sweetpotatoFriesPrice * qty;
    }//GEN-LAST:event_sweetPotatoSpinnerStateChanged

    private void burgerSteakSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_burgerSteakSpinner2StateChanged
        // TODO add your handling code here:
        int qty;
        burgerSteak2Price = list.search("RC02");
        qty = (int) burgerSteakSpinner2.getValue();
        burgerSteak2Price = burgerSteak2Price * qty;
    }//GEN-LAST:event_burgerSteakSpinner2StateChanged

    private void burgSteakCMSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_burgSteakCMSpinner2StateChanged
        // TODO add your handling code here:
        int qty;
        burgSteak2CMPrice = list.search("CRC02");
        qty = (int) burgSteakCMSpinner2.getValue();
        burgSteak2CMPrice = burgSteak2CMPrice * qty;
    }//GEN-LAST:event_burgSteakCMSpinner2StateChanged

    private void burgerSteakSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_burgerSteakSpinnerStateChanged
        // TODO add your handling code here:
        int qty;
        burgerSteakPrice = list.search("RC01");
        qty = (int) burgerSteakSpinner.getValue();
        burgerSteakPrice = burgerSteakPrice * qty;
    }//GEN-LAST:event_burgerSteakSpinnerStateChanged

    private void burgSteakCMSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_burgSteakCMSpinnerStateChanged
        // TODO add your handling code here:
        int qty;
        burgSteakCMPrice = list.search("CRC01");
        qty = (int) burgSteakCMSpinner.getValue();
        burgSteakCMPrice = burgSteakCMPrice * qty;
    }//GEN-LAST:event_burgSteakCMSpinnerStateChanged

    private void regularCokeSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_regularCokeSpinnerStateChanged
        // TODO add your handling code here:
        int qty = 0;
        regularCokePrice = list.search("D1");
        qty = (int) regularCokeSpinner.getValue();
        regularCokePrice = regularCokePrice * qty;
    }//GEN-LAST:event_regularCokeSpinnerStateChanged

    private void largeCokeSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_largeCokeSpinnerStateChanged
        // TODO add your handling code here:
        int qty = 0;
        largeCokePrice = list.search("D2");
        qty = (int) largeCokeSpinner.getValue();
        largeCokePrice = largeCokePrice * qty;
    }//GEN-LAST:event_largeCokeSpinnerStateChanged

    private void regularIcedTeaSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_regularIcedTeaSpinnerStateChanged
        // TODO add your handling code here:
        int qty = 0;
        regularIcedTeaPrice = list.search("D3");
        qty = (int) regularIcedTeaSpinner.getValue();
        regularIcedTeaPrice = regularIcedTeaPrice * qty;
    }//GEN-LAST:event_regularIcedTeaSpinnerStateChanged

    private void largeIcedTeaSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_largeIcedTeaSpinnerStateChanged
        // TODO add your handling code here:
        int qty = 0;
        largeIcedTeaPrice = list.search("D4");
        qty = (int) largeIcedTeaSpinner.getValue();
        largeIcedTeaPrice = largeIcedTeaPrice * qty;
    }//GEN-LAST:event_largeIcedTeaSpinnerStateChanged

    private void bottomlessIcedTeaSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bottomlessIcedTeaSpinnerStateChanged
        // TODO add your handling code here:
        int qty;
        bottomlessIcedTeaPrice = list.search("D5");
        qty = (int) bottomlessIcedTeaSpinner.getValue();
        bottomlessIcedTeaPrice = bottomlessIcedTeaPrice * qty;
    }//GEN-LAST:event_bottomlessIcedTeaSpinnerStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        boolean cancel = false;
        String classicBurgerReceipt;
        String chickenBurgerReceipt;
        String cheeseBurgerReceipt;
        String veggieBurgerReceipt;
        String doublePattyBurgerReceipt;
        String triplePattyBurgerReceipt;
        String eggBaconBurgerReceipt;
        String supremeBurgerReceipt;
        String classicFriesReceipt;
        String chunkyFriesReceipt;
        String shoestringFriesReceipt;
        String sweetpotatoFriesReceipt;
        String burgSteakReceipt;
        String burgSteak2Receipt;
        String burgSteakCMReceipt;
        String burgSteakCM2Receipt;
        String regularCokeReceipt;
        String largeCokeReceipt;
        String regularIcedTeaReceipt;
        String largeIcedTeaReceipt;
        String bottomlessIcedTeaReceipt;
        int idCode = Integer.parseInt(cancelOrderIDCode.getText());

        if (idCode == 100001) {
            if (classicBurgerPrice > 0) {
                classicBurgerPrice = 0;
                cancel = true;
            }
        }
        if (idCode == 100002) {
            if (cheeseBurgerPrice > 0) {
                cheeseBurgerPrice = 0;
                cancel = true;
            }
        }
        if (idCode == 100003) {
            if (doublePattyBurgerPrice > 0) {
                doublePattyBurgerPrice = 0;
                cancel = true;
            }
        }
        if (idCode == 100004) {
            if (triplePattyBurgerPrice > 0) {
                triplePattyBurgerPrice = 0;
                cancel = true;
            }
        }
        if (idCode == 100005) {
            if (chickenBurgerPrice > 0) {
                chickenBurgerPrice = 0;
                cancel = true;
            }
        }
        if (idCode == 100006) {
            if (veggieBurgerPrice > 0) {
                veggieBurgerPrice = 0;
                cancel = true;
            }
        }

        if (idCode == 100007) {
            if (eggBaconBurgerPrice > 0) {
                eggBaconBurgerPrice = 0;
                cancel = true;
            }
        }
        if (idCode == 100008) {
            if (supremeBurgerPrice > 0) {
                supremeBurgerPrice = 0;
                cancel = true;
            }
        }
        if (idCode == 200001) {
            if (classicFriesPrice > 0) {
                classicFriesPrice = 0;
                cancel = true;
            }
        }
        if (idCode == 200002) {
            if (chunkyFriesPrice > 0) {
                chunkyFriesPrice = 0;
                cancel = true;
            }
        }
        if (idCode == 200003) {
            if (shoestringFriesPrice > 0) {
                shoestringFriesPrice = 0;
                cancel = true;
            }
        }
        if (idCode == 200004) {
            if (sweetpotatoFriesPrice > 0) {
                sweetpotatoFriesPrice = 0;
                cancel = true;
            }
        }
        if (idCode == 300001) {
            if (burgerSteakPrice > 0) {
                burgerSteakPrice = 0;
                cancel = true;
            }
        }
        if (idCode == 300002) {
            if (burgerSteak2Price > 0) {
                burgerSteak2Price = 0;
                cancel = true;
            }
        }
        if (idCode == 300003) {
            if (burgSteakCMPrice > 0) {
                burgSteakCMPrice = 0;
                cancel = true;
            }
        }
        if (idCode == 300004) {
            if (burgSteak2CMPrice > 0) {
                burgSteak2CMPrice = 0;
                cancel = true;
            }
        }
        if (idCode == 400001) {
            if (regularCokePrice > 0) {
                regularCokePrice = 0;
                cancel = true;
            }
        }
        if (idCode == 400002) {
            if (largeCokePrice > 0) {
                largeCokePrice = 0;
                cancel = true;
            }
        }
        if (idCode == 400003) {
            if (regularIcedTeaPrice > 0) {
                regularIcedTeaPrice = 0;
                cancel = true;
            }
        }
        if (idCode == 400004) {
            if (largeIcedTeaPrice > 0) {
                largeIcedTeaPrice = 0;
                cancel = true;
            }
        }
        if (idCode == 400005) {
            if (bottomlessIcedTeaPrice > 0) {
                bottomlessIcedTeaPrice = 0;
                cancel = true;
            }
        }

        if (cancel == true) {
            receiptArea.setText(receipt);
            totalPrice = classicBurgerPrice + chickenBurgerPrice + cheeseBurgerPrice + veggieBurgerPrice + doublePattyBurgerPrice + triplePattyBurgerPrice + eggBaconBurgerPrice + supremeBurgerPrice;
            totalPrice = totalPrice + classicFriesPrice + chunkyFriesPrice + shoestringFriesPrice + sweetpotatoFriesPrice;
            totalPrice = totalPrice + burgerSteakPrice + burgerSteak2Price + burgSteakCMPrice + burgSteak2CMPrice;
            totalPrice = totalPrice + regularCokePrice + largeCokePrice + regularIcedTeaPrice + largeIcedTeaPrice + bottomlessIcedTeaPrice;

            //receiptArea.setText("**************************************************\n");
            //receiptArea.setText(receiptArea.getText() + "*                          SUABURGERS                          *\n");
            //receiptArea.setText(receiptArea.getText() + "**************************************************\n");
            if (classicBurgerPrice > 0) {
                classicBurgerReceipt = "\nClassic Burger\t\t\t" + classicBurgerPrice;
                receiptArea.setText(receiptArea.getText() + classicBurgerReceipt);
                
            }

            if (chickenBurgerPrice > 0) {
                chickenBurgerReceipt = "\nChicken Brgr\t\t\t" + chickenBurgerPrice;
                receiptArea.setText(receiptArea.getText() + chickenBurgerReceipt);
                
            }

            if (cheeseBurgerPrice > 0) {
                cheeseBurgerReceipt = "\nCheese Brgr\t\t\t" + cheeseBurgerPrice;
                receiptArea.setText(receiptArea.getText() + cheeseBurgerReceipt);
                
            }

            if (veggieBurgerPrice > 0) {
                veggieBurgerReceipt = "\nVeggie Burger\t\t\t" + veggieBurgerPrice;
                receiptArea.setText(receiptArea.getText() + veggieBurgerReceipt);
                
            }

            if (doublePattyBurgerPrice > 0) {
                doublePattyBurgerReceipt = "\nDouble Patty Burger\t\t" + doublePattyBurgerPrice;
                receiptArea.setText(receiptArea.getText() + doublePattyBurgerReceipt);
                
            }

            if (triplePattyBurgerPrice > 0) {
                triplePattyBurgerReceipt = "\nTriple Patty Burger\t\t" + triplePattyBurgerPrice;
                receiptArea.setText(receiptArea.getText() + triplePattyBurgerReceipt);
            }

            if (eggBaconBurgerPrice > 0) {
                eggBaconBurgerReceipt = "\nEgg Bacon Burger\t\t" + eggBaconBurgerPrice;
                receiptArea.setText(receiptArea.getText() + eggBaconBurgerReceipt);
            }

            if (supremeBurgerPrice > 0) {
                supremeBurgerReceipt = "\nSupreme Burger\t\t" + supremeBurgerPrice;
                receiptArea.setText(receiptArea.getText() + supremeBurgerReceipt);
            }

            if (classicFriesPrice > 0) {
                classicFriesReceipt = "\nClassic Fries\t\t\t" + classicFriesPrice;
                receiptArea.setText(receiptArea.getText() + classicFriesReceipt);
            }

            if (chunkyFriesPrice > 0) {
                chunkyFriesReceipt = "\nChunky Fries\t\t\t" + chunkyFriesPrice;
                receiptArea.setText(receiptArea.getText() + chunkyFriesReceipt);
            }

            if (shoestringFriesPrice > 0) {
                shoestringFriesReceipt = "\nShoeString Fries\t\t" + shoestringFriesPrice;
                receiptArea.setText(receiptArea.getText() + shoestringFriesReceipt);
            }

            if (sweetpotatoFriesPrice > 0) {
                sweetpotatoFriesReceipt = "\nSweet Potato Fries\t\t" + sweetpotatoFriesPrice;
                receiptArea.setText(receiptArea.getText() + sweetpotatoFriesReceipt);
            }

            if (burgerSteakPrice > 0) {
                burgSteakReceipt = "\nBurger Steak\t\t\t" + burgerSteakPrice;
                receiptArea.setText(receiptArea.getText() + burgSteakReceipt);
            }

            if (burgerSteak2Price > 0) {
                burgSteak2Receipt = "\n2 pcs. Burger Steak\t\t" + burgerSteak2Price;
                receiptArea.setText(receiptArea.getText() + burgSteak2Receipt);
            }

            if (burgSteakCMPrice > 0) {
                burgSteakCMReceipt = "\nBurger Steak Combo Meal\t\t" + burgSteakCMPrice;
                receiptArea.setText(receiptArea.getText() + burgSteakCMReceipt);
            }

            if (burgSteak2CMPrice > 0) {
                burgSteakCM2Receipt = "\n2pc BurgSteak Combo Meal\t\t" + burgSteak2CMPrice;
                receiptArea.setText(receiptArea.getText() + burgSteakCM2Receipt);
            }

            if (regularCokePrice > 0) {
                regularCokeReceipt = "\nRegular Coke\t\t\t" + regularCokePrice;
                receiptArea.setText(receiptArea.getText() + regularCokeReceipt);
            }
            if (largeCokePrice > 0) {
                largeCokeReceipt = "\nLarge Coke\t\t\t" + largeCokePrice;
                receiptArea.setText(receiptArea.getText() + largeCokeReceipt);
            }
            if (regularIcedTeaPrice > 0) {
                regularIcedTeaReceipt = "\nRegular Iced Tea\t\t" + regularIcedTeaPrice;
                receiptArea.setText(receiptArea.getText() + regularIcedTeaReceipt);
            }
            if (largeIcedTeaPrice > 0) {
                largeIcedTeaReceipt = "\nLarge IcdTea\t\t\t" + largeIcedTeaPrice;
                receiptArea.setText(receiptArea.getText() + largeIcedTeaReceipt);
            }

            if (bottomlessIcedTeaPrice > 0) {
                bottomlessIcedTeaReceipt = "\nBottomless Iced Tea\t\t" + bottomlessIcedTeaPrice;
                receiptArea.setText(receiptArea.getText() + bottomlessIcedTeaReceipt);
            }

            if (discountComboBox.getSelectedIndex() == 1 || discountComboBox.getSelectedIndex() == 2) {
                totalPrice = totalPrice - (totalPrice * .20);
                String totalPriceFieldText = Double.toString(totalPrice);
                totalPriceField.setText(totalPriceFieldText);

            } else {
                String totalPriceFieldText = Double.toString(totalPrice);
                totalPriceField.setText(totalPriceFieldText);
            }
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void cancelOrderIDCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrderIDCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelOrderIDCodeActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        BinaryTree listtree = new BinaryTree();
        listtree.insert("RC01", "Burger Steak", 300001, 50.00);
        listtree.insert("RC02", "2pc Burger Steak", 300002, 80.00);
        listtree.insert("B01", "Classic Burger  ", 100001, 50.00);
        listtree.insert("B02", "Cheese Burger", 100002, 60.00);
        listtree.insert("B03", "Double Patty Burger", 100003, 120.00);
        listtree.insert("B04", "Triple Patty Burger", 100004, 180.00);
        listtree.insert("B05", "Chicken Burger  ", 100005, 50.00);
        listtree.insert("B06", "Veggie Burger", 100006, 50.00);
        listtree.insert("B07", "Egg n' Bacon Burger", 100007, 60.00);
        listtree.insert("B08", "Supreme Burger", 100008, 60.00);
        listtree.insert("F01", "Classic Fries", 200001, 30.00);
        listtree.insert("F02", "Chunky Fries", 200002, 40.00);
        listtree.insert("F03", "ShoeString Fries", 200003, 40.00);
        listtree.insert("F04", "Sweet Potato Fries", 200004, 40.00);
        listtree.insert("CRC01", "BurgSteak Combo Meal\t", 300003, 100.00);
        listtree.insert("CRC02", "2pc BurgSteak Combo Meal\t", 300004, 160.00);
        listtree.insert("D1", "Regular Coke", 400001, 20.00);
        listtree.insert("D2", "Large Coke", 400002, 70.00);
        listtree.insert("D3", "Regular Iced Tea", 400003, 40.00);
        listtree.insert("D4", "Large Iced Tea\t", 400004, 70.00);
        listtree.insert("D5", "Bottomless Iced Tea", 400005, 70.00);

        String classicBurgerReceipt;
        String chickenBurgerReceipt;
        String cheeseBurgerReceipt;
        String veggieBurgerReceipt;
        String doublePattyBurgerReceipt;
        String triplePattyBurgerReceipt;
        String eggBaconBurgerReceipt;
        String supremeBurgerReceipt;
        String classicFriesReceipt;
        String chunkyFriesReceipt;
        String shoestringFriesReceipt;
        String sweetpotatoFriesReceipt;
        String burgSteakReceipt;
        String burgSteak2Receipt;
        String burgSteakCMReceipt;
        String burgSteakCM2Receipt;
        String regularCokeReceipt;
        String largeCokeReceipt;
        String regularIcedTeaReceipt;
        String largeIcedTeaReceipt;
        String bottomlessIcedTeaReceipt;
        
        double price;
        int idCode = Integer.parseInt(manualOrderIDCode.getText());
        int qty;
        String name = listtree.searchName(idCode);
        price = listtree.searchPrice(idCode);
        qty = (int) manualOrderSpinner.getValue();
        price = price * qty;
        totalPrice=totalPrice+price;
        
        if(price>0){
             order = true;
             if(name.length()<14){
                    receiptArea.setText(receiptArea.getText() + "\n" + name + "\t\t\t" + price);
                }else if(name.length()>19){
                    receiptArea.setText(receiptArea.getText() + "\n" + name + "\t" + price);
                }else{
                    receiptArea.setText(receiptArea.getText() + "\n" + name + "\t\t" + price);
                }
             
        }
        
        if (discountComboBox.getSelectedIndex() == 1 || discountComboBox.getSelectedIndex() == 2) {
                String totalPriceFieldText = Double.toString(discount);
                totalPriceField.setText(totalPriceFieldText);
            } else {
                String totalPriceFieldText = Double.toString(totalPrice);
                totalPriceField.setText(totalPriceFieldText);
            }
               


    }//GEN-LAST:event_jButton5ActionPerformed

    private void manualOrderIDCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manualOrderIDCodeKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
        }
    }//GEN-LAST:event_manualOrderIDCodeKeyPressed

    private void discountComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_discountComboBoxItemStateChanged
        // TODO add your handling code here:
        discount = totalPrice;
        if (discountComboBox.getSelectedIndex() == 1 || discountComboBox.getSelectedIndex() == 2) {
            disc = true;
            
                discount = totalPrice - (totalPrice * .20);
                String totalPriceFieldText = Double.toString(discount);
                totalPriceField.setText(totalPriceFieldText);

            } else {
            disc=false;
                String totalPriceFieldText = Double.toString(totalPrice);
                totalPriceField.setText(totalPriceFieldText);
            }
    }//GEN-LAST:event_discountComboBoxItemStateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashier().setVisible(true);
            }
        });
    }
    class NodeT {
        private String productID;
        private String productName;
        private int itemCode;
        private double price;
        private NodeT left;
        private  NodeT right;

    public NodeT(String productID, String productName, int itemCode, double price) {
        this.productID = productID;
        this.productName = productName;
        this.itemCode = itemCode;
        this.price = price;
    }

}

class BinaryTree {
    NodeT root;

    public void insert(String productID, String productName, int itemCode, double price) {

        NodeT newNode = new NodeT(productID, productName, itemCode, price);

        if (root == null) {
            root = newNode;
        } else {
            NodeT temp = root;

            NodeT parent;
            while (true) {
                parent = temp;

                if (itemCode < temp.itemCode) {
                    temp = temp.left;

                    if (temp == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    temp = temp.right;

                    if (temp == null) {
                        parent.right = newNode;
                        return;
                    }
                }

            }
        }
    }

    public double searchPrice(int itemCode) {

            NodeT temp = root;
            
            while (true) {
                if (temp.itemCode == itemCode) {
                        return temp.price;
                    }
                
                if (itemCode < temp.itemCode) {
                    temp = temp.left;

                    if (temp.itemCode == itemCode) {
                        return temp.price;
                    }
                } else {
                    temp = temp.right;

                    if (temp.itemCode == itemCode) {
                        return temp.price;
                    }
                }

            }
        }
    

    public String searchName(int itemCode) {

        NodeT temp = root;

        
        while (true) {
            
            if (temp.itemCode == itemCode) {
                    return temp.productName;
                }
            
            if (itemCode < temp.itemCode) {
                temp = temp.left;

                if (temp.itemCode == itemCode) {
                    return temp.productName;
                }
            } else {
                temp = temp.right;

                if (temp.itemCode == itemCode) {
                    return temp.productName;
                }
            }

        }
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel afafasfasfa;
    private javax.swing.JTextField ammountPaid;
    private javax.swing.JLabel asfasf;
    private javax.swing.JSpinner bottomlessIcedTeaSpinner;
    private javax.swing.JSpinner burgSteakCMSpinner;
    private javax.swing.JSpinner burgSteakCMSpinner2;
    private javax.swing.JScrollPane burgerScrollPane;
    private javax.swing.JSpinner burgerSteakSpinner;
    private javax.swing.JSpinner burgerSteakSpinner2;
    private javax.swing.JPanel burgersPane;
    private javax.swing.JButton calculateButton;
    private javax.swing.JTextField cancelOrderIDCode;
    private javax.swing.JTextField changeTextField;
    private javax.swing.JSpinner cheeseBurgerSpinner;
    private javax.swing.JSpinner chickenBurgerSpinner;
    private javax.swing.JSpinner chunkyFriesSpinner;
    private javax.swing.JSpinner classicBurgerSpinner;
    private javax.swing.JSpinner classicFriesSpinner;
    private javax.swing.JComboBox<String> discountComboBox;
    private javax.swing.JSpinner doublePattyBurgerSpinner;
    private javax.swing.JPanel drinksPane;
    private javax.swing.JScrollPane drinksScrollPane;
    private javax.swing.JSpinner eggBaconBurgerSpinner;
    private javax.swing.JPanel friesPane;
    private javax.swing.JScrollPane friesScrollPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner largeCokeSpinner;
    private javax.swing.JSpinner largeIcedTeaSpinner;
    private javax.swing.JPanel logOutButton;
    private javax.swing.JTextField manualOrderIDCode;
    private javax.swing.JSpinner manualOrderSpinner;
    private javax.swing.JTextArea receiptArea;
    private javax.swing.JSpinner regularCokeSpinner;
    private javax.swing.JSpinner regularIcedTeaSpinner;
    private javax.swing.JPanel riceMeals;
    private javax.swing.JScrollPane riceMealsScrollPane;
    private javax.swing.JSpinner shoeStringSpinner;
    private javax.swing.JSpinner supremeBurgerSpinner;
    private javax.swing.JSpinner sweetPotatoSpinner;
    private javax.swing.JTextField totalPriceField;
    private javax.swing.JSpinner triplePattyBurgerSpinner;
    private javax.swing.JSpinner veggieBurgerSpinner;
    // End of variables declaration//GEN-END:variables
}
