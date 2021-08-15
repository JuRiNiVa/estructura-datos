package view;

import controller.ControladorRequerimientos;

import model.vo.ProyectosPorEstrato;
import model.vo.ProyectosPorTipo;
import model.vo.ProyectosQuibdoApartaestudio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;


import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientos extends JFrame{
    
    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();
    private JPanel contentPane;
    private static JTextArea areaDeTexto;


    public VistaRequerimientos()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 200, 800, 600);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel etiqueta = new JLabel("Sistema de Consultas Reto 5");
        etiqueta.setBounds(300, 10, 500, 20);
        contentPane.add(etiqueta);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(50,30,700,480);
        contentPane.add(scrollPane);


        areaDeTexto = new JTextArea();
        scrollPane.setViewportView(areaDeTexto);

        
        
        JButton botonConsulta1 = new JButton("Consulta 1");
        botonConsulta1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                requerimiento1();
            }
        });
        botonConsulta1.setBounds(100, 520, 100, 20);
        contentPane.add(botonConsulta1);
        
        JButton botonConsulta2 = new JButton("Consulta 2");
        botonConsulta2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                requerimiento2();
            }
        });
        botonConsulta2.setBounds(250, 520, 100, 20);
        contentPane.add(botonConsulta2);

        JButton botonConsulta3 = new JButton("Consulta 3");
        botonConsulta3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                requerimiento3();
            }
        });
        botonConsulta3.setBounds(400,520,100,20);
        contentPane.add(botonConsulta3);

        JButton limpiar = new JButton("Limpiar");
        limpiar.addActionListener(new ActionListener
        ()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                areaDeTexto.setText("");
            }
        });
        limpiar.setBounds(550, 520, 100, 20);
        contentPane.add(limpiar);
    }

    public static void requerimiento1(){

        String salida = "\t\t\t*** Proyectos por Estrato ***\n\nId_Tipo\tCodigo_Tipo\tArea_Maxima\tEstrato\n";
        
        try{
            
            ArrayList<ProyectosPorEstrato> rankingProyectosPorEstratos = controlador.consultarProyectosPorEstrato();

            for (ProyectosPorEstrato proyectosPorEstrato : rankingProyectosPorEstratos)
            {
                salida +="    " + (proyectosPorEstrato.getIdTipo()+"\t"+proyectosPorEstrato.getCodigoTipo() + 
                "\t" + proyectosPorEstrato.getAreaMaxima() + "\t     " + proyectosPorEstrato.getEstrato()+"\n");
            }
            areaDeTexto.setText(salida);

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento2(){    
        
        String salida = "\t\t\t*** Proyectos por Tipo ***\n\nId_Proyecto\tConstructora\t\tCiudad\tEstrato\n";


        try{
            // su codigo
        
            
            ArrayList<ProyectosPorTipo> rankingProyectosPorTipo = controlador.consultarProyectosPorTipo();

            for (ProyectosPorTipo proyectosPorTipo : rankingProyectosPorTipo){
                salida +=proyectosPorTipo.getIdProyecto() + "\t" + proyectosPorTipo.getConstructora() +
                (proyectosPorTipo.getConstructora().length()<10?"\t\t":"\t") + proyectosPorTipo.getCiudad() + "\t     " + proyectosPorTipo.getEstrato()+"\n";
            }
            areaDeTexto.setText(salida);

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento3(){  

        String salida = "\t\t\t*** Proyectos Quibdo Apartaestudios ***\n\nId_Proyecto\tConstructora\t\tPorcentaje_Cuota_Inicial\tAcabados\n";
        try{
              // su codigo    
            ArrayList<ProyectosQuibdoApartaestudio> rankingProyectosQuibdoApartaestudios = controlador.consultarProyectosQuibdoApartaestudio();

            for (ProyectosQuibdoApartaestudio proyectosQuibdoApartaestudio : rankingProyectosQuibdoApartaestudios){
                salida += proyectosQuibdoApartaestudio.getIdProyecto() + "\t" + proyectosQuibdoApartaestudio.getConstructora() + (proyectosQuibdoApartaestudio.getConstructora().length()<10?"\t\t":"\t                 ")  + proyectosQuibdoApartaestudio.getPorcentajeCuotaInicial() + "\t\t    " + proyectosQuibdoApartaestudio.getAcabados() + "\n";
            }
            areaDeTexto.setText(salida);
        
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

}
