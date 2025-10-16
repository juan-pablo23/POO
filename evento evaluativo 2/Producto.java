public class Producto {
    private String codigo;
    private String descricion;
    private int cantidad;
    private double precioUnitario;

    public Producto(){
        this. codigo = "Sin Codigo";
        this. descricion = "Sin Descricción";
        this. cantidad = 1;
        this. precioUnitario = 0.0;
    }
    public Producto(String codigo, String descriccion, int cantidad, double precioUnitario) {
        if (codigo != null && !codigo.isEmpty()) {
            this. codigo = codigo;
        } else {
            this. codigo = "Sin Codigo";
        }
        if (descriccion != null && !descriccion.isEmpty()) {
            this. descricion = descriccion;
        } else {
            this. descricion = "Sin Descripción";
        }
        if (cantidad >= 1) {
            this. cantidad = cantidad;
        } else {
            this. cantidad = 1;
        }
        if (precioUnitario >= 0) {
            this. precioUnitario = precioUnitario;
        } else {
            this. precioUnitario = 0.0;
        }
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        if (codigo != null && codigo.isEmpty()) {
            this. codigo = codigo;
        }
    }
    public String getDescripccion() {
        return descricion;
    }
    public void setDescripccion(String descripccion) {
        if (descripccion != null && descripccion.isEmpty()) {
            this. descricion = descripccion;
        }
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        if (cantidad >= 1) {
            this. cantidad = cantidad;
        }
    }
    public double getPrecioUnitario() {
     return precioUnitario;   
    }
    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario >= 0) {
            this. precioUnitario = precioUnitario;
        }
    }

    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 50) {
            double descuento = calcularSubtotal() * (porcentaje / 100);
            precioUnitario = precioUnitario - (descuento / cantidad);
        }
    }
    public void incrementarCantidad (int valor) {
        if (valor > 0) {
            cantidad = cantidad + valor;
        }
    }
    public String tooString() {
        return "Códico: " + codigo + " Descripciión: " + descricion + " Cantidad: " + cantidad + " Precio Unitario: " + precioUnitario + " Total: " + calcularSubtotal();
    }
}
