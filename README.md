# Singleton Pattern in Java

This project demonstrates the **Singleton Design Pattern** in Java.  
The Singleton pattern ensures that a class has **only one instance** throughout the application and provides a **global point of access** to it.

---

##  What is Singleton?
- Ensures only one object of a class is created.
- Provides a single point of access to the instance.
- Commonly used in logging, caching, configuration management, thread pools, etc.

---

##  Implementation Steps
1. **Private Constructor**  
   - Prevents direct instantiation of the class using `new`.

2. **Private Static Reference**  
   - Holds the single instance of the class.

3. **Public Static Method**  
   - Provides a global access point to return the single instance.  
   - Lazily initializes the instance when first requested.

---



