/**
 * Classe représentant un contact avec un nom et un numéro de téléphone.
 */
public class Contact {
    /**
     * Le nom du contact
     */
    protected String name;

    /**
     * Le numéro de téléphone du contact
     */
    protected String phone;

    /**
     * Constructeur pour créer un nouveau contact.
     *
     * @param name  Le nom du contact
     * @param phone Le numéro de téléphone du contact
     */
    Contact(final String name, final String phone) {
        this.name = name;
        this.phone = phone;
    }
}
