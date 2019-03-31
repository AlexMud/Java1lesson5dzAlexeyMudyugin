public class MainClass {

    public static void main(String[] args) {
        Person[] staff = {
                new Person("Ivanov Ivan Ivanovich", "Engineer", "ivanov@mail.ru",
                        "89991111111", 60000, 28),
                new Person("Petrov Pyotr Petrovich", "Senior Engineer", "petrov@mail.ru",
                        "89992222222", 80000, 32),
                new Person("Andreev Andrey Andreevich", "Designer", "andreev@mail.ru",
                        "89993333333", 70000, 36),
                new Person("Sidorov Sidor Sidorovich", "Senior Designer",
                        "sidorov@mail.ru", "89994444444", 90000, 40),
                new Person("Sergeev Sergey Sergeevich", "Manager", "sergeev@mail.ru",
                        "89995555555", 90000, 44)
        };

        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getAge()>40){
                System.out.println(staff[i].getName());
            }
        }
        }
    }
