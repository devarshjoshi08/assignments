public class singleton {
    public static void main(String[] args) {
        constructor chk1 = constructor.getConstructor();
        System.out.println(chk1.hashCode());
        constructor chk2 = constructor.getConstructor();
        System.out.println(chk2.hashCode());
    }
}
