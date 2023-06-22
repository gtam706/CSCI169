/*
 * HW4P3Samudrala.cpp
 *
 *  Created on: Feb 10, 2023
 *      Author: gautamsamudrala
 */
#include <stdio.h>
#include <string>
#include <Food.h>
#include <Vegetable.h>
#include <Tomato.h>
int main(int argc, char *argv[])
{
	Date d;
	d.year = 2002;
	d.day = 2;
	d.month = 5;
	Tomato to(d);
	to.prepare();
	to.expiryTime();
}



