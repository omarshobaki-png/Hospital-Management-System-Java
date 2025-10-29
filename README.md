## Project Overview
Author: Omar Shoubaki

Birzeit University

Department of Electrical and Computer Engineering 

---
This project implements a simple hospital management system using Object-Oriented Programming (OOP) in Java.  
It models real-world hospital operations including:
- Patient admission and billing
- Doctor management and salary calculation
- Department and service management

The program demonstrates advanced OOP principles such as inheritance, abstraction, interfaces, and polymorphism.

## Classes and Responsibilities

| Class | Description |
|-------|--------------|
| **Billable (Interface)** | Defines the `calculateBill()` method and includes a constant tax rate used for billing. |
| **PatientBase (Abstract Class)** | Serves as the base for all patient types. Implements `Billable` and `Comparable` to allow sorting by bill amount. |
| **EmergencyPatient** | Extends `PatientBase`. Calculates bills including emergency fees and service costs. |
| **LongTermPatient** | Extends `PatientBase`. Calculates bills based on days admitted, daily rate, and additional service costs. |
| **HospitalService** | Represents medical services linked to patients, each with a name and cost. |
| **Doctor** | Represents doctors with attributes such as specialization, degree, base salary, overtime hours, and rate. Implements `Comparable` for sorting by salary. |
| **Department** | Groups doctors and patients under specific hospital departments. |
| **Driver (Main Class)** | Initializes data, links entities, performs sorting, and prints output summaries. Acts as the program’s entry point. |

## Features
- Calculates bills for emergency and long-term patients  
- Calculates doctor salaries based on degree and overtime  
- Displays total hospital billing for all patients  
- Sorts patients by total bill and doctors by salary  
- Demonstrates inheritance and interface implementation  
- Prints formatted summaries for departments, doctors, and patients  

## How to Run
1. Compile all Java files
2. Run the driver class
   
## Tools used
Eclipse IDE
