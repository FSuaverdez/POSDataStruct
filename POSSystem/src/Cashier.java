
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.*;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Cashier extends javax.swing.JFrame {

    //declaring linkedlist and inserting all products and also setting options for some interfaces
    public Cashier() {

        initComponents();
        setIcon();
        this.setLocationRelativeTo(null);
        burgerScrollPane.setVisible(true);
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

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("favicon.png")));
    }
    //declaring some values to be used to collect data and do calculations and also for conditional statements
    boolean clear = false;
    boolean order = false;
    double discount;
    boolean pending = false;
    boolean paid = false;
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
        classic = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        doublepatty = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        cheese = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        triplepatty = new javax.swing.JLabel();
        veggieBurgerSpinner = new javax.swing.JSpinner();
        chickenBurgerSpinner = new javax.swing.JSpinner();
        eggBaconBurgerSpinner = new javax.swing.JSpinner();
        supremeBurgerSpinner = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        asfasf = new javax.swing.JLabel();
        afafasfasfa = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        chicken = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        eggnbacon = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        veggie = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        supreme = new javax.swing.JLabel();
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
        classicfries = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        classicFriesSpinner = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        chunkyFriesSpinner = new javax.swing.JSpinner();
        jPanel12 = new javax.swing.JPanel();
        shoestring = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        shoeStringSpinner = new javax.swing.JSpinner();
        sweetPotatoSpinner = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        chunky = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        riceMealsScrollPane = new javax.swing.JScrollPane();
        riceMeals = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        burgerSteakSpinner2 = new javax.swing.JSpinner();
        jPanel8 = new javax.swing.JPanel();
        burgermeal2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        burgSteakCMSpinner2 = new javax.swing.JSpinner();
        jPanel9 = new javax.swing.JPanel();
        burger2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        burgerSteakSpinner = new javax.swing.JSpinner();
        jPanel10 = new javax.swing.JPanel();
        burger1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        burgSteakCMSpinner = new javax.swing.JSpinner();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        burgermeal1 = new javax.swing.JLabel();
        drinksScrollPane = new javax.swing.JScrollPane();
        drinksPane = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        Coke1 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        regularCokeSpinner = new javax.swing.JSpinner();
        jPanel19 = new javax.swing.JPanel();
        Coke2 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        largeCokeSpinner = new javax.swing.JSpinner();
        jPanel20 = new javax.swing.JPanel();
        Icetea1 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        regularIcedTeaSpinner = new javax.swing.JSpinner();
        jPanel22 = new javax.swing.JPanel();
        Icetea2 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        largeIcedTeaSpinner = new javax.swing.JSpinner();
        jPanel23 = new javax.swing.JPanel();
        Icetea3 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        bottomlessIcedTeaSpinner = new javax.swing.JSpinner();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        totalPriceField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ammountPaid = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        changeTextField = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();
        payOrder = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        discountComboBox = new javax.swing.JComboBox<>();
        manualOrderIDCode = new javax.swing.JTextField();
        manualOrderSpinner = new javax.swing.JSpinner();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        printReceipt = new javax.swing.JButton();
        voidOrder = new javax.swing.JButton();
        lastName = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SUABURGERS POSSYSTEM");
        setAlwaysOnTop(true);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        logOutButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LOGOUT");
        logOutButton.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 18, -1, -1));

        jPanel1.add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 90, 50));

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

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        classic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Classic.jpg"))); // NOI18N
        jPanel3.add(classic);
        classic.setBounds(0, 0, 100, 100);

        burgersPane.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 100, 100));

        jPanel13.setLayout(null);

        doublepatty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DoublePat.jpg"))); // NOI18N
        jPanel13.add(doublepatty);
        doublepatty.setBounds(0, 0, 100, 100);

        burgersPane.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 100, 100));

        jPanel17.setLayout(null);

        cheese.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cheese.jpg"))); // NOI18N
        jPanel17.add(cheese);
        cheese.setBounds(0, 0, 100, 100);

        burgersPane.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 100, 100));

        jPanel21.setLayout(null);

        triplepatty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triple.jpg"))); // NOI18N
        jPanel21.add(triplepatty);
        triplepatty.setBounds(0, 0, 100, 100);

        burgersPane.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 720, 100, 100));

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

        jPanel26.setLayout(null);

        chicken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Chicken.jpg"))); // NOI18N
        jPanel26.add(chicken);
        chicken.setBounds(0, 0, 100, 100);

        burgersPane.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 100, 100));

        jPanel27.setLayout(null);

        eggnbacon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Egg.jpg"))); // NOI18N
        jPanel27.add(eggnbacon);
        eggnbacon.setBounds(0, 0, 100, 100);

        burgersPane.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 100, 100));

        jPanel28.setLayout(null);

        veggie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Veggie.jpg"))); // NOI18N
        jPanel28.add(veggie);
        veggie.setBounds(0, 0, 100, 100);

        burgersPane.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 100, 100));

        jPanel29.setLayout(null);

        supreme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Supreme.jpg"))); // NOI18N
        jPanel29.add(supreme);
        supreme.setBounds(0, 0, 100, 100);

        burgersPane.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 720, 100, 100));

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

        jPanel5.setLayout(null);

        classicfries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fries1.jpg"))); // NOI18N
        jPanel5.add(classicfries);
        classicfries.setBounds(0, 0, 110, 120);

        jLabel17.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel17.setText("Classic Fries");

        classicFriesSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        classicFriesSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                classicFriesSpinnerStateChanged(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel20.setText("Chunky Fries");

        chunkyFriesSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        chunkyFriesSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chunkyFriesSpinnerStateChanged(evt);
            }
        });

        shoestring.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fries2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(shoestring, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shoestring, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

        jLabel48.setText("200003");

        jLabel49.setText("200002");

        jLabel50.setText("200004");

        chunky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fries3.jpg"))); // NOI18N

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fries4.jpg"))); // NOI18N

        javax.swing.GroupLayout friesPaneLayout = new javax.swing.GroupLayout(friesPane);
        friesPane.setLayout(friesPaneLayout);
        friesPaneLayout.setHorizontalGroup(
            friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(friesPaneLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addGap(188, 188, 188))
            .addGroup(friesPaneLayout.createSequentialGroup()
                .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(friesPaneLayout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(jLabel17))
                        .addGroup(friesPaneLayout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(friesPaneLayout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel49)
                                        .addComponent(classicFriesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(chunky, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(friesPaneLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel20)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, friesPaneLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(chunkyFriesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(friesPaneLayout.createSequentialGroup()
                        .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(friesPaneLayout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(friesPaneLayout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel21)))))
                        .addContainerGap(107, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, friesPaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel50)
                                .addComponent(shoeStringSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sweetPotatoSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(181, 181, 181))))
            .addGroup(friesPaneLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(friesPaneLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(classicFriesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shoeStringSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, friesPaneLayout.createSequentialGroup()
                        .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21))
                        .addGap(60, 60, 60)))
                .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chunky, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, friesPaneLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chunkyFriesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, friesPaneLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sweetPotatoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
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

        jLabel24.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel24.setText("Burger Steak");
        riceMeals.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        burgerSteakSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        burgerSteakSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                burgerSteakSpinner2StateChanged(evt);
            }
        });
        riceMeals.add(burgerSteakSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 60, -1));

        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        burgermeal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Burg4.png"))); // NOI18N
        jPanel8.add(burgermeal2);
        burgermeal2.setBounds(10, 0, 160, 100);

        riceMeals.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 140, 100));

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
        jPanel9.setLayout(null);

        burger2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Burg3.jpg"))); // NOI18N
        jPanel9.add(burger2);
        burger2.setBounds(-40, -10, 220, 160);

        riceMeals.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 140, 110));

        jLabel26.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel26.setText("2pc BurgSteak Combo Meal");
        riceMeals.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, -1, -1));

        burgerSteakSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        burgerSteakSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                burgerSteakSpinnerStateChanged(evt);
            }
        });
        riceMeals.add(burgerSteakSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 60, -1));

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.setLayout(null);

        burger1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Burg1.jpg"))); // NOI18N
        jPanel10.add(burger1);
        burger1.setBounds(0, 0, 140, 110);

        riceMeals.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 140, 110));

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
        riceMeals.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel52.setText("300003");
        riceMeals.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jLabel53.setText("300001");
        riceMeals.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel54.setText("300004");
        riceMeals.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel7.setLayout(null);

        burgermeal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Burg2.jpg"))); // NOI18N
        jPanel7.add(burgermeal1);
        burgermeal1.setBounds(0, 0, 140, 110);

        riceMeals.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 140, 110));

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
        jPanel18.setLayout(null);

        Coke1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Coke1.jpg"))); // NOI18N
        jPanel18.add(Coke1);
        Coke1.setBounds(0, 0, 110, 110);

        drinksPane.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 110, 110));

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
        jPanel19.setLayout(null);

        Coke2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Coke2.jpg"))); // NOI18N
        jPanel19.add(Coke2);
        Coke2.setBounds(0, 0, 110, 110);

        drinksPane.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 110, 110));

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
        jPanel20.setLayout(null);

        Icetea1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icetea1.jpg"))); // NOI18N
        jPanel20.add(Icetea1);
        Icetea1.setBounds(0, 0, 110, 110);

        drinksPane.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 110, 110));

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
        jPanel22.setLayout(null);

        Icetea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icetea2.jpg"))); // NOI18N
        jPanel22.add(Icetea2);
        Icetea2.setBounds(0, 0, 130, 110);

        drinksPane.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 110, 110));

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
        jPanel23.setLayout(null);

        Icetea3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icetea3.jpg"))); // NOI18N
        jPanel23.add(Icetea3);
        Icetea3.setBounds(0, 0, 110, 120);

        drinksPane.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 110, 110));

        jLabel32.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel32.setText("Bottomless Iced Tea");
        drinksPane.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, -1, -1));

        bottomlessIcedTeaSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        bottomlessIcedTeaSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bottomlessIcedTeaSpinnerStateChanged(evt);
            }
        });
        drinksPane.add(bottomlessIcedTeaSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 640, 60, -1));

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

        totalPriceField.setEditable(false);
        totalPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceFieldActionPerformed(evt);
            }
        });
        jPanel1.add(totalPriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 220, 100, -1));

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("DISCOUNT:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 150, -1, -1));

        ammountPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ammountPaidActionPerformed(evt);
            }
        });
        jPanel1.add(ammountPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, 100, -1));

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("AMOUNT PAID:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 260, -1, 20));

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
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

        calculateButton.setBackground(new java.awt.Color(0, 0, 0));
        calculateButton.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        calculateButton.setForeground(new java.awt.Color(255, 255, 255));
        calculateButton.setText("CALCULATE");
        calculateButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
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
        jPanel1.add(calculateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 130, 200, 70));

        payOrder.setBackground(new java.awt.Color(0, 204, 0));
        payOrder.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        payOrder.setText("PAY");
        payOrder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        payOrder.setPreferredSize(new java.awt.Dimension(107, 23));
        payOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payOrderActionPerformed(evt);
            }
        });
        payOrder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                payOrderKeyPressed(evt);
            }
        });
        jPanel1.add(payOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 210, 200, 70));

        jLabel23.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
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

        manualOrderIDCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualOrderIDCodeActionPerformed(evt);
            }
        });
        manualOrderIDCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                manualOrderIDCodeKeyPressed(evt);
            }
        });
        jPanel1.add(manualOrderIDCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 100, 30));

        manualOrderSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(manualOrderSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 50, 30));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("MANUAL ORDER");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("QTY:");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("LAST NAME:");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("ADD");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 90, 30));

        printReceipt.setBackground(new java.awt.Color(0, 0, 0));
        printReceipt.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        printReceipt.setForeground(new java.awt.Color(255, 255, 255));
        printReceipt.setText("PRINT RECEIPT");
        printReceipt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        printReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printReceiptActionPerformed(evt);
            }
        });
        jPanel1.add(printReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 660, 140, 40));

        voidOrder.setBackground(new java.awt.Color(255, 0, 0));
        voidOrder.setFont(new java.awt.Font("Bahnschrift", 1, 32)); // NOI18N
        voidOrder.setText("VOID ALL");
        voidOrder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        voidOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voidOrderActionPerformed(evt);
            }
        });
        voidOrder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                voidOrderKeyPressed(evt);
            }
        });
        jPanel1.add(voidOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 290, 200, 70));
        jPanel1.add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 100, 30));

        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });
        firstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstNameKeyPressed(evt);
            }
        });
        jPanel1.add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 100, 30));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("ITEM CODE:");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("FIRST NAME:");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel38.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("FOR ADDITIONAL ORDER USE");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 190, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //when logout button is clicked the cashier gui will be closed and the login page will be opened
    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseClicked

        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutButtonMouseClicked
