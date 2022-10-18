package com.appbuelito.appbuelito;

public class Appbuelito {
    //atributos
    private String nombre;
    private String apellido;
    private String email;
    private String pass;

    //constructor principal
    public Appbuelito(String nombre, String apellido, String email, String pass){
        setNombre(nombre);
        setApellido(apellido);
        setEmail(email);
        setPass(pass);
    }

    public void setNombre(String nombre){
        if(nombre != null){
            this.nombre = nombre;
        } 
    }

    public void setApellido(String apellido){
        if(apellido != null){
            this.apellido = apellido;
        }
    }

    public void setEmail(String email){
        if(email != null){
            this. email = email;
        }
    }

    public void setPass(String pass){
        if(pass != null){
            this.pass = pass;
        }
    }

    public void mostrarLogin(){
        System.out.println("-----------------------------\nBienvenido " + nombre + " " + apellido + "\nTe registraste exitosamente en nuestro sistema.");
    }

    public void registro(){
        System.out.println("-----------------------------\nTus nuevas credenciales son");
        System.out.println("email: " + email + "\nContraseña: " + pass + "\n-----------------------------");
    }

}
