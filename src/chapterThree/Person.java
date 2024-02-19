 package chapterThree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private List<Problem> problems;

    public Person(){
        problems = new ArrayList<>();
    }

    public void addProblem(Problem problem){
        problems.add(problem);
    }
    public void solveProblem(Problem problem){
        problems.remove(problem);
    }

    public  List<Problem>  recount() {
        return problems;

    }


}
