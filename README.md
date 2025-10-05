<a id="readme-top"></a>

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<br />
<div align="center">
<a href="https://github.com/EddieCHuang/Escape-the-room">
</a>

<h3 align="center">Escape-the-room</h3>

<p align="center">
A hybrid Java escape room game featuring a console-based command system and a visual GUI map built with Swing.
<br />
<a href="https://github.com/EddieCHuang/Escape-the-room"><strong>Explore the docs »</strong></a>
<br />
<br />
<a href="https://github.com/EddieCHuang/Escape-the-room/issues">Report Bug</a>
·
<a href="https://github.com/EddieCHuang/Escape-the-room/issues/new?labels=enhancement&template=feature-request---.md">Request Feature</a>
</p>
</div>

<details>
<summary>Table of Contents</summary>
<ol>
<li>
<a href="#about-the-project">About The Project</a>
<ul>
<li><a href="#project-evolution">Project Evolution</a></li>
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

About The Project

This project is a hybrid escape room game that combines a traditional text-based command interface with a graphical user interface (GUI) map. Implemented in Java, the game challenges players to navigate rooms, solve puzzles, and manage an inventory, with all actions and locations visually represented in a separate GUI window built using Java Swing.

While text-based adventures are classic, they can make it difficult for players to visualize their surroundings. This project solves that by providing a real-time graphical map, giving players a clearer sense of space while retaining the simplicity of a command-line interface for interaction.

Project Evolution

This project has evolved through several versions, each adding new features and complexity.

    Version 1: The Classic Text Adventure
    The initial version was a purely text-based escape room running in the console. It featured an inventory system, multiple puzzle types (number locks, riddles), and a dynamic environment where rooms and objects changed based on player actions. The goal was to gather items to power an elevator and escape.

    Version 2: The Console Visualizer
    This version introduced a visual, grid-based map directly within the console. Players were represented on a 10x10 grid, allowing them to see their position relative to interactive objects like desks and doors, enhancing spatial awareness within the text-based experience.

    Version 3: The Hybrid GUI
    The current version transitions the visual map from the console to a dedicated Java Swing GUI window. This hybrid interface keeps player commands in the console while showing a colorful graphical map. New features include player color customization, pop-up notifications for important clues using JOptionPane, and a more dynamic visual representation of the game world.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

Built With

This project was built using Java and the Swing GUI toolkit.

* [![Java][Java-shield]][Java-url]   
* [![Swing][Swing-shield]][Swing-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>

Getting Started

Follow these steps to get a local copy of the project up and running.

Prerequisites

Make sure you have the following installed:

    Java JDK 8+

    A graphical desktop environment to display the Swing GUI window.

To confirm Java is installed, run this command in your terminal:
Bash

java -version

Installation

    Clone the repo
    Bash

git clone https://github.com/EddieCHuang/Escape-the-room.git

Open the project in your preferred IDE or navigate to the folder in a terminal.

Compile the program:
Bash

javac Main.java

Run the project. A GUI window will appear alongside your console.
Bash

    java Main

<p align="right">(<a href="#readme-top">back to top</a>)</p>

Roadmap

This roadmap outlines the completed versions and future goals for the project.

    [x] Version 1: A complete, text-only escape room game with puzzles and an inventory system.

    [x] Version 2: Enhanced the console experience with a grid-based visual map.

    [x] Version 3: Migrated the visual map to a separate Java Swing GUI for a hybrid experience.

    [ ] Future: Full GUI Implementation

        [ ] Refactor code to separate game logic from GUI rendering (Model-View-Controller pattern).

        [ ] Make the GUI fully interactive (e.g., clicking on a desk to inspect it).

        [ ] Display inventory and game messages within the GUI instead of the console.

        [ ] Add more rooms with distinct layouts and color schemes.

See the open issues for a full list of proposed features and known issues.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

To contribute:

    Fork the Project

    Create your Feature Branch (git checkout -b feature/AmazingFeature)

    Commit your Changes (git commit -m 'Add some AmazingFeature')

    Push to the Branch (git push origin feature/AmazingFeature)

    Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>

License

Distributed under the MIT License. See LICENSE.txt for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

Contact

Eddie Huang - @EddieCHuang - supereddieh@gmail.com

Project Link: https://github.com/EddieCHuang/Escape-the-room

<p align="right">(<a href="#readme-top">back to top</a>)</p>

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
