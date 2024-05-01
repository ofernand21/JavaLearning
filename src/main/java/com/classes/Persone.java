package com.classes;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.mycompany.interfaces.InterfacePerson;

public class Persone implements InterfacePerson {
  private String nom;
  private String numero;

  public Persone(String nom, String numero) {
    this.nom = nom;
    this.numero = numero;
  }

  public Optional<Persone> findByNom(List<Persone> liste, final String nom) {
    // Bloque l'exécution si nom est null
    Objects.requireNonNull(nom, "Fournir le nom");
    for (Persone persone : liste) {
      if (Objects.equals(persone.nom, nom)) {
        return Optional.ofNullable(persone);
      }
    }
    return Optional.ofNullable(null);
  }

  public Optional<Persone> findByNumero(List<Persone> liste, final String numero) {
    Objects.requireNonNull(numero, "Fournir le nom");
    for (Persone persone : liste) {
      if (Objects.equals(persone.numero, numero)) {
        return Optional.ofNullable(persone);
      }
    }
    return Optional.ofNullable(null);
  }

  public int isNumber(final String numero) {
    Objects.requireNonNull(numero, "Fournir le nom svp");
    return Integer.valueOf(numero);
  }

  public String getName() {
    return this.nom;
  }

  @Override
  public String toString() {
    return this.nom + " a pour numéro " + this.numero;
  }
}
