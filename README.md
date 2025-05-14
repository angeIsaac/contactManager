# Contacts Manager

## Description

Le projet **Contacts Manager** est une application Java conçue pour gérer une liste de contacts personnels. Il fournit des fonctionnalités pour ajouter, rechercher et gérer des contacts. Ce programme est simple mais efficace, offrant une base solide pour comprendre la gestion de données en Java.

---

## Structure du Projet

Voici une description des principaux fichiers situés dans le dossier `src` :

### 1. `Contact.java`

La classe `Contact` représente un contact individuel avec :

- **Attributs** :
    - `name` : Le nom du contact.
    - `phone` : Le numéro de téléphone du contact.

- **Constructeur** :
    - Permet d'initialiser un contact avec son nom et son numéro de téléphone.

### 2. `ContactManager.java`

La classe `ContactManager` est responsable de la gestion d'une liste de contacts.

- **Attributs** :
    - `myFriends` : Un tableau de `Contact` stockant jusqu'à 500 contacts.
    - `friendCount` : Le compteur des contacts actuellement stockés.

- **Fonctionnalités principales** :
    - `addFriend(Contact friend)` : Ajoute un nouveau contact.
    - `searchContact(String searchName)` : Recherche un contact par son nom.

- **Limites** :
    - Le nombre maximum de contacts est fixé à 500.

### 3. `Main.java`

La classe `Main` est le point d'entrée de l'application.

- **Ce qu'elle fait** :
    - Crée des instances de `Contact`.
    - Ajoute ces contacts dans une instance de `ContactManager`.
    - Démontre la recherche d'un contact spécifique dans le gestionnaire.

---

## Fonctionnalités

L'application offre les fonctionnalités suivantes :

1. **Ajout d'un contact** :
    - Créez un objet `Contact` avec un nom et un numéro de téléphone.
    - Ajoutez-le au gestionnaire à l'aide de la méthode `addFriend`.

2. **Recherche d'un contact** :
    - Utilisez la méthode `searchContact` pour rechercher un contact par son nom.
    - Récupérez les informations du contact correspondant.

3. **Limitations** :
    - Le gestionnaire de contacts ne peut contenir que jusqu'à 500 contacts.

---

## Comment exécuter le programme ?

1. Compilez les fichiers Java à l’aide d’un JDK 23+.
2. Exécutez la classe `Main.java`.
3. Un exemple d'exécution affichera le nom d’un contact recherché dans la console.
