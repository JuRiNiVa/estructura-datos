import view.VistaRequerimientos;

import java.awt.EventQueue;

public class App {
    public static void main( String[] args )
    {        

        EventQueue.invokeLater (new Runnable()
        {

            public void run ()
            {
                try 
                {
                    VistaRequerimientos frame = new VistaRequerimientos();
                    frame.setVisible(true);
                } catch (Exception e) 
                {
                    e.printStackTrace();
                }
            }
        });
    }

}
