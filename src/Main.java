public class Main {
    public static void main(String[] args) {
        MyArrayLists<Integer> arr = new MyArrayLists<>();
        arr.size();
        System.out.println(arr.getCapacity());
        arr.add(1);
        arr.add(10);

        arr.size();
        System.out.println(arr.getCapacity());
        arr.add(55);
        arr.size();
        System.out.println(arr.getCapacity());
        arr.add(50);
        arr.size();
        arr.gotoString();
        System.out.println();
        System.out.println(arr.getCapacity());
        System.out.println(arr.get(2));
        System.out.println(arr.get(71));
        arr.remove(1);
        arr.gotoString();
        System.out.println();
        arr.size();
        arr.set(5,5);
        arr.set(1,12);
        arr.size();
        arr.gotoString();
        System.out.println(arr.isEmpty());
        arr.clear();
        System.out.println("İçi Boşaltıldı");
        System.out.println(arr.isEmpty());
        arr.gotoString();
        System.out.println();
        arr.size();
        arr.add(5);
        arr.add(15);
        arr.add(20);
        arr.size();
        System.out.println(arr.contains(5));
        System.out.println(arr.contains(51));

    }
}