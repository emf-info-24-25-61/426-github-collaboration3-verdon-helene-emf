# Exercice 04: Gestion des versions

Un tag est un alias (un nom) défini par un développeur, dont le rôle est de pointer vers un commit. Il permet d’identifier facilement un commit.

**Les tags sont notamment utilisés pour marquer des numéros de version sur des commits.**



Veuillez prendre connaissance du contexte de l'exercice avant de passer à sa réalisation.

## Contexte de l'exercice

Ce schéma vous indique la situation générale correspondant à l'activité proposée.
Revenez-y lorsque vous rencontrerez une situation similaire ultérieurement.

```mermaid
sequenceDiagram
    autonumber

    actor John
    participant repository
 
    Note over John: John à terminé l'exercice 03 précédent et doit maintenant créer un tag de version <br> car son équipe SCRUM à terminé son Sprint avec un incrément fonctionnel
    
    John->>repository: Ajout d'un tag v1.0.0<br/>(`git tag -a v1.0.0-m "Version stable"`)
    John->>+repository: Push du tag<br/>(`git push origin v1.0.0`)
   
    repository-->>repository: Tag v1.0.0 ajouté et visible sur GitHub

    John->>+repository: lecture du tag <br/>(`git show v1.0.0`)
    repository-->>-John: détail du tag

    repository-->>repository: Création d'une Release
```

## Déroulement de l'exercice

Cet exercice s'effectue à individuellement.

Vous suivez le déroulement décrit dans contexte ci-dessus afin d'effectuer l'exercice.

Vous utiliserez ensuite les commmandes données dans le fichier [README-VSC-Github.md](/README-VSC-Github.md#les-tags), le github de VSC et les fonctionalités de la platforme WEB permettant de visualiser votre repository distant.

## Eléments de solution

Après la création du tag
![alt text](/doc/image-30.pngimage-30.png)

Après la création de la Release
![alt text](/doc/image-31.png)

![alt text](/doc/image-32.png)