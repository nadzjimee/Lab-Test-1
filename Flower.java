
public class Flower
{
    public String name;
    public String color;
    public double price;
    public int quantity;
    
    public Flower()
    {
         name = " ";
         color = " ";
         price = 0.00;
         quantity = 0;
    }
    
    public Flower(String name, String color, double price, int quantity)
    {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }
    
    public void setFlower(String name, String color, double price, int quantity)
    {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public String toString()
    {
        return("\nThe name of flower : " + name + "\nThe color of flower : " + color + "\nThe price : " + price + "\nThe quantity of flower : " + quantity);
    }
}
