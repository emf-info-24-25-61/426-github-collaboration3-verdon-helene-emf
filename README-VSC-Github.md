# Collaboration avec VSC sur un projet GitHub

Vous trouverez ci-dessous un résumé des principales activités et actions attendues par le dévelopeur dans divers scénarios communs.

N.B. La plupart des commandes ci-dessous ne sont montrées qu'à des fins de compréhension de **"ce qui se passe derrière les rideaux"**, car VSC fera la plupart de ces commandes automatiquement pour vous lorsque vous presserez le **"bouton bleu"**.

TIPS: 
- Avec la version 1.94.2 de VSC, le SOURCE CONTROL GRAPH est disponible et vous voyez graphiquement les différentes versions et branches directement dans VSC.
- Vous pouvez également visualer graphiquement les branches dans le repository distant, dans le menu Insights/Network

## Cloner un dépôt GitHub

Pour commencer à travailler sur un projet hébergé sur GitHub :

1. **Cloner le dépôt** : Obtenez l'URL du dépôt GitHub que vous souhaitez cloner.
   - Dans VS Code, ouvrez le terminal intégré ou utilisez la commande rapide.
   - Exécutez la commande :

     ```bash
     git clone <URL_du_dépôt>
     ```

   - Cela crée une copie locale du dépôt sur votre machine.

## Apporter des contributions

1. **Créer ou modifier des fichiers** : Effectuez les modifications nécessaires dans votre code.
2. **Ajouter les changements** :
   - Utilisez la commande :

     ```bash
     git add <fichier_ou_répertoire>
     ```

   - Pour ajouter tous les changements :

     ```bash
     git add .
     ```

3. **Committer les changements** :
   - Enregistrez vos modifications avec un message descriptif :

     ```bash
     git commit -m "Message décrivant les changements"
     ```

4. **Pousser les changements vers GitHub** :
   - Envoyez vos commits locaux vers le dépôt distant/GitHub :

     ```bash
     git push
     ```

## Scénarios de collaboration

### 1. Un autre utilisateur a modifié un fichier, mon repo local n'est plus à jour

**Problème** : Votre version locale n'est plus à jour car un autre utilisateur a poussé des modifications.

**Solution** :

- **Récupérer les dernières modifications** :

  ```bash
  git pull
  ```

- Cela synchronise votre dépôt local avec le dépôt GitHub.
- **Résoudre les conflits éventuels** : Si des modifications entrent en conflit, Git vous demandera de les résoudre manuellement.

### 2. Un autre utilisateur a modifié un fichier, j'ai également modifié ce fichier, le conflit doit être géré

**Problème** : Plusieurs utilisateurs ont modifié le même fichier, entraînant des conflits lors du commit.

**Solution** :

1. **Tenter de pousser vos changements** :

   ```bash
   git push
   ```

   - Si Git détecte des conflits, il vous avertira que le push a échoué.
2. **Tirer les dernières modifications** :

   ```bash
   git pull
   ```

3. **Résoudre les conflits** :
   - Ouvrez les fichiers en conflit dans VS Code.
   - Les zones en conflit sont délimitées par :

     ```diff
     <<<<<<< HEAD
     Votre version du code
     =======
     Version du code depuis le dépôt distant/GitHub
     >>>>>>> nom_de_la_branche_ou_commit
     ```

   - Choisissez quelle version conserver ou fusionnez les deux manuellement.
4. **Après résolution** :
   - Ajoutez les fichiers modifiés :

     ```bash
     git add <fichiers_modifiés>
     ```

   - Committez les résolutions de conflit :

     ```bash
     git commit -m "Résolution des conflits"
     ```

   - Poussez à nouveau les changements :

     ```bash
     git push
     ```

## Les branches sur GitHub

### Qu'est-ce qu'une branche

Une **branche** est une version parallèle du code dans le dépôt. Elle permet de travailler sur des fonctionnalités ou des corrections de bugs de manière isolée sans affecter la branche principale (souvent appelée `main` ou `master`).

### Pourquoi utiliser des branches

- **Isolation** : Éviter que les modifications en cours n'affectent le code stable.
- **Collaboration** : Permettre à plusieurs développeurs de travailler sur différentes fonctionnalités simultanément.
- **Gestion des versions** : Faciliter le suivi des différentes versions du code.

### Cas d'utilisation

- **Nouvelles fonctionnalités** : Créer une branche pour développer une nouvelle fonctionnalité.
- **Corrections de bugs** : Isoler la correction d'un bug pour ne pas perturber le développement en cours.
- **Expérimentation** : Tester de nouvelles idées sans risque pour le code principal.

### Travailler avec les branches

1. **Lister les branches existantes** :

   ```bash
   git branch
   ```

