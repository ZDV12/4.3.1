public class Program {
    public static void main (String args[]){
         PhoneBook phoneBook = new PhoneBook("Телефонный справочник");
         phoneBook.addGroup("Семья");
         Contact petya = new Contact("Петя", "89123456789");
         Contact ivan = new Contact("Иван", "82126452730");
         phoneBook.addContact(petya, "Семья");



    }
}
