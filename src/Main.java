import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


        LinkedList list = new LinkedList ();

        Item item1 = new Item("Ольга", 26);
        Item item2 = new Item("Наташа", 36);
        Item item3 = new Item("Василий", 21);
        Item item4 = new Item("Виктор", 25);
        Item item5 = new Item("Александер", 24);

        list.add(item1);
      list.add(item2);
        list.add(item3);
        list.add(item4);
        list.add(item5);

        System.out.println("After insert:");
        list.display();
        System.out.println("After remove:");
        list.remove(item1);
        list.display();
        System.out.println("Find Pavel: " + list(item4.getId()));

        System.out.println("size is " + list.getSize());
        System.out.println("Finish");

    }

}







