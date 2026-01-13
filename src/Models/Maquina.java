package Models;

import java.util.List;

public class Maquina implements Comparable<Maquina>{
    private String nombre;
    private String ip;
    private List<Integer> codigos;
    private int subred;
    private int riesgo;
    public Maquina(String nombre, String ip, List<Integer> codigos) {
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
        this.subred = calcularSubred();
        this.riesgo = 0;
    }

    // IP = 192.168.100.1 -> 100: La subred es el tercer numero
    // IP = 172.16.55.90 -> 55
    private int calcularSubred() { 
        String[] octetos = ip.split("\\.");
        String subred = octetos[2];

        return Integer.parseInt(subred);
    }

    private int calcularRiesgo() {

        return 0;
    }

    @Override
    public int compareTo(Maquina o) {
        int compSubred = Integer.compare(this.subred, o.subred);
        if (compSubred != 0) {
            return compSubred;
        }

        return this.nombre.compareTo(o.nombre);
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<Integer> getCodigos() {
        return codigos;
    }

    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }

    public int getSubred() {
        return subred;
    }

    public void setSubred(int subred) {
        this.subred = subred;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }
}
