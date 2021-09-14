package JCA_Homework10;

public class Main {
    public static void main(String[] args) {
                Phone myPhone = new Phone();
                myPhone.setName("Eray");
                myPhone.setNumber("0533XXXXXXX");

                Phone girlfriendPhone = new Phone();
                girlfriendPhone.setName("Canan");
                girlfriendPhone.setNumber("0544XXXXXXX");

                Phone yourPhone = new Phone();
                yourPhone.setName("Bita Mirshafiee");
                yourPhone.setNumber("0599XXXXXXX");


                PhoneBook phoneBook = new PhoneBook();
                phoneBook.add(myPhone);
                phoneBook.add(girlfriendPhone);
                phoneBook.add(yourPhone);

                System.out.println(phoneBook);
            }

        }
