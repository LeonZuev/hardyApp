# hardyApp

## Construction Project Management Application

### Trekker description:
A simple console application for managing projects, workdays,
and workers in the construction industry.

### Get Start:
To start the application, run the 'ConsoleInterfase' class,
wich contains the 'main' method.

## Class Overview:
### 1. Project:
Represents a construction project with its details such as
date, company name, company manager, project address, workers,
progress, materials, and workers notes.
### 2. Workday:
Represents a workday with details such as date, company
name, project address, hours, progress, materials, notes, and 
payment.
### 3. Worker:
Represents a worker with details such as worker name, day 
payment, hour payment, notes, workdays in the current month, total
workdays, projects, and materials.
### 4. MainApplicationManager:
Manages the main logic of the
application, including initializing data, adding/removing projects,
workdays, and workers.
### 5. ConsoleInterface:
Provides the console user interface for interacting
with the application.

## Detal Description:
The Construction Trekker is designed to help users manage projects,
workdays, and workers in the construction industry. Users can add,
remove, and update projects, workdays, and workers, as well as assign 
workdays and projects to workers. The application stores data in memory 
and displays it to the user as needed. It features a simple console 
interface for ease of use.
The application consists of several classes that each serve a specific
purpose. The Project class represents a construction project, while the 
Workday class represents a workday. The Worker class is used to store
information about a worker, including their name, payment rates, and
assigned workdays and projects.
The MainApplicationManager class is responsible for the main logic of
the application. It initializes data structures to store projects, workdays,
and workers, and provides methods to add, remove, and manipulate these 
objects. The manager also provides methods to print lists of projects and
workers for easy viewing.
Lastly, the ConsoleInterface class provides the user interface for
interacting with the application. It presents a menu of options for the user
to choose from, such as adding or removing projects, workdays, or
workers. The interface handles user input and calls the appropriate
methods in the MainApplicationManager class to perform the desired
actions.

## JUnit Tests Overview:
In addition to the main classes, the application includes a set of JUnit
tests to ensure the functionality of the MainApplicationManager class.
These tests cover a range of use cases, including adding and removing
projects, workdays, and workers, as well as edge cases that may arise
during the application's operation.

## Author:
Leon Zuev ([@LeonZuev]:(loonatune@gmail.com))

## Date:
![current date](https://img.shields.io/badge/date-2023.04.21-green)
