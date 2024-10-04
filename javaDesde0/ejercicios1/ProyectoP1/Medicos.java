public class Medicos
{
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;
    private String numeroDocumentoIdentidad;
    private String especialidad;
    
    
    public Medicos()
    {
        
        nombre = "pepe";
        apellidos = "perez";
        edad = 32;
        casado = true;
        numeroDocumentoIdentidad = "28173909027";
        especialidad = "dormir";
        
    }
    
    
// este es el ejercicio 2   
// ------------------------------------------------------------------------ 
    public void calculoParaMultiploEdad(){
    
        edad = edad % 5;
        edad = 5 - edad;
        
        System.out.println("El medico con nombre de "+nombre+" con especialidad "+especialidad+" tendra una edad multiplo de 5 dentro de "+ edad + " años");
        
    
    }
// ------------------------------------------------------------------------

    public String respuestaNombre(String valorNombre){
    
        System.out.println("se ha cambiado el nombre a " + valorNombre);
        nombre = valorNombre;
        return "el metodo ha devuelto" + valorNombre;
        
    }
    
    public String respuestApellido(String valorApellidos){
        
        System.out.println("se ha cambiado el apellidos a " + valorApellidos);
        apellidos = valorApellidos;
        return "el metodo se ha devuelto " + valorApellidos;
    
    }
    
    public String respuestaEdad(int valorEdad){
    
        System.out.println("se ha cambiado la edad a " + valorEdad);
        edad = valorEdad;
        return "el metodo ha devuelto"+ valorEdad;

    }
    
    public String respuestaCasado(boolean valorCasado){
    
        System.out.println("se ha cambiado el casado a " + valorCasado);
        casado = valorCasado;
        return "el metodo ha devuelto" + valorCasado;
        
    }
    
    public String respuestaNumeroDeDocumentoIdentidad(String valorNumeroDocumentoIdentidad){
    
        System.out.println("se ha cambiado el documento de identidad a " + valorNumeroDocumentoIdentidad);
        numeroDocumentoIdentidad = valorNumeroDocumentoIdentidad;
        return "el metodo ha devuelto " + valorNumeroDocumentoIdentidad;
        
    }
    
    public String respuestaEspecialidad(String valorEspecialidad){
    
        System.out.println("se ha cambiado la especialidad a " + valorEspecialidad);
        especialidad = valorEspecialidad;
        return "el metodo ha devuelve " + valorEspecialidad;
        
    }

    public String getNombre(){return nombre;}

    public String getApellido(){return apellidos;}
    
    public int getEdad(){return edad;}
    
    public boolean getCasado(){return casado;}
    
    public String getnumeroDocumentoIdentidad(){return numeroDocumentoIdentidad;}
    
    public String getEspecialidad(){return especialidad;}
    
}
