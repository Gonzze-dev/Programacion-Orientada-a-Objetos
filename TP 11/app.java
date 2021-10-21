public class app 
{

    public static void main(String[] args) throws PilaException
    {
        Pila<Integer> objPila = new Pila<Integer>(3);
        objPila.desapilar();
        System.out.println("Error");
    }
    
}
