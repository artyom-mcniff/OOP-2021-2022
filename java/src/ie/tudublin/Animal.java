package ie.tudublin;

public class Animal
{
    private String name;
    private int numLives = 9;

    public void setLives(int numLives)
    {
        this.numLives = numLives;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void kill()
    {
        this.numLives = this.numLives - 1;
        if (this.numLives > 0)
        {
            System.out.println("Ouch");
        }
        else
        {
            System.out.println("Dead");
        }
    }

    public Animal(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }
}