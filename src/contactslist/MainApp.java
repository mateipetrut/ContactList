
package contactslist;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class MainApp extends javax.swing.JFrame {

    private DefaultListModel people = new DefaultListModel();
    private DefaultComboBoxModel sort = new DefaultComboBoxModel(Sorting.values());
    private DefaultComboBoxModel filter = new DefaultComboBoxModel(Filter.values());
    BufferedImage icon, image;
    
    public MainApp() {
        initComponents();
        list.setModel(people);
        sortItems.setModel(sort);
        filterItems.setModel(filter);
        try {
           icon = ImageIO.read(new File("src\\images\\icon.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        super.setIconImage(icon);
        super.setTitle("Agenda");
        open.setVisible(false);
        Database.displayInJList(people);
    }

    @SuppressWarnings("unchecked")
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addWindow = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        phoneCheck = new javax.swing.JCheckBox();
        firstName = new javax.swing.JTextField();
        surName = new javax.swing.JTextField();
        bDay = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        modifyWindow = new javax.swing.JFrame();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        modifyButton = new javax.swing.JButton();
        cancelButtonM = new javax.swing.JButton();
        phoneCheckM = new javax.swing.JCheckBox();
        firstNameM = new javax.swing.JTextField();
        surNameM = new javax.swing.JTextField();
        bDayM = new javax.swing.JTextField();
        phoneM = new javax.swing.JTextField();
        addBt = new javax.swing.JButton();
        deleteBt = new javax.swing.JButton();
        editBt = new javax.swing.JButton();
        filterButton = new javax.swing.JButton();
        sortButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        filterItems = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        filtru = new javax.swing.JTextField();
        sortItems = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        resetButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        files = new javax.swing.JMenu();
        open = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        inregistrare = new javax.swing.JMenuItem();
        despre = new javax.swing.JMenuItem();

        addWindow.setAlwaysOnTop(true);
        addWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setText("Nume:");

        jLabel5.setText("Prenume:");

        jLabel6.setText("Data nasterii (AAAA-LL-ZZ):");

        jLabel7.setText("Telefon:");

        addButton.setText("Adauga");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Anulare");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        phoneCheck.setText("Fix");

        javax.swing.GroupLayout addWindowLayout = new javax.swing.GroupLayout(addWindow.getContentPane());
        addWindow.getContentPane().setLayout(addWindowLayout);
        addWindowLayout.setHorizontalGroup(
            addWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addWindowLayout.createSequentialGroup()
                .addGroup(addWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addWindowLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(addButton)
                        .addGap(60, 60, 60)
                        .addComponent(cancelButton))
                    .addGroup(addWindowLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(addWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(addWindowLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(37, 37, 37)
                                .addComponent(phoneCheck)))
                        .addGap(24, 24, 24)
                        .addGroup(addWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstName)
                            .addComponent(surName)
                            .addComponent(bDay)
                            .addComponent(phone, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        addWindowLayout.setVerticalGroup(
            addWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addWindowLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(addWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(addWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(surName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(addWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(addWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(phoneCheck)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(addWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        modifyWindow.setAlwaysOnTop(true);
        modifyWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel8.setText("Nume:");

        jLabel9.setText("Prenume:");

        jLabel10.setText("Data nasterii (AAAA-LL-ZZ):");

        jLabel11.setText("Telefon:");

        modifyButton.setText("Modifica");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        cancelButtonM.setText("Anulare");
        cancelButtonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonMActionPerformed(evt);
            }
        });

        phoneCheckM.setText("Fix");

        javax.swing.GroupLayout modifyWindowLayout = new javax.swing.GroupLayout(modifyWindow.getContentPane());
        modifyWindow.getContentPane().setLayout(modifyWindowLayout);
        modifyWindowLayout.setHorizontalGroup(
            modifyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyWindowLayout.createSequentialGroup()
                .addGroup(modifyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modifyWindowLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(modifyButton)
                        .addGap(60, 60, 60)
                        .addComponent(cancelButtonM))
                    .addGroup(modifyWindowLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(modifyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(modifyWindowLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(37, 37, 37)
                                .addComponent(phoneCheckM)))
                        .addGap(24, 24, 24)
                        .addGroup(modifyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNameM)
                            .addComponent(surNameM)
                            .addComponent(bDayM)
                            .addComponent(phoneM, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        modifyWindowLayout.setVerticalGroup(
            modifyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyWindowLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(modifyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(firstNameM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(modifyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(surNameM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(modifyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(bDayM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(modifyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(phoneCheckM)
                    .addComponent(phoneM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(modifyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifyButton)
                    .addComponent(cancelButtonM))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        addBt.setText("Adauga contact");
        addBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtActionPerformed(evt);
            }
        });

        deleteBt.setText("Sterge contact selectat");
        deleteBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtActionPerformed(evt);
            }
        });

        editBt.setText("Editeaza contact selectat");
        editBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtActionPerformed(evt);
            }
        });

        filterButton.setText("Filtreaza");
        filterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterButtonActionPerformed(evt);
            }
        });

        sortButton.setText("Ordoneaza");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtrare:");

        jLabel2.setText("Ordonare:");

        filterItems.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        filterItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterItemsActionPerformed(evt);
            }
        });

        jLabel3.setText("filtru:");

        filtru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtruActionPerformed(evt);
            }
        });

        sortItems.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sortItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortItemsActionPerformed(evt);
            }
        });

        list.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list);

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Viorica.png"))); // NOI18N

        files.setText("Fisiere");

        open.setText("Deschidere");
        files.add(open);

        save.setText("Salvare");
        files.add(save);

        exit.setText("Iesire");
        files.add(exit);

        jMenuBar1.add(files);

        help.setText("Ajutor");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });

        inregistrare.setText("Inregistrare");
        help.add(inregistrare);

        despre.setText("Despre");
        despre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                despreActionPerformed(evt);
            }
        });
        help.add(despre);

        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteBt)
                        .addGap(69, 69, 69)
                        .addComponent(editBt)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filterItems, 0, 152, Short.MAX_VALUE)
                            .addComponent(sortItems, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(filtru)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resetButton)
                                .addGap(91, 91, 91)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sortButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(filterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterButton)
                    .addComponent(jLabel1)
                    .addComponent(filterItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(filtru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortButton)
                    .addComponent(jLabel2)
                    .addComponent(sortItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtActionPerformed
        if (list.getSelectedIndex() != -1) {
            int dialogButton = JOptionPane.showConfirmDialog(rootPane,"Sunteti sigur ca doriti sa stergeti"
                               + " contactul selectat?", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            
            if (dialogButton == 0)
                Database.removeFromDatabase(people, (Contact)people.getElementAt(list.getSelectedIndex()));
        }
    }//GEN-LAST:event_deleteBtActionPerformed

    private void addBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtActionPerformed
        addWindow.setVisible(true);
        addWindow.setAlwaysOnTop(true);
        addWindow.setSize(400, 300);
    }//GEN-LAST:event_addBtActionPerformed

    private void filterItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterItemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filterItemsActionPerformed

    private void filtruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtruActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        
    }//GEN-LAST:event_helpActionPerformed

    private void despreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_despreActionPerformed
        
    }//GEN-LAST:event_despreActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        addWindow.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        LocalDate date = LocalDate.parse(bDay.getText());
        Phone phoneN;
        boolean flagName = false;
        boolean flagPhone = false;
        
        if (checkFullName(firstName.getText(), surName.getText())) 
            flagName = true; 
        else
            JOptionPane.showMessageDialog(rootPane, "Atentie! Numele " + firstName.getText() + " " +
                    surName.getText() + " este deja prezent in angenda!");
        
        
        if (phoneCheck.isSelected()) 
            phoneN = new Landline(phone.getText());
        else
            phoneN = new MobilePhone(phone.getText());
        
        if (checkPhone(phoneN))
            flagPhone = true;
        else
            JOptionPane.showMessageDialog(rootPane, "Atentie! Exista deja un contact cu numarul " + phoneN.toString() + ".");
        
        if (flagName && flagPhone) {
            Contact c = new Contact(firstName.getText(), surName.getText(), date, phoneN);
            Database.addInDatabase(people, c);
            firstName.setText("");  
            surName.setText("");     
            bDay.setText("");        
            phone.setText("");
        }       
    }//GEN-LAST:event_addButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        LocalDate date = LocalDate.parse(bDayM.getText());
        Phone phoneN;
        boolean flagName = true;
        boolean flagPhone = true;
        Contact editedContact = (Contact)people.getElementAt(list.getSelectedIndex());
        
        if (!checkFullName(firstNameM.getText(), surNameM.getText()) && 
                firstNameM.getText().compareToIgnoreCase(editedContact.getFristN()) != 0 &&
                surNameM.getText().compareToIgnoreCase(editedContact.getSurN()) != 0 ) {
            JOptionPane.showMessageDialog(rootPane,
            "Numele " + firstNameM.getText() + " " + surNameM.getText() + " este deja prezent in lista!");
            flagName = false;
        }
        if (phoneCheckM.isSelected()) 
            phoneN = new Landline(phoneM.getText());
        else
            phoneN = new MobilePhone(phoneM.getText());
        
        if (!checkPhone(phoneN) && !phoneN.equals(editedContact.getPhone())) {
            JOptionPane.showMessageDialog(rootPane,
            "Numarul " + phoneN.toString() + " este deja prezent in lista!");
            flagPhone = false;
        }
        
        if (flagName && flagPhone) {
            Contact newItem = new Contact(firstNameM.getText(), surNameM.getText(), date, phoneN);
            Database.addInDatabase(people, newItem);
            Database.removeFromDatabase(people, editedContact);
            modifyWindow.setVisible(false);
        }
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void cancelButtonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonMActionPerformed
        modifyWindow.setVisible(false);
    }//GEN-LAST:event_cancelButtonMActionPerformed

    public boolean checkFullName(String firstN, String surN) {
        String fullN = firstN + " " + surN;
        
        for (int i = 0; i < people.getSize(); i++) {
            Contact c = (Contact)people.getElementAt(i);
            String nameToComp = c.getFristN() + " " + c.getSurN();
            
            if (fullN.equalsIgnoreCase(nameToComp))
                return false;
        }
        return true;
    }
    
    public boolean checkPhone(Phone phone) {
        for (int i = 0; i < people.getSize(); i++)
        {
            Contact c = (Contact)people.getElementAt(i);
            if (phone.compareTo(c.getPhone()) == 0)
                return false;
        }
        return true;
    }
    
    private void editBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtActionPerformed
        if (list.getSelectedIndex() != -1) {
            modifyWindow.setVisible(true);
            modifyWindow.setAlwaysOnTop(true);
            modifyWindow.setSize(400, 300);
            Contact contact = (Contact)people.get(list.getSelectedIndex());
            firstNameM.setText(contact.getFristN());
            surNameM.setText(contact.getSurN());
            bDayM.setText(contact.getBirthDay().toString());
            phoneM.setText(contact.getPhone().toString());
            
        }
    }//GEN-LAST:event_editBtActionPerformed

    private void sortItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortItemsActionPerformed
        
    }//GEN-LAST:event_sortItemsActionPerformed

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
         if ((Sorting)sort.getSelectedItem() == Sorting.BY_BIRTHDAY)
            Database.sortDatabase("birthday", people);
        else if ((Sorting)sort.getSelectedItem() == Sorting.BY_FIRST_NAME)
            Database.sortDatabase("firstN", people);
        else if ((Sorting)sort.getSelectedItem() == Sorting.BY_PHONE)
            Database.sortDatabase("phone", people);
        else if ((Sorting)sort.getSelectedItem() == Sorting.BY_SUR_NAME)
            Database.sortDatabase("surN", people);
    }//GEN-LAST:event_sortButtonActionPerformed

    private void filterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterButtonActionPerformed
        Filter selectedFilter = (Filter)filter.getSelectedItem();
      
        for (int i = 0; i < people.getSize(); i++) {
            Contact c = (Contact)people.getElementAt(i);
            
            switch(selectedFilter) {
                case LANDLINE:
                    if (c.getPhone().toString().startsWith("07"))
                        people.removeElement(c);
                    break;
                    
                case MOBILE_PHONE:
                    if (!c.getPhone().toString().startsWith("07"))
                        people.removeElement(c);
                    break;    
                    
                case BIRTHDAY_TODAY:
                    if ((c.getBirthDay().getMonth() != LocalDate.now().getMonth()) &&
                           (c.getBirthDay().getDayOfMonth() != LocalDate.now().getDayOfMonth()))
                        people.removeElement(c);
                    break;    
                    
                case BIRTHDAY_THIS_MONTH:
                    if ((c.getBirthDay().getMonth() != LocalDate.now().getMonth()) &&
                            (c.getBirthDay().getDayOfMonth() > LocalDate.now().getDayOfMonth()))
                        people.removeElement(c);
                    break;        
            }
        }        
    }//GEN-LAST:event_filterButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        
    }//GEN-LAST:event_resetButtonActionPerformed

    public void switchItems(Contact c1, Contact c2, int index1, int index2) {
        people.removeElementAt(index1);
        people.add(index1, c2);
        people.removeElementAt(index2);
        people.add(index2, c1);
    }
    
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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBt;
    private javax.swing.JButton addButton;
    private javax.swing.JFrame addWindow;
    private javax.swing.JTextField bDay;
    private javax.swing.JTextField bDayM;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelButtonM;
    private javax.swing.JButton deleteBt;
    private javax.swing.JMenuItem despre;
    private javax.swing.JButton editBt;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu files;
    private javax.swing.JButton filterButton;
    private javax.swing.JComboBox filterItems;
    private javax.swing.JTextField filtru;
    private javax.swing.JTextField firstName;
    private javax.swing.JTextField firstNameM;
    private javax.swing.JMenu help;
    private javax.swing.JMenuItem inregistrare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList list;
    private javax.swing.JButton modifyButton;
    private javax.swing.JFrame modifyWindow;
    private javax.swing.JMenuItem open;
    private javax.swing.JTextField phone;
    private javax.swing.JCheckBox phoneCheck;
    private javax.swing.JCheckBox phoneCheckM;
    private javax.swing.JTextField phoneM;
    private javax.swing.JButton resetButton;
    private javax.swing.JMenuItem save;
    private javax.swing.JButton sortButton;
    private javax.swing.JComboBox sortItems;
    private javax.swing.JTextField surName;
    private javax.swing.JTextField surNameM;
    // End of variables declaration//GEN-END:variables
}
