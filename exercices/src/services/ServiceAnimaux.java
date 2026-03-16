package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceAnimaux {

    private List<String> animaux;
    /**
     * Constructeur de la classe AnimalManager.
     * Initialise une liste vide pour stocker les noms d'animaux.
     */
    public ServiceAnimaux() {
        this.animaux = new ArrayList<>();
    }

  

     /**
     * Demande à l'utilisateur de saisir le nom d'un animal et l'ajoute à la liste d'animaux.
     * Affiche un message de confirmation une fois que l'animal est ajouté.
     */
    public void ajouterAnimal() {
        //Le code de cette méthode sera ajouté par le programmeur Alpha, dans une branche spécifique
        /*   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom de l'animal à ajouter : ");
        String nomAnimal = scanner.nextLine();
        animaux.add(nomAnimal);
        System.out.println(nomAnimal + " a été ajouté à la liste.");
        */
    }



    /**
     * Affiche la liste des animaux ajoutés.
     * Si la liste est vide, affiche un message indiquant qu'il n'y a pas d'animaux.
     */
    public void afficherAnimaux() {
        //Le code de cette méthode sera ajouté par le programmeur Beta, dans une branche spécifique
        /* 
        if (animaux.isEmpty()) {
            System.out.println("La liste des animaux est vide.");
        } else {
            System.out.println("Liste des animaux :");
            for (String animal : animaux) {
                System.out.println("- " + animal);
            }
        }
        */            
    }    
}
