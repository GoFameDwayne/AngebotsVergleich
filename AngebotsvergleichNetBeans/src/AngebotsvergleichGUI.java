
import Controller.ProductCompareController;
import Models.*;

import Models.Place;
import Models.Product;
import Models.Product.AmountType;
import Repository.DataProvider;
import java.awt.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AngebotsvergleichGUI extends javax.swing.JFrame {

    private ProductCompareController ProductCompareController;
    
    public AngebotsvergleichGUI() {
        initComponents();
        ProductCompareController = new ProductCompareController(new DataProvider());
        List<Place> Places = ProductCompareController.getDataProvider().GetPlaces();
        FillCombobox(cbMPlace, Places);
        FillCombobox(cbPProductTypes, ProductCompareController.getDataProvider().GetProductTypes());
        FillCombobox(cbCPlace,Places);
        FillCombobox(cbPrCompany, ProductCompareController.getDataProvider().GetCompanies());
        FillCombobox(cbPrMarket, ProductCompareController.getDataProvider().GetMarkets());
                
        tblProductCompare.getColumnModel().removeColumn(tblProductCompare.getColumn("ID"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane5 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductCompare = new javax.swing.JTable();
        btnCompareProduct = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TxtCompareDescription1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        TxtCompareDescription2 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        TxtCompareProductNumber1 = new javax.swing.JTextField();
        TxtCompareAmount1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLblPercentage1 = new javax.swing.JLabel();
        jLblPercentage2 = new javax.swing.JLabel();
        TxtCompareProductNumber2 = new javax.swing.JTextField();
        TxtCompareAmount2 = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        txtPrProductNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrAmount = new javax.swing.JTextField();
        cbPrCompany = new javax.swing.JComboBox<String>();
        jLabel8 = new javax.swing.JLabel();
        cbPrMarket = new javax.swing.JComboBox<String>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPaneDescription = new javax.swing.JTextArea();
        btAddProduct = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        cbPProductTypes = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtPtName = new javax.swing.JTextField();
        btAddProductType = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btAddCompany = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtCName = new javax.swing.JTextField();
        cbCPlace = new javax.swing.JComboBox<String>();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btAddMarket = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtMName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbMPlace = new javax.swing.JComboBox<String>();
        jPanel8 = new javax.swing.JPanel();
        btAddPlace = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtPlStreet = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPlPLZ = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPlCity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSearchTerm = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Angebotsvergleich");

        tblProductCompare.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Bezeichnung", "Produktnummer", "Preis", "Markt"
            }
        ));
        jScrollPane1.setViewportView(tblProductCompare);

        btnCompareProduct.setText("vergleichen");
        btnCompareProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompareProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCompareProduct))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCompareProduct)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Normal-Vergleich", jPanel2);

        jLabel4.setText("Direkter Vergleich");

        TxtCompareDescription1.setColumns(20);
        TxtCompareDescription1.setRows(5);
        jScrollPane4.setViewportView(TxtCompareDescription1);

        TxtCompareDescription2.setColumns(20);
        TxtCompareDescription2.setRows(5);
        jScrollPane5.setViewportView(TxtCompareDescription2);

        jLabel18.setText("Produktnummer:");

        jLabel19.setText("Beschreibung");

        jLabel20.setText("Preis:");

        jLabel21.setText("Vergleich");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLblPercentage1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCompareProductNumber1)
                                    .addComponent(TxtCompareAmount1))))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblPercentage2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtCompareAmount2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(TxtCompareProductNumber2, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(TxtCompareProductNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCompareProductNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCompareAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(TxtCompareAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLblPercentage1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblPercentage2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Direkt-Vergleich", jPanel3);

        txtPrProductNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrProductNumberActionPerformed(evt);
            }
        });

        jLabel2.setText("Produktnummer");

        jLabel5.setText("Preis");

        jLabel8.setText("Hersteller");

        jLabel7.setText("Markt");

        jLabel6.setText("Beschreibung");

        txtPaneDescription.setColumns(20);
        txtPaneDescription.setRows(5);
        jScrollPane2.setViewportView(txtPaneDescription);

        btAddProduct.setText("AddData");
        btAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddProductActionPerformed(evt);
            }
        });

        jLabel17.setText("Produk Typ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btAddProduct))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbPProductTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrProductNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(cbPrMarket, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(cbPrCompany, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(84, 84, 84))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPrProductNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbPrMarket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cbPrCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cbPProductTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAddProduct)
                .addGap(43, 43, 43))
        );

        jTabbedPane2.addTab("Produkt", jPanel4);

        jLabel9.setText("Name");

        txtPtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPtNameActionPerformed(evt);
            }
        });

        btAddProductType.setText("AddData");
        btAddProductType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddProductTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPtName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(357, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAddProductType)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(btAddProductType)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Produkttyp", jPanel5);

        btAddCompany.setText("AddData");
        btAddCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCompanyActionPerformed(evt);
            }
        });

        jLabel10.setText("Name");

        txtCName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNameActionPerformed(evt);
            }
        });

        jLabel11.setText("Ort");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAddCompany)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(btAddCompany)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Unternehmen", jPanel6);

        btAddMarket.setText("AddData");
        btAddMarket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddMarketActionPerformed(evt);
            }
        });

        jLabel12.setText("Name");

        txtMName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMNameActionPerformed(evt);
            }
        });

        jLabel13.setText("Ort");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(414, Short.MAX_VALUE)
                .addComponent(btAddMarket)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cbMPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(btAddMarket)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Markt", jPanel7);

        jPanel8.setToolTipText("");
        jPanel8.setMaximumSize(new java.awt.Dimension(521, 204));
        jPanel8.setMinimumSize(new java.awt.Dimension(521, 204));
        jPanel8.setPreferredSize(new java.awt.Dimension(521, 204));

        btAddPlace.setText("AddData");
        btAddPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddPlaceActionPerformed(evt);
            }
        });

        jLabel14.setText("Straße");

        txtPlStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlStreetActionPerformed(evt);
            }
        });

        jLabel15.setText("PLZ");

        txtPlPLZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlPLZActionPerformed(evt);
            }
        });

        jLabel16.setText("Stadt");

        txtPlCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 402, Short.MAX_VALUE)
                        .addComponent(btAddPlace))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPlStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlPLZ, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlCity, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 253, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlPLZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAddPlace)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Ort", jPanel8);

        jTabbedPane1.addTab("Daten hinzufügen", jTabbedPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Suche");

        btnSearch.setText("Los!!");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearchTerm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSearchTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private <T extends IEntity> void FillCombobox(JComboBox combobox, List<T> Entities){
        for(IEntity entity:Entities){
            combobox.addItem(entity);
        }
    }
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchString = txtSearchTerm.getText();
        List<Product> ProductList = new ArrayList<Product>();
        if(!"".equals(searchString))
        {
            ProductList = ProductCompareController.getDataProvider().GetProductsByNumber(searchString);
        }else{
            ProductList = ProductCompareController.getDataProvider().GetProducts();
        }
        DefaultTableModel model = (DefaultTableModel) tblProductCompare.getModel();
        model.setRowCount(0);
        for(Product product : ProductList)
        {
            model.addRow(new Object[]{product.getID(), product.getDescription(),product.getProductNumber(),"Preis",product.getMarket()});
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCompareProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompareProductActionPerformed
        int[] Selection = tblProductCompare.getSelectedRows();
        UUID SelectedId1;
        UUID SelectedId2;
        if(Selection.length == 2){
            SelectedId1 = UUID.fromString(String.valueOf(tblProductCompare.getModel().getValueAt(Selection[0], 0)));
            SelectedId2 = UUID.fromString(String.valueOf(tblProductCompare.getModel().getValueAt(Selection[1], 0)));
            ProductCompareController.setProduct1(ProductCompareController.getDataProvider().GetProductsById(SelectedId1));
            ProductCompareController.setProduct2(ProductCompareController.getDataProvider().GetProductsById(SelectedId2));
            TxtCompareAmount1.setText(String.valueOf(ProductCompareController.getProduct1().getAmount()));
            TxtCompareAmount2.setText(String.valueOf(ProductCompareController.getProduct2().getAmount()));
            TxtCompareProductNumber1.setText(ProductCompareController.getProduct1().getProductNumber());
            TxtCompareProductNumber2.setText(ProductCompareController.getProduct2().getProductNumber());
            TxtCompareDescription1.setText(ProductCompareController.getProduct1().getDescription());
            TxtCompareDescription2.setText(ProductCompareController.getProduct2().getDescription());
            
            ProductCompareController.getBetterProduct();
            jLblPercentage1.setText(String.valueOf(ProductCompareController.getPricePercentage1()));
            jLblPercentage2.setText(String.valueOf(ProductCompareController.getPricePercentage2()));
            jLblPercentage1.setOpaque(true);
            jLblPercentage2.setOpaque(true);
            if(ProductCompareController.getPricePercentage1() > ProductCompareController.getPricePercentage2()){
                jLblPercentage1.setBackground(Color.green);
                jLblPercentage2.setBackground(Color.red);
            }else if(ProductCompareController.getPricePercentage1() < ProductCompareController.getPricePercentage2()){
                jLblPercentage1.setBackground(Color.red);
                jLblPercentage2.setBackground(Color.green);
            }else{
                jLblPercentage1.setBackground(Color.yellow);
                jLblPercentage2.setBackground(Color.yellow); 
            }
        }else{
            return;
        }
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnCompareProductActionPerformed
    
    private void txtPtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPtNameActionPerformed

    private void btAddProductTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddProductTypeActionPerformed
        ProductType ProductType = new ProductType();
        ProductType.setID(UUID.randomUUID());
        ProductType.setName(txtPtName.getText());
        ProductCompareController.getDataProvider().SaveProductType(ProductType);
    }//GEN-LAST:event_btAddProductTypeActionPerformed

    private void btAddCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCompanyActionPerformed
        Company Company = new Company();
        Company.setID(UUID.randomUUID());
        Company.setName(txtCName.getText());
        Company.setPlace((Place) cbCPlace.getSelectedItem());
        ProductCompareController.getDataProvider().SaveCompany(Company);
    }//GEN-LAST:event_btAddCompanyActionPerformed

    private void btAddMarketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddMarketActionPerformed
        Market Market = new Market();
        Market.setID(UUID.randomUUID());
        Market.setName(txtMName.getText());
        Market.setPlace((Place)cbMPlace.getSelectedItem());
        ProductCompareController.getDataProvider().SaveMarket(Market);
    }//GEN-LAST:event_btAddMarketActionPerformed

    private void btAddPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddPlaceActionPerformed
        Place Place = new Place();
        Place.setID(UUID.randomUUID());
        Place.setStreet(txtPlStreet.getText());
        Place.setCity(txtPlCity.getText());
        Place.setZipCode(txtPlPLZ.getText());
        ProductCompareController.getDataProvider().SavePlace(Place);
    }//GEN-LAST:event_btAddPlaceActionPerformed

    private void txtCNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCNameActionPerformed

    private void btAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddProductActionPerformed
        Product Product = new Product();
        Product.setID(UUID.randomUUID());
        Product.setAmount(Double.parseDouble(txtPrAmount.getText()));
        Product.setAmountTypeInt(AmountType.euro.ordinal());
        Product.setCompany((Company) cbPrCompany.getSelectedItem());
        Product.setDescription(txtPaneDescription.getText());
        Product.setMarket((Market)cbPrMarket.getSelectedItem());
        Product.setProductNumber(txtPrProductNumber.getText());
        Product.setProductType((ProductType)cbPProductTypes.getSelectedItem());
        ProductCompareController.getDataProvider().SaveProduct(Product);
    }//GEN-LAST:event_btAddProductActionPerformed

    private void txtPrProductNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrProductNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrProductNumberActionPerformed

    private void txtMNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMNameActionPerformed

    private void txtPlStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlStreetActionPerformed

    private void txtPlPLZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlPLZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlPLZActionPerformed

    private void txtPlCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlCityActionPerformed

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
            java.util.logging.Logger.getLogger(AngebotsvergleichGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AngebotsvergleichGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AngebotsvergleichGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AngebotsvergleichGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AngebotsvergleichGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtCompareAmount1;
    private javax.swing.JTextField TxtCompareAmount2;
    private javax.swing.JTextArea TxtCompareDescription1;
    private javax.swing.JTextArea TxtCompareDescription2;
    private javax.swing.JTextField TxtCompareProductNumber1;
    private javax.swing.JTextField TxtCompareProductNumber2;
    private javax.swing.JButton btAddCompany;
    private javax.swing.JButton btAddMarket;
    private javax.swing.JButton btAddPlace;
    private javax.swing.JButton btAddProduct;
    private javax.swing.JButton btAddProductType;
    private javax.swing.JButton btnCompareProduct;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbCPlace;
    private javax.swing.JComboBox<String> cbMPlace;
    private javax.swing.JComboBox cbPProductTypes;
    private javax.swing.JComboBox<String> cbPrCompany;
    private javax.swing.JComboBox<String> cbPrMarket;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblPercentage1;
    private javax.swing.JLabel jLblPercentage2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable tblProductCompare;
    private javax.swing.JTextField txtCName;
    private javax.swing.JTextField txtMName;
    private javax.swing.JTextArea txtPaneDescription;
    private javax.swing.JTextField txtPlCity;
    private javax.swing.JTextField txtPlPLZ;
    private javax.swing.JTextField txtPlStreet;
    private javax.swing.JTextField txtPrAmount;
    private javax.swing.JTextField txtPrProductNumber;
    private javax.swing.JTextField txtPtName;
    private javax.swing.JTextField txtSearchTerm;
    // End of variables declaration//GEN-END:variables
}
