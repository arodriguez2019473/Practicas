public class TestEnum {
    
    enum TipoDeMadera { ROBLE, CAOBA, NOGAL, CEREZO, BOJ };

    public static void main (String[ ] Args) {

        TipoDeMadera maderaUsuario;
        maderaUsuario = TipoDeMadera.ROBLE;

        System.out.println ("La madera elegida por el usuario es " + maderaUsuario.toString().toLowerCase() );
        System.out.println ("¿Es la madera elegida por el usuario caoba? Resultado: " + (maderaUsuario==TipoDeMadera.CAOBA) );
        System.out.println ("¿Es la madera elegida por el usuario roble? Resultado: " + (maderaUsuario==TipoDeMadera.ROBLE) );

    } //Cierre del main

} //Cierre de la clase