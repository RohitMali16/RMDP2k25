import java.util.*;

public class LongSubstring
 
{
    public static int lenOfLongSubstring(String s) 
    {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) 
        {
            char ch = s.charAt(right);
            while (set.contains(ch))
            {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args)
     {
        String s = "abcabcbb";
        System.out.println("Length of longest substring: " + lenOfLongSubstring(s));
    }
}