//when burger button is clicked other pane will be closed and burger pane will be opened
    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:
        burgerScrollPane.setVisible(false);
        friesScrollPane.setVisible(false);
        riceMealsScrollPane.setVisible(false);
        drinksScrollPane.setVisible(false);
        burgerScrollPane.setVisible(true);

    }//GEN-LAST:event_jPanel4MousePressed
//when fries button is clicked other pane will be closed and fries pane will be opened
    private void jPanel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MousePressed
        // TODO add your handling code here:
        burgerScrollPane.setVisible(false);
        friesScrollPane.setVisible(false);
        riceMealsScrollPane.setVisible(false);
        drinksScrollPane.setVisible(false);
        friesScrollPane.setVisible(true);
    }//GEN-LAST:event_jPanel14MousePressed
//when rice meals button is clicked other pane will be closed and rice meals pane will be opened
    private void jPanel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MousePressed
        // TODO add your handling code here:
        burgerScrollPane.setVisible(false);
        friesScrollPane.setVisible(false);
        riceMealsScrollPane.setVisible(false);
        drinksScrollPane.setVisible(false);
        riceMealsScrollPane.setVisible(true);
    }//GEN-LAST:event_jPanel15MousePressed
//when drinks button is clicked other pane will be closed and drinks pane will be opened
    private void jPanel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MousePressed
        // TODO add your handling code here:
        burgerScrollPane.setVisible(false);
        friesScrollPane.setVisible(false);
        riceMealsScrollPane.setVisible(false);
        drinksScrollPane.setVisible(false);
        drinksScrollPane.setVisible(true);
    }//GEN-LAST:event_jPanel16MousePressed
