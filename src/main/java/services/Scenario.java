package services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Scenario {
  public final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

  abstract public boolean launch();
}
