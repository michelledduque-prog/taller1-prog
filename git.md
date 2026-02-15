# GIT
---
### 1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?

Un repositorio en Git es una carpeta que contiene un proyecto más el historial de cambios (versiones) que Git guarda. Y un proyecto normal no tiene ese historial ni control de cambios.
Entonces la diferencia con un proyecto normal, es que el repositorio tiene una carpeta oculta .git, donde Git almacena versiones, ramas, commits y toda la información de control de versiones.

### 2. ¿Cuáles son las tres áreas principales de Git (working directory, staging area/index y repository) y qué papel cumple cada una?

•	**Working directory:** donde edita los archivos.

•	**Staging area (index):** donde selecciona que cambios van a ir en el próximo commit.

•	**Repository:** donde Git guarda los cambios confirmados.

### 3. ¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag).

•	**Blob:** contenido de un archivo.

•	**Tree:** estructura de carpetas y archivos.

•	**Commit:** referencia a un tree + información del autor, fecha y mensaje.

•	**Tag:** etiqueta para marcar un commit importante (por ejemplo, una versión).

### 4. ¿Cómo se crea un commit y qué información almacena un objeto commit?

Un commit se crea con *git commit -m "mensaje"*.

Un commit almacena:

•	Referencia al estado de los archivos.

•	Autor y fecha.

•	Mensaje del commit.

•	Referencia al commit anterior.

### 5. ¿Cuál es la diferencia entre git pull y git fetch?

•	**git fetch:** descarga cambios del remoto, pero no los aplica a la rama.

•	**git pull:** descarga los cambios y los fusiona automáticamente en la rama actual.

### 6. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?

Una rama es un puntero a un commit que representa una línea de trabajo. Git mueve el puntero al nuevo commit cada vez que se confirme cambios.

### 7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?

Se realiza con *git merge nombre_rama*.

Pueden surgir conflictos cuando dos ramas modifican la misma parte de un archivo.

Se resuelven editando manualmente el archivo, eligiendo qué cambios conservar, y luego confirmando con *git add* y *git commit*.

### 8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?

El área de staging permite elegir qué cambios entran en el commit.

Si omites *git add*, los cambios no se incluirán en el commit, aunque estén modificados en la carpeta de trabajo.

### 9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?

*.gitignore* indica qué archivos o carpetas no deben ser rastreados por Git.

### 10. ¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit?

*git commit --amend* modifica el último commit. 

Un *nuevo commit* crea un punto nuevo en el historial.

### 11. ¿Cómo se utiliza git stash y en qué escenarios es útil?

*git stash* guarda cambios temporalmente sin hacer commit. Es útil cuando debes cambiar de rama rápido.

### 12. ¿Qué mecanismos ofrece Git para deshacer cambios (por ejemplo, git reset, git revert, git checkout)?

*git reset, git revert* y *git checkout* permiten deshacer cambios de diferentes formas.

•	**git reset:** mueve el HEAD a otro commit (puede borrar cambios locales).

•	**git revert:** crea un commit que deshace uno anterior (seguro para historial compartido).

•	**git checkout:** permite volver archivos a un estado anterior o cambiar de rama.

### 13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?

•	**origin:** el repositorio remoto principal.

•	**upstream:** el repositorio original del proyecto.

Comandos comunes:

•	*git remote add upstream URL*

•	*git fetch upstream*

•	*git merge upstream/main*

NOTA: 
FORKS: es una copia del respositorio original y se puede modificar sin afectar al repositorio. 

### 14. ¿Cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git diff, git show)?

•	**git log:** muestra el historial de commits.

•	**git diff:** muestra diferencias entre archivos o commits.

•	**git show:** muestra el detalle de un commit específico.
