public class Shop
{
    private String shop_Name;
    private String shop_Owner;
    private long shop_Phoneno;
    private String shop_Address;
    private double shop_Rating;

    public void setShop_Owner(String shop_Owner)
    {
        this.shop_Owner = shop_Owner;
    }

    public void setShop_Phoneno(long shop_Phoneno)
    {
        this.shop_Phoneno = shop_Phoneno;
    }

    public void setShop_Address(String shop_Address)
    {
        this.shop_Address = shop_Address;
    }

    public void setShop_Rating(double shop_Rating)
    {
        this.shop_Rating = shop_Rating;
    }

    public void setShop_Name(String shop_Name)
    {
        this.shop_Name = shop_Name;
    }

    public double getShop_Rating()
    {
        return shop_Rating;
    }

    public String getShop_Name()
    {
        return shop_Name;
    }

    public String getShop_Owner()
    {
        return shop_Owner;
    }

    public long getShop_Phoneno()
    {
        return shop_Phoneno;
    }

    public String getShop_Address()
    {
        return shop_Address;
    }

    public String toString()
    {
        return "Shop Name : "+this.shop_Name+"\nShop Owner name : "+this.shop_Owner+"\nShop Owner Phone number : "+this.shop_Phoneno+"\nShop Address : "+this.shop_Address+"\nShop Rating : "+this.shop_Rating;
    }
}


public class Shop_Driver
{
    public static void main(String[] args)
    {
        Shop sh = new Shop();

        sh.setShop_Name("Amazon");
        sh.setShop_Owner("Jeff Bezos");
        sh.setShop_Phoneno(998687758);
        sh.setShop_Address("New York");
        sh.setShop_Rating(4.5);

        System.out.println(sh);
    }
}
