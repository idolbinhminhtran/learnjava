package learn_oop.lesson3;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Person(String name, int age, String gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    public Person()
    {

    }




    public String toString()
    {
        return "name: " + this.name + " age: " + this.age + " gender: " + this.gender + " hobby: " + this.hobby;

    }
}

class Main
{
    public static void main(String[] args) {
        Person princess = new Person();
        princess.setName("Nguyen Ngoc Khanh Linh");
        princess.setAge(19);
        princess.setHobby("Cooking");
        princess.setGender("Female");

        Person coder = new Person("Nguyen Van Thuy", 22, "Male", "Masturbation");



        System.out.println(princess.toString());
        System.out.println(coder.toString());
    }


}