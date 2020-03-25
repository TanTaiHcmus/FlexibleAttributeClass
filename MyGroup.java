import java.util.HashMap;
import java.util.Map;

public class MyGroup
{
    private Map<String, Object> myMap;
    private String name;
    private MyGroup() {};
    private void copyGroup(MyGroup otherGroup)
    {
        this.myMap = otherGroup.myMap;
        this.name = otherGroup.name;
    }
    public MyGroup(String groupName)
    {
        name = groupName;
        if (GroupManegement.Exist(groupName))
        {
            this.copyGroup(ManegementGroupByName.getGroupByName(groupName));
            GroupManegement.resetGroup(ManegementGroupByName.getGroupByName(groupName), groupName);
        }
        else 
        {
            myMap = new HashMap<>();
            ManegementGroupByName.addANewGroupByName(groupName, this);
        }
    }

    public Object getObject(String attributeGroup)
    {
        if (myMap.containsKey(attributeGroup))
        {
            if (myMap.get(attributeGroup) == null) 
                return "Khong co gia tri";
            else 
                return myMap.get(attributeGroup);
        }
        return "Khong ton tai thuoc tinh";
    }

    public void setObject(String attributeGroup, Object object)
    {
        myMap.put(attributeGroup, object);
        GroupManegement.addAttributeToGroup(this.name, attributeGroup);
    }
}