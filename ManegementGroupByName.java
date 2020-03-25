import java.util.HashMap;
import java.util.Map;

public class ManegementGroupByName
{
    private static Map<String, MyGroup> myManegement;
    public ManegementGroupByName()
    {
        myManegement = new HashMap<>();
    }
    public static void addANewGroupByName(String groupName, MyGroup group)
    {
        myManegement.put(groupName, group);
    }
    public static MyGroup getGroupByName(String groupName)
    {
        return myManegement.get(groupName);
    }
}