public class Semaforo_GUI extends javax.swing.JFrame 
{
    String estado;
    int trafico;
    public Semaforo_GUI() 
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Luz_Verde = new javax.swing.JLabel();
        Luz_Amarilla = new javax.swing.JLabel();
        Luz_Roja = new javax.swing.JLabel();
        Titulo_Trafico = new javax.swing.JLabel();
        Slider_Trafico = new javax.swing.JSlider();
        Animacion_Peaton = new javax.swing.JLabel();
        Bot_Paso = new javax.swing.JButton();
        Titulo_Paso = new javax.swing.JLabel();
        Tex_Rojo = new javax.swing.JTextField();
        Tex_Amarillo = new javax.swing.JTextField();
        Tex_Verde = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Semaforo medio feo :0");

        Luz_Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Luz verde apagada.png"))); // NOI18N

        Luz_Amarilla.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Luz amarilla apagada.png")); // NOI18N

        Luz_Roja.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Luz roja apagada.png")); // NOI18N

        Titulo_Trafico.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Titulo_Trafico.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_Trafico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_Trafico.setText("Trafico");

        Slider_Trafico.setBackground(new java.awt.Color(51, 51, 51));

        Animacion_Peaton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Esperar_1.png"))); // NOI18N

        Bot_Paso.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Bot_Paso.setText("Dar Paso");
        Bot_Paso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot_PasoActionPerformed(evt);
            }
        });

        Titulo_Paso.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Titulo_Paso.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_Paso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_Paso.setText("00:00");

        Tex_Rojo.setEditable(false);
        Tex_Rojo.setBackground(new java.awt.Color(51, 51, 51));
        Tex_Rojo.setForeground(new java.awt.Color(255, 255, 255));
        Tex_Rojo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tex_Rojo.setText("00:00");
        Tex_Rojo.setBorder(null);
        Tex_Rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tex_RojoActionPerformed(evt);
            }
        });

        Tex_Amarillo.setEditable(false);
        Tex_Amarillo.setBackground(new java.awt.Color(51, 51, 51));
        Tex_Amarillo.setForeground(new java.awt.Color(255, 255, 255));
        Tex_Amarillo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tex_Amarillo.setText("00:00");
        Tex_Amarillo.setBorder(null);

        Tex_Verde.setEditable(false);
        Tex_Verde.setBackground(new java.awt.Color(51, 51, 51));
        Tex_Verde.setForeground(new java.awt.Color(255, 255, 255));
        Tex_Verde.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tex_Verde.setText("00:00");
        Tex_Verde.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Slider_Trafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Titulo_Trafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(Tex_Rojo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(Luz_Roja)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Luz_Amarilla)
                            .addComponent(Tex_Amarillo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Tex_Verde, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Luz_Verde)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Animacion_Peaton)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Bot_Paso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Titulo_Paso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Luz_Amarilla)
                    .addComponent(Luz_Verde)
                    .addComponent(Luz_Roja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tex_Rojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tex_Amarillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tex_Verde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(Titulo_Trafico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Slider_Trafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Animacion_Peaton)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bot_Paso)
                        .addGap(5, 5, 5)
                        .addComponent(Titulo_Paso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bot_PasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot_PasoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bot_PasoActionPerformed

    private void Tex_RojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tex_RojoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tex_RojoActionPerformed
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Animacion_Peaton;
    private javax.swing.JButton Bot_Paso;
    private javax.swing.JLabel Luz_Amarilla;
    private javax.swing.JLabel Luz_Roja;
    private javax.swing.JLabel Luz_Verde;
    private javax.swing.JSlider Slider_Trafico;
    private javax.swing.JTextField Tex_Amarillo;
    private javax.swing.JTextField Tex_Rojo;
    private javax.swing.JTextField Tex_Verde;
    private javax.swing.JLabel Titulo_Paso;
    private javax.swing.JLabel Titulo_Trafico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    public static void main(String args[]) 
    {
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Semaforo_GUI().setVisible(true);
            }
        });
    }
}
