
import java.util.ArrayList;
import java.util.List;

public class Pila <T>
{
    List<T> elementos;
    Integer tope;
    public Pila(Integer tope)
    {
        this.elementos = new ArrayList<T>();
        this.tope = tope;
    }

    public void apilar(T elemento) throws PilaException
    {
        if (elementos.size() < tope)
        {
            this.elementos.add(elemento);
        }
        else
        {
            throw new PilaException("Error, pila llena");
        }
    }
    

    public T desapilar() throws PilaException
    {
        if (elementos.size() > 0)
        {
            return this.elementos.remove(this.elementos.size());
        }
        else
        {
            throw new PilaException("Error, la pila no tiene elementos");
        }
    }

    public boolean pila_vacia()
    {
        return this.elementos.size() == 0;
    }

    public Integer tamanio()
    {
        return this.elementos.size();
    }

    public T getElementoCima()
    {
        return this.elementos.get(this.elementos.size());
    }
}
