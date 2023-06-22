#ifndef FRUIT_H_
#define FRUIT_H_
#include <stdio.h>
#include <string>
#include <Food.h>
using namespace std;
class Fruit: public Food{
	public:
		Date ripe;
        Fruit(string n,Date d){
            name = n;
            ripe =d;
        }
        void ripeTime(){
        	printf("You can eat it on ");
        }
        int compareTo(Fruit f){
        	if(f.ripe.year < ripe.year){
        		return 1;
        	}
        	else if(f.ripe.year > ripe.year){
        		return -1;
        	}
        	else if (f.ripe.month < ripe.month){
        		return 1;
        	}
        	else if(f.ripe.month > ripe.month){
        		return -1;
        	}
        	else if (f.ripe.day < ripe.day){
        	      return 1;
        	    }
			else if(f.ripe.day > ripe.day){
        	     return -1;
        	}
			else{
				return 0;
			}
        }
};

#endif /* FRUIT_H_ */
