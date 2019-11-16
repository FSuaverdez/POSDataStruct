
import java.awt.Color;
import java.awt.Dialog;
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
        list.insert("RC01", "Burger Steak", 101010, 50.00);
        list.insert("RC02", "2pc Burger Steak", 202020, 80.00);
        list.insert("CRC01", "BurgSteak Combo Meal", 303030, 100.00);
        list.insert("CRC02", "2pc BurgSteak Combo Meal", 404040, 160.00);
        list.insert("D1", "Regular Coke", 01010, 20.00);
        list.insert("D2", "Large Coke", 02020, 70.00);
        list.insert("D3", "Regular Iced Tea", 03030, 40.00);
        list.insert("D4", "Large Iced Tea", 04040, 70.00);
        list.insert("D5", "Bottomless Iced Tea", 05050, 70.00);

    }
    boolean pending = false;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
                .addContainerGap(42, Short.MAX_VALUE)
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

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 203, -1));

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
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 203, -1));

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
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 203, -1));

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
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 200, -1));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logOutButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        logOutButtonLayout.setVerticalGroup(
            logOutButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOutButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, -1, -1));

        receiptArea.setColumns(20);
        receiptArea.setRows(5);
        jScrollPane1.setViewportView(receiptArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 380, 300, 270));

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

        burgerScrollPane.setViewportView(burgersPane);

        jPanel1.add(burgerScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 670, 513));

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

        javax.swing.GroupLayout friesPaneLayout = new javax.swing.GroupLayout(friesPane);
        friesPane.setLayout(friesPaneLayout);
        friesPaneLayout.setHorizontalGroup(
            friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(friesPaneLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(friesPaneLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(classicFriesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jLabel17))))
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
                                .addComponent(shoeStringSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)))))
                .addGap(117, 117, 117))
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
                .addGap(35, 35, 35)
                .addGroup(friesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(friesPaneLayout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shoeStringSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
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
                        .addGap(49, 49, 49)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chunkyFriesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        friesScrollPane.setViewportView(friesPane);

        jPanel1.add(friesScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 670, 513));

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

        riceMealsScrollPane.setViewportView(riceMeals);

        jPanel1.add(riceMealsScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 670, 513));

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

        drinksPane.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jLabel29.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel29.setText("Large Coke");
        drinksPane.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        largeCokeSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        largeCokeSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                largeCokeSpinnerStateChanged(evt);
            }
        });
        drinksPane.add(largeCokeSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 60, -1));

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

        drinksPane.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        jLabel31.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel31.setText("Large Iced Tea");
        drinksPane.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        largeIcedTeaSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        largeIcedTeaSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                largeIcedTeaSpinnerStateChanged(evt);
            }
        });
        drinksPane.add(largeIcedTeaSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 60, -1));

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

        drinksPane.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        jLabel32.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel32.setText("Bottomless Iced Tea");
        drinksPane.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, -1, -1));

        bottomlessIcedTeaSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        bottomlessIcedTeaSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bottomlessIcedTeaSpinnerStateChanged(evt);
            }
        });
        drinksPane.add(bottomlessIcedTeaSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, 60, -1));

        drinksScrollPane.setViewportView(drinksPane);

        jPanel1.add(drinksScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 670, 513));

        jButton1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jButton1.setText("VOID");
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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 340, 70, 23));

        totalPriceField.setEditable(false);
        totalPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceFieldActionPerformed(evt);
            }
        });
        jPanel1.add(totalPriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 220, 100, -1));

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("DISCOUNT:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, -1, -1));

        ammountPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ammountPaidActionPerformed(evt);
            }
        });
        jPanel1.add(ammountPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 280, 100, -1));

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("AMOUNT PAID");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, -1, 20));

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CHANGE:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 320, -1, -1));

        changeTextField.setEditable(false);
        changeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(changeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, 100, -1));

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
        jPanel1.add(calculateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 220, 110, -1));

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
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 280, 70, 23));

        jButton2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jButton2.setText("PRINT RECEIPT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 670, -1, -1));

        jLabel23.setFont(new java.awt.Font("Bahnschrift", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("TOTAL PRICE:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 200, -1, -1));

        discountComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Senior Citizen", "PWD" }));
        discountComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(discountComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 170, 100, -1));

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
                    int j=15;
                    jop.setMessage("Insert Flash Drive that contains void key.\nExiting in "+ j + " seconds.");
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
                                        totalPrice=0;
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
                            jop.setMessage("Insert Flash Drive that contains void key.\nExiting in "+j + " seconds.");
                        } catch (InterruptedException e) {
                            /* do nothing */ }
                        if(j==0){
                            stop=true;
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
    String receipt = "**************************************************"
            + "\n                           SUABURGERS"
            + "\n**************************************************\n";

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // TODO add your handling code here:
        if (pending == false) {
            pending = true;
            receiptArea.setText(receipt);
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
            totalPrice = classicBurgerPrice + chickenBurgerPrice + cheeseBurgerPrice + veggieBurgerPrice + doublePattyBurgerPrice + triplePattyBurgerPrice + eggBaconBurgerPrice + supremeBurgerPrice;
            totalPrice = totalPrice + classicFriesPrice + chunkyFriesPrice + shoestringFriesPrice + sweetpotatoFriesPrice;
            totalPrice = totalPrice + burgerSteakPrice + burgerSteak2Price + burgSteakCMPrice + burgSteak2CMPrice;
            totalPrice = totalPrice + regularCokePrice + largeCokePrice + regularIcedTeaPrice + largeIcedTeaPrice + bottomlessIcedTeaPrice;
            //receiptArea.setText("**************************************************\n");
            //receiptArea.setText(receiptArea.getText() + "*                          SUABURGERS                          *\n");
            //receiptArea.setText(receiptArea.getText() + "**************************************************\n");
            if (classicBurgerPrice > 0) {
                classicBurgerReceipt = "\nClassic Burger................................................" + classicBurgerPrice;
                receiptArea.setText(receiptArea.getText() + classicBurgerReceipt);
                classicBurgerSpinner.setValue(0);
            }

            if (chickenBurgerPrice > 0) {
                chickenBurgerReceipt = "\nChicken Burger..............................................." + chickenBurgerPrice;
                receiptArea.setText(receiptArea.getText() + chickenBurgerReceipt);
                chickenBurgerSpinner.setValue(0);
            }

            if (cheeseBurgerPrice > 0) {
                cheeseBurgerReceipt = "\nCheese Burger..............................................." + cheeseBurgerPrice;
                receiptArea.setText(receiptArea.getText() + cheeseBurgerReceipt);
                cheeseBurgerSpinner.setValue(0);
            }

            if (veggieBurgerPrice > 0) {
                veggieBurgerReceipt = "\nVeggie Burger................................................." + veggieBurgerPrice;
                receiptArea.setText(receiptArea.getText() + veggieBurgerReceipt);
                veggieBurgerSpinner.setValue(0);
            }

            if (doublePattyBurgerPrice > 0) {
                doublePattyBurgerReceipt = "\nDouble Patty Burger......................................" + doublePattyBurgerPrice;
                receiptArea.setText(receiptArea.getText() + doublePattyBurgerReceipt);
                doublePattyBurgerSpinner.setValue(0);
            }

            if (triplePattyBurgerPrice > 0) {
                triplePattyBurgerReceipt = "\nTriple Patty Burger........................................." + triplePattyBurgerPrice;
                receiptArea.setText(receiptArea.getText() + triplePattyBurgerReceipt);
                triplePattyBurgerSpinner.setValue(0);
            }

            if (eggBaconBurgerPrice > 0) {
                eggBaconBurgerReceipt = "\nEgg Bacon Burger........................................." + eggBaconBurgerPrice;
                receiptArea.setText(receiptArea.getText() + eggBaconBurgerReceipt);
                eggBaconBurgerSpinner.setValue(0);
            }

            if (supremeBurgerPrice > 0) {
                supremeBurgerReceipt = "\nSupreme Burger............................................" + supremeBurgerPrice;
                receiptArea.setText(receiptArea.getText() + supremeBurgerReceipt);
                supremeBurgerSpinner.setValue(0);
            }

            if (classicFriesPrice > 0) {
                classicFriesReceipt = "\nClassic Fries...................................................." + classicFriesPrice;
                receiptArea.setText(receiptArea.getText() + classicFriesReceipt);
                classicFriesSpinner.setValue(0);
            }

            if (chunkyFriesPrice > 0) {
                chunkyFriesReceipt = "\nChunky Fries...................................................." + chunkyFriesPrice;
                receiptArea.setText(receiptArea.getText() + chunkyFriesReceipt);
                chunkyFriesSpinner.setValue(0);
            }

            if (shoestringFriesPrice > 0) {
                shoestringFriesReceipt = "\nShoeString Fries............................................." + shoestringFriesPrice;
                receiptArea.setText(receiptArea.getText() + shoestringFriesReceipt);
                shoeStringSpinner.setValue(0);
            }

            if (sweetpotatoFriesPrice > 0) {
                sweetpotatoFriesReceipt = "\nSweet Potato Fries........................................." + sweetpotatoFriesPrice;
                receiptArea.setText(receiptArea.getText() + sweetpotatoFriesReceipt);
                sweetPotatoSpinner.setValue(0);
            }

            if (burgerSteakPrice > 0) {
                burgSteakReceipt = "\nBurger Steak..................................................." + burgerSteakPrice;
                receiptArea.setText(receiptArea.getText() + burgSteakReceipt);
                burgerSteakSpinner.setValue(0);
            }

            if (burgerSteak2Price > 0) {
                burgSteak2Receipt = "\n2 pcs. Burger Steak......................................." + burgerSteak2Price;
                receiptArea.setText(receiptArea.getText() + burgSteak2Receipt);
                burgerSteakSpinner2.setValue(0);
            }

            if (burgSteakCMPrice > 0) {
                burgSteakCMReceipt = "\nBurger Steak Combo Meal.........................." + burgSteakCMPrice;
                receiptArea.setText(receiptArea.getText() + burgSteakCMReceipt);
                burgSteakCMSpinner.setValue(0);
            }

            if (burgSteak2CMPrice > 0) {
                burgSteakCM2Receipt = "\n2 pcs. Burger Steak Combo Meal.............." + burgSteak2CMPrice;
                receiptArea.setText(receiptArea.getText() + burgSteakCM2Receipt);
                burgSteakCMSpinner2.setValue(0);
            }

            if (regularCokePrice > 0) {
                regularCokeReceipt = "\nRegular Coke................................................." + regularCokePrice;
                receiptArea.setText(receiptArea.getText() + regularCokeReceipt);
                regularCokeSpinner.setValue(0);
            }
            if (largeCokePrice > 0) {
                largeCokeReceipt = "\nLarge Coke....................................................." + largeCokePrice;
                receiptArea.setText(receiptArea.getText() + largeCokeReceipt);
                largeCokeSpinner.setValue(0);
            }
            if (regularIcedTeaPrice > 0) {
                regularIcedTeaReceipt = "\nRegular Iced Tea..........................................." + regularIcedTeaPrice;
                receiptArea.setText(receiptArea.getText() + regularIcedTeaReceipt);
                regularIcedTeaSpinner.setValue(0);
            }
            if (largeIcedTeaPrice > 0) {
                largeIcedTeaReceipt = "\nLarge Iced Tea..............................................." + largeIcedTeaPrice;
                receiptArea.setText(receiptArea.getText() + largeIcedTeaReceipt);
                largeIcedTeaSpinner.setValue(0);
            }

            if (bottomlessIcedTeaPrice > 0) {
                bottomlessIcedTeaReceipt = "\nBottomless Iced Tea...................................." + bottomlessIcedTeaPrice;
                receiptArea.setText(receiptArea.getText() + bottomlessIcedTeaReceipt);
                bottomlessIcedTeaSpinner.setValue(0);
            }

            if (discountComboBox.getSelectedIndex() == 1 || discountComboBox.getSelectedIndex() == 2) {
                totalPrice = totalPrice - (totalPrice * .20);
                String totalPriceReceipt = "\n\nTotal Amount  (20%)Discount......................." + totalPrice;
                receiptArea.setText(receiptArea.getText() + totalPriceReceipt);
                String totalPriceFieldText = Double.toString(totalPrice);
                totalPriceField.setText(totalPriceFieldText);
                discountComboBox.setSelectedIndex(0);
            } else {
                String totalPriceReceipt = "\n\nTotal Amount..............................................." + totalPrice;
                receiptArea.setText(receiptArea.getText() + totalPriceReceipt);
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

        pending = false;
        totalChange = Double.parseDouble(ammountPaid.getText()) - totalPrice;
        String ammoundPaidReceipt = "\nAmmount Paid................................................" + Double.parseDouble(ammountPaid.getText());
        String totalChangeReceipt = "\nChange............................................................." + totalChange;
        receiptArea.setText(receiptArea.getText() + ammoundPaidReceipt);
        receiptArea.setText(receiptArea.getText() + totalChangeReceipt);
        String totalChangeText = Double.toString(totalChange);
        changeTextField.setText(totalChangeText);
        totalPriceField.setText("");

        ammountPaid.setText("");


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
        try {

            receiptArea.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
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

    private void discountComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountComboBoxActionPerformed

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
        int qty = 0;
        bottomlessIcedTeaPrice = list.search("D5");
        qty = (int) bottomlessIcedTeaSpinner.getValue();
        bottomlessIcedTeaPrice = bottomlessIcedTeaPrice * qty;
    }//GEN-LAST:event_bottomlessIcedTeaSpinnerStateChanged

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
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
