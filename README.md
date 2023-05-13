# CS2511-Vacation
Chapter 10 Individual Lab Assignment

**Assignment:** Write an abstract super class encapsulating a vacation: A Vacation has one attribute: a destination. It has an overloaded constructor a toString() and an abstract calculate cost method that returns the total cost of each vacation. This class has two non-abstract subclasses: one encapsulating an all-inclusive vacation, and the other encapsulating a piecemeal vacation. 

An all-inclusive vacation has three additional attributes: a brand (for instance ClubMed); a rating, expressed as a number of stars; and a price. In addition an all-inclusive vacation has an overloaded constructor, a toString() and a concrete calculate cost method that returns the total cost of the all-inclusive vacation vacation ( price). 

A piecemeal vacation has three additional attributes: hotel, meal, airfare as corresponding costs. In addition a piecemeal vacation has an overloaded constructor, a toString() and a concrete calculate cost method that returns the total cost of the piecemeal vacation ( sum of hotel, meal and airfare). 

You also need to include a client class to test these two classes using either an ArrayList or an array of objects to populate the array. Print the state of each element and the total costs for each vacation element. 
