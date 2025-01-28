
public class Main {

    public static void main(String[] args) {
        SimpleCollection collection = new SimpleCollection("characters");
        System.out.println("Collection name: " + collection.getName());
        System.out.println("");

        System.out.println(collection);
        System.out.println("");

        collection.add("magneto");
        System.out.println(collection);
        System.out.println("");

        collection.add("mystique");
        System.out.println(collection);
        System.out.println("");

        collection.add("phoenix");
        System.out.println(collection);
    }
}
