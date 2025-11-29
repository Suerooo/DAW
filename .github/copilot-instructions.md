# AI Copilot Instructions for DAW Repository

This is an educational repository containing coursework for **Desarrollo de Aplicaciones Web (DAW)** - Web Development curriculum. The codebase is organized by programming language and learning units.

## Repository Structure

**Java/** - Core programming exercises organized by learning unit (Unidad1-6) + Exams

- **Unidad1-4:** Basic programming fundamentals (input/output, conditionals, loops)
- **Unidad5:** Arrays and collections (1D and 2D arrays)
- **Unidad6:** String manipulation and game development
- **Examenes:** Exam exercises for each unit, named `Act[N][Description].java`

**SQL/** - Database design exercises

- **academia/:** Database schema for academic institution (professors, courses, students)
- **tienda_virtual/:** E-commerce database design

**Web/** - Frontend development

- **HTML/:** Multi-page websites with navigation (Act1WebPersonal, Act2Noticias, Act3Formularios)
- **CSS/:** Styling exercises corresponding to HTML projects

## Key Coding Patterns

### Java File Structure

- **Package naming:** Each unit has its package (e.g., `package Unidad5;`)
- **Static Scanner:** Multi-method projects use `static Scanner sc = new Scanner(System.in);` at class level
- **Single main() per file:** All executable code in `public static void main(String[] args)`
- **Comments:** Problem description as block comment at method start; inline comments for logic clarity
- **No error handling:** Programs assume valid input (educational context - no try/catch or validation)
- **Example:** `Act6Ahorcado.java` (Unidad6) - game logic with loops and String manipulation

### Array Operations (Unidad5)

- **1D arrays:** Element access via loop iteration; sum/average calculations
- **2D arrays:** Nested loops for matrix operations (see `Act15Multidimension.java`)
- **Pattern:** Declare with size first, then populate in loops
- **No Collections API:** Use primitive arrays only, not ArrayList/HashMap

### String Manipulation (Unidad6)

- **Substring operations:** `substring()`, `indexOf()`, `charAt()` for character processing
- **Case conversion:** `.toLowerCase()` / `.toUpperCase()` common for user input normalization
- **String concatenation:** Use `+` operator (not StringBuilder, despite less efficient)
- **Example:** `Act6Ahorcado.java` uses character replacement via substring reconstruction

### SQL Database Design

- **Naming convention:**
  - Table abbreviation prefix (e.g., `pro_` for profesor, `alu_` for alumno)
  - Constraint format: `[PREFIX]_[TYPE]_[KEY]` (e.g., `pro_nif_pk`, `cur_nom_uni`)
- **Common patterns:**
  - `VARCHAR(255)` default for strings
  - `DECIMAL(10,2)` for monetary values
  - `ENUM('H', 'M')` for fixed choices
  - `AUTO_INCREMENT UNSIGNED INT` for surrogate keys
- **Constraints:** Always include PRIMARY KEY, FOREIGN KEY, and CHECK constraints

### HTML Structure

- **Language:** `<!DOCTYPE html>` with `lang="es"` (Spanish context)
- **Navigation:** Table-based menus with pipe separators (legacy pattern)
- **File linking:** Relative paths for internal pages (e.g., `href="hobbies.html"`)
- **Metadata:** UTF-8 encoding declared as `UFT-8` (note: typo preserved in original)

## When Adding New Exercises

1. **Java:** Place in appropriate `Unidad[N]/` folder with naming `Act[N][Description].java`
2. **SQL:** Create `.sql` file with `create database`, table definitions, constraints
3. **Web:** Create corresponding `ActN[Description]/` folder with `index.html` + linked pages + `style.css`
4. **Conventions:** Follow existing naming, package structure, and coding style exactly
5. **No external libraries:** Stick to `java.util.Scanner` only; no framework dependencies

## Exam Organization

Exams stored in `Java/Examenes/Examen[N]/` with exercises `Act[N][Description].java`. Each exam covers the complete unit material with integrated problem-solving.

---

_Last updated: November 2025 - Reflects coursework structure as of current snapshot_
