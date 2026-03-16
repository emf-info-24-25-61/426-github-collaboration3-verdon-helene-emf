# Introduction à Git avec Visual Studio Code

## C'est quoi Git ?

Git est un système de contrôle de version distribué qui permet de suivre les modifications apportées à des fichiers et de collaborer efficacement sur des projets.

Couplé avec GitHub, une plateforme d'hébergement de code, il devient un outil puissant pour le travail en équipe. Visual Studio Code (VS Code), avec ses extensions Git intégrées, facilite grandement l'utilisation de Git.

## Collaboration avec VSC sur un projet GitHub

Vous trouverez ci-dessous un résumé des principales activités et actions attendues par le dévelopeur dans ces différents scénarios :

- [Cloner un dépôt GitHub afin de collaborer sur un projet](/README-VSC-Github.md#cloner-un-dépôt-github)
- [Apporter votre contribution à ce projet](/README-VSC-Github.md#apporter-des-contributions)
- [Scénarios de collaboration](/README-VSC-Github.md#scénarios-de-collaboration)
  - [Un autre utilisateur a modifié un fichier, mon repo local n'est plus à jour](/README-VSC-Github.md#1-un-autre-utilisateur-a-modifié-un-fichier-mon-repo-local-nest-plus-à-jour)
  - [Un autre utilisateur a modifié un fichier, j'ai également modifié ce fichier, le conflit doit être géré](/README-VSC-Github.md#2-un-autre-utilisateur-a-modifié-un-fichier-jai-également-modifié-ce-fichier-le-conflit-doit-être-géré)
  - [**Mais pourquoi Git accepterait-il mon commit après résolution du conflit ? Comment ça marche ??**](/README-VSC-Github-ConflictsWhy.md)

- [Les branches sur GitHub](/README-VSC-Github.md#les-branches-sur-github)
  - [Qu'est-ce qu'une branche ?](/README-VSC-Github.md#quest-ce-quune-branche)
  - [Pourquoi et quand utiliser des branches ?](/README-VSC-Github.md#pourquoi-utiliser-des-branches)

    - Pour créer, tester de nouvelles fonctionnalités de manière isolée pour ne pas perturber le développement en cours.
    - Pour corriger des bugs de manière isolée pour ne pas perturber le développement en cours.
    - Pour expérimenter de nouvelles idées sans risque pour le code principal.
  - Travailler avec les branches :
    - [Lister les branches existantes](/README-VSC-Github.md#travailler-avec-les-branches)
    - [Créer une nouvelle branche](/README-VSC-Github.md#travailler-avec-les-branches)
    - [Basculer vers une branche](/README-VSC-Github.md#travailler-avec-les-branches)
    - [Fusionner une branche dans la branche actuelle](/README-VSC-Github.md#travailler-avec-les-branches)
    - [Supprimer une branche](/README-VSC-Github.md#travailler-avec-les-branches)

- [Les tag](/README-VSC-Github.md#les-tags)
- [La numérotation des versions](/README-VSC-Github.md#la-numérotation-des-versions)
- [Les release](/README-VSC-Github.md#les-releases)
  

## Résumé des principales commandes Git

### Sous forme de tableau

Voici un [tableau des principales commandes Git sous forme de tableau avec lien direct vers la documentation officielle en français](/README-Git-Commands.md).

### Sous forme de PDF "Cheat-sheet"

Voici une [Cheat-sheet PDF de 2 pages sur les commandes Git principales](/doc/git-cheat-sheet-education.pdf) réalisée par *education.github.com*.

## Exercices

- [Exercice 01: Modification de lignes distinctes](/exercices/Exercice-01-Scenario-ModificationLignesDistinctes.md)

- [Exercice 02: Modification de lignes identiques](/exercices/Exercice-02-Scenario-ModificationLignesIdentiques.md)
  
- [Exercice 03: Gestion des branches](/exercices/Exercice-03-Scenario-GestionDesBranches.md)
  
- [Exercice 04: Gestion des versions](/exercices/Exercice-04-Scenario-GestionDesVersions.md)

## Conclusion

La maîtrise de Git est essentielle pour le développement collaboratif.

En comprenant ses bases, les scénarios courants de collaboration et l'utilisation des branches, vous serez en mesure de gérer efficacement vos projets et de collaborer avec d'autres développeurs.

N'hésitez pas à pratiquer ces commandes et à explorer davantage pour renforcer vos compétences.

---

<img src="consigne/EMF_logo_RVB_Info_long.png" width="25%" style="margin-left:-20px;">