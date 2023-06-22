/*
 * Orange.h
 *
 *  Created on: Feb 10, 2023
 *      Author: gautamsamudrala
 */

#ifndef ORANGE_H_
#define ORANGE_H_
#include <stdio.h>
#include <string>
#include <Food.h>
#include <Fruit.h>
class Orange: public Fruit {
public:
	Orange(){
		name = "Orange";
	}
	Orange(Date d){
		ripe = d;
	}
	void prepare(){
		printf("%s","Peel the orange");
	}
};

#endif /* ORANGE_H_ */
