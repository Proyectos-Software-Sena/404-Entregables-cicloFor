# 💻 Taller Práctico: Estructuras de Repetición (Ciclo For) en Java

**Institución:** SENA  
**Instructor:** Edwin Rozo  

## 📌 Instrucciones de Entrega y Reglas del Taller

Para garantizar el orden y el correcto seguimiento de tu progreso, este entregable tiene reglas estrictas de control de versiones. **Lee atentamente antes de empezar:**

1. **Trabajo Individual:** El taller es de carácter estrictamente individual.
2. **Estrategia de Ramas (Branches):** Debes crear y trabajar en tu propia rama, nombrada con el siguiente formato: `feature/nombre-apellido-taller-for`.
3. **Regla de Commits (¡Crítico!):** Se requiere **un commit por cada ejercicio resuelto**. 
   * Formato esperado del mensaje: `feat: resuelve ejercicio X - [Breve descripción]` (Ej. `feat: resuelve ejercicio 1 - calculo de ventas`).
   * ⚠️ *Nota del instructor:* **Sin este requisito de commits, el entregable se considerará INVÁLIDO**, sin excepciones.

---

## 🚀 Ejercicios Prácticos (Nivel Progresivo)

### Ejercicio 1: Cierre de Caja (Totalizar Ventas)
**Caso de uso:** Una tienda de barrio necesita calcular el total de dinero recaudado en el día.
*   **Entrada esperada:** El programa debe preguntar primero cuántas ventas se realizaron en el día. Luego, debe pedir el valor de cada una de esas ventas.
*   **Salida esperada:** El total de los ingresos del día.
*   *Ejemplo:* Si hubo 3 ventas, y los valores ingresados son 5000, 12000 y 8000. La salida debe ser: `El total de ventas del día es: $25000`.

### Ejercicio 2: Control de Calidad en Producción
**Caso de uso:** Una fábrica de repuestos automotrices (ej. piezas para Renault Twingo) necesita contar cuántas piezas no cumplen con el peso reglamentario para ser descartadas.
*   **Entrada esperada:** Preguntar cuántas piezas se van a revisar. Luego, solicitar el peso (en gramos) de cada pieza. Una pieza es defectuosa si pesa menos de 100g o más de 120g.
*   **Salida esperada:** La cantidad total de piezas *Aprobadas* y la cantidad de piezas *Defectuosas*.
*   *Ejemplo:* Se revisan 4 piezas con pesos: 105, 95, 115, 125. Salida: `Piezas aprobadas: 2. Piezas defectuosas: 2`.

### Ejercicio 3: Monitoreo de Temperatura de Servidores
**Caso de uso:** El centro de datos del SENA necesita saber cuál fue la temperatura máxima registrada durante un periodo de monitoreo para prevenir sobrecalentamientos.
*   **Entrada esperada:** Solicitar la cantidad de lecturas de temperatura que se tomaron. Luego, pedir cada uno de los valores de temperatura (en grados Celsius).
*   **Salida esperada:** Imprimir únicamente la temperatura más alta registrada.
*   *Ejemplo:* 5 lecturas: 18, 22, 25, 21, 19. Salida: `La temperatura máxima registrada fue: 25°C`.

### Ejercicio 4: Promedio de Calificaciones ADSO
**Caso de uso:** El sistema académico necesita calcular el promedio de notas de un aprendiz en un módulo de desarrollo y determinar si aprueba o no.
*   **Entrada esperada:** Solicitar al usuario cuántas calificaciones componen el módulo. Luego, pedir cada nota (valores entre 0.0 y 5.0).
*   **Salida esperada:** El promedio exacto de las calificaciones y un mensaje que diga `Aprobado` (si el promedio es >= 3.0) o `No Aprobado` (si es < 3.0).
*   *Ejemplo:* 3 notas: 2.5, 4.0, 3.5. Salida: `Promedio: 3.33 - Estado: Aprobado`.

