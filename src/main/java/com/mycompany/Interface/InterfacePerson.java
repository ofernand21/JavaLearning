package com.mycompany.Interface;

import java.util.List;
import java.util.Optional;

import com.classes.Persone;

public interface InterfacePerson {
  public Optional<Persone> findByNom(List<Persone> liste, final String nom);

  Optional<Persone> findByNumero(List<Persone> liste, final String numero);
}