2. **Créer une nouvelle branche** :

   ```bash
   git branch nom_de_la_branche
   ```

3. **Basculer vers une branche** :

   ```bash
   git checkout nom_de_la_branche
   ```

   - Ou pour créer et basculer en une seule commande :

     ```bash
     git checkout -b nom_de_la_branche
     ```

4. **Fusionner une branche dans la branche actuelle** :

   ```bash
   git merge nom_de_la_branche
   ```

5. **Supprimer une branche** :

   ```bash
   git branch -d nom_de_la_branche
   ```

## Les tags

Un tag est un alias (un nom) défini par un développeur, dont le rôle est de pointer vers un commit. Il permet d’identifier facilement un commit.

Les tags sont notamment utilisés pour **marquer des numéros de version** sur des commits.

```bash
  git tag -a v1.0.0 -m "Initial release"
```

**Explications :**

-a : création d'un tag annoté (inclu un message et des métadonnées comme l’auteur et la date).

v1.0.0 : nom du tag

-m "Initial release" : est le message associé au tag.


Par défaut, les tags ne sont pas envoyés automatiquement au dépôt distant lors d’un git push. Il est nécessaire de les pousser explicitement :

```bash
  git push origin v1.0.0
```

Voici des commandes supplémentaires pour connaître la liste des tag et recupérer les informations lié à un tag

```bash
  git tag

  git show v1.0.0
```

## La numérotation des versions

La numérotation des versions dans GitHub (et plus généralement dans les projets logiciels) est souvent gérée à l'aide d'une convention appelée Versionnement Sémantique (Semantic Versioning ou SemVer).

Format du versionnement sémantique :

`MAJEUR.MINOR.PATCH` 

- `MAJEUR` (Major): Incrémenté lorsque des modifications importantes et non rétrocompatibles sont apportées.
Exemple : 1.0.0 → 2.0.0 (par exemple, une refonte complète de l'application).

- `MINOR` (Minor): Incrémenté lorsque des fonctionnalités sont ajoutées de manière rétrocompatible.
Exemple : 1.0.0 → 1.1.0 (ajout d'une nouvelle fonctionnalité sans impact sur les fonctionnalités existantes).

- `PATCH` (Patch): Incrémenté pour corriger des bugs ou apporter de petites améliorations sans ajouter de nouvelles fonctionnalités.
Exemple : 1.0.0 → 1.0.1 (correction d'un bug).

## Les releases

Une release sur le GitHub distant permet de publier une version spécifique du projet, basée sur un tag Git. 
Cela permet d'encapsuler tous le code corresondant à la version du tag dans des .zip.

Les releases sont particulièrement utiles pour distribuer des versions stables d'un projet.

Voici un lien sur la [documentation officiel de GitHub.](https://docs.github.com/en/repositories/releasing-projects-on-github/managing-releases-in-a-repository) pour créer des releases.

## Résumé des principales commandes Git

- **Configuration initiale** :
  - Configurer le nom d'utilisateur :

    ```bash
    git config --global user.name "Votre Nom"
    ```

  - Configurer l'email :

    ```bash
    git config --global user.email "votre.email@example.com"
    ```

- **Cloner un dépôt** :

  ```bash
  git clone <URL_du_dépôt>
  ```

- **Statut du dépôt** :

  ```bash
  git status
  ```

- **Ajouter des changements** :
  - Ajouter un fichier spécifique :

    ```bash
    git add <fichier>
    ```

  - Ajouter tous les changements :

    ```bash
    git add .
    ```

- **Committer des changements** :

  ```bash
  git commit -m "Message du commit"
  ```

- **Pousser vers le dépôt distant/GitHub** :

  ```bash
  git push
  ```

- **Tirer les modifications du dépôt distant/GitHub** :

  ```bash
  git pull
  ```

- **Gérer les branches** :
  - Lister les branches :

    ```bash
    git branch
    ```

  - Créer une nouvelle branche :

    ```bash
    git branch nom_de_la_branche
    ```

  - Basculer vers une branche :

    ```bash
    git checkout nom_de_la_branche
    ```

  - Fusionner une branche :

    ```bash
    git merge nom_de_la_branche
    ```

  - Supprimer une branche :

    ```bash
    git branch -d nom_de_la_branche
    ```

- **Voir l'historique des commits** :

  ```bash
  git log
  ```

- **Afficher les différences** :
  - Par rapport au dernier commit :

    ```bash
    git diff
    ```

  - Entre deux commits :

    ```bash
    git diff commit1 commit2
    ```

- **Annuler des changements** :
  - Annuler des modifications locales non committées :

    ```bash
    git checkout -- <fichier>
    ```

  - Revenir à un commit précédent :

    ```bash
    git reset --hard commit_hash
    ```
