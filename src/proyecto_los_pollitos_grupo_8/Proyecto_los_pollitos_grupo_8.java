/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_los_pollitos_grupo_8;

import javax.swing.JOptionPane;

/**
 * Participantes grupos 8:
 * Sergio Joel Mendez Ortega 
 * Kristhel Brigitte Rodriguez Villalobos 
 * Gabriel Porras Rodriguez
 *
 */
public class Proyecto_los_pollitos_grupo_8 {

    public static void main(String[] args) {
        // Vamos agregar los arreglos de objetos aqui
        boolean continuar = true;
        String menu = "Bienvenido al sistema del supermercado Los Pollitos, por favor seleccione una opcion:"
                + "\n1.Registro\n2.Ver inventario\n3.Registrar una venta\n4.Salir";
        String opcion = "";

        while (continuar == true) {
            opcion = JOptionPane.showInputDialog(menu);
            switch (opcion) {
                case "1":
                    String subMenu = JOptionPane.showInputDialog(null, "Bienvenido al registro\n"
                            + "1.Registrar nuevo producto\n2.Registrar nueva marca\n3.Registrar una nueva categoria \n4.Regresar");

                    switch (subMenu) {
                        case "1":
                            //Aqui se van a registrar los productos
                            break;
                        case "2":
                            // Aqui se van a registrar las nuevas marcas
                            break;

                        case "3":
                            // Aqui se van a registrar las categorias;
                            break;
                        case "4":
                            JOptionPane.showMessageDialog(null, "Regresando al menu principal ...");
                            // Regresar;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Error la opcion ingresada no es valida.");
                            break;
                    }
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Inventario:");
                    // Aqui se va mostrar la lista de productos con sus datos
                    break;
                case "3":
                    String nombreCliente = JOptionPane.showInputDialog(null, "Bienvenido al registro de ventas \n Por favor escriba su nombre");
                    // Aqui se van a registrar las ventas
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema de ventas...");
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error la opcion ingresada no es valida.");
                    break;
            }
        }

    }

}
