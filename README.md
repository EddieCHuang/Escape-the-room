<!-- Improved compatibility of back to top link -->

<a id="readme-top"></a>

<!-- PROJECT SHIELDS -->

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- PROJECT LOGO -->

<br />
<div align="center">
<a href="https://www.google.com/search?q=https://github.com/EddieCHuang/Escape-the-room">
</a>

<h3 align="center">Escape-the-room</h3>

<p align="center">
A hybrid Java escape room game featuring a console-based command system and a visual GUI map built with Swing.
<br />
<a href="https://www.google.com/search?q=https://github.com/EddieCHuang/Escape-the-room"><strong>Explore the docs »</strong></a>
<br />
<br />
<a href="https://www.google.com/search?q=https://github.com/EddieCHuang/Escape-the-room/issues">Report Bug</a>
·
<a href="https://www.google.com/search?q=https://github.com/EddieCHuang/Escape-the-room/issues/new?labels=enhancement&template=feature-request---.md">Request Feature</a>
</p>
</div>

<!-- TABLE OF CONTENTS -->

<details>
<summary>Table of Contents</summary>
<ol>
<li>
<a href="#about-the-project">About The Project</a>
<ul>
<li><a href="#built-with">Built With</a></li>
</ul>
</li>
<li>
<a href="#getting-started">Getting Started</a>
<ul>
<li><a href="#prerequisites">Prerequisites</a></li>
<li><a href="#installation">Installation</a></li>
</ul>
</li>
<li><a href="#roadmap">Roadmap</a></li>
<li><a href="#contributing">Contributing</a></li>
<li><a href="#license">License</a></li>
<li><a href="#contact">Contact</a></li>
</ol>
</details>

<!-- ABOUT THE PROJECT -->
About The Project

This project is a hybrid escape room game that combines a traditional text-based command interface with a graphical user interface (GUI) map. Implemented in Java, the game challenges players to navigate rooms, solve puzzles, and manage an inventory, with all actions and locations visually represented in a separate GUI window built using Java Swing.

The Problem It Solves

While text-based adventures are classic, they can make it difficult for players to visualize their surroundings. This project solves that by providing a real-time graphical map, giving players a clearer sense of space and location relative to interactive objects, while still retaining the simplicity of a command-line interface for interaction.

Why It Exists

This game was created as an educational project to integrate core Java concepts with GUI programming. It demonstrates how to manage game state logic separately from the user interface and how to use Java Swing to create a simple, dynamic, and visual application that enhances the traditional console experience.

What Makes It Unique

This version evolves the original text-based game by introducing several key features:

    Hybrid Interface: Player commands (look, use key, left) are entered into the console, while the results of movement and the room layout are displayed in a separate Java Swing window.

    Visual GUI Map: The room is represented as a 10x10 grid of colored panels. Each color corresponds to an object (e.g., red for a bed, brown for a desk), and the player's current position is highlighted.

    Player Color Customization: At the start of the game, players can input custom RGB values to change their character's color on the map.

    Pop-up Notifications: Important clues and messages are delivered through JOptionPane dialog boxes, ensuring they don't get lost in the console text.

    Interactive Puzzles: The core gameplay still revolves around solving randomized number locks, finding items, and using an inventory system to progress through the escape room.

This blend of a console command system and a live visual map creates an engaging and user-friendly escape room experience.

<p align="right">(<a href="#readme-top">back to top</a>)</p>
Built With

This project was built using Java and the Swing GUI toolkit.

* [![Java][Java-shield]][Java-url]   
* [![Swing][Swing-shield]][Swing-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- GETTING STARTED -->
Getting Started

Follow these steps to get a local copy of the project up and running.
Prerequisites

Make sure you have the following installed:

    Java JDK 8+

    A graphical desktop environment to display the Swing GUI window.

To confirm Java is installed, run this command in your terminal:

java -version

Installation

    Clone the repo

    git clone [https://github.com/EddieCHuang/Escape-the-room.git](https://github.com/EddieCHuang/Escape-the-room.git)

    Open the project in your preferred IDE or navigate to the folder in a terminal.

    Compile the program:

    javac Main.java

    Run the project. A GUI window will appear alongside your console.

    java Main

<p align="right">(<a href="#readme-top">back to top</a>)</p>
Roadmap

    [ ] Refactor code to separate game logic from GUI rendering (Model-View-Controller pattern).

    [ ] Make the GUI interactive (e.g., clicking on a desk to inspect it).

    [ ] Add more rooms with distinct layouts and color schemes.

    [ ] Display inventory and game messages within the GUI instead of the console.

See the open issues for a full list of proposed features and known issues.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTRIBUTING -->
Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

To contribute:

    Fork the Project

    Create your Feature Branch (git checkout -b feature/AmazingFeature)

    Commit your Changes (git commit -m 'Add some AmazingFeature')

    Push to the Branch (git push origin feature/AmazingFeature)

    Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- LICENSE -->
License

Distributed under the MIT License. See LICENSE.txt for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTACT -->
Contact

Your Name - @EddieCHuang - supereddieh@gmail.com

Project Link: https://github.com/EddieCHuang/Escape-the-room

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->

[contributors-shield]: https://img.shields.io/github/contributors/EddieCHuang/Escape-the-room.svg?style=for-the-badge
[contributors-url]: https://github.com/EddieCHuang/Escape-the-room/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/EddieCHuang/Escape-the-room.svg?style=for-the-badge
[forks-url]: https://github.com/EddieCHuang/Escape-the-room/network/members
[stars-shield]: https://img.shields.io/github/stars/EddieCHuang/Escape-the-room.svg?style=for-the-badge
[stars-url]: https://github.com/EddieCHuang/Escape-the-room/stargazers
[issues-shield]: https://img.shields.io/github/issues/EddieCHuang/Escape-the-room.svg?style=for-the-badge
[issues-url]: https://github.com/EddieCHuang/Escape-the-room/issues
[license-shield]: https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge
[license-url]: https://github.com/EddieCHuang/Escape-the-room/blob/Version-1/LICENSE
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/linkedin_username
[product-screenshot]: images/screenshot.png
[Java-shield]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white
[Java-url]: https://www.java.com/
[Swing-shield]: https://img.shields.io/badge/Java%20Swing-596D78?style=for-the-badge&logo=java&logoColor=white
[Swing-url]: https://docs.oracle.com/javase/8/docs/api/javax/swing/package-summary.html
