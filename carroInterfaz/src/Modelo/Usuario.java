
package Modelo;

public class Usuario {
    private String Nombre_Cliente;
    private String correo_Cliente;
    private String contrasena_Cliente;

    public Usuario() {
        this.Nombre_Cliente = "";
        this.correo_Cliente = "";
        this.contrasena_Cliente = "";
    }

    public String getNombre_Cliente() {
        return Nombre_Cliente;
    }

    public void setNombre_Cliente(String Nombre_Cliente) {
        this.Nombre_Cliente = Nombre_Cliente;
    }

    public String getCorreo_Cliente() {
        return correo_Cliente;
    }

    public void setCorreo_Cliente(String auxCorreo) {
        this.correo_Cliente = auxCorreo;
    }

    public String getContrasena_Cliente() {
        return contrasena_Cliente;
    }

    public void setContrasena_Cliente(String auxContrasena) {
        this.contrasena_Cliente = auxContrasena;
    }
}
