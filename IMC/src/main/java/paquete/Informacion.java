package paquete;

public class Informacion {
    double peso;
    double altura;
    double pesoKg;
    double alturaMetros;
    
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double convertirPeso() {
      pesoKg = peso/2.205;
      return pesoKg;
    }
    public double convertirAltura(){
        alturaMetros = altura/100;
        return alturaMetros;
    }
    
    public double mostrarIMC(){
        double total;
        total = convertirPeso()/Match.pow(convertirAltura(),2);
        return total;
    }
    
    public String MostrarResultado(){
        String rango = null;
     
        if(mostrarIMC()<24.9){
            rango = "Bajo peso";
        
        }else if (mostrarIMC()<24.9){
            rango = "peso ideal";
        }else if (mostrarIMC()>30){
            rango = "peso ideal";
        }
     return rango;}
    
    
    }