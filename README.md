# 📚 Student Record Management System

                            A simple CLI-based Java application to manage student records using CRUD operations. Built as part of the **Java Developer Internship Task 2** .


## 🚀 Objective

              To implement a command-line interface (CLI) system that allows users to **Add**, **View**, **Update**, and **Delete** student records using core Java concepts.


## 🛠️ Tools & Technologies

              - **Language**: Java  
              - **IDE**: IntelliJ IDEA Community Edition  
              - **Data Structure**: `ArrayList`  
              - **Concepts Used**: Classes, Encapsulation, Collections, Loops, Scanner, Static Methods


## 📦 Features

          - Add new student records with ID, name, and marks
          - View all student records
          - Update existing student details by ID
          - Delete student records by ID
          - Exit the application gracefully


## 📄 Code Overview

### 🔹 Student Class

              Encapsulates student data with:
                      - `id` (int)
                      - `name` (String)
                      - `marks` (double)

                ```java
                      static class Student {
                          int id;
                          String name;
                          double marks;
                      
                          Student(int id, String name, double marks) {
                              this.id = id;
                              this.name = name;
                              this.marks = marks;
                          }
                      
                          public String toString() {
                                                    return id + "|" + name + "|" + marks;
                          }
                      }
                  ```

### 🔹 Main Menu

              Displays options and handles user input:

                    ```java
                          System.out.println("\n1.Add Student");
                          System.out.println("2.View Student");
                          System.out.println("3.Update Student");
                          System.out.println("4.Delete Student");
                          System.out.println("5.Exit");
                    ```
                    
### 🔹 Core Methods

                - `addStudent()` – Adds a new student to the list
                - `viewStudent()` – Displays all students
                - `updateStudent()` – Updates student info by ID
                - `deleteStudent()` – Removes student by ID

