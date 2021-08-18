public class Literals {
    public void f(boolean b) {
    }
    void c (String x, String y) {

        //if ((x == y) == true) {
        //System.out.println(x+" такой же как и "+ y);
        // }else{ System.out.println(x + " не такой как " + y);}
        // if ((x!=y) == true){
        //    System.out.println(x+ " круче чем "+y);
        //  }else{
        //    System.out.println(x+" не круче чем "+y);
        //  }

        //if (x.equals(y)==true){
        // System.out.println(x+" эквивалентен "+y+"у");
        // }else {
        // System.out.println(x+" не эквивалентен "+y+"у");
        // }

        f(x == y);
        f(x != y);
        System.out.println("x==y is: " + x==y);
        System.out.println("x!=y is: " + x!=y);
        System.out.println("x.equals(y) is " + x.equals(y));
    }

    public static void main(String[] args) {
        Literals l1 = new Literals();
        l1.c("sdfwd", "sdfdv");
    }
}


