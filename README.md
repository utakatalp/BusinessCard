# Business Card App (Android Basics with Jetpack Compose)
![image](https://github.com/user-attachments/assets/f3faa57a-7803-43a7-b615-d2861983c696)

This is a beginner-friendly Android project built using **Jetpack Compose**, part of the **Android Basics in Compose** course. The app demonstrates how to create a simple digital business card UI using Composables and layout components.

## 🧾 Project Overview

The purpose of this app is to:
- Practice building UI with Composables.
- Understand layout composables like `Column`, `Row`, and `Box`.
- Explore image and text composables.
- Arrange UI elements into logical sections.
- Use string resources and drawable assets.

This project follows the concept of building a **low-fidelity prototype**, which is then converted into a Compose-based UI structure.

## 📱 App Structure

The app screen is divided into two main sections:

1. **Personal Information Section**  
   Displays the user's:
   - Profile Icon
   - Name
   - Job Title

2. **Contact Information Section**  
   Includes:
   - Phone number with icon
   - Email address with icon
   - Location/address with icon

### Example Design Sketch

| [ Profile Icon ] |
| John Doe |
| Software Engineer |
| |
| 📞 +1 (234) 567-8901 |
| 📍 123 Main St, Springfield |
| ✉️ example@email.com |


## 🛠️ Key Features

- **Jetpack Compose UI** using `@Composable` functions
- Organized layout with `Column`, `Row`, `Box`, and `Spacer`
- Uses `painterResource` to load images from `res/drawable`
- Uses `stringResource` for localization support
- Fully responsive design using screen width and dynamic padding

## 📂 Composable Breakdown

- `BusinessCard()` — Main layout containing all UI parts.
- `PersonalCard()` — Displays name, title, and logo.
- `DetailsCard()` — Displays contact info using `ContactRow()`.
- `ContactRow()` — Single row with an icon and associated text.

## 🧑‍💻 How to Run

1. Clone the repository or copy the source code into a new Android Studio project.
2. Place your drawable resources in `res/drawable` (e.g., `outline_adb_24.png`, `outline_123_24.png`, etc.)
3. Add the appropriate string values in `res/values/strings.xml`:
```xml
<resources>
    <string name="name">John Doe</string>
    <string name="title">Software Engineer</string>
    <string name="tel_number">+1 (234) 567-8901</string>
    <string name="email">example@email.com</string>
    <string name="location">123 Main St, Springfield</string>
</resources>



Let me know if you'd like this exported as a downloadable file or if you want help generating icons or UI assets!
