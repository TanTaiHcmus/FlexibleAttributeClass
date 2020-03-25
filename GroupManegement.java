import java.util.HashMap;
import java.util.Map;

public class GroupManegement
{
    private static Map<String, String[]> myManegement = null;
    public GroupManegement()
    {
        if (myManegement == null) myManegement = new HashMap<String, String[]>();
    }
    public static boolean Exist(String groupName)
    {
        return (myManegement.containsKey(groupName));
    }

    public static void resetGroup(MyGroup group, String groupName)
    {
        for (String s : myManegement.get(groupName))
            group.setObject(s, null);
    }
    public static void addAttributeToGroup(String groupName, String attribute)
    {
        if (myManegement.containsKey(groupName))
        {
            String s[] = new String[myManegement.get(groupName).length + 1];
            for (int i = 0; i < myManegement.get(groupName).length; i++)
                s[i] = (myManegement.get(groupName))[i];
            s[s.length - 1] = attribute;
            myManegement.put(groupName, s);
        }
        else
        {
            String s[] = new String[1];
            s[0] = attribute;
            myManegement.put(groupName, s);
        }
    }
}