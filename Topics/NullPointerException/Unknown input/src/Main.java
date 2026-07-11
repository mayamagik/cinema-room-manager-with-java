class Util {
    // correct this method to avoid NPE
    public static void printLength(String name) {

        if (name == null) {
            System.out.println(name+ " null");
        } else if ( name.isEmpty()) {
            System.out.println(name+ " empty");
        } else {
        System.out.println(name.length());

        }
    }
}