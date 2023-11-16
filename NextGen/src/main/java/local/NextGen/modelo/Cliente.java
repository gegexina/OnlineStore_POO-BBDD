package local.NextGen.modelo;

/**
 * Clase abstracta que representa un cliente con sus atributos básicos.
 */
public abstract class Cliente {
    private int idCliente;
    private String nif;
    private String nombre;
    private String email;
    private String direccion;

    /**
     * Constructor para crear un objeto Cliente con los detalles especificados.
     * @param idCliente El ID del cliente.
     * @param nif El NIF del cliente.
     * @param nombre El nombre del cliente.
     * @param email El correo electrónico del cliente.
     * @param direccion La dirección de envío del cliente.
     */
    public Cliente(int idCliente, String nif, String nombre, String email, String direccion) {
        this.idCliente = idCliente;
        this.nif = nif;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    // Getters y setters

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public abstract String tipoCliente();
    public abstract float calcAnual();
    public abstract float descuentoEnv();

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
