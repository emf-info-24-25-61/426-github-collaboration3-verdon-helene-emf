# Pourquoi Git accepterait-il mon commit après résolution du conflit ?

La question n'est pas anodine et la réponse permet de mieux comprendre le fonctionnement de GitHub.

**Situation rencontrée**

Votre commit est refusé car Git détecte un conflit avec un fichier qui a entretemps été modifié par un autre usager qui l'a committé sur GitHub avant vous.

**Question qu'on pourrait se poser**

Au final, lorsque j'aurais rebidouillé mon fichier pour y incorporer peu ou beaucoup des changements réalisés par l'autre utilisateur, mon fichier sera quand même différent de celui sur GitHub !

Donc si je fusionne manuellement ces deux versions (celle sur GitHub avec mes propres modifications), je finis quand même par avoir un fichier plus récent que sur GitHub, du coup :

- Pourquoi et comment GitHub saurait-il qu'il doit cette fois-ci accepter mon commit alors qu'il vient de le refuser juste avant ??
- Faudrait-il des droits particuliers pour cela ???

## Explication

En bref :

- **Le refus initial du push** est une mesure de sécurité pour éviter d'écraser des modifications dont vous n'aviez pas conscience, modifications que vous n'avez donc pas encore intégrées.
- **La résolution des conflits** est effectuée localement. `GitHub n'a pas besoin de savoir comment vous avez résolu ces conflits, il lui suffit de recevoir un historique de commits cohérent`.
- **Après fusion des changements et commit**, votre dépôt local contiendra tous les changements effectués (*) et vous pourrez pousser vos modifications sans problème !

Éléments de réponse supplémentaires :

- **Permissions de push :** Vous n'avez pas besoin de droits spéciaux pour résoudre les conflits et pousser vos modifications, à condition que vous ayez déjà les permissions pour pousser sur la branche concernée du dépôt GitHub.

- **Gestion des conflits :** La résolution des conflits est une opération standard en Git et fait partie du flux de travail normal lors de la collaboration.

- (*) **Intégration des modifications distantes/GitHub :** en résolvant les conflits et en committant, vous avez intégré les modifications distantes/GitHub dans votre historique local (car vous avez donc fait un **git pull**). `Votre branche locale est désormais en avance par rapport à la branche distante sur GitHub !!` et c'est bien la raison qui fera que votre commit sera accepté.

  Plus précisément, pour faire cela vous avez :

  - Ouvert les fichiers en conflit dans VS Code.
  - Les sections en conflit sont délimitées par :

     ```diff
     <<<<<<< HEAD
     Votre version du code (changements locaux)
     =======
     Version du code du dépôt distant/GitHub
     >>>>>>> commit_hash
     ```

    avec des différences bien montrées en couleur.
  - Vous avez décidé les modifications à conserver :
    - Conservé seulement vos changements, ou
    - Conservé seulement les changements distants/GitHub, ou
    - Fusionné les deux en les combinant manuellement

  et vous avez ainsi un fichier en local désormais en avance par rapport à la branche distante/GitHub !! 😄

- **Historique linéaire :** Git fonctionne en s'assurant que l'historique des commits est cohérent. En intégrant les commits distants/GitHub, vous maintenez un historique que Git peut suivre.
- **Pas de divergence :** Il n'y a plus de divergence entre votre branche locale et la branche distante/GitHub, donc GitHub peut accepter vos nouveaux commits sans risque d'écraser les modifications des autres (dont vous avez tenu compte, c'est votre responsabilité !).

## **Conclusion**

Le processus de résolution des conflits et de fusion est une partie intégrante de Git lors de la collaboration.

En intégrant les modifications distantes/GitHub et en résolvant les conflits, vous maintenez un historique de commits cohérent que GitHub peut accepter. Vous n'avez pas besoin de droits spéciaux pour cela, seulement les permissions normales pour pousser sur le dépôt.
