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
