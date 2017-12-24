package com.ospavliuk.gtn;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Gui extends JFrame {

    static {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    Gui(Game game) {
        this.game = game;
        initComponents();
        keyboard = new JButton[]{jButton0, jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7,
                jButton8, jButton9, jButtonBack, enterButton};

    }

    private void initComponents() {
        observerList = new ArrayList<>();
        JLayeredPane jLayeredPane1 = new JLayeredPane();
        JPanel jPanel1 = new JPanel();
        JScrollPane jScrollPane1 = new JScrollPane();
        jTextPane1 = new JTextPane();
        infoString = new JTextField();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();
        JLabel globalScoreLabel = new JLabel();
        globalResultLabel = new JLabel();
        globalScoreField = new JTextField();
        JPanel jPanel2 = new JPanel();
        jComboBox1 = new JComboBox<>();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jComboBox2 = new JComboBox<>();
        jLabel4 = new JLabel();
        jComboBox3 = new JComboBox<>();
        jLabel1 = new JLabel();
        jLabel5 = new JLabel();
        numberInput = new JTextField();
        JPanel jPanel3 = new JPanel();
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
        startButton.setEnabled(false);
        enterButton.setEnabled(false);
        jButtonBack.setEnabled(false);
        infoString.setEditable(false);
        setManualScoreEnabled(false);

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
        setTitle("Игра \"Угадай Число!\"");
        setIconImages(null);
        setLocation(new java.awt.Point(300, 100));
        setResizable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("Ход игры");

        jTextPane1.setEditable(false);
        jTextPane1.setToolTipText("Здесь отображается история ходов");
        jScrollPane1.setViewportView(jTextPane1);

        infoString.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel6.setText("Информация:");

        jLabel7.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        jLabel7.setText("Ход игры");
        globalScoreLabel.setText("Суммарный счет игр:");

        globalResultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        globalResultLabel.setText("Пока по нулям!");

        globalScoreField.setEditable(false);
        globalScoreField.setFont(new java.awt.Font("Comic Sans MS", Font.BOLD, 18)); // NOI18N
        globalScoreField.setForeground(new java.awt.Color(0, 255, 0));
        globalScoreField.setHorizontalAlignment(JTextField.CENTER);
        globalScoreField.setText("0-0");
        globalScoreField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        globalScoreField.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        globalScoreField.setDoubleBuffered(true);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(globalScoreLabel)
                                                        .addComponent(globalScoreField, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                                .addComponent(globalResultLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jScrollPane1))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(infoString, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(globalScoreLabel)
                                        .addComponent(globalScoreField, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(globalResultLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoString, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[]{"одиночная", "сетевая"}));
        jComboBox1.addActionListener(evt4 -> jComboBox1ActionPerformed());
        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[]{"различные числа", "общее число"}));
        jComboBox2.addActionListener(evt1 -> jComboBox2ActionPerformed());
        jComboBox3.setModel(new DefaultComboBoxModel<>(new String[]{"ввести вручную", "сгенерировать", "не скажу своё число!"}));
        jComboBox3.addActionListener(evt3 -> jComboBox3ActionPerformed());
        jLabel1.setText("Установки игры:");
        jLabel2.setText("Тип игры:");
        jLabel3.setText("Угадывать:");
        jLabel4.setText("Своё число:");
        jLabel5.setText("Введите собственное число:");
        jLabel6.setText("Информация:");
        jLabel7.setFont(new Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        jLabel7.setText("Ход игры");
        jLabel5.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        numberInput.setFont(new Font("Comic Sans MS", Font.BOLD, 24)); // NOI18N
        numberInput.setForeground(new Color(255, 0, 0));
        numberInput.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        numberInput.setDisabledTextColor(new Color(153, 153, 153));
        numberInput.setDoubleBuffered(true);
        numberInput.setToolTipText("Введите сюда четырехзначное число");
        numberInput.addCaretListener(evt2 -> numberInputCaretUpdate());
        numberInput.addActionListener(evt -> game.enter(numberInput.getText()));
        numberInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numberInputKeyReleased();
            }
        });
        jButton1.setText("1");
        jButton1.setPreferredSize(new Dimension(62, 37));
        jButton1.addActionListener(listener);
        jButton2.setText("2");
        jButton2.setPreferredSize(new Dimension(62, 37));
        jButton2.addActionListener(listener);
        jButton3.setText("3");
        jButton3.setPreferredSize(new Dimension(62, 37));
        jButton3.addActionListener(listener);
        jButton4.setText("4");
        jButton4.setPreferredSize(new Dimension(62, 37));
        jButton4.addActionListener(listener);
        jButton5.setText("5");
        jButton5.setPreferredSize(new Dimension(62, 37));
        jButton5.addActionListener(listener);
        jButton6.setText("6");
        jButton6.setPreferredSize(new Dimension(62, 37));
        jButton6.addActionListener(listener);
        jButton7.setText("7");
        jButton7.setPreferredSize(new Dimension(62, 37));
        jButton7.addActionListener(listener);
        jButton8.setText("8");
        jButton8.setPreferredSize(new Dimension(62, 37));
        jButton8.addActionListener(listener);
        jButton9.setText("9");
        jButton9.setPreferredSize(new Dimension(62, 37));
        jButton9.addActionListener(listener);
        jButton0.setText("0");
        jButton0.setPreferredSize(new Dimension(62, 37));
        jButton0.addActionListener(listener);
        enterButton.setText("ввод");
        enterButton.setPreferredSize(new Dimension(62, 37));
        enterButton.addActionListener(evt -> game.enter(numberInput.getText()));
        jButtonBack.setText("назад");
        jButtonBack.setPreferredSize(new Dimension(62, 37));
        jButtonBack.addActionListener(evt1 -> jButtonBackActionPerformed());
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
        scoreField2.setFont(new Font("Comic Sans MS", Font.BOLD, 24)); // NOI18N
        scoreField2.setForeground(new Color(0, 0, 255));
        scoreField2.addCaretListener(evt1 -> scoreField2CaretUpdate());
        scoreField2.addActionListener(evt -> game.calculateScore());
        scoreField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                scoreField2KeyReleased();
            }
        });
        scoreLabel.setHorizontalAlignment(SwingConstants.LEFT);
        scoreLabel.setText("Введите счет хода противника:");
        scoreLabel2.setFont(new Font("Comic Sans MS", Font.PLAIN, 24)); // NOI18N
        scoreLabel2.setText(":");
        scoreField1.setFont(new Font("Comic Sans MS", Font.BOLD, 24)); // NOI18N
        scoreField1.setForeground(new Color(0, 0, 255));
        scoreField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                scoreField1KeyReleased();
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
        startButton.addActionListener(evt -> startButtonActionPerformed());
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
    }

    class State {
        int typeGame1 = jComboBox1.getSelectedIndex();
        int guess2 = jComboBox2.getSelectedIndex();
        int ownNumber3 = jComboBox3.getSelectedIndex();
        boolean ownNumber3Enabled = jComboBox3.isEnabled();
        boolean numberInputEnabled = numberInput.isEnabled();
        boolean startButtonGaming = startButton.getText().equals("Прервать игру");
    }

    public void nextMove() {
        keyboardEnabled(true);
        numberInput.requestFocus();
    }

    private class KeyboardListener implements ActionListener {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            JTextField activeField = numberInput.isEnabled() ? numberInput : scoreField1.getText().length() == 0 ? scoreField1 : scoreField2;
            activeField.setText(numberInput.getText() + ((JButton) evt.getSource()).getText());
            setUsedKeysDisabled();
        }
    }

    private void jComboBox2ActionPerformed() {
        jComboBox3.setSelectedIndex(jComboBox2.getSelectedIndex());
        jComboBox3.setEnabled(jComboBox2.getSelectedIndex() == 0);
        keyboardEnabled(jComboBox2.getSelectedIndex() == 0);
        jLabel4.setEnabled(jComboBox2.getSelectedIndex() == 0);
        jLabel5.setEnabled(jComboBox2.getSelectedIndex() == 0);
        numberInput.setEnabled(jComboBox2.getSelectedIndex() == 0);
        startButton.setEnabled(jComboBox2.getSelectedIndex() == 1);
        enterButton.setEnabled(false);
        notifyObservers();
    }

    private void jButtonBackActionPerformed() {
        String text = numberInput.getText();
        if (text.length() > 0) {
            numberInput.setText(text.substring(0, text.length() - 1));
            setUsedKeysDisabled();
        } else jButtonBack.setEnabled(false);
    }

    private void jComboBox3ActionPerformed() {
        boolean b = jComboBox3.getSelectedIndex() == 0;
        keyboardEnabled(b);
        jLabel4.setEnabled(b);
        jLabel5.setEnabled(b);
        numberInput.setEnabled(b);
        startButton.setEnabled(!b);
        if (!b) numberInput.setText("");
        notifyObservers();
    }

    private void jComboBox1ActionPerformed() {
        jComboBox1.setSelectedIndex(0);
        new Ticker("Сетевая игра в процессе разработки!", this);
    }

    private void startButtonActionPerformed() {
        if (startButton.getText().equals("Прервать игру")) {
            stopGame();
        } else {
            startButton.setText("Прервать игру");
            hideEnemyMoves = jComboBox2.getSelectedIndex() == 1;
            keyboardEnabled(true);
            jButtonBack.setEnabled(false);
            settingsEnabled(false);
            numberInput.setEnabled(true);
            numberInput.setText("");
            jTextPane1.setText("");
            jLabel5.setText("Предполагаемое число:");
            numberInput.requestFocus();
        }
        notifyObservers();
    }

    private void scoreField1KeyReleased() {
        String text = scoreField1.getText();
        try {
            Integer n = Integer.parseInt(text);
            if (n < 5 && n > -1) {
                scoreField2.setText("");
                scoreField2.requestFocus();
            } else {
                scoreField1.setText("");
            }
        } catch (NumberFormatException e) {
            scoreField1.setText("");
        }
    }

    private void scoreField2KeyReleased() {
        String text = scoreField2.getText();
        try {
            Integer n = Integer.parseInt(text);
            if (n < 5 && n > -1 && n <= Integer.parseInt(scoreField1.getText())) {
                enterButton.setEnabled(true);
            } else {
                scoreField1.setText("");
            }
        } catch (NumberFormatException e) {
            scoreField1.setText("");
        }
    }

    private void scoreField2CaretUpdate() {
        enterButton.setEnabled(scoreField2.getText().length() == 1);
    }

    public State getCurrentState() {
        return new State();
    }

    void clearInputField() {
        numberInput.setText("");
    }

    private void numberInputKeyReleased() {
        setUsedKeysDisabled();
    }

    private void numberInputCaretUpdate() {
        enterButton.setEnabled(numberInput.getText().length() == 4);
    }

    private Game game;
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
    private JTextPane jTextPane1;
    private JTextField numberInput;
    private JTextField scoreField1;
    private JTextField scoreField2;
    private JLabel scoreLabel;
    private JLabel scoreLabel2;
    private JButton startButton;
    private JLabel globalResultLabel;
    private JTextField globalScoreField;
    private final JButton[] keyboard;
    private boolean hideEnemyMoves;
    private KeyboardListener listener = new KeyboardListener();
    private java.util.List<GuiObserver> observerList;

    private void setUsedKeysDisabled() {
        if (numberInput.isEnabled()) {
            char[] text = numberInput.getText().toCharArray();
            int caret = numberInput.getCaretPosition();
            UniqueDigits ud = new UniqueDigits(text);
            java.util.List<Integer> output = ud.normalize();
            for (int i = 0; i < 10; i++) {
                keyboard[i].setEnabled(!output.contains(i));
            }
            StringBuilder t = new StringBuilder();
            for (int i : output) {
                t.append(i);
            }
            numberInput.setText(t.toString());
            jButtonBack.setEnabled(t.length() > 0);
            numberInput.setCaretPosition(caret < t.length() ? caret : t.length());
            numberInput.setCaretColor(t.length() < 4 ? Color.GREEN : Color.RED);
        }
    }

    public void setHideEnemyMoves(boolean hideEnemyMoves) {
        this.hideEnemyMoves = hideEnemyMoves;
    }

    private void keyboardEnabled(boolean en) {
        for (JButton button : keyboard) {
            button.setEnabled(en);
        }
        if (!scoreField1.isEnabled()) {
            numberInput.setEnabled(en);
            jLabel5.setEnabled(en);
            jButtonBack.setEnabled(en && numberInput.getText().length() > 0);
            enterButton.setEnabled(en && numberInput.getText().length() == 4);
        } else {
            for (int i = 5; i < 10; i++) {
                keyboard[i].setEnabled(false);
            }
        }
        notifyObservers();
    }

    private void settingsEnabled(boolean b) {
        jLabel1.setEnabled(b);
        jLabel2.setEnabled(b);
        jLabel3.setEnabled(b);
        jLabel4.setEnabled(b && jComboBox2.getSelectedIndex() == 0);
        jComboBox1.setEnabled(b);
        jComboBox2.setEnabled(b);
        jComboBox3.setEnabled(b && jComboBox2.getSelectedIndex() == 0);
    }

    protected void print(boolean userMove, int[] value) {
        String s1 = "", s2;
        if (value.length == 4) {
            s2 = "" + value[0] + value[1] + value[2] + value[3] + " - ";
            if (userMove) {
                s1 = game.getMoveCounter() + 1 + ").   ";
            } else {
                s1 = "      ";
                if (hideEnemyMoves) {
                    s2 = "**** - ";
                }
            }
        } else {
            s2 = "" + value[0] + ":" + value[1];
        }
        if ((!userMove) && value.length == 2) {
            s2 += "\n";
        }
        jTextPane1.setText(jTextPane1.getText() + s1 + s2);
    }

    protected void print(String text) {
        jTextPane1.setText(jTextPane1.getText() + "\n" + text);
    }

    void clearScreen() {
        jTextPane1.setText("");
    }

    void enableStartButton() {
        startButton.setEnabled(true);
    }

    void manualScorePrepare() {
        setManualScoreEnabled(true);
        keyboardEnabled(true);
        scoreField1.requestFocus();
    }

    int[] getManualScore() {
        return new int[]{Integer.parseInt(scoreField1.getText()), Integer.parseInt(scoreField2.getText())};
    }

    void stopGame() {
        startButton.setText("Начать игру!");
        jLabel5.setText("Введите собственное число:");
        keyboardEnabled(jComboBox3.getSelectedIndex() == 0);
        startButton.setEnabled(jComboBox3.getSelectedIndex() != 0);
        settingsEnabled(true);
        setManualScoreEnabled(false);
    }

    void setManualScoreEnabled(boolean b) {
        numberInput.setEnabled(!b);
        scoreLabel.setEnabled(b);
        scoreLabel2.setEnabled(b);
        scoreField1.setText("");
        scoreField2.setText("");
        scoreField1.setEnabled(b);
        scoreField2.setEnabled(b);
        notifyObservers();
    }

    void setGlobalScore(int user, int comp) {
        globalScoreField.setText("" + user + ":" + comp);
        if (user == comp && user != 0) {
            globalResultLabel.setText("Ничья!");
        } else if (user > comp) {
            globalResultLabel.setText("в Вашу пользу!");
        } else if (user < comp) {
            globalResultLabel.setText("не в Вашу пользу!");
        }
    }

    void registerObserver(GuiObserver observer) {
        observerList.add(observer);
    }

    private void notifyObservers() {
        for (GuiObserver anObserverList : observerList) {
            anObserverList.guiStateChanged(new State());
        }
    }
}
