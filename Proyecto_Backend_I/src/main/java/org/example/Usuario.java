package org.example;
public class Usuario {
    private int id;
    private String username;
    private String password;
    private int intentos;
    private boolean activo;


    public Usuario() {}


    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
        this.intentos = 0;
        this.activo = true;
    }


// getters y setters
public String getUsername() {
    return username;
}

    public String getPassword() {
        return password;
    }

    public int getIntentos() {
        return intentos;
    }

    public boolean isActivo() {
        return activo;
    }

    // SETTERS
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}