package com.tail.firstClassCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class WinnerList {

  // 이렇게 비즈니스에서 쓰이는 자료 구조가 있을때는 클래스로 만들어서 관리하는게 좋다.

  //1. collection의 불변성 보장
  //2.  collection을 다루는 로직을 한곳에 모아둘 수 있다.
  //3. 이름이 있는 컬렉션이 가능

  private static final int WINNER_SIZE = 6;
  private final List<Long> winnerLists;

  public WinnerList() {
    this.winnerLists = createWinnerList();
    validateDuplicate(winnerLists);
    validateSize(winnerLists);
  }

  private List<Long> createWinnerList() {
    List<Long> winnerLists = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < WINNER_SIZE; i++) {
      long no = random.nextInt(100);
      if (winnerLists.contains(no)) {
        i--;
        continue;
      }
      winnerLists.add(no);
    }
    return winnerLists;
  }

  private void validateSize(List<Long> winnerLists){

    if(winnerLists.size() != WINNER_SIZE){
      throw new IllegalArgumentException("당첨자는 6명이여야 합니다.");
    }

  }

  private void validateDuplicate(List<Long> winnerLists){
    Set<Long> nonDuplicate = new HashSet<>(winnerLists);
    if(nonDuplicate.size() != WINNER_SIZE){
      throw new IllegalArgumentException("당첨자는 중복되면 안됩니다.");
    }
  }
}
