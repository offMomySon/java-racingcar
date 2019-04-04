/*
 * UserInterface Interface
 *
 * @version 2
 *
 * @date 2019-04-02
 *
 * Copyright (c) 2019. Jihun oh
 * All rights reserved
 */

package domain.interfaces;

import domain.Car;

import java.util.List;


public interface UserInterface {

    String[] inputCarName();

    String inputGameCount();

    void alertInvalidCarNameLength();

    void alertCarNameDuplicate();

    void alertInvalidCarCount();

    void alertInvalidGameCount();

    void printGameState(List<Car> carList);

    void printWinner(List<Car> carList);
}
