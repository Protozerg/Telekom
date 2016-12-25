public class StartForm extends javax.swing.JFrame {

    public StartForm(AbonentList al, MainFile mf, WorkFile wf) {
    	this.al = al;
    	this.mf = mf;
    	this.wf = wf;
        initComponents();
    }

    private void initComponents() {

        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        button1 = new java.awt.Button();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setVisible(true);
        
        setBackground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(102, 255, 204));
        label1.setFont(new java.awt.Font("Garamond", 3, 48)); 
        label1.setName(""); 
        label1.setText("Телеком");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Malgun Gothic", 0, 18));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Программа \"Телеком\" предоставляет возможность пользователю вводить данные об оплате счетов и просматривать информацию о клиентах. Для продолжения нажмите кнопку \"Далее\".");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 255, 153), new java.awt.Color(102, 255, 204), null));
        jTextArea1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jTextArea1.setPreferredSize(new java.awt.Dimension(320, 450));
        jScrollPane1.setViewportView(jTextArea1);

        button1.setBackground(new java.awt.Color(255, 255, 153));
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button1.setFont(new java.awt.Font("Garamond", 1, 24)); 
        button1.setLabel("Далее");
        button1.setMinimumSize(new java.awt.Dimension(60, 30));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .addGap(275, 275, 275))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addGap(72, 72, 72)
                .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
    }

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {
    	new SearchForm(al, mf, wf);
    	dispose();
    }

    private java.awt.Button button1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Label label1;
    private AbonentList al;
    private MainFile mf;
    private WorkFile wf;

}