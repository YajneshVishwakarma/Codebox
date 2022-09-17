public class Main
{
    public String addComma(String comma)
    {
        int counter = 0, atComma = 3;
        String res = "";

        for (int i = comma.length()-1; i >= 0; i-- )
        {
            res =  Character.toString(comma.charAt(i)) + res;
            counter += 1;

            if(counter % atComma == 0 && i > 0)
            {
                res = "," +res;
                atComma = 2;
                counter = 0;
            }
        }
        return res;
    }
    public static void main(String[] args) {

        Main m = new Main();

        System.out.println(m.addComma("100000000000000"));
    }
}
