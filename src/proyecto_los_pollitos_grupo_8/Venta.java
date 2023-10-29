/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_los_pollitos_grupo_8;

/**
 *
 * @author 50686
 */
public class Venta {
    private int idVenta;
    private String nombreCliente;
    private Double subTotal;
    private Double total;

    public Venta(int idVenta, String nombreCliente, Double subTotal, Double total) {
        this.idVenta = idVenta;
        this.nombreCliente = nombreCliente;
        this.subTotal = subTotal;
        this.total = total;
    }

    public Venta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }    
}
