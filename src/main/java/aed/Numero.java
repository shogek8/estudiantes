package aed;
//Invariante :
//i es un int 
//es para compartir la referencia
public class Numero {
    int i;

    public Numero(){
        i = 0;
    }

    public void mas_uno(){
        i++;
    }
    public void menos_uno(){
        i--;
    }
    public int numero(){
        return i;
    }
}
