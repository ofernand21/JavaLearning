package com.mycompany.method;

public class Method {
  /**
   * This method converts celcius to fahrenheit
   * @param celcius
   * @return float representation of celcius in fahrenheit
   */
  public float convertCelciusToFahrenheit(float celcius) {
    return (float)9/5*celcius + 12;
  }

  /**
   * This method calculates the area of the rectangular
   * @param longeur the height of the rectangle
   * @param largeur the weight of the rectangle
   * @return float representing the area of the rectangle
   */
  public static float calculeSurfaceRectangle(float longeur, float largeur) {
    return longeur*largeur;
  }
}
