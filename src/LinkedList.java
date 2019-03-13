public class LinkedList extends Item {

    private Item [] listArr;
    private int size;
    private Item nonItem;


    public LinkedList(int size) {

        this.size = size;
        this.listArr = new LinkedList[size];

        }

        public void display () {
            for (int i = 0; i < size; i++) {
                if (listArr[i] != null) {
                    System.out.println(listArr[i].getKey());
                } else {
                    System.out.println("***");
                }
            }
        }


    public int hashFunc ( int key){
            return key % size;
        }

        public void insert (Item item){
            int key = item.getKey();
            int hashVal = hashFunc(key);
            while (listArr[hashVal] != null && listArr[hashVal].getKey() != -1) {
                ++hashVal;
                hashVal %= size;
            }

            listArr[hashVal] = item;
        }

        public Item delete (int key){
            int hashVal = hashFunc(key);
            while (listArr[hashVal] != null) {
                if (listArr[hashVal].getKey() == key) {
                    Item temp = listArr[hashVal];
                  listArr[hashVal] = nonItem;
                    return temp;
                }
                ++hashVal;
                hashVal %= size;
            }
            return null;
        }

        public Item find (int key){
            int hashVal = hashFunc(key);
            while (listArr[hashVal] != null) {
                if (listArr[hashVal].getKey() == key) {
                    return listArr[hashVal];
                }
                ++hashVal;
                hashVal %= size;
            }
            return null;
        }
    }
