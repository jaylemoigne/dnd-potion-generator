# 🧪 Fantasy Potion Generator for D&D

**Fantasy Potion Generator** is a tool designed for Dungeon Masters and players of Dungeons & Dragons (D&D) to create unique, magical potions for their campaigns. Using a series of CSV files, the generator parses the information and outputs randomly generated potions with varying effects, ingredients, and properties that can be directly applied to gameplay.

## 📜 Project Overview

This generator pulls from a collection of CSV files that contain potion-related data (such as ingredients, effects, and magical properties). The data is parsed into arrays stored within an `ArrayList`, allowing the creation of randomized potions with each generation. These potions can be directly used in real campaigns and have tangible, applicable effects in D&D adventures.

### Key Features:
- **Random Potion Generation**: Potions are dynamically generated each time, offering a vast variety of magical brews for your campaign.
- **CSV Parsing**: The generator reads from CSV files that define ingredients, potion effects, rarity, and more, allowing for customizable and expandable data sources.
- **Game-Ready Effects**: Every potion comes with effects that can be directly applied to D&D characters, offering mechanical benefits (or drawbacks).
- **Customizable**: By editing or adding new CSV files, you can easily expand the kinds of potions generated to fit your specific campaign world.

## 🧪 Potion Examples

## Disclaimer | Potions generated might not always make sense, some effects can contradict other attributes etc.

The Fantasy Potion Generator produces a wide variety of potions, each with unique attributes, effects, and lore. Here are a few examples of what the generator can create:

- **Potion of Firebreathing**:
  - Ingredients: Dragon Scales, Inferno Blossoms
  - Effect: Grants the user the ability to breathe fire for 1d4 rounds, dealing 2d6 fire damage in a 15-foot cone.
  - Rarity: Rare

- **Elixir of the Moonlight Veil**:
  - Ingredients: Moonpetal Flower, Stardust Powder
  - Effect: Turns the drinker invisible under moonlight for 1 hour.
  - Rarity: Uncommon

- **Berserker's Brew**:
  - Ingredients: Ogre's Blood, Blackthorn Root
  - Effect: Grants a +2 to Strength for 1d4+1 hours, but imposes disadvantage on all Intelligence saving throws during that time.
  - Rarity: Common

## 📄 How to Use in D&D Campaigns

These potions are designed to be game-ready for D&D campaigns. Once a potion is generated, you can:

1. **Present it as loot**: Introduce the potion as treasure found in a dungeon or awarded by a quest-giver.
2. **Include it in shops**: Let players buy or barter for these potions at a local alchemist’s shop.
3. **Use the effects**: The effects are balanced to fit within standard D&D mechanics. Feel free to adjust potion durations, damage, and other mechanics to fit your campaign's power level.

## 🔄 Customization

You can easily modify the potion generator by editing or adding new CSV files:

1. **Add new ingredients**: Open the `ingredients.csv` file and add new rows with ingredient names and descriptions.
2. **Expand effects**: Modify the `effects.csv` to create new potion effects that suit your campaign's needs.
3. **Change rarity**: Adjust the `rarity.csv` to define the chances of generating common, uncommon, rare, or legendary potions.
