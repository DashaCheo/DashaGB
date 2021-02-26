public class Hw5 {
    class Person {
        private String fio;
        private String post;
        private String email;
        private String tel;
        private double salary;
        private int age;

        Person(String fio, String post, String email, String tel, double salary, int age) {
            this.fio = fio;
            this.post = post;
            this.email = email;
            this.tel = tel;
            this.salary = salary;
            if(age >= 18) {
                this.age = age;
            } else {
                System.out.println("Сотрудник должен быть старше 18 лет");
            }
        }

        int GetAge() {
            return age;
        }

        void Show() {
            System.out.println(fio + " " + post + " " +  email + " " + tel + " " + salary + " " + age);
        }
    }



    public class Main {

        public static void main(String[] args) {

            Person[] persArray = new Person[5];
            persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
            persArray[1] = new Person("CHeo Dasha", "Engineer1", "cheodasha@mailbox.com", "1892312312", 40000, 40);
            persArray[2] = new Person("Zubova Masha", "Engineer2", "zubova@mailbox.com", "2892312312", 50000, 50);
            persArray[3] = new Person("Komarov Sasha", "Engineer3", "komarov3@mailbox.com", "3892312312", 60000, 60);
            persArray[4] = new Person("Petrov Dima", "Engineer4", "petrov@mailbox.com", "4892312312", 70000, 70);

            for(Person item : persArray) {
                if(item.GetAge() > 40) item.Show();
            }
        }
    }