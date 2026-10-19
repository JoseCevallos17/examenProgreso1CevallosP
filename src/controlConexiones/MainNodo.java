package controlConexiones;

public class MainNodo {
    static void main() {
        NodoRed nodo1 = new NodoRed(1,2);
        System.out.println(nodo1.getConexionesAct() + " conexines activas");
        nodo1.conectar();
        System.out.println(nodo1.getConexionesAct()+ " conexiones");
        nodo1.conectar();
        System.out.println(nodo1.getConexionesAct()+ " conexiones");
        nodo1.conectar();
        System.out.println(nodo1.getConexionesAct()+ " conexiones");
        nodo1.desconectar();
        nodo1.desconectar();
        System.out.println(nodo1.getConexionesAct()+ " conexiones");
        nodo1.desconectar();


        NodoRed nodo2=new NodoRed(-2,-6);

    }

}
