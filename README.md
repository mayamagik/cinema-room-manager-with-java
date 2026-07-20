# Cinema Room Manager

A command-line cinema booking application written in Java. The program creates a seating plan for a cinema room, allows users to purchase tickets, calculates ticket prices, and displays sales statistics.

This project was developed as part of the JetBrains Academy Java learning track and is organized into five stages, with each stage introducing new functionality.

## Features

- Create a cinema room with a custom number of rows and seats
- Display the current seating plan
- Purchase tickets by selecting a row and seat
- Mark booked seats in the seating plan
- Prevent the same seat from being purchased twice
- Validate row and seat numbers
- Calculate ticket prices based on the size of the cinema room
- Display the number and percentage of purchased tickets
- Track current and potential total income
- Navigate the application through a console menu

## Ticket Pricing

- In cinema rooms with **60 seats or fewer**, every ticket costs **$10**.
- In larger rooms, tickets in the **front half** cost **$10** and tickets in the **back half** cost **$8**.

## Seat Symbols

| Symbol | Meaning |
| --- | --- |
| `S` | Available seat |
| `B` | Booked seat |

## Technologies and Concepts

- Java
- Object-oriented programming fundamentals
- Two-dimensional arrays
- Loops and conditional statements
- Methods and static variables
- User input with `Scanner`
- Input validation
- Basic calculations and formatted output

## Project Structure

The repository contains the completed stages of the project:

1. Print the seating plan
2. Calculate potential profit
3. Set ticket prices
4. Add the application menu
5. Manage statistics and validate bookings

The final version is located at:

```text
5. Manage stats and make your app error-free/src/cinema/Cinema.java
```

The `Topics` directory contains additional Java exercises completed during the project.

## How to Run

### Requirements

- Java Development Kit (JDK) 8 or newer

### From an IDE

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA or another Java IDE.
3. Open the final-stage `Cinema.java` file.
4. Run the `Cinema.main()` method.

### From the Command Line

From the repository root, run:

```bash
cd "5. Manage stats and make your app error-free/src"
javac cinema/Cinema.java
java cinema.Cinema
```

## Example Menu

```text
1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
```

## Learning Outcomes

This project helped me practise structuring a Java console application, working with multidimensional arrays, separating program logic into methods, validating user input, and updating application state during runtime.
