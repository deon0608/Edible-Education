#include <stdio.h>
#include <stdlib.h>
 
// Define a structure to store information about education
// topics and the applicable resources 
struct EdibleEducation {
    char* topic;       // topic of education 
    char** resources;  // resources for education 
};
 
// function to add new education topics and resources
void addEdibleEducation(struct EdibleEducation* edu, 
                        const char* topic, const char** resources) {
    edu->topic = topic; 
	edu->resources = resources; 
}
 
// function to print out the education topic and resources 
void showEdibleEducation(struct EdibleEducation edu) {
    printf("Edible Education: %s\n", edu.topic);
    int i=0; 
    printf("Resources: "); 
    while (edu.resources[i] != NULL) {
        printf("%s ", edu.resources[i]);
        i++; 
    }
    printf("\n\n");
}
 
// main function 
int main() {
    // instantiate an array of Edible Education resources 
    const char* vegetarian_resources[] = {"Vegetarian Cookbook", 
        "Vegan Times Magazine", "The Veg Times Website", NULL};
    const char* baking_resources[] = {"The Baking Bible", 
        "Cake Decorating 101", "The Baker's Journal", NULL};
 
    struct EdibleEducation edu1, edu2; 
    addEdibleEducation(&edu1, "Vegetarian Cooking", vegetarian_resources);
    addEdibleEducation(&edu2, "Baking", baking_resources);
 
    showEdibleEducation(edu1); 
    showEdibleEducation(edu2); 
 
    return 0;
}