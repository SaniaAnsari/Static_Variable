# Static_Variable

In Java, a **static variable** (also called a **class variable**) belongs to the **class** rather than any specific object.  

- All objects of the class **share the same copy** of the static variable.  
- Static variables are **initialized only once** when the class is loaded.  
- Stored in the **method area** of JVM memory, not in the heap.

---

This is a simple **Java program** that demonstrates the use of **static variables**, **object creation**, and **seat number generation** for students in a university.

---

## Features

- Automatically generates **seat numbers** for students in the format: `B2411000###`.
- Keeps track of **total students admitted** using a static variable.
- Allows **university name** to be shared and updated for all students.
- Demonstrates the use of **`static` methods** and **`toString()`** for easy display.

---

## Class Description

### `Student` Class

**Variables:**

- `String name` – Name of the student.
- `String seatNumber` – Unique seat number generated automatically.
- `static String university` – Shared among all students.
- `static int count` – Keeps track of the total number of students.
- `static int nextNumber` – Helps generate sequential seat numbers.

**Constructor:**

- Accepts `name` as a parameter.
- Automatically generates the seat number in the format `B2411000###`.
- Increments `count` and `nextNumber`.

**Methods:**

- `toString()` – Returns student information in readable format.
- `static void showTotalStudents()` – Displays total students admitted.

---


Student s3 = new Student("Ahmed");
