package com.tlglearning.cards.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Deck implements Iterable<Card> {

  public final List<Card> cards;

  public Deck() {
    cards = new ArrayList<>();
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        Card card = new Card(rank, suit);
        cards.add(card);
      }
    }
  }

  @Override
  public Iterator<Card> iterator() {
    return cards.iterator();
  }
}
