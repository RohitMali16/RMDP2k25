public class LongestCommonPrefix
 {
    public static String longestCommonPrefix(String[] strs) 
    {
        if (strs == null || strs.length == 0) 
        {
            return "";
        }

        StringBuilder prefix = new StringBuilder();

        String first = strs[0];
        for (int i = 0; i < first.length(); i++) 
        {
            char c = first.charAt(i);
            for (int j = 1; j < strs.length; j++) 
            {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) 
                {
                    return prefix.toString();
                }
            }
            prefix.append(c);
        }

        return prefix.toString();
    }

    public static void main(String[] args) 
    {
        String[] words1 = {"flower", "flow", "flight"};
        String[] words2 = {"Messi", "Ronaldo", "Neymar"};

        System.out.println("Ex 1: " + longestCommonPrefix(words1));
        System.out.println("Ex 2: " + longestCommonPrefix(words2));
    }
}
