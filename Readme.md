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

## Class Hierarchy and Relationships

<div style="text-align:center">
  <img src="https://github.com/Mahathirrr/Library_PBO/assets/111866202/97103ab3-1810-449b-bd88-632c366bf205" alt="DiagramBlueJ" width="400">
</div>

- The diagram showcases the inheritance relationships between different book types and the common base class (`Book`).
- It also highlights any interfaces and abstract classes used in the project.
- Arrows and associations represent how classes are connected and interact within the system.

Feel free to explore the code to gain a deeper understanding of how OOP principles are applied in this project.

**Watch the Video:**
1. Click [here](https://drive.google.com/file/d/1cT1A1d8wCP8_23StnYPvG3MzcIB0v6Up/view?usp=sharing) to access the detailed video presentation.
2. Gain valuable insights into OOP concepts in action within the Library Management System.

## License

This project is licensed under the [MIT License](LICENSE).
