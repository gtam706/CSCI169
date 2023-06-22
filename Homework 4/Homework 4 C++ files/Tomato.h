/*
 * Tomato.h
 *
 *  Created on: Feb 10, 2023
 *      Author: gautamsamudrala
 */

#ifndef TOMATO_H_
#define TOMATO_H_
#include <stdio.h>
#include <string>
#include <Food.h>
#include <Vegetable.h>
class Tomato: public Vegetable{
	public:
		Tomato(){
			name = "Tomato";
		}
		Tomato(Date d){
			expiry = d;
		}
};



#endif /* TOMATO_H_ */
