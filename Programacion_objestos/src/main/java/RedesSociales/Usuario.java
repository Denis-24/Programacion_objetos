package RedesSociales;

import lombok.Getter;
import lombok.Setter;

import java.security.PrivateKey;
import java.security.PublicKey;

@Getter @Setter
public class Usuario {
    private String nombre;
    private int edad;
    private String nombre_usuario;
    private int seguidores;

    public Usuario(String nombre, int edad, String nombre_usuario, int seguidores){
        this.nombre = nombre;
        this.edad = edad;
        this.nombre_usuario = nombre_usuario;
        this.seguidores = seguidores;
    }

    public void mostrarInfo(){
        System.out.println("Informacion de usuario: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nombre de usuario: " + nombre_usuario);
        System.out.println("Seguidores: " + seguidores);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nombre_usuario='" + nombre_usuario + '\'' +
                ", seguidores=" + seguidores +
                '}';
    }
}
