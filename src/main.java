public class main
{
    public static void main(String[] args)
    {
        String string   = "";
        int    spacemax = 0;
        char   Lettre   = '*';

        for (int ligne = 20; ligne > 0; ligne--)
        {
            for (int i = 0; i < ligne / 2; i++)
            {
                string += " ";
            }

            string += Lettre;

            for (int space = 0; space < spacemax; space++)
            {
                string += Lettre;
            }

            string += Lettre;

            for (int i = 0; i < ligne / 2; i++)
            {
                string += " ";
            }

            ligne--;
            spacemax += 2;
            System.out.println(string);
            string = "";
        }
    }
}