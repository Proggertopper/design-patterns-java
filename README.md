# Design Patterns in Java

A comprehensive educational project that demonstrates the implementation of classic **Gang of Four (GoF)** design patterns in Java.  
The repository contains practical examples, clean architecture principles, and real-world use cases for learning object-oriented design and improving software maintainability.

## Repository

https://github.com/Proggertopper/design-patterns-java

---

# Overview

This project was created to explore and practice the most important software design patterns used in modern Java development.

The repository demonstrates how patterns help developers:

- write scalable and maintainable code;
- reduce coupling between components;
- improve code reusability;
- follow SOLID principles;
- solve recurring architectural problems using proven approaches.

Design patterns are widely used in enterprise systems, frameworks, and backend applications such as Spring, Hibernate, and Java EE.

---

# Implemented Pattern Categories

## 1. Creational Patterns

Creational patterns focus on object creation mechanisms.

### Included patterns

- Singleton
- Factory Method
- Abstract Factory
- Builder
- Prototype

### Purpose

These patterns help make object creation flexible and independent from concrete implementations.

### Example Use Cases

- Database connection management
- Complex object construction
- Dynamic object generation
- Configuration systems

---

## 2. Structural Patterns

Structural patterns describe how classes and objects are composed into larger structures.

### Included patterns

- Adapter
- Decorator
- Facade
- Composite
- Proxy
- Bridge

### Purpose

These patterns improve flexibility and simplify relationships between components.

### Example Use Cases

- API integrations
- Wrappers and extensions
- Layer abstraction
- Simplified interfaces

---

## 3. Behavioral Patterns

Behavioral patterns focus on communication between objects and responsibility distribution.

### Included patterns

- Strategy
- Observer
- Command
- State
- Template Method
- Chain of Responsibility
- Mediator
- Visitor

### Purpose

These patterns improve extensibility and reduce tightly coupled business logic.

### Example Use Cases

- Event systems
- Payment strategies
- Request processing pipelines
- Application state management

---

# Technologies Used

| Technology | Purpose |
|---|---|
| Java | Core programming language |
| OOP Principles | Encapsulation, inheritance, polymorphism |
| IntelliJ IDEA | Development environment |
| Git & GitHub | Version control |
| Maven / Gradle *(optional)* | Dependency management |

---

# Project Structure

```text
design-patterns-java/
│
├── creational/
│   ├── singleton/
│   ├── builder/
│   ├── factory/
│   └── prototype/
│
├── structural/
│   ├── adapter/
│   ├── decorator/
│   ├── facade/
│   └── proxy/
│
├── behavioral/
│   ├── strategy/
│   ├── observer/
│   ├── command/
│   └── state/
│
└── README.md
```

---

# SOLID Principles

This project also follows and demonstrates important **SOLID** principles:

| Principle | Description |
|---|---|
| S — Single Responsibility | Each class has one responsibility |
| O — Open/Closed | Classes are open for extension but closed for modification |
| L — Liskov Substitution | Child classes can replace parent classes |
| I — Interface Segregation | Small and focused interfaces |
| D — Dependency Inversion | Depend on abstractions, not implementations |

Using design patterns together with SOLID principles significantly improves software architecture quality.

---

# Why Design Patterns Matter

Design patterns are considered industry-standard solutions for recurring software engineering problems.

Benefits include:

- improved readability;
- easier maintenance;
- scalable architecture;
- reusable components;
- cleaner object-oriented design.

Modern Java frameworks heavily rely on design patterns internally.

---

# Learning Goals

This repository is intended for:

- beginner Java developers;
- computer science students;
- backend developers;
- developers preparing for technical interviews;
- engineers learning software architecture.

The project helps understand not only **how** patterns work, but also **when** and **why** they should be used.

---

# How to Run

## Clone the repository

```bash
git clone https://github.com/Proggertopper/design-patterns-java.git
```

## Open the project

Open the project in:

- IntelliJ IDEA
- Eclipse
- VS Code

## Run examples

Navigate to a specific pattern implementation and run the corresponding `Main.java` file.

---

# Example

## Strategy Pattern Example

```java
interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid with credit card: " + amount);
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid with PayPal: " + amount);
    }
}

class PaymentService {
    private PaymentStrategy strategy;

    public PaymentService(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(int amount) {
        strategy.pay(amount);
    }
}
```

This pattern allows changing application behavior dynamically without modifying existing code.

---

# Best Practices Demonstrated

- Clean code structure
- Separation of concerns
- Interface-driven development
- Loose coupling
- Composition over inheritance
- Extensible architecture

---

# Future Improvements

Possible future additions:

- Multithreading patterns
- Spring Framework integration
- UML diagrams
- Unit tests
- Real-world mini projects
- Microservice-oriented examples

---

# Resources

Useful resources for learning design patterns:

- https://refactoring.guru/design-patterns/java
- https://www.baeldung.com/design-patterns-series
- https://github.com/iluwatar/java-design-patterns

---

# Conclusion

This project serves as a practical guide to mastering Java design patterns and object-oriented architecture.

Understanding design patterns is an essential skill for professional software engineers because it improves the ability to build clean, scalable, and maintainable applications used in real-world enterprise development.
