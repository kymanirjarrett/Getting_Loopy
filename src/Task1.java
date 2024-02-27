public class Task1
{
    public static void main(String[] args)
    {
        int row = 4;
        int col = 4;

        for (int r = 0; r <= row; r++)
        {
            for (int c = 0; c <= col; c++)
            {
                System.out.printf("*", r * c);
            }
            {
                System.out.println("");
            }
        }
    }
}
