import services.ServiceAnimaux;

public class App {
    public static final int NBR_ANIMAUX = 2;

    public static void main(String[] args) {

        ServiceAnimaux serviceAnimaux = new ServiceAnimaux();

        // Ajout d'animaux
        for (int i = 0; i < NBR_ANIMAUX; i++) {
            serviceAnimaux.ajouterAnimal();
        }

        // Appelle de la méthode d'affichage des animaux
        serviceAnimaux.afficherAnimaux();

    }
}
