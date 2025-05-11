/**
 * La classe ContactManager permet de gérer une liste de contacts personnels.
 * Elle offre des fonctionnalités pour stocker, ajouter et rechercher des contacts.
 * <p>
 * Cette classe utilise un tableau de taille fixe pour stocker les contacts, avec
 * une capacité maximale de 500 contacts.
 */
public class ContactManager {
    /**
     * Tableau stockant les contacts de l'utilisateur.
     * La taille maximale est fixée à 500 contacts.
     */
    protected Contact[] myFriends;

    /**
     * Compteur du nombre actuel de contacts stockés.
     */
    protected int friendCount;

    /**
     * Constructeur par défaut.
     * Initialise un nouveau gestionnaire de contacts avec un tableau vide
     * pouvant contenir jusqu'à 500 contacts.
     */
    ContactManager() {
        myFriends = new Contact[500];
        friendCount = 0;
    }

    /**
     * Ajoute un nouveau contact à la liste des contacts.
     *
     * @param friend Le contact à ajouter
     * @throws ArrayIndexOutOfBoundsException Si le nombre maximum de contacts (500) est déjà atteint
     */
    public void addFriend(Contact friend) {
        myFriends[friendCount] = friend;
        friendCount++;
    }

    /**
     * Recherche un contact par son nom dans la liste des contacts.
     *
     * @param searchName Le nom du contact à rechercher
     * @return Le contact trouvé ou null si aucun contact ne correspond au nom recherché
     */
    public Contact searchContact(String searchName) {
        for (Contact contact : myFriends) {
            if (contact != null && contact.name.equals(searchName)) {
                return contact;
            }
        }
        return null;
    }
}