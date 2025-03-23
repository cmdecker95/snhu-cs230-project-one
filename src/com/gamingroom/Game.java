package com.gamingroom;

/**
 * A simple class to hold information about a game.
 * 
 * @author coce@snhu.edu
 * @author Christian Decker
 */
public class Game extends Entity {

  /**
   * Constructor with an identifier and name
   */
  public Game(long id, String name) {
    super(id, name); // Calls the Entity(long, String) constructor overload
  }

  @Override
  public String toString() {
    return "Game [id=" + getId() + ", name=" + getName() + "]";
  }
}
