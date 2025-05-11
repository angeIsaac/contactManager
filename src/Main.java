
/**
 * La classe Main sert de point d'entrée de l'application.
 * Elle démontre les fonctionnalités de gestion des contacts utilisant la classe ContactManager.
 * Les contacts sont créés, ajoutés au gestionnaire, et recherchés par nom.
 */
public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("cheick", "0502162069");
        Contact contact1 = new Contact("abou", "0502162069");
        Contact contact2 = new Contact("guidy", "0502162069");
        Contact contact3 = new Contact("trazie bi", "0502162069");
        ContactManager contactManager = new ContactManager();
        contactManager.addFriend(contact);
        contactManager.addFriend(contact1);
        contactManager.addFriend(contact2);
        contactManager.addFriend(contact3);
        System.out.println(contactManager.searchContact("cheick").name);

    }
}