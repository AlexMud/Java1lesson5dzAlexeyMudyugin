public class Person {

    private String lastFirstFatherName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String lastFirstFatherName, String position, String email, String phone, int salary, int age) {
        this.lastFirstFatherName = lastFirstFatherName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName(){
        return lastFirstFatherName;
    }

    public void info(){
        System.out.println("Name: " + lastFirstFatherName + "; position: " + position + "; e-mail: " + email +
                "; phone number: " + phone + "; salary: " + salary + "; age: " + age);
    }

}