### Ejercicio 5: Proyección de Ahorros Programados
**Caso de uso:** Un banco ofrece un plan de ahorro donde el cliente deposita una cantidad fija mensual. El sistema debe mostrar el acumulado mes a mes.
*   **Entrada esperada:** Pedir el monto fijo a ahorrar cada mes y la cantidad de meses de la proyección.
*   **Salida esperada:** Mostrar una lista iterativa mes a mes con el total acumulado hasta ese momento.
*   *Ejemplo:* Ahorro de $50000 por 3 meses. 
    * Salida: 
      `Mes 1: $50000`
      `Mes 2: $100000`
      `Mes 3: $150000`

### Ejercicio 6: Clasificador de Edades para Eventos
**Caso de uso:** Un auditorio necesita clasificar a los asistentes de un evento de tecnología en menores de edad y adultos para temas de logística y entrega de credenciales.
*   **Entrada esperada:** Solicitar la cantidad total de asistentes. Luego, pedir la edad de cada uno.
*   **Salida esperada:** Cantidad de menores de edad (< 18 años) y cantidad de adultos (>= 18 años).
*   *Ejemplo:* 4 asistentes con edades 15, 22, 17, 30. Salida: `Menores: 2 - Adultos: 2`.

### Ejercicio 7: Tabla de Conversión de Divisas
**Caso de uso:** Una casa de cambio requiere tener a la mano una tabla rápida de conversión de Dólares (USD) a Pesos Colombianos (COP) para agilizar la atención en ventanilla.
*   **Entrada esperada:** Pedir la Tasa de Cambio Representativa del Mercado (TRM) del día (ej. 4000).
*   **Salida esperada:** Una tabla generada desde 1 USD hasta 10 USD multiplicados por la tasa ingresada.
*   *Ejemplo:* Tasa: 4000. 
    * Salida: 
      `1 USD = 4000 COP`
      `2 USD = 8000 COP`
      `...`
      `10 USD = 40000 COP`

### Ejercicio 8: Generador de Códigos (Inversor de Cadenas)
**Caso de uso:** Un sistema de seguridad básico genera tokens temporales invirtiendo la palabra clave ingresada por el usuario.
*   **Entrada esperada:** Solicitar una palabra clave o cadena de texto (ej. "SENA2026").
*   **Salida esperada:** La cadena de texto invertida. **Ojo:** Esto debe hacerse usando un ciclo `for` que recorra el String de atrás hacia adelante.
*   *Ejemplo:* Entrada: `SENA`. Salida: `ANES`.

### Ejercicio 9: Modelo de Crecimiento Bacteriano
**Caso de uso:** Un laboratorio necesita proyectar el crecimiento de una población de bacterias que se duplica cada hora para calcular los insumos químicos necesarios.
*   **Entrada esperada:** La cantidad inicial de bacterias y la cantidad de horas de proyección.
*   **Salida esperada:** Mostrar el número de la hora y la población total de bacterias en ese momento.
*   *Ejemplo:* Inicial: 5 bacterias. Horas: 3. 
    * Salida:
      `Hora 1: 10 bacterias`
      `Hora 2: 20 bacterias`
      `Hora 3: 40 bacterias`

### Ejercicio 10: Estimación Ágil (Sucesión de Fibonacci)
**Caso de uso:** En el desarrollo de software (Scrum), se utiliza la serie de Fibonacci para estimar la complejidad de las tareas (Planning Poker). Se necesita un generador de esta serie para imprimir las cartas.
*   **Entrada esperada:** Solicitar al usuario la cantidad de términos `N` de la serie de Fibonacci que desea generar.
*   **Salida esperada:** Los `N` primeros números de la serie de Fibonacci separados por comas o espacios.
*   *Condición técnica estricta:* Debes generar la sucesión utilizando **un solo ciclo for**.
*   *Ejemplo:* Si el usuario ingresa 7. La salida debe ser: `0, 1, 1, 2, 3, 5, 8`.
