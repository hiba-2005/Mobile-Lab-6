# LAB 6 - Application "Recettes de Pizza" 🍕

## Cours
**Programmation Mobile : Android avec Java**

## Objectif du TP
Ce laboratoire a pour objectif de développer une application Android en Java permettant d’afficher une liste de pizzas avec leurs informations principales, puis d’ouvrir une page de détail pour chaque recette.

L’application permet de mettre en pratique plusieurs notions importantes en développement mobile Android, comme :
- l’organisation du projet en plusieurs packages,
- l’utilisation d’un modèle orienté objet,
- l’affichage d’une liste personnalisée avec `ListView`,
- le passage de données entre activités,
- et la création d’un écran de démarrage (Splash Screen).

---

## Fonctionnalités réalisées
L’application contient les fonctionnalités suivantes :

- affichage d’un **Splash Screen** au lancement ;
- affichage d’une **liste de pizzas** ;
- chaque pizza contient :
  - un nom,
  - un prix,
  - une durée de préparation,
  - une image ;
- ouverture d’un **écran détail** au clic sur une pizza ;
- affichage dans la page détail de :
  - l’image,
  - le nom,
  - le prix,
  - la durée,
  - les ingrédients,
  - la description,
  - les étapes de préparation.

---

## Structure du projet
Le projet est organisé en plusieurs packages pour mieux séparer les responsabilités :

- **classes** : contient les entités métiers comme `Produit`
- **dao** : contient l’interface générique `IDao`
- **service** : contient la logique de gestion des pizzas avec `ProduitService`
- **adapter** : contient l’adaptateur personnalisé `PizzaAdapter`
- **ui** : contient les activités de l’interface utilisateur

---

## Technologies utilisées
- **Java**
- **Android Studio**
- **Android SDK API 24+**
- **XML** pour les interfaces graphiques

---

---

## Interface graphique
L’application utilise plusieurs fichiers XML :

- `activity_splash.xml` : écran de démarrage
- `activity_list_pizza.xml` : page contenant la liste des pizzas
- `row_pizza.xml` : modèle graphique d’une pizza dans la liste
- `activity_pizza_detail.xml` : page détail d’une pizza

---

## Résultat obtenu

<img width="1600" height="900" alt="image" src="https://github.com/user-attachments/assets/318a75a2-a27b-4d6f-add6-dc92a7d84b23" />
<img width="1600" height="900" alt="image" src="https://github.com/user-attachments/assets/7e9a911c-274f-4fbb-b95b-27be78cc084b" />

Au lancement de l’application :
1. un écran de chargement s’affiche ;
2. la liste des pizzas apparaît ;
3. lorsqu’on clique sur une pizza, une page de détail s’ouvre.

---

## Conclusion
Ce TP m’a permis de mieux comprendre la structure d’une application Android simple en Java.  
J’ai appris à organiser le code en plusieurs couches, à manipuler une liste personnalisée, à transmettre des données entre activités et à construire une interface claire et fonctionnelle.



