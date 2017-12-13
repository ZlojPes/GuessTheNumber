package com.ospavliuk.gtn;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class GuiSetup extends JFrame {

    public GuiSetup() {
        initComponents();
        JButton[] keybrd = {jButton0, jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButtonBack, enterButton};
        keyboard = keybrd;
        startButton.setEnabled(false);
        enterButton.setEnabled(false);
        jButtonBack.setEnabled(false);
        infoString.setEditable(false);
        setManualScoreEnabled(false);
        this.file = new File((new JFileChooser()).getFileSystemView().getDefaultDirectory().toString() + "\\num");
        this.initGlobalScore();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new JLayeredPane();
        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTextPane1 = new JTextPane();
        infoString = new JTextField();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        totalScoreLabel = new JLabel();
        globalResultLabel = new JLabel();
        globalScoreField = new JTextField();
        jPanel2 = new JPanel();
        jComboBox1 = new JComboBox<>();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jComboBox2 = new JComboBox<>();
        jLabel4 = new JLabel();
        jComboBox3 = new JComboBox<>();
        jLabel1 = new JLabel();
        jLabel5 = new JLabel();
        numberInput = new JTextField();
        jPanel3 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton6 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton7 = new JButton();
        jButton9 = new JButton();
        jButton8 = new JButton();
        jButton0 = new JButton();
        enterButton = new JButton();
        jButtonBack = new JButton();
        scoreField2 = new JTextField();
        scoreLabel = new JLabel();
        scoreLabel2 = new JLabel();
        scoreField1 = new JTextField();
        startButton = new JButton();

        GroupLayout jLayeredPane1Layout = new GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
                jLayeredPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
                jLayeredPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Игра \"Числа\"");
        setIconImages(null);
        setLocation(new Point(300, 100));
        setResizable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("Ход игры");

        jTextPane1.setEditable(false);
        jTextPane1.setToolTipText("тест");
        jScrollPane1.setViewportView(jTextPane1);

        infoString.setPreferredSize(new Dimension(60, 20));

        jLabel6.setText("Информация:");

        jLabel7.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Ход игры");

        totalScoreLabel.setText("Глобальный счёт:");

        globalResultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        globalResultLabel.setText("Пока по нулям!");

        globalScoreField.setEditable(false);
        globalScoreField.setFont(new Font("Comic Sans MS", 1, 18)); // NOI18N
        globalScoreField.setForeground(new Color(0, 255, 0));
        globalScoreField.setHorizontalAlignment(0);
        globalScoreField.setText("0-0");
        globalScoreField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        globalScoreField.setDisabledTextColor(new Color(153, 153, 153));
        globalScoreField.setDoubleBuffered(true);
        globalScoreField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                totalScoreFieldCaretUpdate(evt);
            }
        });
        globalScoreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalScoreFieldActionPerformed(evt);
            }
        });
        globalScoreField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                totalScoreFieldKeyReleased(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(72, 72, 72)
                                                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                                .addComponent(infoString, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(totalScoreLabel)/*
                                                        .addGap(18, 18, 18)*/
                                                        .addComponent(globalScoreField, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(globalResultLabel, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(totalScoreLabel)
                                        .addComponent(globalScoreField, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(globalResultLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(infoString, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[]{"одиночная", "сетевая"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Тип игры:");

        jLabel3.setText("Угадывать:");

        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[]{"различные числа", "общее число"}));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Своё число:");

        jComboBox3.setModel(new DefaultComboBoxModel<>(new String[]{"ввести вручную", "сгенерировать", "не скажу своё число!"}));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Установки игры:");

        jLabel5.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel5.setText("Введите собственное число:");
        jLabel5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        numberInput.setFont(new Font("Comic Sans MS", 1, 24)); // NOI18N
        numberInput.setForeground(new Color(255, 0, 0));
        numberInput.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        numberInput.setDisabledTextColor(new Color(153, 153, 153));
        numberInput.setDoubleBuffered(true);
        numberInput.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                numberInputCaretUpdate(evt);
            }
        });
        numberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberInputActionPerformed(evt);
            }
        });
        numberInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numberInputKeyReleased(evt);
            }
        });

        jButton1.setText("1");
        jButton1.setPreferredSize(new Dimension(62, 37));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.setPreferredSize(new Dimension(62, 37));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.setPreferredSize(new Dimension(62, 37));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.setPreferredSize(new Dimension(62, 37));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.setPreferredSize(new Dimension(62, 37));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.setPreferredSize(new Dimension(62, 37));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.setPreferredSize(new Dimension(62, 37));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.setPreferredSize(new Dimension(62, 37));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.setPreferredSize(new Dimension(62, 37));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllActionPerformed(evt);
            }
        });

        jButton0.setText("0");
        jButton0.setPreferredSize(new Dimension(62, 37));
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllActionPerformed(evt);
            }
        });

        enterButton.setText("ввод");
        enterButton.setPreferredSize(new Dimension(62, 37));
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        jButtonBack.setText("назад");
        jButtonBack.setPreferredSize(new Dimension(62, 37));
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonBack, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton8, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton0, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(enterButton, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton0, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButtonBack, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(enterButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        scoreField2.setFont(new Font("Comic Sans MS", 1, 24)); // NOI18N
        scoreField2.setForeground(new Color(0, 0, 255));
        scoreField2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                scoreField2CaretUpdate(evt);
            }
        });
        scoreField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreField2ActionPerformed(evt);
            }
        });
        scoreField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                scoreField2KeyReleased(evt);
            }
        });

        scoreLabel.setHorizontalAlignment(SwingConstants.LEFT);
        scoreLabel.setText("Введите счет хода противника:");

        scoreLabel2.setFont(new Font("Comic Sans MS", 0, 24)); // NOI18N
        scoreLabel2.setText(":");

        scoreField1.setFont(new Font("Comic Sans MS", 1, 24)); // NOI18N
        scoreField1.setForeground(new Color(0, 0, 255));
        scoreField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                scoreField1KeyReleased(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(78, 78, 78))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(scoreLabel, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(scoreField1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(scoreLabel2, GroupLayout.PREFERRED_SIZE, 7, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(scoreField2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel2))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jComboBox1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jComboBox2, 0, 152, Short.MAX_VALUE)))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(numberInput, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap())
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(numberInput, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(scoreLabel))
                                        .addComponent(scoreField2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(scoreLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(scoreField1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        startButton.setText("Начать игру!");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(81, 81, 81)
                                                .addComponent(startButton, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(startButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        jComboBox3.setSelectedIndex(jComboBox2.getSelectedIndex());
        jComboBox3.setEnabled(jComboBox2.getSelectedIndex() == 0);
        keyboardEnabled(jComboBox2.getSelectedIndex() == 0);
        jLabel4.setEnabled(jComboBox2.getSelectedIndex() == 0);
        jLabel5.setEnabled(jComboBox2.getSelectedIndex() == 0);
        numberInput.setEnabled(jComboBox2.getSelectedIndex() == 0);
        startButton.setEnabled(jComboBox2.getSelectedIndex() == 1);
        enterButton.setEnabled(false);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButtonAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAllActionPerformed
        JTextField temp;
        if (numberInput.isEnabled())
            temp = numberInput;
        else if (scoreField1.getText().length() == 0)
            temp = scoreField1;
        else
            temp = scoreField2;
        temp.setText(numberInput.getText() + ((JButton) evt.getSource()).getText());
        setUsedKeysDisabled();
    }//GEN-LAST:event_jButtonAllActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed

        if (startButton.getText().equals("Начать игру!"))
            beforeStartEnterCommands();
        else afterStartEnterCommands();
    }//GEN-LAST:event_enterButtonActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        String text = numberInput.getText();
        if (text.length() > 0) {
            numberInput.setText(text.substring(0, text.length() - 1));       // TODO add your handling code here:
            setUsedKeysDisabled();
        } else jButtonBack.setEnabled(false);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void numberInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberInputKeyReleased
        setUsedKeysDisabled();
    }//GEN-LAST:event_numberInputKeyReleased

    private void numberInputCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_numberInputCaretUpdate
        enterButton.setEnabled(numberInput.getText().length() == 4);
    }//GEN-LAST:event_numberInputCaretUpdate

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        boolean boo = jComboBox3.getSelectedIndex() == 0;
        keyboardEnabled(boo);
        jLabel4.setEnabled(boo);
        jLabel5.setEnabled(boo);
        numberInput.setEnabled(boo);
        startButton.setEnabled(!boo);
        if (!boo) numberInput.setText("");
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jComboBox1.setSelectedIndex(0);
        new Ticker("Сетевая игра в процессе разработки!", this);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        if (startButton.getText().equals("Начать игру!")) {
            startButton.setText("Прервать игру");
            counter = 0;
            restrictEnemy = jComboBox2.getSelectedIndex() == 1;
            artInt = new ArtInt3();
            mixer = new Mixer();
            userTurns = new ArrayList<>();
            if (jComboBox1.getSelectedIndex() == 0 && jComboBox2.getSelectedIndex() == 0)
                enemyNum = RandomGen.getRandom();
            if (jComboBox2.getSelectedIndex() == 1)
                enemyNum = userNum = RandomGen.getRandom();
            if (jComboBox3.isEnabled() && jComboBox3.getSelectedIndex() == 1) {
                userNum = RandomGen.getRandom();
                new Ticker("Ваше число установлено как " + userNum[0] + userNum[1] + userNum[2] + userNum[3], this);
            }
            if (jComboBox3.isEnabled() && jComboBox3.getSelectedIndex() == 2)
                userNum = null;
            keyboardEnabled(true);
            jButtonBack.setEnabled(false);
            settingsEnabled(false);
            numberInput.setEnabled(true);
            numberInput.setText("");
            jTextPane1.setText("");
            jLabel5.setText("Предполагаемое число:");
            numberInput.requestFocus();
        } else {
            stopGame();
            print("Прервано пользователем");
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void numberInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberInputActionPerformed
        enterButtonActionPerformed(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_numberInputActionPerformed

    private void scoreField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scoreField1KeyReleased
        String text = scoreField1.getText();
        try {
            Integer n = Integer.parseInt(text);
            if (n < 5 && n > -1) {
                scoreField2.setText("");
                scoreField2.requestFocus();
            } else
                scoreField1.setText("");
        } catch (NumberFormatException e) {
            scoreField1.setText("");
        }
    }//GEN-LAST:event_scoreField1KeyReleased

    private void scoreField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scoreField2KeyReleased
        String text = scoreField2.getText();
        try {
            Integer n = Integer.parseInt(text);
            if (n < 5 && n > -1 && n <= Integer.parseInt(scoreField1.getText())) {
                enterButton.setEnabled(true);
            } else
                scoreField1.setText("");
        } catch (NumberFormatException e) {
            scoreField1.setText("");
        }
    }//GEN-LAST:event_scoreField2KeyReleased

    private void scoreField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreField2ActionPerformed
        getManualScore();
    }//GEN-LAST:event_scoreField2ActionPerformed

    private void scoreField2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_scoreField2CaretUpdate
        enterButton.setEnabled(scoreField2.getText().length() == 1);
    }//GEN-LAST:event_scoreField2CaretUpdate

    private void totalScoreFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_totalScoreFieldCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_totalScoreFieldCaretUpdate

    private void totalScoreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalScoreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalScoreFieldActionPerformed

    private void totalScoreFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalScoreFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_totalScoreFieldKeyReleased

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiSetup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private File file;
    private JButton enterButton;
    protected JTextField infoString;
    private JButton jButton0;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JButton jButtonBack;
    private JComboBox<String> jComboBox1;
    private JComboBox<String> jComboBox2;
    private JComboBox<String> jComboBox3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLayeredPane jLayeredPane1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane1;
    private JTextPane jTextPane1;
    private JTextField numberInput;
    private JTextField scoreField1;
    private JTextField scoreField2;
    private JLabel scoreLabel;
    private JLabel scoreLabel2;
    private JButton startButton;
    private JLabel globalResultLabel;
    private JTextField globalScoreField;
    private JLabel totalScoreLabel;
    // End of variables declaration//GEN-END:variables
    private final JButton[] keyboard;
    private int[] userNum, enemyNum;
    private ArtInt3 artInt;
    private Mixer mixer;
    private ArrayList<int[]> userTurns;
    private int counter, userWinCounter, enemyWinCounter;
    private boolean restrictEnemy;

    private void setUsedKeysDisabled() {
        if (numberInput.isEnabled()) {
            char[] text = numberInput.getText().toCharArray();
            int caret = numberInput.getCaretPosition();
            UniqueDigits ud = new UniqueDigits(text);
            java.util.List<Integer> output = ud.normalize();
            for (int i = 0; i < 10; i++)
                keyboard[i].setEnabled(!output.contains(i));
            String t = "";
            for (int i : output)
                t += i;
            numberInput.setText(t);
            jButtonBack.setEnabled(t.length() > 0);
            numberInput.setCaretPosition(caret < t.length() ? caret : t.length());
            numberInput.setCaretColor(t.length() < 4 ? Color.GREEN : Color.RED);
        }
    }


    private void keyboardEnabled(boolean en) {
        for (JButton b : keyboard)
            b.setEnabled(en);
        if (!scoreField1.isEnabled()) {
            numberInput.setEnabled(en);
            jLabel5.setEnabled(en);
            jButtonBack.setEnabled(en && numberInput.getText().length() > 0);
            enterButton.setEnabled(en && numberInput.getText().length() == 4);
        } else {
            for (int i = 5; i < 10; i++)
                keyboard[i].setEnabled(false);
        }
    }

    private void settingsEnabled(boolean b) {
        jLabel1.setEnabled(b);
        jLabel2.setEnabled(b);
        jLabel3.setEnabled(b);
        jLabel4.setEnabled(b && jComboBox2.getSelectedIndex() == 0);
        jComboBox1.setEnabled(b);
        jComboBox2.setEnabled(b);
        jComboBox3.setEnabled(b && jComboBox2.getSelectedIndex() == 0);
//        setManualScoreEnabled(b);
    }

    protected void print(boolean firstValue, int[] value) {
        String s1 = "", s2;
        if (value.length == 4) {
            s2 = "" + value[0] + value[1] + value[2] + value[3] + " - ";
            if (firstValue)
                s1 = counter + 1 + ").   ";
            else {
                s1 = "      ";
                if (restrictEnemy)
                    s2 = "**** - ";
            }
        } else
            s2 = "" + value[0] + ":" + value[1];
        if ((!firstValue) && value.length == 2)
            s2 += "\n";
        jTextPane1.setText(jTextPane1.getText() + s1 + s2);
    }

    protected void print(String text) {
        jTextPane1.setText(jTextPane1.getText() + "\n" + text);

    }

    private void printAll() {
        jTextPane1.setText("");
        if (userTurns.size() == artInt.getLog().size()) {
            for (int i = 0; i < userTurns.size(); i++) {
                counter = i;
                restrictEnemy = false;
                int[] a = userTurns.get(i);
                int[] b = artInt.getLog().get(i);
                print(true, new int[]{a[0], a[1], a[2], a[3]});
                print(true, new int[]{a[4], a[5]});
                print(false, mixer.getMix(new int[]{b[0], b[1], b[2], b[3]}));
                print(false, new int[]{b[4], b[5]});
            }
        }
    }

    private void beforeStartEnterCommands() {
        String text = numberInput.getText();
        UniqueDigits un = new UniqueDigits(text.toCharArray());
        if (un.isValidNumber()) {
            new Ticker("Ваше число установлено как " + text + ". Нажмите \"начать игру!\" для старта", this);
            userNum = un.getIntArray();
            startButton.setEnabled(true);
        } else new Ticker("Проверьте данные и попробуйте еще раз!", this);
    }

    private void afterStartEnterCommands() {
        if (numberInput.isEnabled()) {
            String text = numberInput.getText();
            UniqueDigits un = new UniqueDigits(text.toCharArray());
            if (un.isValidNumber()) {
                int[] userNumber = un.getIntArray();
                print(true, userNumber);
                print(true, getRemoteScore(userNumber));
                int[] userScore = getRemoteScore(userNumber);
                userTurns.add(new int[]{userNumber[0], userNumber[1], userNumber[2], userNumber[3], userScore[0], userScore[1]});
                int[] enemyTurn = null;
                try {
                    numberInput.setText("");
                    enemyTurn = getEnemyMove();
                    if (numberInput.isEnabled() && enemyTurn != null)
                        checkWinner(userScore, enemyTurn);
                } catch (ManualScoreException ex) {
                    setManualScoreEnabled(true);
                    keyboardEnabled(true);
                    scoreField1.requestFocus();
                } catch (WrongScoreException ex) {
                    wrongScore();
//                    Logger.getLogger(GuiSetup.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } else {
            keyboardEnabled(true);
            getManualScore();
        }

    }

    private void checkWinner(int[] userScore, int[] enemyScore) {
        try {
            if (jComboBox3.getSelectedIndex() == 2 && enemyScore[1] < 4)
                artInt.makeYourMove();
            if (userScore[1] == 4 || enemyScore[1] == 4) {
                printAll();
                if (userScore[1] == 4 && enemyScore[1] == 4) {
                    print("Ничья!");
                    stopGame();
                } else if (userScore[1] == 4) {
                    print("Вы выиграли!");
                    userWinCounter++;
                    stopGame();
                } else if (enemyScore[1] == 4) {
                    print("Вы проиграли!");
                    if (jComboBox1.getSelectedIndex() == 0 && jComboBox2.getSelectedIndex() == 0)
                        print("Вашей целью было число " + enemyNum[0] + enemyNum[1] + enemyNum[2] + enemyNum[3]);
                    enemyWinCounter++;
                    stopGame();
                }
                globalScoreField.setText("" + userWinCounter + "-" + enemyWinCounter);
                if (userWinCounter == enemyWinCounter && userWinCounter != 0)
                    globalResultLabel.setText("Ничья!");
                else if (userWinCounter > enemyWinCounter)
                    globalResultLabel.setText("в Вашу пользу!");
                else if (userWinCounter < enemyWinCounter)
                    globalResultLabel.setText("не в Вашу пользу!");
            } else {
                keyboardEnabled(true);
                numberInput.requestFocus();
                counter++;
            }
        } catch (WrongScoreException ex) {
            wrongScore();
        }
    }

    private int[] getRemoteScore(int[] intArray) {
        if (jComboBox1.getSelectedIndex() == 0) {
            int[] score = Score.getScore(enemyNum, intArray);
            return new int[]{score[score.length - 2], score[score.length - 1]};
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    private int[] getEnemyMove() throws ManualScoreException, WrongScoreException {
        if (jComboBox1.getSelectedIndex() == 0) {
            int[] score;
            int[] artIntMove = artInt.makeYourMove();
            int[] mixedMove = mixer.getMix(artIntMove);
            print(false, mixedMove);
            if (jComboBox3.getSelectedIndex() != 2)
                score = Score.getScore(userNum, mixedMove);
            else {
                artInt.writeToLog(artIntMove);
                throw new ManualScoreException();
            }
            print(false, score);
            int[] toLog = new int[6];
            System.arraycopy(artIntMove, 0, toLog, 0, 4);
            System.arraycopy(score, 0, toLog, 4, 2);
            artInt.writeToLog(toLog);
            return score;

        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void stopGame() {
        startButton.setText("Начать игру!");
        jLabel5.setText("Введите собственное число:");
        keyboardEnabled(jComboBox3.getSelectedIndex() == 0);
        startButton.setEnabled(jComboBox3.getSelectedIndex() != 0);
        settingsEnabled(true);
        setManualScoreEnabled(false);
    }

    private void setManualScoreEnabled(boolean b) {
        numberInput.setEnabled(!b);
        scoreLabel.setEnabled(b);
        scoreLabel2.setEnabled(b);
        scoreField1.setEnabled(b);
        scoreField2.setEnabled(b);
    }

    private void getManualScore() {
        int[] score2 = new int[]{Integer.parseInt(scoreField1.getText()), Integer.parseInt(scoreField2.getText())};
        print(false, score2);
        ArrayList<int[]> log = artInt.getLog();
        int[] last = log.get(log.size() - 1);
        int[] output = new int[]{last[0], last[1], last[2], last[3], score2[0], score2[1]};
        artInt.getLog().remove(log.size() - 1);
        artInt.writeToLog(output);
        int[] score1 = new int[]{userTurns.get(userTurns.size() - 1)[4], userTurns.get(userTurns.size() - 1)[5]};
        numberInput.setEnabled(true);
        scoreField1.setText("");
        scoreField2.setText("");
        setManualScoreEnabled(false);
        checkWinner(score1, score2);
    }

    private void wrongScore() {
        print("Вы допустили ошибку при вводе счёта в одном из ходов. Вам засчитывается техническое поражение.");
        stopGame();
    }

    private void initGlobalScore() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.file));
            Throwable var42 = null;

            try {
                String s = reader.readLine();
                this.globalScoreField.setText(s);
                String[] score = s.split(":");
                this.userWinCounter = Integer.parseInt(score[0]);
                this.enemyWinCounter = Integer.parseInt(score[1]);
                this.globalScoreField.setText("" + this.userWinCounter + ":" + this.enemyWinCounter);
            } catch (Throwable var35) {
                var42 = var35;
                throw var35;
            } finally {
                if (reader != null) {
                    if (var42 != null) {
                        try {
                            reader.close();
                        } catch (Throwable var34) {
                            var42.addSuppressed(var34);
                        }
                    } else {
                        reader.close();
                    }
                }

            }
        } catch (FileNotFoundException var39) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(this.file));
                Throwable var3 = null;

                try {
                    writer.write("0:0");
                } catch (Throwable var33) {
                    var3 = var33;
                    throw var33;
                } finally {
                    if (writer != null) {
                        if (var3 != null) {
                            try {
                                writer.close();
                            } catch (Throwable var32) {
                                var3.addSuppressed(var32);
                            }
                        } else {
                            writer.close();
                        }
                    }

                }
            } catch (IOException var37) {
                Logger.getLogger(GuiSetup.class.getName()).log(Level.SEVERE, (String)null, var37);
            }
        } catch (IOException var40) {
            Logger.getLogger(GuiSetup.class.getName()).log(Level.SEVERE, (String)null, var40);
        } catch (NumberFormatException var41) {
            System.exit(0);
        }

        if (this.userWinCounter == this.enemyWinCounter && this.userWinCounter != 0) {
            this.globalResultLabel.setText("Ничья!");
        } else if (this.userWinCounter > this.enemyWinCounter) {
            this.globalResultLabel.setText("в Вашу пользу!");
        } else if (this.userWinCounter < this.enemyWinCounter) {
            this.globalResultLabel.setText("не в Вашу пользу!");
        }

    }

}

