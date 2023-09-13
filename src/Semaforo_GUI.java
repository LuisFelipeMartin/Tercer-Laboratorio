import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;
public class Semaforo_GUI extends javax.swing.JFrame 
{
    int i=0,x=0,Y=0,j=0,k=0,l=0,tiempo_Rojo=25,tiempo_Verde=20,tiempo_Amarillo=3,CicloTotal=0,Rojo_tmp=tiempo_Rojo,Verde_tmp=tiempo_Verde;
    ImageIcon[] Sprite=new ImageIcon[8];
    ImageIcon[] Ssemaforo=new ImageIcon[6];
    public Semaforo_GUI() 
    {
        Ssemaforo[0]=new ImageIcon("Luz roja apagada.png");
        Ssemaforo[1]=new ImageIcon("Luz roja encendida.png");
        Ssemaforo[2]=new ImageIcon("Luz amarilla apagada.png");
        Ssemaforo[3]=new ImageIcon("Luz amarilla encendida.png");
        Ssemaforo[4]=new ImageIcon("Luz verde apagada.png");
        Ssemaforo[5]=new ImageIcon("Luz verde encendida.png");
        CicloTotal=tiempo_Rojo+tiempo_Amarillo+tiempo_Verde;
        cicloTotal.start();
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
        Bot_Paso = new javax.swing.JButton();
        Titulo_Paso = new javax.swing.JLabel();
        Tex_Rojo = new javax.swing.JTextField();
        Tex_Amarillo = new javax.swing.JTextField();
        Tex_Verde = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Semaforo medio feo :0");

        Luz_Verde.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Universidad\\2023 - 2 + Laboratorio de programacion 3 + Mec lab 3\\Trabajos\\Segundo corte\\2023 - 2 + Informe 03 + Semaforo\\Luz verde apagada.png")); // NOI18N

        Luz_Amarilla.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Universidad\\2023 - 2 + Laboratorio de programacion 3 + Mec lab 3\\Trabajos\\Segundo corte\\2023 - 2 + Informe 03 + Semaforo\\Luz amarilla apagada.png")); // NOI18N

        Luz_Roja.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Universidad\\2023 - 2 + Laboratorio de programacion 3 + Mec lab 3\\Trabajos\\Segundo corte\\2023 - 2 + Informe 03 + Semaforo\\Luz roja apagada.png")); // NOI18N

        Titulo_Trafico.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Titulo_Trafico.setForeground(new java.awt.Color(255, 255, 255));
        Titulo_Trafico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_Trafico.setText("Trafico");

        Slider_Trafico.setBackground(new java.awt.Color(51, 51, 51));
        Slider_Trafico.setForeground(new java.awt.Color(255, 255, 255));
        Slider_Trafico.setMajorTickSpacing(2);
        Slider_Trafico.setMaximum(10);
        Slider_Trafico.setMinorTickSpacing(1);
        Slider_Trafico.setPaintLabels(true);
        Slider_Trafico.setPaintTicks(true);
        Slider_Trafico.setToolTipText("");
        Slider_Trafico.setValue(0);
        Slider_Trafico.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Slider_TraficoStateChanged(evt);
            }
        });

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
        Tex_Amarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tex_AmarilloActionPerformed(evt);
            }
        });

        Tex_Verde.setEditable(false);
        Tex_Verde.setBackground(new java.awt.Color(51, 51, 51));
        Tex_Verde.setForeground(new java.awt.Color(255, 255, 255));
        Tex_Verde.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tex_Verde.setText("00:00");
        Tex_Verde.setBorder(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\Universidad\\2023 - 2 + Laboratorio de programacion 3 + Mec lab 3\\Trabajos\\Segundo corte\\2023 - 2 + Informe 03 + Semaforo\\Caminar_1.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tex_Rojo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Luz_Roja))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Luz_Amarilla)
                            .addComponent(Tex_Amarillo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tex_Verde, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Luz_Verde))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Bot_Paso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Titulo_Paso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                            .addComponent(Slider_Trafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Titulo_Trafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
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
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bot_Paso)
                        .addGap(10, 10, 10)
                        .addComponent(Titulo_Paso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void Bot_PasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot_PasoActionPerformed
        if(Y!=1)
        {
            Y++;
            Rojo_tmp = tiempo_Rojo+5;
            Titulo_Paso.setText(Titulo_Paso.getText()+" (+00:05)");
        }
    }//GEN-LAST:event_Bot_PasoActionPerformed

    private void Tex_RojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tex_RojoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tex_RojoActionPerformed

    private void Slider_TraficoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Slider_TraficoStateChanged
        Rojo_tmp=tiempo_Rojo-Slider_Trafico.getValue(); 
        Verde_tmp=tiempo_Verde+Slider_Trafico.getValue();
    }//GEN-LAST:event_Slider_TraficoStateChanged

    private void Tex_AmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tex_AmarilloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tex_AmarilloActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    Timer cicloTotal = new Timer(1000, new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
            if(x<9)
            {
                Titulo_Paso.setText("00:0"+x);
            }
            else
            {
                Titulo_Paso.setText("00:"+x);
            }
            if(x<=CicloTotal)
            {
                peatonEspera.stop();
                if(x<=Rojo_tmp)
                {
                    //SEMAFORO EN ROJO
                    k=0;
                    Luz_Roja.setIcon(Ssemaforo[1]);
                    Luz_Amarilla.setIcon(Ssemaforo[2]);
                    Luz_Verde.setIcon(Ssemaforo[4]);
                    peatonMovimiento.start();
                    Tex_Rojo.setText(String.valueOf("00:"+(Rojo_tmp-l)));
                    l++;
                }
                if(x>Rojo_tmp&&x<=Rojo_tmp+tiempo_Amarillo)
                {
                    //SEMAFORO EN AMARILLO
                    l=0;
                    Luz_Roja.setIcon(Ssemaforo[0]);
                    Luz_Amarilla.setIcon(Ssemaforo[3]);
                    Luz_Verde.setIcon(Ssemaforo[4]);
                    Tex_Amarillo.setText(String.valueOf("00:0"+(tiempo_Amarillo-j)));
                    j++;
                }
                if(x>Rojo_tmp+tiempo_Amarillo)
                {
                    //SEMAFORO EN VERDE
                    j=0;
                    Luz_Roja.setIcon(Ssemaforo[0]);
                    Luz_Amarilla.setIcon(Ssemaforo[2]);
                    Luz_Verde.setIcon(Ssemaforo[5]);
                    peatonMovimiento.stop();
                    peatonEspera.start();
                    Tex_Verde.setText(String.valueOf("00:"+(Verde_tmp-k)));
                    k++;
                }       
            }
            else
            {
                x=0;
                Y=0;
            }
            x++;
        }   
    });
    Timer peatonEspera = new Timer(200, new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
            if(i<5)
            {
                Sprite[i]=new ImageIcon("Esperar_"+(i+1)+".png");
                jLabel2.setIcon(Sprite[i]);
                i++;
            }
            else
            {
                i=0;
            }
        }
    });
    Timer peatonMovimiento = new Timer(80, new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
            if(i<3)
            {
                Sprite[i]=new ImageIcon("Caminar_"+(i+1)+".png");
                jLabel2.setIcon(Sprite[i]);
                i++;
            }
            else
            {
                i=0;
            }
        }
    });
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