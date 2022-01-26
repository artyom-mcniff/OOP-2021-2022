package ie.tudublin;

public class Main
{
    public static void main(String[] args)
    {
        int i = 0;
        System.out.println("Hello world");

        Animal misty = new Animal("Misty");
        Animal lucy = new Animal("Lucy");
        Animal ginger = new Animal("Ginger");

        lucy = misty;
        misty.setName("Tara");

        System.out.println(misty);
        System.out.println(lucy);

        for (i = 0; i < 9; i++)
        {
            ginger.kill();
        }

        

        // Tara Misty
        // Tara Tara
        
    }
}