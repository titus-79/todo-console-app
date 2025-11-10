# 📝 Todo List Console - Java

Application console de gestion de tâches développée en Java pur, permettant d'organiser efficacement ses tâches quotidiennes avec un système CRUD complet.

![Java](https://img.shields.io/badge/Java-17+-orange)
![Status](https://img.shields.io/badge/status-completed-success)

## 📸 Aperçu
```
=== TODO LIST ===
1. Ajouter une tâche
2. Lister les tâches
3. Marquer une tâche comme complétée
4. Supprimer une tâche
5. Modifier une tâche
0. Quitter
Choisissez une option: 2

=== Liste des tâches ===
--- En cours ---
[TODO] 1. Apprendre Spring Boot
[TODO] 2. Préparer entretien technique

--- Terminées ---
[DONE] 3. Finir projet Todo List
```

## ✨ Fonctionnalités

- ✅ **Ajouter** : Créer une nouvelle tâche avec un titre
- 📋 **Lister** : Afficher toutes les tâches triées par statut (en cours puis terminées)
- ✔️ **Marquer comme complétée** : Changer le statut d'une tâche
- ✏️ **Modifier** : Éditer le titre d'une tâche existante
- 🗑️ **Supprimer** : Supprimer une tâche avec confirmation de sécurité
- 🔍 **Recherche par ID** : Système de recherche optimisé avec méthode factorисée
- 🛡️ **Gestion d'erreurs** : Validation des entrées et messages clairs

## 🛠️ Technologies

- **Langage** : Java 17+
- **Paradigme** : Programmation orientée objet (POO)
- **Collections** : ArrayList pour le stockage en mémoire
- **Interface** : Console interactive avec Scanner
- **Aucune dépendance externe** : 100% Java standard

## 📋 Prérequis

- Java JDK 17 ou supérieur
- Un terminal ou invite de commandes

Vérifier l'installation :
```bash
java -version
javac -version
```

## 🚀 Installation et lancement

### 1. Cloner le projet
```bash
git clone https://github.com/ton-username/todo-console-app.git
cd todo-console-app
```

### 2. Compiler
```bash
javac Main.java Todo.java
```

### 3. Exécuter
```bash
java Main
```

## 💡 Guide d'utilisation

### Ajouter une tâche
```
Choisissez une option: 1
Entrez le titre de la tâche: Apprendre Spring Boot
Tâche ajoutée: [TODO] 1. Apprendre Spring Boot
```

### Lister les tâches
```
Choisissez une option: 2

=== Liste des tâches ===
--- En cours ---
[TODO] 1. Apprendre Spring Boot

--- Terminées ---
(aucune)
```

### Marquer comme complétée
```
Choisissez une option: 3
Entrez l'ID de la tâche à marquer comme complétée: 1
Tâche marquée comme complétée: [DONE] 1. Apprendre Spring Boot
```

### Modifier une tâche
```
Choisissez une option: 5
Entrez l'ID de la tâche à modifier: 1
Entrez le nouveau titre (actuel: Apprendre Spring Boot): Maîtriser Spring Boot
Tâche modifiée: [DONE] 1. Maîtriser Spring Boot
```

### Supprimer une tâche
```
Choisissez une option: 4
Entrez l'ID de la tâche à supprimer: 1
Êtes-vous sûr de vouloir supprimer la tâche: [DONE] 1. Maîtriser Spring Boot ? (o/n): o
Tâche supprimée: [DONE] 1. Maîtriser Spring Boot
```

## 📂 Structure du projet
```
todo-console-app/
├── Main.java          # Point d'entrée, menu et logique métier
├── Todo.java          # Modèle de données (classe Todo)
├── .gitignore         # Fichiers ignorés par Git
└── README.md          # Documentation du projet
```

### Architecture

- **Main.java** : Contient la boucle principale, l'affichage du menu et toutes les opérations CRUD
- **Todo.java** : Classe modèle avec encapsulation (getters/setters) et méthode `toString()` personnalisée

## 🔍 Concepts Java appliqués

Ce projet démontre la maîtrise de plusieurs concepts Java fondamentaux :

- **POO** : Encapsulation, getters/setters, méthode `toString()`
- **Collections** : Utilisation d'ArrayList pour gérer la liste de tâches
- **Boucles** : Parcours de collections avec for-each
- **Conditionnelles** : Switch/case pour le menu, if/else pour la logique
- **Scanner** : Gestion des entrées utilisateur et nettoyage du buffer
- **Méthodes statiques** : Organisation modulaire du code
- **Recherche** : Méthode `trouverTacheParId()` réutilisable
- **Validation** : Vérification des entrées et gestion des cas d'erreur

## 🎯 Points forts du code

- ✅ **Code propre et lisible** : Nommage clair, méthodes bien découpées
- ✅ **DRY (Don't Repeat Yourself)** : Factorisation de la recherche par ID
- ✅ **Expérience utilisateur** : Messages clairs, confirmations de sécurité
- ✅ **Robustesse** : Gestion des cas limites (liste vide, ID invalide)
- ✅ **Maintenabilité** : Structure modulaire facile à étendre

## 🚧 Améliorations futures possibles

- [ ] **Persistance** : Sauvegarde des tâches dans un fichier (CSV/JSON)
- [ ] **Priorités** : Système de priorités (haute, moyenne, basse)
- [ ] **Dates** : Ajout de dates d'échéance et de création
- [ ] **Catégories** : Organisation par catégories/projets
- [ ] **Statistiques** : Affichage du taux de complétion
- [ ] **Recherche** : Recherche par mot-clé dans les titres
- [ ] **Tri** : Options de tri (date, priorité, alphabétique)
- [ ] **Exceptions** : Gestion des InputMismatchException

## 📊 Compétences démontrées

Ce projet met en avant :
- Maîtrise des bases de Java et de la POO
- Capacité à structurer un projet de manière modulaire
- Conception d'interface utilisateur console intuitive
- Gestion de l'état de l'application en mémoire
- Bonnes pratiques de développement (DRY, code lisible)

## 👨‍💻 Auteur

**Rodolphe** - Développeur Junior Java  

- 💼 [LinkedIn](https://www.linkedin.com/in/rodolphe-legeron-624338369/)
- 🐙 [GitHub](https://github.com/titus-79)

## 📜 Licence

Ce projet est libre de droits et peut être utilisé à des fins éducatives.

---

💡 *Projet réalisé dans le cadre de ma formation en développement Java pour consolider les fondamentaux de la programmation orientée objet.*