public class constructor{
    //constructor

private static constructor con;

    private constructor(){

    }
    public static constructor getConstructor(){
        //Object of this class
        if (con == null) {
            con = new constructor();
        }
        return con;
    }
}