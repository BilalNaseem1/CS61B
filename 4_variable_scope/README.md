## **Variables in Java**

In Java, variables are classified based on **scope** and **declaration**. They fall into two main categories: **Class Variables** and **Local Variables**.

---

### **1. Class Variables**
Class variables are declared **at the class level**, outside any method, constructor, or block. These are further divided into:

#### **a) Static Variables**
- Declared using the `static` keyword.
- Belong to the class rather than any specific instance of the class.
- Shared among all objects of the class.
- Stored in **static memory**.
- Initialized when the class is loaded, and they exist until the class is unloaded.

**Example:**
```java
public class Main {
    static int sharedValue = 0; // Static variable (class-level)
    
    public static void incrementSharedValue() {
        sharedValue++;
    }

    public static void main(String[] args) {
        Main.incrementSharedValue();
        Main.incrementSharedValue();
        System.out.println("Shared Value: " + Main.sharedValue); // Output: 2
    }
}
```

---

#### **b) Instance Variables**
- Declared **without the `static` keyword**.
- Belong to individual objects; each object has its own copy.
- Stored in **heap memory**.
- Exist as long as the object exists.
- Initialized with default values (e.g., `0` for integers, `null` for objects).

**Example:**
```java
public class Main {
    int instanceValue = 0; // Instance variable

    public static void main(String[] args) {
        Main obj1 = new Main();
        Main obj2 = new Main();

        obj1.instanceValue = 5;
        obj2.instanceValue = 10;

        System.out.println("Object 1 Value: " + obj1.instanceValue); // Output: 5
        System.out.println("Object 2 Value: " + obj2.instanceValue); // Output: 10
    }
}
```

---

### **2. Local Variables**
- Declared **inside a method, constructor, or block**.
- Exist only within the method or block where they are defined (limited scope).
- Stored in **stack memory**.
- Not initialized by default (must be explicitly initialized).

**Example:**
```java
public class Main {
    public void displayMessage() {
        int localValue = 10; // Local variable
        System.out.println("Local Value: " + localValue);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.displayMessage(); // Output: Local Value: 10
    }
}
```

---

### **Comparison of Variable Types**

| **Type**           | **Keyword** | **Scope**              | **Memory**        | **Default Initialization?** | **Shared?**   |
|---------------------|-------------|------------------------|-------------------|-----------------------------|---------------|
| **Static Variable** | `static`    | Class-level            | Static Memory     | Yes                         | Yes           |
| **Instance Variable**| None        | Per-object instance    | Heap Memory       | Yes                         | No            |
| **Local Variable**   | None        | Method/block-specific  | Stack Memory      | No (must be initialized)    | No            |

---

### **Examples of All Types Together**

```java
public class Main {
    // Static variable
    static int staticCount = 0;

    // Instance variable
    int instanceCount = 0;

    public void demonstrateScopes() {
        // Local variable
        int localCount = 5;

        // Increment variables
        staticCount++;
        instanceCount++;
        localCount++;

        System.out.println("Static Count: " + staticCount);
        System.out.println("Instance Count: " + instanceCount);
        System.out.println("Local Count: " + localCount);
    }

    public static void main(String[] args) {
        Main obj1 = new Main();
        Main obj2 = new Main();

        obj1.demonstrateScopes();
        obj2.demonstrateScopes();

        // Static variable is shared
        System.out.println("Final Static Count: " + staticCount);

        // Instance variables are independent for each object
        System.out.println("Object 1 Instance Count: " + obj1.instanceCount);
        System.out.println("Object 2 Instance Count: " + obj2.instanceCount);
    }
}
```

### **Output:**
```
Static Count: 1
Instance Count: 1
Local Count: 6
Static Count: 2
Instance Count: 1
Local Count: 6
Final Static Count: 2
Object 1 Instance Count: 1
Object 2 Instance Count: 1
```

---

### **Summary**
- **Static Variables:** Shared across all objects and belong to the class.
- **Instance Variables:** Unique to each object and belong to the instance.
- **Local Variables:** Limited to the scope of the method/block in which they are declared.

This structure can be directly added to your README file! Let me know if you'd like additional formatting suggestions for Markdown.