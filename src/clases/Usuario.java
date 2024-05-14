package clases;

public class Usuario {
    private String nombre;
    private String email;
    private String ip;
    private String telefono;
    private String nick;
    private String contra;

    public Usuario(String nombre, String email, String ip, String telefono, String nick, String contra) {
        this.nombre = nombre;
        this.email = email;
        this.ip = ip;
        this.telefono = telefono;
        this.nick = nick;
        this.contra = contra;
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
}
