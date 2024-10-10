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

## Disclaimer | Potions generated might not always make sense, some effects can contradict other attributes.

The Fantasy Potion Generator produces a wide variety of potions, each with unique attributes, effects, and lore. Here are a few examples of what the generator can create:

- **Potion**:
    - Title: Potion
    - Effect: Ghostly Form. Makes the user intangible and able to phase through objects.
    - Strength: A poison. Almost no positive affect all side effect.
    - Side Effect: Fear of something.
    - Container: A glass syringe.
    - Colour: Dark Grey.
    - Appearance: Leaves and flowers in it.
    - Texture: Thin and watery.
    - Taste: Indescribable but horrid.
    - Label: Its description in ornate elvish.
    - Duration: 1 minute
    - Curability (if applicable): Expert Level (Second Hardest)

- **Vial**:
  - Title: Vial
  - Effect: Riddle me gone. Gives the user the cure to a single riddle.
  - Strength: Temporary but strong and wears off quickly.
  - Side Effect: Curses.
  - Container: A small shot sized bottle.
  - Colour: Metallic.
  - Appearance: Blood within it.
  - Texture: Thick and sludgy.
  - Taste: Of chemicals.
  - Label: A healing symbol.
  - Duration: 30 minutes
  - Curability (if applicable): Expert Level (Second Hardest)


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
