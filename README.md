# Java Strategy Game Framework

A lightweight Java framework designed to simplify the creation of tile-based strategy games. This project provides a modular and extensible foundation for defining units, game boards, and turn-based mechanics.

## Features [UNDER CONSTRUCTION]

- 📦 **Modular architecture** – Clean separation between board, units, and managers
- ♟️ **Unit system** – Abstract base unit and extendable unit types (e.g., `RangedUnit`)
- 📐 **Grid-based board** – Easily customizable 2D grid board
- ⚙️ **Game management** – Central `BoardManager` to handle board state and unit spawning
- 🔁 **Ready for extension []** – Plug in new units, rules, and behaviors with minimal setup

## Current Structure
├── App.java # Entry point to test the framework
├── board
│ ├── Board.java # Represents a 2D game board
│ └── Cell.java # Represents a single tile on the board
├── managers
│ └── BoardManager.java # Handles board setup, cell tracking, and unit spawning
├── units
│ ├── BaseUnit.java # Abstract class for all unit types
│ └── RangedUnit.java # Example subclass with specific behavior
└── units.attacks
└── AttackBehavior.java # Strategy interface for attack logic


## Roadmap

 - Turn-based mechanics and player controller

 - AI opponent or dummy logic

 - Pathfinding and movement logic

 - Win/loss conditions and scoring

## Contributing
Currently, since this is a passion and learning project, I'm leaning on staying as a solo developer.
However, if you feel that you have meaningful contributions or suggestions feel free to contact me!