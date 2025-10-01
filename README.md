## 🔹 Static Variables

**Definition:**  
A static variable belongs to the class rather than to individual objects.  
- Only **one copy** exists for all instances.  
- Stored in the **method area**.  
- Useful for **shared data**, counters, or IDs.

**Static variables in this program:**
| Variable       | Purpose                                           |
|----------------|--------------------------------------------------|
| `university`   | Shared name among all objects                    |
| `count`        | Total number of objects created                  |
| `nextNumber`   | Generates unique IDs automatically              |

---

## 🔹 Instance Variables

**Definition:**  
Instance variables belong to individual objects. Each object has its **own copy**.

**Instance variables in this program:**
| Variable       | Purpose                                           |
|----------------|--------------------------------------------------|
| `name`         | Name of the object                               |
| `seatNumber`   | Unique ID assigned to the object                 |

---

## 🔹 Static Methods

**Definition:**  
Static methods belong to the class and can be called **without creating an object**.  
- Can directly access **static variables**.  
- Cannot directly access **instance variables**.  

**Example in this program:**
- `showTotalStudents()` – Displays the total number of objects created.

---

## ✅ Program Features

1. **Automatic SeatNo Generation**
   - IDs follow a consistent format (e.g., `B2411006101`, `B24110006102`).  
   - Ensures **unique SeatNo** for every object.

2. **Shared Class-Level Data**
   - Updating a static variable like `university` affects **all objects**.

3. **Object Count Tracking**
   - Keeps track of the **total number of objects created**.

---

## ⚡ How the Program Works

1. Create multiple objects of the class.  
2. Assign **unique SeatNo automatically**.  
3. Print object details including **name, SeatNo, and shared data**.  
4. Display **total objects created** using a static method.  
5. Update a shared variable and observe the change across all objects.

---
## 💻 Example Run
B24110006101-Sania	(KU)
B24110006102-Zoha	(KU)
B24110006103-Laiba	(KU)
Total students admitted: 3
----------After updating university name----------
B24110006101-Sania	(Ned University)
B24110006102-Zoha	(Ned University)
B24110006103-Laiba	(Ned University)
Total students admitted: 3

