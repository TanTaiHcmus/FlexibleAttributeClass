class MyClass
{
    public static void main(String[] args) {
        GroupManegement groupManegement = new GroupManegement();
        ManegementGroupByName manegementGroupByName = new ManegementGroupByName();
        MyGroup football = new MyGroup("Bong Da");
        MyGroup lopCNTN = new MyGroup("Lop CNTN");
        football.setObject("Huan luyen vien", "Phan Huynh Duc");
        football.setObject("So luong cau thu", 20);
        football.setObject("Doi truong", "Nguyen Cong Phuong");
        lopCNTN.setObject("GVCN", "Tran Minh Triet");
        lopCNTN.setObject("So luong sinh vien", 69);
        lopCNTN.setObject("Lop truong", "Vo Tan Dat");
        MyGroup football1 = new MyGroup("Bong Da");
        System.out.println(lopCNTN.getObject("GVCN"));
        System.out.println(football1.getObject("So luong cau thu").toString());
    }
}