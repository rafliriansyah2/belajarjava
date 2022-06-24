public class OuterClass {
    String str;
    boolean outerClassAccessible;
    InnerClass in;

    // constructor OuterClass
    public OuterClass() {
        str = new String("Outer class variable");
        outerClassAccessible = true;
        OuterClass.InnerClass in = new OuterClass.InnerClass();
        System.out.println(str);

        System.out.println("outerClassAccessible1 : " + outerClassAccessible);
        System.out.println("innerClassAccessible1 : " + in.innerClassAccessible);
    }

    // inner class
    class InnerClass {
        String str;
        boolean innerClassAccessible;

        // constructor InnerClass
        public InnerClass() {
            str = new String("InnerClass variable");
            innerClassAccessible = true;
            System.out.println(str);
            System.out.println("outerClassAccessible2 : " + outerClassAccessible);
            System.out.println("innerClassAccessible2 : " + innerClassAccessible);
        }
    }
}
