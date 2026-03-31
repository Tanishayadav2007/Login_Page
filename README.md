# Java Swing Login Page

A **Java Swing-based Login Page** application that demonstrates GUI programming, user input handling, and basic authentication logic. This project is ideal for beginners learning Java GUI development and serves as a foundation for building more advanced desktop applications.

---

## Project Overview

This project implements a simple login system using **Java Swing** components. It includes username and password fields, a show/hide password feature, and a dashboard that opens upon successful login. Invalid credentials trigger a clear error message dialog, and the input fields are reset for retrying.

---

## Motivation

The motivation behind this project is to learn and demonstrate:
- Designing user-friendly GUI interfaces using Java Swing.
- Handling user input and performing basic validation.
- Managing multiple windows (login and dashboard) in a desktop application.
- Understanding event-driven programming in Java.

---

## Features

- **Username & Password Fields** with bold labels for clarity.
- **Show/Hide Password** toggle button to improve user experience.
- **Login Validation**: Accepts predefined credentials (`admin` / `1234`).
- **Error Handling**: Displays a popup if login credentials are invalid.
- **Dashboard Window**: Opens a new window after successful login with a **Logout** button.
- **Field Reset**: Clears username and password fields after invalid login.
- **Responsive UI**: Simple and clean layout for desktop applications.

---

## How It Works

1. The user enters a username and password.
2. Clicking the **Login** button triggers authentication logic.
3. If the credentials are correct:
    - A success message is shown.
    - The login window closes.
    - A dashboard window opens with a welcome message and logout button.
4. If the credentials are incorrect:
    - An error dialog appears.
    - Input fields are cleared for retrying.

---

## Technologies Used

- Java  
- Swing (`JFrame`, `JLabel`, `JTextField`, `JPasswordField`, `JButton`, `JOptionPane`)

---
## Screenshots

### Login Page
<img width="572" height="440" alt="Screenshot 2026-03-31 151526" src="https://github.com/user-attachments/assets/1f0d456f-7e0d-48a6-b76e-03ff2328cfc7" />
### Successful Login
<img width="558" height="424" alt="Screenshot 2026-03-31 151709" src="https://github.com/user-attachments/assets/71f70d78-e826-4871-9746-a0c29d7b9e89" />
### Invalid Credentials
<img width="554" height="425" alt="Screenshot 2026-03-31 151643" src="https://github.com/user-attachments/assets/8cfdbb40-83dd-4619-96db-332670753656" />
