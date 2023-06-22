/*
 * Vegetable.h
 *
 *  Created on: Feb 10, 2023
 *      Author: gautamsamudrala
 */

#ifndef VEGETABLE_H_
#define VEGETABLE_H_
#include <stdio.h>
#include <string>
#include <Food.h>
using namespace std;
class Vegetable: public Food{
	public:
		Date expiry;
        Vegetable(string n,Date d){
            name = n;
            expiry =  d;
        }
        void expiryTime(){
        	printf("It expires on ");
        	printf("%d",expiry.day);
        	printf("/");
        	printf("%d",expiry.month);
        	printf("/");
        	printf("%d",expiry.year);
        	printf("/n");
        }
        int compareTo(Vegetable f){
        	if(f.expiry.year < expiry.year){
        		return 1;
        	}
        	else if(f.expiry.year > expiry.year){
        		return -1;
        	}
        	else if (f.expiry.month < expiry.month){
        		return 1;
        	}
        	else if(f.expiry.month > expiry.month){
        		return -1;
        	}
        	else if (f.expiry.day < expiry.day){
        	      return 1;
        	    }
			else if(f.expiry.day > expiry.day){
        	     return -1;
        	}
			else{
				return 0;
			}
        }
};



#endif /* VEGETABLE_H_ */
