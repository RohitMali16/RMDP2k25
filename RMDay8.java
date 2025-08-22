public class Reverseprogram
 {
    public static String Reverseprogram(String s) 
    {
        s = s.trim();

        String[] words = s.split(" ");

        String result = "";

        for (int i = words.length - 1; i >= 0; i--)
         {
            if (!words[i].equals(""))
             {   
                result += words[i] + " "; 
            }
        }

        return result.trim();
    }

    public static void main(String[] args) 
    {
        String s = " Messi Lionel is Football the of God";
        System.out.println("Input: \"" + s + "\"");
        System.out.println("Output: \"" + Reverseprogram(s) + "\"");
    }
}
