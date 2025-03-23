package com.gamingroom;

/**
 * A simple class to hold information about a team.
 * 
 * @author coce@snhu.edu
 * @author Christian Decker
 */
public class Team extends Entity {

  /**
   * Constructor with an identifier and name
   */
  public Team(long id, String name) {
    super(id, name); // Calls the Entity(long, String) constructor overload
  }

  @Override
  public String toString() {
    return "Team [id=" + getId() + ", name=" + getName() + "]";
  }
}
