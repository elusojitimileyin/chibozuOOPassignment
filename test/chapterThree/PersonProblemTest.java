package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonProblemTest {

    @Test
    public void testAddProblemAndCount() {

        Problem problem1 = new Problem("Financial Crisis", Type.FINANCIAL);
        Problem problem2 = new Problem("Lack of Education", Type.EDUCATION);
        Problem problem3 = new Problem("Spiritual Issue", Type.SPIRITUAL);
        Problem problem4 = new Problem("Poor Business Output", Type.BUSINESS);


        Person person = new Person();

        person.addProblem(problem1);
        person.addProblem(problem2);
        person.addProblem(problem3);
        person.addProblem(problem4);

        assertEquals(4, person.recount().size());
    }

    @Test
    public void testAddProblemAndSolve() {

        Problem problem1 = new Problem("Financial Crisis", Type.FINANCIAL);
        Problem problem2 = new Problem("Lack of Education", Type.EDUCATION);
        Problem problem3 = new Problem("Spiritual Issue", Type.SPIRITUAL);
        Problem problem4 = new Problem("Poor Business Output", Type.BUSINESS);


        Person person = new Person();

        person.addProblem(problem1);
        person.addProblem(problem2);
        person.addProblem(problem3);
        person.addProblem(problem4);

        assertEquals(4, person.recount().size());

        person.solveProblem(problem2);

        assertEquals(3, person.recount().size());
    }
    @Test
        public void testAddProblemAndRemoveProblem(){
        Problem problem10 = new Problem("Financial Crisis", Type.FINANCIAL);
        Problem problem20 = new Problem("Lack of Education", Type.EDUCATION);
        Problem problem30 = new Problem("Spiritual Issue", Type.SPIRITUAL);
        Problem problem40 = new Problem("Business Output", Type.BUSINESS);

        Person persons = new Person();

        persons.addProblem(problem10);
        persons.addProblem(problem20);
        persons.addProblem(problem30);
        persons.addProblem(problem40);

            assertEquals(4, persons.recount().size());
            persons.solveProblem(problem20);
            persons.solveProblem(problem40);

            assertEquals(2, persons.recount().size());
    }

    }

