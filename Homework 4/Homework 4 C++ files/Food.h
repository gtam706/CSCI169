#ifndef FOOD_H_
#define FOOD_H_
#include <string>
#include <stdio.h>
using namespace std;
class Food{
    public:
        string name;
        Food(string n){
            name = n;
        }
        void prepare(){
            printf("Prepare the  ");
            printf("%s", name.c_str());
            printf("\n");
        }
};

struct Date{
	int day;
	int month;
	int year;
};


#endif /* FOOD_H_ */
