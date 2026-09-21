# JavaFX-desde-POO
# Programación Orientada a Objetos

> **Estudiante:** [Mejía Ávila Ingrid Jaqueline]  
> **Fecha:** [21/09/2026]

---

## 📌 1. ¿Qué es JavaFX?

- **Definición:**  
  [Explica brevemente qué es JavaFX y cuál es su función principal en la plataforma Java]

- **Propósito y Uso:**  
  [Menciona para qué sirve (crear interfaces gráficas modernas, desarrollo de aplicaciones de escritorio) y sus principales ventajas frente a librerías anteriores como Swing o AWT]

---

## 🏛️ 2. Arquitectura de la Interfaz (Estructura Principal)

A continuación, explica los componentes jerárquicos que conforman la estructura visual de una aplicación JavaFX:

| Componente | Definición / Concepto Clave | Rol en la Interfaz |
| :--- | :--- | :--- |
| **`Application`** | [Definición de la clase base] | [Función del método `start()` y el ciclo de vida] |
| **`Stage`** | [Concepto analógico (ej. el marco o ventana)] | [Administración de la ventana principal de la app] |
| **`Scene`** | [Concepto analógico (ej. el lienzo o contenido)] | [Contenedor del árbol de nodos visuales] |
| **`Node`** | [Elemento básico de la jerarquía (*Scene Graph*)] | [Representación de cualquier objeto gráfico en pantalla] |

---

## 🧩 3. Componentes Visuales

### 3.1 Controles
- **Concepto:** [Define qué es un control de interfaz gráfica (*UI Control*)]
- **Ejemplos principales:**
  - `Button`: [Breve descripción]
  - `Label`: [Breve descripción]
  - `TextField`: [Breve descripción]
  - `CheckBox` / `RadioButton`: [Breve descripción]

### 3.2 Layouts (Paneles de Diseño)
- **Concepto:** [Define qué es un layout y por qué es fundamental para organizar los nodos]
- **Ejemplos principales:**
  - `VBox`: [Descripción de la alineación vertical]
  - `HBox`: [Descripción de la alineación horizontal]
  - `BorderPane`: [Descripción del diseño por regiones (Top, Bottom, Left, Right, Center)]
  - `GridPane`: [Descripción de la distribución en cuadrícula / filas y columnas]

---

## ⚡ 4. Manejo de Eventos

### 4.1 Concepto de Eventos en JavaFX
- [Explica de forma concisa qué es un evento (ej. clics del mouse, pulsación de teclas) y cómo responde la interfaz a la interacción del usuario]

### 4.2 El Método `setOnAction()`
- **Función:** [Explica para qué sirve el método `setOnAction()` en controles como botones]
- **Sintaxis básica y uso:**  
  [Muestra un breve fragmento de código usando una expresión Lambda para manejar el evento de un clic]

```java
// Ejemplo conceptual
button.setOnAction(e -> {
    // [Escribe aquí lo que ejecuta la acción]
});
