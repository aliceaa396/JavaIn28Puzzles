package JavaDrills.Generics;

public class GenericsClass {
    public static void main(String[] args) {

        //BEFORE GENERICS
//        MyCustomList list = new MyCustomList();
//        list.addElement("Element1");
//        list.addElement("Element2");
//
//        MyCustomList list2 = new MyCustomList();
//        list2.addElement(Integer.valueOf(5));
//        list2.addElement(Integer.valueOf(7));

        //AFTER GENERICS
        MyCustomList <String> list = new MyCustomList<>();
        list.addElement("Element1");
        list.addElement("Element2");
        String value = list.get(0);

        System.out.println(list);

        MyCustomList <Integer> list2 = new MyCustomList<>();
        list2.addElement(Integer.valueOf(1));
        list2.addElement(Integer.valueOf(2));
        Integer number = list2.get(0);

        System.out.println(list2);
    }
}
