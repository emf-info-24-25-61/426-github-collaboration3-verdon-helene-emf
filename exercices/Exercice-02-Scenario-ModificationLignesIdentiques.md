# Exercice 02 : Scénario de modification de lignes identiques

Veuillez prendre connaissance du contexte de l'exercice avant de passer à sa réalisation.

TIPS: veuillez noter que github, lors d'une mise en commun de modification de plusieurs utilisateur, effectue une comparaison ligne par ligne. Dans ce scénario, les lignes modifiées sont **identiques**. Découvrer comment github gère cette situation!

## Contexte de l'exercice

Ce schéma vous indique la situation générale correspondant à l'activité proposée.
Revenez-y lorsque vous rencontrerez une situation similaire ultérieurement.

```mermaid
sequenceDiagram
    autonumber

    actor John
    participant repository
    actor Alice

    Note over John: John veut travailler sur le projet
    repository->>John: clonage du repo dans VSC<br/>(ou pull s'il existe déjà)

    Note over Alice: Alice veut travailler sur le projet
    repository->>Alice: clonage du repo dans VSC<br/>(ou pull s'il existe déjà)

    Note over John, Alice: Les utilisateurs vont ensuite travailler<br/>Ils vont modifier un même fichier en local

    Note over Alice: Alice a fini son travail<br/>Elle commit/push sur le repo
    Alice->>+repository: commit / push
    repository-->>-Alice: OK
    

    Note over John: John a fini son travail<br/>Il veut commit/push sur le repo<br/>mais cela va échouer (conflit)
    John->>+repository: commit / push
    repository-->>-John: KO ! conflit détecté !

    Note over John, Alice: Pour Git c'est l'utilisateur<br/>qui est responsable de faire la réconciliation

    Note over John: John doit réconcilier les deux contenus manuellement <br/>(le sien avec celui sur le repo) <br> en utilisant le Merge Editor
    repository->>John: pull
    John->>John: Réconciliation<br/>de contenu

    Note over John: John peut maintenant faire<br/>son commit/push sans conflits
    John->>+repository: commit / push
    repository-->>-John: OK
```

## Déroulement de l'exercice

Avec le même groupe que l'exercice précédent, vous travaillez sur un repository distant commun à tous.

Trois éléments vous sont donnés:
  
- [Un schéma récapitulatif des étapes à effectuer](#description-schématique-de-lexercice)

- [Les lignes à modifier pour effectuer l'exercice](#lignes-à-modifier-selon-explications-du-scénario-ajouter-un-texte-de-votre-choix)

- [La description détaillée et solution en utilisant les menus du plugin github dans VSC](#description-détaillée-et-solution-de-lexercice)

## Description schématique de l'exercice

 ```mermaid

    flowchart TD

    A[Début de l'exercice] --> B[Tirer-pull les dernières modifications de ce repository]
    B --> C[Définissez la ligne commune à modifier]
    C --> D[Ajouter un texte court de votre choix]

    D --> E[Utilisateur Alpha : Commit & Push]
    E --> F[Modification synchronisée avec le dépôt distant]


    D --> G[Utilisateur Beta : Attente]
    G --> H[Utilisateur Beta : Commit & Push]

    H --> J[Utilisateur Beta : Git alerte qu'il ne peut pas effectuer le push]
    J --> K[Utilisateur Beta : Effectuer un pull]
    K --> L[Git détecte un conflit et l'indique en rouge]
    L --> M[Utilisateur Beta: résout et valide le conflit à l'aide du Merge Editor]
    M --> N[Utilisateur Beta : Push, pousser les modifications mergées]
    N --> O[Contrôler que les modifications Alpha et Beta soient présentes dans le dépôt distant]
    O --> P[Fin de l'exercice]


```

## Lignes à modifier selon explications du scénario (ajouter un texte de votre choix)

1.modification
2. version de Paul
3.
4.
5..BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB
qui
utilise
plus
de lignes
qu'avant.....
6.
7.
8.
9.
10.CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC

## Description détaillée et solution de l'exercice

Dans cette exercice, vous allez simplement modifier la même ligne de ce fichier, mais en prenant soin de vous mettre d'accord avec vos collègues afin de modifier une ligne identique.

Dans ce cas de figure, github ne sera pas capable de resynchroniser vos modifications automatiquement.

Voici les étapes à suivre:

### 1. Avant de commencer, assurez-vous d'avoir tirer (pull) les dernières modifications sur ce repository

- Lorsque chacun à effectué un pull, répartissez-vous les lignes ci-dessus à compléter.

### 2. Ajouter un texte court de votre choix

### 3. Effectuer à tour de rôle des commit&Push

- Lorsque chacun à modifié ses lignes, effectuer à tour de rôle un commit&push et observer chez chacun se qui se passe:
  - Le premier (utilisateur Alpha) qui effectue le commit&push ne devrait rencontrer aucun message de conflit.
  - Le deuxième (utilisateur Beta) essaye d'effectuer un commit&push. Git va alors vous alerter que des modifications ont été effectuées
  
     ![alt text](/doc/image.png)

  - Vous pouvez consulter le message de git-error, qui explique exactement ce qui se passe:

     ![alt text](/doc/image-1.png)

  - Vous effectuez alors un pull (soit dans le terminal, soit avec le menu contextuel)
  
     ![alt text](/doc/image-2.png)

### 4. Détection et réslution manuel du conflit

- Git détecte alors un conflit et marque le Merge en rouge,
  
    ![alt text](/doc/image-10.png)

    anisi que le nom de votre fichier

    ![alt text](/doc/image-11.png)

- Vous devez résoudre vous-même le conflit à l'aide du Merge Editor:

![alt text](/doc/image-13.png)

- Vous modifiez manuellement le fichier résultant

![alt text](/doc/image-14.png)

- Vous validez vos modifications

![alt text](/doc/image-15.png)

- Vous effectuez un commmit&push

### 5. Contrôle du résultat final

- Vous contrôlez finalement que ces modifications sont bien présentes dans le repository distant
  
![alt text](/doc/image-16.png)
