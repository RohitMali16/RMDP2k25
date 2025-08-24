import java.util.*;

public class Groupmembers
 {
    public static List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) 
        {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (map.containsKey(key))
             {
                map.get(key).add(word);
            } 
            else 
            {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(key, list);
            }
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args)
     {
        String[] words = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(words);

        System.out.println(result);
    }
}
