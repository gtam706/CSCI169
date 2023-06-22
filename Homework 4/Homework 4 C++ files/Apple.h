/*
 * Apple.h
 *
 *  Created on: Feb 10, 2023
 *      Author: gautamsamudrala
 */

#ifndef APPLE_H_
#define APPLE_H_
#include <stdio.h>
#include <string>
#include <Food.h>
#include <Fruit.h>
class Apple: public Fruit{
	public:
		Apple(){
			name = "Apple";
		}
		Apple(Date d){
			ripe = d;
		}
		void prepare(){
			printf("%s","Core the apple");
		}
};




#endif /* APPLE_H_ */
