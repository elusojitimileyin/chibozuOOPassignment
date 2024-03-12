package chapterThree;

public class Problem {
    private final String name;
    private boolean isSolved = false;
    private final Type type ;

    public Problem(String name, Type type ) {
        this.name = name;
        this.type = type;
    }
    public boolean isSolved() {
        return isSolved;
    }
    public String getName(){
        return name;
    }
    public Type getType(){
        return type;
    }



}
