import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Semaforo extends Semaforo_GUI
{
    String estado="",tiex,tiey,tiez;
    int trafico=0,x=0,y=0,z=0; 
    Semaforo(String estado, int trafico) 
    {
        this.estado=estado;
        this.trafico=trafico;
    }
    public void Secuencia()
    {
        Timer tiempo = new Timer(1000, new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                while(estado=="rojo")
                {
                    x++;
                    if(x<=9)
                    {
                        tiex="00:0"+x;
                    }
                    else
                    {
                        tiex="00:"+x;
                    }
                }
                while(estado=="amarillo")
                {
                    y++;
                    if(y<=9)
                    {
                        tiey="00:0"+y;
                    }
                    else
                    {
                        tiey="00:"+y;
                    }  
                }
                while(estado=="verde")
                {
                    z++;
                    if(z<=9)
                    {
                        tiez="00:0"+z;
                    }
                    else
                    {
                        tiez="00:"+z;
                    }
                }
            }
        });
    }
}