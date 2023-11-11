# Library Management System

Object-Oriented Programming B Group Project

Group Members:
- Muhammad Mahathir (2208107010056)
- Muhammad Ridho (2208107010064)

---

This project is a simple library management system implemented in Java, showcasing the application of Object-Oriented Programming (OOP) principles. It manages a collection of various types of books and allows users to borrow and return books. The program highlights the following key OOP concepts:

1. **Inheritance**: The project uses inheritance to create different types of books (e.g., Comic, Science, History) as subclasses of a common base class (Book).

2. **Polymorphism**: Through method overriding, the program demonstrates polymorphism by allowing users to interact with different book types using a common method (`view`), without needing to know the specific book type.

3. **Abstraction**: The base class `Book` defines an abstract method `view`, ensuring that all book types have an implementation for displaying book information.

4. **Encapsulation**: Private member variables in the `Book` class are encapsulated, and access to them is provided through public getter methods to maintain data integrity.

## Usage

1. Clone this repository to your local machine.
2. Compile and run the program using a Java IDE or command line.
3. Follow the on-screen instructions to borrow or return books.

Feel free to explore the code to learn more about how OOP principles are applied in this project.

## License

This project is licensed under the [MIT License](LICENSE).