//for every spinner when a spinner value changed it will automatically calculate the price for the product
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
            + "\n                                  SUABURGERS"
            + "\n               150 Algeciras St. Sampaloc, Manila"
            + "\n                   Email: suaburgers@gmail.com     "
            + "\n                          Contact # 09770367227                                               "
            + "\n***************************************************************\n";

    // when clicked the program will check if there is a pending order if not the function will add all the prices collected from the spinners
    // and it will be showed in the receipt area
    // but if there is a pending order the program will throw an error saying use manual order or finish the pending order
    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // TODO add your handling code here:
        changeTextField.setText("");
        if(pending == false){
                        totalPrice = totalPrice + classicBurgerPrice + chickenBurgerPrice + cheeseBurgerPrice + veggieBurgerPrice + doublePattyBurgerPrice + triplePattyBurgerPrice + eggBaconBurgerPrice + supremeBurgerPrice;
        totalPrice = totalPrice + classicFriesPrice + chunkyFriesPrice + shoestringFriesPrice + sweetpotatoFriesPrice;
        totalPrice = totalPrice + burgerSteakPrice + burgerSteak2Price + burgSteakCMPrice + burgSteak2CMPrice;
        totalPrice = totalPrice + regularCokePrice + largeCokePrice + regularIcedTeaPrice + largeIcedTeaPrice + bottomlessIcedTeaPrice;
        }

        calculateDisc();
        if (totalPrice == 0) {
            pending = false;
        } else if (pending == false) {
            pending = true;

            if (clear == true) {
                receiptArea.setText(receipt);
                changeTextField.setText("");
            }
            clear = false;

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


            //receiptArea.setText("**************************************************\n");
            //receiptArea.setText(receiptArea.getText() + "*                          SUABURGERS                          *\n");
            //receiptArea.setText(receiptArea.getText() + "**************************************************\n");
            if (classicBurgerPrice > 0) {
                classicBurgerReceipt = "\nClassic Burger*" + classicBurgerSpinner.getValue() + "\t\t" + classicBurgerPrice;
                receiptArea.setText(receiptArea.getText() + classicBurgerReceipt);

            }

            if (chickenBurgerPrice > 0) {
                chickenBurgerReceipt = "\nChicken Brgr*" + chickenBurgerSpinner.getValue() + "    \t\t" + chickenBurgerPrice;
                receiptArea.setText(receiptArea.getText() + chickenBurgerReceipt);

            }

            if (cheeseBurgerPrice > 0) {
                cheeseBurgerReceipt = "\nCheese Brgr*" + cheeseBurgerSpinner.getValue() + "\t\t\t" + cheeseBurgerPrice;
                receiptArea.setText(receiptArea.getText() + cheeseBurgerReceipt);

            }

            if (veggieBurgerPrice > 0) {
                veggieBurgerReceipt = "\nVeggie Burger*" + veggieBurgerSpinner.getValue() + "\t\t" + veggieBurgerPrice;
                receiptArea.setText(receiptArea.getText() + veggieBurgerReceipt);

            }

            if (doublePattyBurgerPrice > 0) {
                doublePattyBurgerReceipt = "\nDouble Patty Burger*" + doublePattyBurgerSpinner.getValue() + "\t\t" + doublePattyBurgerPrice;
                receiptArea.setText(receiptArea.getText() + doublePattyBurgerReceipt);

            }

            if (triplePattyBurgerPrice > 0) {
                triplePattyBurgerReceipt = "\nTriple Patty Burger*" + triplePattyBurgerSpinner.getValue() + "\t\t" + triplePattyBurgerPrice;
                receiptArea.setText(receiptArea.getText() + triplePattyBurgerReceipt);

            }

            if (eggBaconBurgerPrice > 0) {
                eggBaconBurgerReceipt = "\nEgg Bacon Burger*" + eggBaconBurgerSpinner.getValue() + "\t\t" + eggBaconBurgerPrice;
                receiptArea.setText(receiptArea.getText() + eggBaconBurgerReceipt);

            }

            if (supremeBurgerPrice > 0) {
                supremeBurgerReceipt = "\nSupreme Burger*" + supremeBurgerSpinner.getValue() + "\t\t" + supremeBurgerPrice;
                receiptArea.setText(receiptArea.getText() + supremeBurgerReceipt);

            }

            if (classicFriesPrice > 0) {
                classicFriesReceipt = "\nClassic Fries*" + classicFriesSpinner.getValue() + "    \t\t" + classicFriesPrice;
                receiptArea.setText(receiptArea.getText() + classicFriesReceipt);

            }

            if (chunkyFriesPrice > 0) {
                chunkyFriesReceipt = "\nChunky Fries*" + chunkyFriesSpinner.getValue() + "    \t\t" + chunkyFriesPrice;
                receiptArea.setText(receiptArea.getText() + chunkyFriesReceipt);

            }

            if (shoestringFriesPrice > 0) {
                shoestringFriesReceipt = "\nShoeString Fries*" + shoeStringSpinner.getValue() + "\t\t" + shoestringFriesPrice;
                receiptArea.setText(receiptArea.getText() + shoestringFriesReceipt);

            }

            if (sweetpotatoFriesPrice > 0) {
                sweetpotatoFriesReceipt = "\nSweet Potato Fries*" + sweetPotatoSpinner.getValue() + "\t\t" + sweetpotatoFriesPrice;
                receiptArea.setText(receiptArea.getText() + sweetpotatoFriesReceipt);

            }

            if (burgerSteakPrice > 0) {
                burgSteakReceipt = "\nBurger Steak*" + burgerSteakSpinner.getValue() + "    \t\t" + burgerSteakPrice;
                receiptArea.setText(receiptArea.getText() + burgSteakReceipt);

            }

            if (burgerSteak2Price > 0) {
                burgSteak2Receipt = "\n2 pcs. Burger Steak*" + burgerSteakSpinner2.getValue() + "\t\t" + burgerSteak2Price;
                receiptArea.setText(receiptArea.getText() + burgSteak2Receipt);

            }

            if (burgSteakCMPrice > 0) {
                burgSteakCMReceipt = "\nBurger Steak Combo Meal*" + burgSteakCMSpinner.getValue() + "\t\t" + burgSteakCMPrice;
                receiptArea.setText(receiptArea.getText() + burgSteakCMReceipt);

            }

            if (burgSteak2CMPrice > 0) {
                burgSteakCM2Receipt = "\n2pc BurgSteak Combo Meal*" + burgSteakCMSpinner2.getValue() + "       \t" + burgSteak2CMPrice;
                receiptArea.setText(receiptArea.getText() + burgSteakCM2Receipt);

            }

            if (regularCokePrice > 0) {
                regularCokeReceipt = "\nRegular Coke*" + regularCokeSpinner.getValue() + "   \t\t" + regularCokePrice;
                receiptArea.setText(receiptArea.getText() + regularCokeReceipt);

            }
            if (largeCokePrice > 0) {
                largeCokeReceipt = "\nLarge Coke*" + largeCokeSpinner.getValue() + "\t\t\t" + largeCokePrice;
                receiptArea.setText(receiptArea.getText() + largeCokeReceipt);

            }
            if (regularIcedTeaPrice > 0) {
                regularIcedTeaReceipt = "\nRegular Iced Tea*" + regularIcedTeaSpinner.getValue() + "\t\t" + regularIcedTeaPrice;
                receiptArea.setText(receiptArea.getText() + regularIcedTeaReceipt);

            }
            if (largeIcedTeaPrice > 0) {
                largeIcedTeaReceipt = "\nLarge Iced Tea*" + largeIcedTeaSpinner.getValue() + "  \t\t" + largeIcedTeaPrice;
                receiptArea.setText(receiptArea.getText() + largeIcedTeaReceipt);

            }

            if (bottomlessIcedTeaPrice > 0) {
                bottomlessIcedTeaReceipt = "\nBottomless Iced Tea*" + bottomlessIcedTeaSpinner.getValue() + "\t\t" + bottomlessIcedTeaPrice;
                receiptArea.setText(receiptArea.getText() + bottomlessIcedTeaReceipt);

            }

            if (disc == true) {
                String totalPriceFieldText = Double.toString(discount);
                totalPriceField.setText(totalPriceFieldText);
            } else {
                String totalPriceFieldText = Double.toString(totalPrice);
                totalPriceField.setText(totalPriceFieldText);
            }

        } else {
            if (totalPrice > 0) {
                JOptionPane.showMessageDialog(((Supplier<JDialog>) () -> {
                    final JDialog dialog = new JDialog();
                    dialog.setAlwaysOnTop(true);
                    return dialog;
                }).get(), "There is a pending Order!\nUse Manual Order to add more!");
            } else {
                pending = false;
            }

        }


    }//GEN-LAST:event_calculateButtonActionPerformed

    private void calculateButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calculateButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_calculateButtonKeyPressed
    // this pay button will check all the conditions like if there is a name entered by the cashier or
    // if the ammount entered is not enough for the total order price
    // this will also print the total ammount and total change in the receipt
    private void payOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payOrderActionPerformed
        // TODO add your handling code here:
        double pay = 0;

        if (pending) {

            pay = Double.parseDouble(ammountPaid.getText());
        }
        if (checkName()) {
            if (pending != false) {
                if ((discount > pay && disc == true) || (totalPrice > pay && disc != true)) {
                    JOptionPane.showMessageDialog(((Supplier<JDialog>) () -> {
                        final JDialog dialog = new JDialog();
                        dialog.setAlwaysOnTop(true);
                        return dialog;
                    }).get(), "ERROR: Ammount Paid is less than Total Price\nPlease Try again with the right ammount.");
                } else {
                    paid = true;
                    pending = false;
                    order = false;
                    if (discountComboBox.getSelectedIndex() == 1 || discountComboBox.getSelectedIndex() == 2) {
                        totalPrice = discount;
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

                    clear = true;
                    String ammoundPaidReceipt = "\nAmmount Paid\t\t\t" + Double.parseDouble(ammountPaid.getText());
                    String totalChangeReceipt = "\nChange\t\t\t" + totalChange;
                    receiptArea.setText(receiptArea.getText() + ammoundPaidReceipt);
                    receiptArea.setText(receiptArea.getText() + totalChangeReceipt);
                    String totalChangeText = Double.toString(totalChange);
                    Date date = new Date();
                    String strDateFormat = "hh:mm:ss a";
                    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
                    String formattedDate = dateFormat.format(date);
                    receiptArea.setText(receiptArea.getText() + "\n\n\nTIME: " + formattedDate);
                    receiptArea.setText(receiptArea.getText() + "\nDATE ISSUED: " + java.time.LocalDate.now());
                    receiptArea.setText(receiptArea.getText() + "\nVALID UNTIL: " + "2024-12-06");
                    receiptArea.setText(receiptArea.getText() + "\nCASHIER: " + firstName.getText() + " " + lastName.getText());
                    receiptArea.setText(receiptArea.getText() + "\nRECEIPT # " + getRandom(10000000, 99999999));
                    receiptArea.setText(receiptArea.getText() + "\n\n\t " + "THANK YOU!!!!!!");
                    try {
                        File file = new File("ReceiptRecords.txt");
                        try {
                            String filename = "ReceiptRecords.txt";
                            FileWriter fw = new FileWriter(filename, true);
                            fw.write(receiptArea.getText() + "\n\n\n\n\n\n------------------------------------------------------------------------\n");
                            fw.close();
                        } catch (IOException ioe) {

                        }
                    } catch (Exception e) {
                    }
                    disc = false;
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
                    totalPrice = 0;
                    ammountPaid.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(((Supplier<JDialog>) () -> {
                    final JDialog dialog = new JDialog();
                    dialog.setAlwaysOnTop(true);
                    return dialog;
                }).get(), "There is no pending Order!");

            }
        } else {
            JOptionPane.showMessageDialog(((Supplier<JDialog>) () -> {
                final JDialog dialog = new JDialog();
                dialog.setAlwaysOnTop(true);
                return dialog;
            }).get(), "Please Enter your name!");

        }


    }//GEN-LAST:event_payOrderActionPerformed

    private void payOrderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_payOrderKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_payOrderKeyPressed

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
    //manual order function
    // this function declares and inserts the binary tree
    // once the user entered the itemCode it will use binary search tree to search for price and name
    // adding using this will also add the product to the receipt are
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (pending == true) {
            if (clear == true) {
                receiptArea.setText(receipt);
                changeTextField.setText("");
            }
            BinaryTree listtree = new BinaryTree();
            clear = false;
            listtree.insert("RC01", "Burger Steak*" + manualOrderSpinner.getValue() + "    \t\t", 300001, 50.00);
            listtree.insert("RC02", "2pc Burger Steak*" + manualOrderSpinner.getValue() + "\t\t", 300002, 80.00);
            listtree.insert("B01", "Classic Burger*" + manualOrderSpinner.getValue() + "\t\t", 100001, 50.00);
            listtree.insert("B02", "Cheese Burger*" + manualOrderSpinner.getValue() + "\t\t", 100002, 60.00);
            listtree.insert("B03", "Double Patty Burger*" + manualOrderSpinner.getValue() + "\t\t", 100003, 120.00);
            listtree.insert("B04", "Triple Patty Burger*" + manualOrderSpinner.getValue() + "\t\t", 100004, 180.00);
            listtree.insert("B05", "Chicken Burger*" + manualOrderSpinner.getValue() + "    \t\t", 100005, 50.00);
            listtree.insert("B06", "Veggie Burger*" + manualOrderSpinner.getValue() + "\t\t", 100006, 50.00);
            listtree.insert("B07", "Egg n' Bacon Burger*" + manualOrderSpinner.getValue() + "\t\t", 100007, 60.00);
            listtree.insert("B08", "Supreme Burger*" + manualOrderSpinner.getValue() + "\t\t", 100008, 60.00);
            listtree.insert("F01", "Classic Fries*" + manualOrderSpinner.getValue() + "    \t\t", 200001, 30.00);
            listtree.insert("F02", "Chunky Fries*" + manualOrderSpinner.getValue() + "    \t\t", 200002, 40.00);
            listtree.insert("F03", "ShoeString Fries*" + manualOrderSpinner.getValue() + "\t\t", 200003, 40.00);
            listtree.insert("F04", "Sweet Potato Fries*" + manualOrderSpinner.getValue() + "\t\t", 200004, 40.00);
            listtree.insert("CRC01", "BurgSteak Combo Meal*" + manualOrderSpinner.getValue() + "\t\t", 300003, 100.00);
            listtree.insert("CRC02", "2pc BurgSteak Combo Meal*" + manualOrderSpinner.getValue() + "       \t", 300004, 160.00);
            listtree.insert("D1", "Regular Coke*" + manualOrderSpinner.getValue() + "   \t\t", 400001, 20.00);
            listtree.insert("D2", "Large Coke*" + manualOrderSpinner.getValue() + "\t\t\t", 400002, 70.00);
            listtree.insert("D3", "Regular Iced Tea*" + manualOrderSpinner.getValue() + "\t\t", 400003, 40.00);
            listtree.insert("D4", "Large Iced Tea*" + manualOrderSpinner.getValue() + "  \t\t", 400004, 70.00);
            listtree.insert("D5", "Bottomless Iced Tea*" + manualOrderSpinner.getValue() + "\t\t", 400005, 70.00);

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
            totalPrice = totalPrice + price;

            if (price > 0) {
                order = true;
                receiptArea.setText(receiptArea.getText() + "\n" + name + price);

            }

            if (disc == true) {
                String totalPriceFieldText = Double.toString(discount);
                totalPriceField.setText(totalPriceFieldText);
            } else {
                String totalPriceFieldText = Double.toString(totalPrice);
                totalPriceField.setText(totalPriceFieldText);
            }

            manualOrderIDCode.setText("");
            manualOrderSpinner.setValue(0);
        } else {
            JOptionPane.showMessageDialog(((Supplier<JDialog>) () -> {
                final JDialog dialog = new JDialog();
                dialog.setAlwaysOnTop(true);
                return dialog;
            }).get(), "Use Manual Order only if there is a pending order\nand you want to add more orders.");
            manualOrderIDCode.setText("");
            manualOrderSpinner.setValue(0);
        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void manualOrderIDCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manualOrderIDCodeKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_manualOrderIDCodeKeyPressed
    // this function will detect the changes in the discount combBox
    // if the chosen item is eligible for discount
    // the price will automatically be changed to the discounted price
    private void discountComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_discountComboBoxItemStateChanged
        // TODO add your handling code here:
        discount = totalPrice;
        if (discountComboBox.getSelectedIndex() == 1 || discountComboBox.getSelectedIndex() == 2) {
            disc = true;

            discount = totalPrice - (totalPrice * .20);
            String totalPriceFieldText = Double.toString(discount);
            totalPriceField.setText(totalPriceFieldText);

        } else {
            disc = false;
            String totalPriceFieldText = Double.toString(totalPrice);
            totalPriceField.setText(totalPriceFieldText);
        }
    }//GEN-LAST:event_discountComboBoxItemStateChanged
    // this function will print the receipt unless there are pending orders
    private void printReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printReceiptActionPerformed
        if (paid == true) {
            try {
                // TODO add your handling code here:
                setAlwaysOnTop(false);
                receiptArea.print();
                setAlwaysOnTop(true);
            } catch (PrinterException ex) {
                Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
            }
            receiptArea.setText(receipt);
            changeTextField.setText("");
            paid = false;
        } else {
            if(pending==false){
                JOptionPane.showMessageDialog(((Supplier<JDialog>) () -> {
                final JDialog dialog = new JDialog();
                dialog.setAlwaysOnTop(true);
                return dialog;
            }).get(), "There are no pending orders!");
            }else{
                JOptionPane.showMessageDialog(((Supplier<JDialog>) () -> {
                final JDialog dialog = new JDialog();
                dialog.setAlwaysOnTop(true);
                return dialog;
            }).get(), "The pending order is not yet paid!");
            }
            
        }


    }//GEN-LAST:event_printReceiptActionPerformed
    // this function will search for new drive inserted to the system
    // once found it will try to find a program named "suaburgers.txt"
    // it will compare the text inside the file to the saved text inside the system
    // if they are equal the program will delete all the pending orders and will reset
    // all conditions
    // there is also a 15 seconds countdown and if finished the void will cancel
    private void voidOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voidOrderActionPerformed
        // TODO add your handling code here:
        JOptionPane jop = new JOptionPane();
        jop.setMessageType(JOptionPane.PLAIN_MESSAGE);
        JDialog dialog = jop.createDialog(null, "Insert Flash Drive");
        dialog.setAlwaysOnTop(true);

        dialog.setSize(400, 170);
        dialog.setLocationRelativeTo(null);
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
                    jop.setMessage("Insert Flash Drive that contains void key.\nExiting in " + j + " seconds.\nClick OK to stop.");

                    for (int i = 0; i < letters.length; ++i) {
                        drives[i] = new File(letters[i] + ":/");

                        isDrive[i] = drives[i].canRead();
                    }
                    while (!stop) {
                        for (int i = 0; i < letters.length; ++i) {
                            boolean pluggedIn = drives[i].canRead();
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
                                        totalPriceField.setText("");
                                        clear = false;
                                        discountComboBox.setSelectedIndex(0);
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
                                        totalPrice = 0;
                                        ammountPaid.setText("");
                                        jop.setMessage("Void Complete");
                                        Thread.sleep(1200);
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
                        try {
                            if (stop != true) {
                                Thread.sleep(1000);
                                j--;
                                jop.setMessage("Insert Flash Drive that contains void key.\nExiting in " + j + " seconds.\nClick OK to stop.");
                            }

                        } catch (InterruptedException e) {
                        }
                        if (j == 0) {
                            stop = true;
                        }
                        if (!jop.isShowing()) {
                            stop = true;

                        }
                    }

                } catch (Exception e) {
                }
                dialog.dispose();
            }

        }).start();

        dialog.setVisible(true);
    }//GEN-LAST:event_voidOrderActionPerformed

    private void voidOrderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_voidOrderKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_voidOrderKeyPressed

    private void firstNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameKeyPressed
    // this functions checks if there are names inserted by the cashier operator
    boolean checkName() {
        if ((!firstName.getText().isEmpty() && (!lastName.getText().isEmpty()))) {
            return true;
        }
        return false;
    }
    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void manualOrderIDCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualOrderIDCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manualOrderIDCodeActionPerformed

    private void sweetPotatoSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sweetPotatoSpinnerStateChanged
        // TODO add your handling code here:
        int qty;
        sweetpotatoFriesPrice = list.search("F04");
        qty = (int) sweetPotatoSpinner.getValue();
        sweetpotatoFriesPrice = sweetpotatoFriesPrice * qty;
    }//GEN-LAST:event_sweetPotatoSpinnerStateChanged

    private void shoeStringSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_shoeStringSpinnerStateChanged
        // TODO add your handling code here:
        int qty;
        shoestringFriesPrice = list.search("F03");
        qty = (int) shoeStringSpinner.getValue();
        shoestringFriesPrice = shoestringFriesPrice * qty;
    }//GEN-LAST:event_shoeStringSpinnerStateChanged

    private void chunkyFriesSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chunkyFriesSpinnerStateChanged
        // TODO add your handling code here:
        int qty;
        chunkyFriesPrice = list.search("F02");
        qty = (int) chunkyFriesSpinner.getValue();
        chunkyFriesPrice = chunkyFriesPrice * qty;
    }//GEN-LAST:event_chunkyFriesSpinnerStateChanged

    private void classicFriesSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_classicFriesSpinnerStateChanged
        // TODO add your handling code here:
        int qty;
        classicFriesPrice = list.search("F01");
        qty = (int) classicFriesSpinner.getValue();
        classicFriesPrice = classicFriesPrice * qty;
    }//GEN-LAST:event_classicFriesSpinnerStateChanged

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
//this will calculate the discount for the orders

    public static int getRandom(int min, int max) {
        int x = (int) ((Math.random() * ((max - min) + 1)) + min);
        return x;
    }

    void calculateDisc() {
        discount = totalPrice;
        if (discountComboBox.getSelectedIndex() == 1 || discountComboBox.getSelectedIndex() == 2) {
            disc = true;

            discount = totalPrice - (totalPrice * .20);
            String totalPriceFieldText = Double.toString(discount);
            totalPriceField.setText(totalPriceFieldText);

        } else {
            disc = false;
            String totalPriceFieldText = Double.toString(totalPrice);
            totalPriceField.setText(totalPriceFieldText);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Coke1;
    private javax.swing.JLabel Coke2;
    private javax.swing.JLabel Icetea1;
    private javax.swing.JLabel Icetea2;
    private javax.swing.JLabel Icetea3;
    private javax.swing.JLabel afafasfasfa;
    private javax.swing.JTextField ammountPaid;
    private javax.swing.JLabel asfasf;
    private javax.swing.JSpinner bottomlessIcedTeaSpinner;
    private javax.swing.JSpinner burgSteakCMSpinner;
    private javax.swing.JSpinner burgSteakCMSpinner2;
    private javax.swing.JLabel burger1;
    private javax.swing.JLabel burger2;
    private javax.swing.JScrollPane burgerScrollPane;
    private javax.swing.JSpinner burgerSteakSpinner;
    private javax.swing.JSpinner burgerSteakSpinner2;
    private javax.swing.JLabel burgermeal1;
    private javax.swing.JLabel burgermeal2;
    private javax.swing.JPanel burgersPane;
    private javax.swing.JButton calculateButton;
    private javax.swing.JTextField changeTextField;
    private javax.swing.JLabel cheese;
    private javax.swing.JSpinner cheeseBurgerSpinner;
    private javax.swing.JLabel chicken;
    private javax.swing.JSpinner chickenBurgerSpinner;
    private javax.swing.JLabel chunky;
    private javax.swing.JSpinner chunkyFriesSpinner;
    private javax.swing.JLabel classic;
    private javax.swing.JSpinner classicBurgerSpinner;
    private javax.swing.JSpinner classicFriesSpinner;
    private javax.swing.JLabel classicfries;
    private javax.swing.JComboBox<String> discountComboBox;
    private javax.swing.JSpinner doublePattyBurgerSpinner;
    private javax.swing.JLabel doublepatty;
    private javax.swing.JPanel drinksPane;
    private javax.swing.JScrollPane drinksScrollPane;
    private javax.swing.JSpinner eggBaconBurgerSpinner;
    private javax.swing.JLabel eggnbacon;
    private javax.swing.JTextField firstName;
    private javax.swing.JPanel friesPane;
    private javax.swing.JScrollPane friesScrollPane;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel38;
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
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner largeCokeSpinner;
    private javax.swing.JSpinner largeIcedTeaSpinner;
    private javax.swing.JTextField lastName;
    private javax.swing.JPanel logOutButton;
    private javax.swing.JTextField manualOrderIDCode;
    private javax.swing.JSpinner manualOrderSpinner;
    private javax.swing.JButton payOrder;
    private javax.swing.JButton printReceipt;
    private javax.swing.JTextArea receiptArea;
    private javax.swing.JSpinner regularCokeSpinner;
    private javax.swing.JSpinner regularIcedTeaSpinner;
    private javax.swing.JPanel riceMeals;
    private javax.swing.JScrollPane riceMealsScrollPane;
    private javax.swing.JSpinner shoeStringSpinner;
    private javax.swing.JLabel shoestring;
    private javax.swing.JLabel supreme;
    private javax.swing.JSpinner supremeBurgerSpinner;
    private javax.swing.JSpinner sweetPotatoSpinner;
    private javax.swing.JTextField totalPriceField;
    private javax.swing.JSpinner triplePattyBurgerSpinner;
    private javax.swing.JLabel triplepatty;
    private javax.swing.JLabel veggie;
    private javax.swing.JSpinner veggieBurgerSpinner;
    private javax.swing.JButton voidOrder;
    // End of variables declaration//GEN-END:variables
}
