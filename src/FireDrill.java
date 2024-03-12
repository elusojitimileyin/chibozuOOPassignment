public class FireDrill {

    private String birthDate;
    private int age;
    private int birthDay;

    private int birthMonth;
    private int birthYear;




    public int getBirthDay(){
        return birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }
    public int setBirthDate(){
        int birthDay = getBirthDay();
        int birthMonth = getBirthMonth();
        int birthYear = getBirthYear();
         int age = Integer.parseInt(birthDay + "/" + birthMonth + "/" + birthYear);
         return age;
    }
    public int getBirthDate(int age){
        return age;
    }
    public int currentDate(){return  age;
    }
}
