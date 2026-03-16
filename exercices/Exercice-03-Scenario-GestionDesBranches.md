# Exercice 03: Gestion des branches

Veuillez prendre connaissance du contexte de l'exercice avant de passer à sa réalisation.

## Contexte de l'exercice

Ce schéma vous indique la situation générale correspondant à l'activité proposée.
Revenez-y lorsque vous rencontrerez une situation similaire ultérieurement.

```mermaid
sequenceDiagram
    autonumber

    actor John
    participant repository-Branche J
    participant repository
    participant repository-Branche A
    actor Alice

    Note over John: John veut travailler sur le projet
    repository->>John: clonage du repo dans VSC<br/>(ou pull s'il existe déjà)

    Note over Alice: Alice veut travailler sur le projet
    repository->>Alice: clonage du repo dans VSC<br/>(ou pull s'il existe déjà)

    Note over John, Alice: Les utilisateurs vont ensuite travailler sur deux branches github différentes

    Note over Alice: Alice crée une branche A et s'y déplace afin d'ajouter <br> une fonctionnalité spécifique
    Alice->>Alice: git checkout - b BrancheA  

    Note over John: John crée une branche J afin d'ajouter <br> une fonctionnalité spécifique
    John->>John: git checkout - b BrancheJ

    Note over Alice: Alice ajoute une fonctionnalité sur la branche A <br> et ajoute la branche au repository

    Alice->>Alice: git commit  

    Note over John: John ajoute une fonctionnalité sur la branche J <br> et ajoute la branche au repository

    John->>John: git commit  

    
    Alice->>+repository-Branche A: push origin BrancheA

    John->>+repository-Branche J: push origin BrancheJ

    Note over John, Alice: Création de pull request depuis l'application web du github distant <br> afin de merger les branches dans le main

    repository->>repository: create pull request
    repository->>repository: merge pull request
    repository->>repository-Branche J : delete branch
    repository->>repository-Branche A : delete branch

    Note over John, Alice: Alice et John se replace sur la branch main et et effectue un pull <br> afin de mettre à jour leur repo local avec les pull request sur les <br> branches qui ont été mergées

    John->>John: git checkout main
    repository->>John: pull
    Alice->>Alice: git checkout main
    repository->>Alice: pull


```

## Déroulement de l'exercice

Cet exercice s'effectue à 2 ou 3 personnes. Par conséquent vous formez les groupes et ensuite vous clonez le même repository distant.
Pour cela l'enseignant (ou vous si vous avez les autorisations) ajoute les membres du groupe à ce seul repository.

Vous suivez le déroulement décrit dans contexte ci-dessus afin d'effectuer l'exercice.

Vous utiliser le fichier [ServiceAnimaux.java](/exercices/src/services/ServiceAnimaux.java) pour effectuer des modifications de code

- le développeur A rendra active la fonction ajouterAnimal dans une branche A
- le développeur B rendra active la fonction afficherAnimaux dans une branche B
  
Vous utiliserez ensuite les commmandes données dans le [README-VSC-Github.md](/README-VSC-Github.md#les-branches-sur-github), le github de VSC et les fonctionalités de la platforme WEB permettant de visualiser votre repository distant.

Finalement vous serez capable d'exectuer votre application java contenant les modifications effectuées dans les deux branches.

## Eléments de la solution

### Création de branches

![alt text](/doc/image-22.png)

### Visualisation des branches

- Par le source control graph

![alt text](/doc/image-24.png)

- Dans l'application web du repo distant sous Insights/Network

![alt text](/doc/image-23.png)

### Création des pull request

![alt text](/doc/image-25.png)

![alt text](/doc/image-26.png)

![alt text](/doc/image-27.png)

![alt text](/doc/image-28.png)

![alt text](/doc/image-29.png)