package API.Testing;

public class BuilderPatternJava {
    // change return type of each method as Class type
    // "this" always points to current/calling object. returning the same to have same reference

    public BuilderPatternJava Floor1() {
        System.out.println("Floor1 is done");
        return this;
    }

    public BuilderPatternJava Floor2(String param) {
        System.out.println("Floor2 is done");
        return this;
    }

    public BuilderPatternJava Floor3() {
        System.out.println("Floor3 is done");
        return this;
    }

    public static void main(String[] args) {
        BuilderPatternJava bp = new BuilderPatternJava();
        bp.Floor1().Floor2("Vinay").Floor3();
    }


    }





