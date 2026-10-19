package controlConexiones;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class NodoRed {
    private int identificador;
    private int capacidadMax;
    private int conexionesAct;
    public static int contNodos;

    public NodoRed(int identificador, int capacidadMax) {
        this.identificador = contNodos;
        this.capacidadMax = capacidadMax;
        contNodos++;
    }

    public static int contNodos(){
        return contNodos ++;
    }

    public final void capacidadMax(int capacidadMax) {
        if(capacidadMax > 0)
            this.capacidadMax = capacidadMax;
    }

    public void setConexionesAct(int conexionesAct) {
        if(conexionesAct>0 && conexionesAct<capacidadMax)
            this.conexionesAct = conexionesAct;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public int getConexionesAct() {
        return conexionesAct;
    }

    public boolean conectar(){
        if (conexionesAct<capacidadMax){
            conexionesAct++;
            return true;
        } else {
            System.out.println("Las conexiones activas llegaron a su maximo");
            return false;
        }
    }

    public boolean desconectar(){
        if(conexionesAct>0){
            conexionesAct= conexionesAct -1;
            return true;
        } else{
            System.out.println("No hay conexiones activas para desconectar");
            return false;
        }
    }

    public void consulta(){
        System.out.println("Usted tiene " + contNodos + " Nodos creados");
    }
}