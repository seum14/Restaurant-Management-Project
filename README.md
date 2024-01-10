# Restaurant Management Project

This project, completed in the 3rd semester of my university life, is a comprehensive Java-based Restaurant Management System. It offers a robust solution for managing a restaurant's operations, providing unique interfaces for managers, staff, and customers.

## Project Description

The Restaurant Management Project is designed to streamline the operations of a restaurant. It provides separate interfaces for managers, staff, and customers, each equipped with features tailored to their roles. Managers can oversee accounts, view sales information, and handle refunds. Staff members can create orders and manage their bank account information. Customers can place orders, leave reviews, and manage their bank account information. The project is a testament to the power of Java in creating efficient and user-friendly management systems.

## Contribution

This project was fully developed by Khalid Hasan Seum.

## Features

The project includes the following features:

1. **Home Page**
2. **Log In Page**
3. **Create New Account**
4. **Forget Password**
5. **Log in as manager, customer, staff separately**

### Manager

- Home Page of manager
- Manage Account
- Sells Information
- Show Review
- Add Bank Account
- Bank Account information
- Menu (Food Item)
- Create Order
- Update Menu
- Update Offer
- Refund
- Refund List
- Log out

### Staff

- Add Bank Account
- Bank Account information
- Menu
- Create Order
- Log Out

### Customer

- Add Bank Account
- Bank Account information
- Menu (Food Item)
- Give Order
- Make Review
- Sign Out

## How to Run This Project

1. Install the Xampp Control Panel v3.2.4.
2. Start Apache, MySQL.
3. Go to the Admin option that is situated beside the MySQL.
4. Import `multiuserlogin.sql` in local host which is open when you press Admin option in MySQL. The file which you want to import is located in the Database folder.
5. If you fail to import `multiuserlogin.sql`, create a new Database named `multiuserlogin`. In this database, import table from the Database folder. When you import the table, do not import the `multiuserlogin.sql`.
6. Do not use any password in the database. This basically means you use a user account which name is root and it has no password.
7. Import `mysql-connector.jar` in the library of project if you have not any in Apache NetBeans.
8. Import `rs2xml.jar` in the library of project if you have not any in Apache NetBeans.
9. Import JDK 14 in the library of project if you have not any in Apache NetBeans.
10. Use Apache NetBeans to run this project. Alternatively, you can run this project by going to Restaurant Management Project folder then go to src folder. There, you will see a jar file named `Restaurent_Managment_Project.jar`. Open it to show the project. This is the best option to run this project without any hassle. But you must set up the database first. Otherwise, you cannot log in the project or sign up this project and cannot able to show any information.

## Project Files

The project files can be accessed from this Google Drive link: https://drive.google.com/drive/folders/11Hl2HcBo5S5cqMZQH3IxyGQDdAfzGlyL?usp=drive_link . Please note that you'll need to set up the database as described in the 'How to Run This Project' section before running the project.
